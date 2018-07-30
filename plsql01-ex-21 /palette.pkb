CREATE OR REPLACE PACKAGE BODY hr.palette AS 
    PROCEDURE drawpyramid (
        pin_size IN NUMBER
    ) IS
        num NUMBER;
        i NUMBER := 1;
        j NUMBER;
        k NUMBER;
    begin 
  
        num := pin_size;
        WHILE i<num LOOP
            j:=1;
            WHILE j<num-i LOOP
                dbms_output.put(' ');
                j:=j+2;
            END LOOP;

            FOR k in 1..i LOOP
                dbms_output.put('*');
            END LOOP;
            dbms_output.new_line;
            i:=i+2;
        END LOOP;
    
        WHILE i>=1 LOOP
            j:=pin_Size;
            
            WHILE j>i LOOP
                dbms_output.put(' ');
                j:=j-2;
            END LOOP;
 
            FOR k in 1..i LOOP
                dbms_output.put('*');
            END LOOP;
            dbms_output.new_line;
            i := i - 2;
        END LOOP; 
    END drawpyramid; 
END palette;