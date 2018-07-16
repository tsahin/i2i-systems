CREATE OR REPLACE PACKAGE exp_utility AS
PROCEDURE get_employee_name (
   pin_employeeid IN EMPLOYEES.EMPLOYEE_ID%TYPE
);
END exp_utility;