/*
COMMIT / ROLLBACK BENCHMARK
author: Tugba Sahin
date: 30.06.2018
definiton: created transaction_time_benchmark.pkb

*/

CREATE OR REPLACE PACKAGE BODY hr.transaction_time_benchmark AS

    PROCEDURE operation_type (
        pin_number   IN NUMBER, pin_value     IN NUMBER
    ) AS
        operation   NUMBER;
    BEGIN
        IF
            ( pin_value = 1 )
        THEN
            FOR loop_counter IN 1..pin_number LOOP
                INSERT INTO stajyer ( universite ) VALUES ( 'Ktu' );
            END LOOP;

        ELSIF ( pin_value = 2 ) THEN
            FOR loop_counter IN 1..pin_number LOOP
                DELETE FROM stajyer
                WHERE
                    universite = 'Ktu';
            END LOOP;
        ELSIF ( pin_value = 3 ) THEN
            FOR loop_counter IN 1..pin_number LOOP
                UPDATE stajyer
                SET
                    universite = 'Karadeniz Teknik Üniversitesi';
            END LOOP;
        END IF;
    END operation_type;

    PROCEDURE transaction_time (
        pin_option IN NUMBER
    ) AS
        start_time   NUMBER; end_time     NUMBER;
    BEGIN
        start_time := dbms_utility.get_time;
        IF
            ( pin_option = 1 )
        THEN
            ROLLBACK;
        ELSIF ( pin_option = 2 ) THEN
            COMMIT;
        END IF;

        end_time := dbms_utility.get_time;
        dbms_output.put_line(end_time - start_time || 'second');
    END transaction_time;

END transaction_time_benchmark;
/