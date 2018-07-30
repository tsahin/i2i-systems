<?php

ini_set("soap.wsdl_cache_enabled", "0");

try {
  $WebServiceUrl="http://localhost:8070/CalculatorWebService/services/CalculatorWebServiceImpl?wsdl";
  $WebService = new SoapClient($WebServiceUrl);

} catch (Exception $exc) { // Hata olusursa yakala
  echo "Soap Hatasi Olustu: " . $exc->getMessage();
}
?>