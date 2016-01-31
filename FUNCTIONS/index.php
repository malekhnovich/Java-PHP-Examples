<?php
/**
 * HOW TO DEFINE A FUNCTION
 * a function with no parameters that returns a value
 * function coin_toss(){
 * $coin=(mt_rand(0,1)==0)?'heads':'tails';
 * return $coin;
 * }
 * A function with one parameter
 * function display_error($error){
 * echo '<p class="error">'.$error.'</p>
 * 
 * }
 * A function with three parameters that returns a value
 * function avg_of_3($x,$y,$z){
 * $avg=($x+$y+$z)/3
 * return $avg;
 * 
 * HOW TO CALL A FUNCTION
 * FUNCTIONS THAT RETURNS VALUES
 * $average=avg_of_3(5,2,8);
 * echo coin_toss();
 * 
 * DISCARDING THE RETURN VALUE
 * $list=array('Apples','Oranges','Grape');
 * $last=array_pop($list); //Removes Grapes-stores return value 
 * array_pop($list); //removes Oranges-discards return value
 * 
 * A variable with global scope
 * $a=10;
 * function show_a() {
 * echo $a;
 * }
 * show_a();
 * 
 * HOW TO ACCESS A GLOBAL VARIABLE FROM WITHIN A FUNCTION
 * $b=10; //$b has global scope
 * function show_b() {
 *  global $b; //$b now refers to the global variable named $b
 * echo $b;
 * }
 * show_b(); //Displays 10
 * 
 * ANOTHER WAY TO ACCESS A GLOBAL VARIABLE WITHIN A FUNCTION
 * $c=10;
 * function show_c(){
 * $c=$GLOBALS['c'];
 * echo $c;
 * }
 * show_c(); //Displays 10
 * 
 * A VARIABLE WITH LOCAL SCOPE
 * function show_d()[
 * $d=10;
 * echo $d;
 * }
 * echo $d ;
 * }  
 * 
 * A function with one default parameter
 * function get_rand_bool_text($type='coin') {
 * $rand=mt_rand(0,1);
 * switch($type) {
 * case 'coin':
 * $result=($rand==1)?'heads':'tails';
 * 
 * 
 * A FUNCTION THAT ADDS A LIST OF NUMBERS
 * function add() {
 * $number=func_get_args();
 * $total=0;
 * foreach($numbers as $number){
 * $total+=$number;
 * }
 * return total;
 * }
 * $sum=add(5,10,15);
 * 
 * 
 * ARRAY OF ARRAYS
 * $employees=array (
 * array('name'=> 'Ray', 'id'=>5685),
 * array('name'=> 'Mike', 'id'=>4302),
 * array('name'=> 'Anne', 'id'=>3674),
 * array('name' => 'Pren', 'id'=>1527),
 * array('name'=> 'Joel', 'id'=6256)
 * );
 * 
 * A FUNCTION TO SORT THE ARRAY BY ANY COLUMN
 * function array_compare_factory($sort_key) {
 *  return function($left, $right) use ($sort_key) {
 * if($left[$sort_key]<$right[$sort_key]){
 * return -1;
 * } else if ($left[$sort_key]>$right[$sort_key]) {
 * return 1;
 * }else {
 * return 0;
 * }
 * };
 * }
 * 
 * 
 * 
 *   
 *  */