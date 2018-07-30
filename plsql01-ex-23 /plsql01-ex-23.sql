/*
PLSQL01-EX-23:
author: Tugba Sahin
date: 29.06.2018
definition: Used java code named primeNumbers in PL/SQL code
*/
CREATE OR REPLACE AND COMPILE JAVA SOURCE NAMED "primeNumbersJavaDb" AS
public class inputPrimeNumbers {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = false;
        System.out.println("Enter a number: ");
        int number = read.nextInt();
        primeNumbers(number);
    }

    public static void primeNumbers(int number) {
        for(int i = 2; i <= number; ++i) {
            int counter = 0;

            for(int j = 2; j <= i / 2; ++j) {
                if (i % j == 0) {
                    ++counter;
                }
            }

            if (counter == 0) {
                System.out.println(i);
            }
        }

    }
