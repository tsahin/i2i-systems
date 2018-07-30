/*
PLSQL01-EX-22
author: Tugba Sahin
date: 27.06.2018
definiton: created print_employe_name pks
*/
CREATE OR REPLACE PACKAGE hr.staj_utilty AS
    PROCEDURE print_employe_name (
        pin_employeeid IN hr.employees.employee_id%TYPE
    );
END staj_utilty;