/*
author: Tugba Sahin
date:02.08.2018
*/
1- Departmandaki tum calisan personelleri yanyana yazabilir misiniz?

SELECT department_id, LISTAGG (first_name || ' ' ||last_name, ',') 
    WITHIN GROUP (ORDER BY department_id) AS SONUC
     FROM employees GROUP BY department_id;
     
2- JOBID ye gore gruplanacak empid ye gore herkesin kendinden 1 onceki ve 1 sonraki salary toplami bulunacak.

 SELECT emp.*,SUM(salary) OVER(
        PARTITION BY job_id
        ORDER BY
            employee_id
        ROWS BETWEEN 1 PRECEDING AND 1 FOLLOWING
    )total FROM employees emp;

3- Telefon no herkesin kendinden bir sonraki kisinin telefon numarasini yanina yazin. 
HIRE_DATE e gore sirali
DEPARTMENT_ID gore gruplanmali

SELECT emp.*, LEAD(phone_number,1) OVER (PARTITION BY department_id ORDER BY hire_date) NEXT_VALUE FROM employees emp;

4- Maaslara gore 1 den baslayarak sirala employees tablosu icinde maas ayni ise kideme(ise giris tarihi) gore sirala

SELECT  emp.*,ROW_NUMBER () OVER ( ORDER BY salary,hire_date)no FROM employees emp;

5- Tum tabloyu employees ilk 10 icin 1 diger 10 icin 2.. yazacak.Siralamayi EMPLOYEE_ID uzerinden yapabilir misiniz?

SELECT emp.*, NTILE(107 / 10) OVER (ORDER BY employee_id)no FROM employees emp;

6- Her departman icin ortalama maasin altindakiler 0 ustundekiler 1 olarak gosterilsin.

SELECT a.*,avg_sal,DECODE(SIGN(avg_sal-salary), 1,0,1)salary_no FROM employees a,
(SELECT department_id,AVG(salary)avg_sal FROM employees GROUP BY department_id)b
WHERE 1=1 AND a.department_id=b.department_id ORDER BY a.department_id,salary;

7- Employees tablosu yil icinde ise baslayan ilk personelleri listeleyebilir misiniz?

SELECT emp.*,MIN(hire_date) OVER(PARTITION BY TO_CHAR(hire_date,'yyyy') ) 
first_staff FROM employees emp;
    
8- Her departmanda en yuksek ucret alan personel disindaki tum kayitlar gelsin.

SELECT * FROM (
  SELECT  emp.*, ROW_NUMBER() OVER (PARTITION BY department_id ORDER BY salary DESC)no FROM employees emp
)WHERE no > 1;

9- Her departmanda en yuksek ucret alan 2 personelin kayitlari gelsin.  

SELECT * FROM (
  SELECT  emp.*, ROW_NUMBER() OVER (PARTITION BY department_id ORDER BY salary DESC)no FROM employees emp
)WHERE no <= 2 ;

10- Her departmanda en kidemli personelden baslayarak ondan once ve sonra bolume
baslayan personelin ad soyad bilgisini gösterebilir misiniz?

SELECT first_name,last_name,department_id, first_value(hire_date) OVER (PARTITION BY department_id ORDER BY hire_date ROWS BETWEEN 1 PRECEDING AND
1 FOLLOWING)history from employees emp;

     
     