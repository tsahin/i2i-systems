<?php
       require("soap.php");
      function operation($input){
        
      
        foreach($input as $operation=>$value){
          return $value;
        }
      }
      $control      = $_POST["radiobutton"]; //radiobutton ismindeki radiobutonlarımızı $ değişkcontrolenimize post methodu ile attık
      $firstNumber  = $_POST["firstNumber"];
      $secondNumber = $_POST["secondNumber"];
      $input=array(
        'first_parameter'=>$firstNumber,
        'second_parameter'=>$secondNumber
      );
        if(empty($control)){
        $returnValue="Select Action";
        
        }
        
        if($control=="addition"){// eğer  değişkcontroleninde yani ismi radiobutton olan radiobutonlarımızda topla işaretli ise $sonuç değişkeninde firstNumber ve secondNumber’yi topla..
        $WebServiceOutput=$WebService->addition($input);
        $returnValue=operation($WebServiceOutput);
        // $returnValue=$firstNumber+$secondNumber;
      
        }
        if($control=="subtraction"){
          $WebServiceOutput=$WebService->subtraction($input);
          $returnValue=operation($WebServiceOutput);
        
          }
       
        if($control=="multiplication"){
          $WebServiceOutput=$WebService->multiplication($input);
          $returnValue=operation($WebServiceOutput);
      
        }
       
       
        if($control=="division"){
          $WebServiceOutput=$WebService->division($input);
          $returnValue=operation($WebServiceOutput);
      
        }
            
       
        ?>
      

<html>
<head>
  <title>Calculator</title>
  <link rel="stylesheet" href="css/style.css"/>
</head>
<body>
<div class="inner">
<form action="" method="post" name="form1">
  <div class="numberBlock">
    <div class="number">
        <span>First Number</span>
        <span><input name="firstNumber" type="text" id="firstNumber"/></span>
    </div>
    <div class="number">
        <span>Second Number</span>
        <span><input name="secondNumber" type="text" id="secondNumber" /></span>
    </div>
  </div>
  <div class="operationBlock">
      <span>
          <input name="radiobutton" type="radio" value="addition" />
          <label>+</label>
      </span>
      <span>
          <input name="radiobutton" type="radio" value="subtraction" /> 
          <label>-</label>
      </span>
      <span>
          <input name="radiobutton" type="radio" value="multiplication" />
          <label>*</label>
      </span>
      <span>
          <input name="radiobutton" type="radio" value="division" />
          <label>/</label>
      </span>
  </div>
  <div class="returnBlock">
      <span><input type="submit" name="Submit" value="=" /></span>
      <span><?php echo $returnValue;?></span>
  </div>
</form>

</div>
</body>
</html>