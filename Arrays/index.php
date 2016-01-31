<?php
/**
 * SYNTAX FOR CREATING AN ARRAY
 * $array_name=array([value1[, value2,...]])
 * 
 * SYNTAX FOR REFERRING TO AN ELEMENT OF THE ARRAY
 * $array_name[index];
 * 
 * HOW TO CREATE AN ARRAY OF NAMES
 *  WITH ONE STATEMENT
 *  $names=array('Ted Lewis','Sue Johnson','Ray Thomas');
 * WITH MUTLIPLE STATEMENTS
 * $names=array();              //create an empty array
 * $names[0]='Ted Lewis';       //set three values in the array
 * $names[1]='Sue Jones';
 * $names[2]='Ray Thomas';
 * 
 * HOW TO CREATE AN ARRAY OF DISCOUNTS
 * WITH ONE STATEMENT
 * $discounts=array(0,5,10,15);  //create an array with four elements
 * WITH MULTIPLE STATEMENTS
 * $discounts=array();
 * $discounts[0]=0;
 * $discounts[1]=5;
 * $discounts[2]=10;
 * $discounts[3]=15;
 * 
 *ADDING A VALUE TO THE END OF AN ARRAY
 * $letters=array('a','b','c','d'); //array is a,b,c,d
 * $letters[]='e'; //array is a,b,c,d,e
 * 
 * HOW TO SET A VALUE AT SPECIFIC INDEX
 * $letters=array('a','b','c','d'); //array is a,b,c,d
 * $letters[0]='e';                 //array is e,b,c,d REPLACES A
 * $letters[3]='f';                 //array is e,b,c,f REPLACES D
 * $letters[5]='g';                 //array is e,b,c,f,NULL,g  
 * HOW TO DELETE VALUES FROM AN ARRAY
 * $letters=array('a','b','c','d');// array is a,b,c,d
 * unset($letters[2]); //array is a, b, NULL, d
 * unset($letters); $letters is NULL
 * 
 * HOW TO REMOVE ELEMENTS THAT CONTAIN NULL VALUES AND REINDEX AN ARRAY
 * $letters=array('a','b','c','d');
 * unset($letters[2]);
 * $letters=array_values($letters); //array is a,b,d
 * 
 * HOW TO USE ARRAY ELEMENTS WITH VARIABLE SUBSTITUTION
 * $name-array('Ray','Harris');
 * echo "First Name: $name[0]";    //First Name:Ray 
 * echo "First Name:{$name[0]}";   //First Name:Ray
 * 
 * CODE THAT STORES 10 RANDOM NUMBER IN AN ARRAY
 * $numbers=array();
 * for($i=0;$i<11;$i++){
 * $numbers[]=mt_rand(1,100);
 * 
 * CODE THAT DISPLAYS THE ELEMENTS OF AN ARRAY
 * $numbers_string='';
 * for($i=0;$i<count($numbers);$i++) {
 * $numbers_string.=$numbers[$i].'';
 * }
 * echo $numbers_string;
 * 
 * CODE THAT COMPUTES THE SUM AND AVERAGE OF AN ARRAY OF PRICES
 * $price=array(141.95,212.95,411,10.95);
 * $sum=0;
 * for($i=0;$i<count($price);$i++){
 *  $sum+=$prices[$i];
 * }
 * $average=$sum/count($prices);
 * 
 * HOW TO SKIP GAPS IN AN ARRAY
 * $numbers=array(1,2,3,4,5,6,7,8,9,10);
 * unset($numbers[2],$numbers[6]);
 * end($numbers);
 * $last=key($numbers);
 * $numbers_string='';
 * for($i=0;$i<=last;$i++){
 *  if(isset($numbers[$i])){
 *      numbers_string.=$numbers[$i].' ';
 * }
 * }
 * echo $numbers_string; //displays 1 2 3 4 5 6 7 8 9 10
 * 
 * CREATING AN ASSOCIATIVE ARRAY OF STATE TAX RATES
 * WITH ONE STATEMENT:
 * $tax_rates=array('NC'=>7.75,'CA'=>8.25, 'NY'=>8.875);
 * WITH MULTIPLE STATEMENTS:
 * $tax_rates=array();
 * $tax_rates['NC']=7.75;
 * $tax_rates['CA']=8.25;
 * $tax_rates['NY']=8.875;
 * CREATING AN ASSOCIATIVE ARRAY OF TELEPOHNE EXTENSIONS
 * $ext=array();
 * $ext[10]='Sales';
 * $ext[13]='Customer Services';
 * $ext[16]='Returns';
 * $ext[18]='Warehouse';
 * 
 * FOREACH LOOPS
 * FOREACH LOOP THAT DISPLAYS THE VALUES IN AN ASSOCIATIVE ARRAY
 * $tax_rates=array('NC'->7.75, 'CA'=>8.25,'NY'=>8.875);
 * echo '<ul>';
 * foreach($tax_rates as $rate) {
 * echo "<li> $rate </li>";
 * }
 * 
 * ARRAY WITH RANGE OF VALUES
 * $numbers=range(1,4); //1,2,3,4
 * $numbers=range(10,22,4);//10,14,18,22
 * 
 * MERGE TWO ARRAYS
 * $employees=array('Mike','Anne');
 * $new_hires=array('Ray','Pren');
 * $employees=array_merge($employees, $new_hires);
 * echo implode(',',$employees); //Mike, Anne, Ray, Pren
 * 
 * SLICE ONE ARRAY FROM ANOTHER
 * $employees=array('Mike','Anne','Ray','Pren');
 * $new_hires=array_slice($employees,2);
 * echo implode(',',$new_hires);
 * 
 * WORKING WITH A STACK
 * $names=array('Mike','Joel','Anne');
 * array_push($names,'Ray'); //$names is Mike, Joel, Anne, Ray
 * $next=array_pop($names); //$names is Mike, Joel, Anne
 * echo $next; //displays Ray
 * 
 * WORKING WITH A QUEUE
 * $names=array('Mike','Anne','Joel');
 * array_push($names,'Ray');//$names is Mike, Anne, Joel, Ray
 * $next=array_shift($names); //$names is Anne, Joel, Ray
 * echo $next; //displays Mike
 * 
 * COUNTING THE # OF OCCURENCES IN AN ARRAY
 * $names=array('Mike','Mike','Mike','Anne','Joel','Joel');
 * $occurences=array_count_values($names);
 * echo $occurences['Mike'];  //3
 * echo $occurences['Anne'];  //1
 * echo $occurences['Joel'];  //2
 * 
 * 
 * 
 */