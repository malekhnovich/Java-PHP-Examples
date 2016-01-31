<?php
//get category data
$name=  filter_input(INPUT_POST, 'name');
//make sure that $name is valid
if($name==null){
    $error="Invalid name";
    include ('error.php');
    
} else {
    require_once 'database.php';
    
}
//add product to database
$query='INSERT INTO categories(categoryName) VALUES(:category_name)';

$statement=$db->prepare($query);
$statement=bindValue(':category_name',$name);
$statement->execute();
$statement->closeCursor();

//display Category List
include 'category_list.php';
/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

