<?php
//Get IDs
$product_id=$_POST['product_id'];
$category_id=$_POST['category_id'];
//Delete the product from the database
require_once ('database.php');
$query="DELETE FROM products"
        . "WHERE productID='$product_id'";
$db->exec($query);

//Display the product List page

include ('index.php');
?>


/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

