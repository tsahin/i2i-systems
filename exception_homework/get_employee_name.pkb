CREATE OR REPLACE PACKAGE BODY exception_utility AS

    PROCEDURE get_employee_name (
        pin_employeeid   IN employees.employee_id%TYPE
    ) IS
        vs_employeename   hr.employees.first_name%TYPE;
    BEGIN
        SELECT
            first_name
        INTO vs_employeename
        FROM
            employees
        WHERE
            employee_id = pin_employeeid;

        dbms_output.put_line(vs_employeename);
    EXCEPTION
        WHEN no_data_found THEN
            dbms_output.put_line(employee_id || 'EMPOLYEE_NOT_FOUND');
        WHEN OTHERS THEN
            dbms_output.put_line('error'
                                   || '----'
                                   || sqlerrm
                                   || '----'
                                   || dbms_utility.format_error_backtrace);

            RAISE;
    END get_employee_name;

END exception_utility;