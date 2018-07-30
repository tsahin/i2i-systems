/*
PLSQL01-EX-22
author: Tugba Sahin
date: 27.06.2018
definiton: created print_employe_name pkb 
*/
CREATE OR REPLACE PACKAGE BODY hr.staj_utilty AS
    PROCEDURE print_employe_name (
        pin_employeeid   IN hr.employees.employee_id%TYPE
    ) IS
        vs_employeename   hr.employees.first_name%TYPE;
    BEGIN
        vs_employeename := get_employe_name(pin_employeeid);
        dbms_output.put_line(vs_employeename);
    END print_employe_name;
END staj_utilty;
/