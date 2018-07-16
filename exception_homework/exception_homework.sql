/*
PL/SQL EX-25
date: 06-07-2018
author: Tugba Sahin
definition: I learned excepton statements
*/

@pks/get_employee_name.pks
@pkb/get_employee_name.pkb

/
BEGIN
hr.exp_utility.get_employee_name(100); 
END;
/