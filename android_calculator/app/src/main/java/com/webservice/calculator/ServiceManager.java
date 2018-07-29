/*
 * Created by INAMOLTUGBA on 25.07.2018.
 *
 */


package com.webservice.calculator;

import org.ksoap2.SoapEnvelope;
import org.ksoap2.serialization.SoapObject;
import org.ksoap2.serialization.SoapPrimitive;
import org.ksoap2.serialization.SoapSerializationEnvelope;
import org.ksoap2.transport.HttpTransportSE;


public class ServiceManager {


    static SoapObject soapObject;
    static SoapSerializationEnvelope soapSerializationEnvelope;
    static HttpTransportSE httpTransportSE;
    static MarshalDouble md = new MarshalDouble();
    public static String Addition(String firstNumber, String secondNumber) {
        String METHOD_NAME = "addition"; //kullanıdıgız service metodu
       // http://209.97.129.103:8080/CalculatorWebService/services/CalculatorWebService?wsdl
        //benim localhost http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl
        String NAMESPACE = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl"; //web service isim alanı
        String SOAP_ACTION = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl/" + METHOD_NAME;
        final String URL = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl";
        String returnedData = "";
        soapObject = new SoapObject(NAMESPACE, METHOD_NAME);


        soapSerializationEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        md.register(soapSerializationEnvelope);
        soapSerializationEnvelope.dotNet = true;
        soapSerializationEnvelope.setOutputSoapObject(soapObject);

        soapObject.addProperty("first_parameter", Double.parseDouble(firstNumber));
        soapObject.addProperty("second_parameter", Double.parseDouble(secondNumber));


        httpTransportSE = new HttpTransportSE(URL);
        httpTransportSE.debug = true;
        try {
            httpTransportSE.call(SOAP_ACTION, soapSerializationEnvelope);
            SoapPrimitive soapPrimitive = (SoapPrimitive) soapSerializationEnvelope.getResponse();
            returnedData = soapPrimitive.toString();
            System.out.println(soapPrimitive.toString());
        } catch (Exception ex) {
            System.out.println("şüpheli yer");
            ex.printStackTrace();
        }
        return returnedData;

    }
    public static String Subtraction(String firstNumber, String secondNumber) {
        String METHOD_NAME = "subtraction"; //kullanıdıgız service metodu
        // http://209.97.129.103:8080/CalculatorWebService/services/CalculatorWebService?wsdl
        //benim localhost http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl
        String NAMESPACE = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl"; //web service isim alanı
        String SOAP_ACTION = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl/" + METHOD_NAME;
        final String URL = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl";
        String returnedData = "";
        soapObject = new SoapObject(NAMESPACE, METHOD_NAME);


        soapSerializationEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        md.register(soapSerializationEnvelope);
        soapSerializationEnvelope.dotNet = true;
        soapSerializationEnvelope.setOutputSoapObject(soapObject);

        soapObject.addProperty("first_parameter", Double.parseDouble(firstNumber));
        soapObject.addProperty("second_parameter", Double.parseDouble(secondNumber));


        httpTransportSE = new HttpTransportSE(URL);
        httpTransportSE.debug = true;
        try {
            httpTransportSE.call(SOAP_ACTION, soapSerializationEnvelope);
            SoapPrimitive soapPrimitive = (SoapPrimitive) soapSerializationEnvelope.getResponse();
            returnedData = soapPrimitive.toString();
            System.out.println(soapPrimitive.toString());
        } catch (Exception ex) {
            System.out.println("şüpheli yer");
            ex.printStackTrace();
        }
        return returnedData;

    }
    public static String Multiplication(String firstNumber, String secondNumber) {
        String METHOD_NAME = "multiplication"; //kullanıdıgız service metodu
        // http://209.97.129.103:8080/CalculatorWebService/services/CalculatorWebService?wsdl
        //benim localhost http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl
        String NAMESPACE = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl"; //web service isim alanı
        String SOAP_ACTION = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl/" + METHOD_NAME;
        final String URL = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl";
        String returnedData = "";
        soapObject = new SoapObject(NAMESPACE, METHOD_NAME);


        soapSerializationEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        md.register(soapSerializationEnvelope);
        soapSerializationEnvelope.dotNet = true;
        soapSerializationEnvelope.setOutputSoapObject(soapObject);

        soapObject.addProperty("first_parameter", Double.parseDouble(firstNumber));
        soapObject.addProperty("second_parameter", Double.parseDouble(secondNumber));


        httpTransportSE = new HttpTransportSE(URL);
        httpTransportSE.debug = true;
        try {
            httpTransportSE.call(SOAP_ACTION, soapSerializationEnvelope);
            SoapPrimitive soapPrimitive = (SoapPrimitive) soapSerializationEnvelope.getResponse();
            returnedData = soapPrimitive.toString();
            System.out.println(soapPrimitive.toString());
        } catch (Exception ex) {
            System.out.println("şüpheli yer");
            ex.printStackTrace();
        }
        return returnedData;

    }
    public static String Division(String firstNumber, String secondNumber) {
        String METHOD_NAME = "division"; //kullanıdıgız service metodu
        // http://209.97.129.103:8080/CalculatorWebService/services/CalculatorWebService?wsdl
        //benim localhost http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl
        String NAMESPACE = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl"; //web service isim alanı
        String SOAP_ACTION = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl/" + METHOD_NAME;
        final String URL = "http://10.0.2.2:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl";
        String returnedData = "";
        soapObject = new SoapObject(NAMESPACE, METHOD_NAME);


        soapSerializationEnvelope = new SoapSerializationEnvelope(SoapEnvelope.VER11);
        md.register(soapSerializationEnvelope);
        soapSerializationEnvelope.dotNet = true;
        soapSerializationEnvelope.setOutputSoapObject(soapObject);

        soapObject.addProperty("first_parameter", Double.parseDouble(firstNumber));
        soapObject.addProperty("second_parameter", Double.parseDouble(secondNumber));


        httpTransportSE = new HttpTransportSE(URL);
        httpTransportSE.debug = true;
        try {
            httpTransportSE.call(SOAP_ACTION, soapSerializationEnvelope);
            SoapPrimitive soapPrimitive = (SoapPrimitive) soapSerializationEnvelope.getResponse();
            returnedData = soapPrimitive.toString();
            System.out.println(soapPrimitive.toString());
        } catch (Exception ex) {
            System.out.println("şüpheli yer");
            ex.printStackTrace();
        }
        return returnedData;

    }
}

