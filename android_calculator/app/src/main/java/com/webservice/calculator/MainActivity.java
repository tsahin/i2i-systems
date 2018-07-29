package com.webservice.calculator;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText editTextFirstNumber,editTextSecondNumber;
    static TextView result;
    Button add,sub,mul,div,clear;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextFirstNumber =(EditText)findViewById(R.id.et_first_number);
        editTextSecondNumber=(EditText)findViewById(R.id.et_second_number);
            result=(TextView) findViewById(R.id.tv_result);
            add=(Button)findViewById(R.id.btn_topla);
            sub=(Button)findViewById(R.id.btn_cikar);
            mul=(Button)findViewById(R.id.btn_carp);
            div=(Button)findViewById(R.id.btn_bol);
            clear=(Button)findViewById(R.id.btn_temizle);

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String firstNumber  = editTextFirstNumber.getText().toString();
                String secondNumber = editTextSecondNumber.getText().toString();



                try {
                    AdditionAsyncTask addition = new AdditionAsyncTask();
                    addition.execute(firstNumber, secondNumber);

                } catch(Exception ex){
                    System.out.println("Exception is: " + ex);

                }

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String firstNumber  = editTextFirstNumber.getText().toString();
                String secondNumber = editTextSecondNumber.getText().toString();



                try {
                    SubtractionAsyncTask subtraction = new SubtractionAsyncTask();
                    subtraction.execute(firstNumber, secondNumber);

                } catch(Exception ex){
                    System.out.println("Exception is: " + ex);

                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String firstNumber  = editTextFirstNumber.getText().toString();
                String secondNumber = editTextSecondNumber.getText().toString();



                try {
                    MultiplicationAsyncTask multiplication = new MultiplicationAsyncTask();
                    multiplication.execute(firstNumber, secondNumber);

                } catch(Exception ex){
                    System.out.println("Exception is: " + ex);

                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String firstNumber  = editTextFirstNumber.getText().toString();
                String secondNumber = editTextSecondNumber.getText().toString();



                try {
                    DivisionAsyncTask division = new DivisionAsyncTask();
                    division.execute(firstNumber, secondNumber);

                } catch(Exception ex){
                    System.out.println("Exception is: " + ex);

                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                editTextFirstNumber.setText("");
                editTextSecondNumber.setText("");
                result.setText("");
            }
        });

    }


    public class AdditionAsyncTask extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... dizi) {
            Log.d("test", "TUGBA:" + dizi[0]+ dizi[1]) ;
            String firstNumber  = dizi[0];
            String secondNumber = dizi[1];

            return ServiceManager.Addition(firstNumber, secondNumber);
        }


        @Override
        protected void onPostExecute(String s) {
            Log.d("deneme", "onPostExecute: " +s );
            result.setText(s);
        }

    }
    public class SubtractionAsyncTask extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... dizi) {
            Log.d("test", "TUGBA:" + dizi[0]+ dizi[1]) ;
            String firstNumber  = dizi[0];
            String secondNumber = dizi[1];

            return ServiceManager.Subtraction(firstNumber, secondNumber);
        }


        @Override
        protected void onPostExecute(String s) {
            Log.d("deneme", "onPostExecute: " +s );
            result.setText(s);
        }

    }
    public class MultiplicationAsyncTask extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... dizi) {
            Log.d("test", "TUGBA:" + dizi[0]+ dizi[1]) ;
            String firstNumber  = dizi[0];
            String secondNumber = dizi[1];

            return ServiceManager.Multiplication(firstNumber, secondNumber);
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("deneme", "onPostExecute: " +s );
            result.setText(s);
        }

    }
    public class DivisionAsyncTask extends AsyncTask<String,String,String> {
        @Override
        protected String doInBackground(String... dizi) {
            Log.d("test", "TUGBA:" + dizi[0]+ dizi[1]) ;
            String firstNumber  = dizi[0];
            String secondNumber = dizi[1];

            return ServiceManager.Division(firstNumber, secondNumber);
        }

        @Override
        protected void onPostExecute(String s) {
            Log.d("deneme", "onPostExecute: " +s );
            result.setText(s);
        }

    }
}










