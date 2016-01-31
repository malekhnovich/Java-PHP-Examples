<!DOCTYPE html>

<!--
*********PROJECT1-218**********************
-->
<html>
<head>
        <meta charset="UTF-8">
        <title>Project2</title>
    </head>
    <body>
        
        <?php
        $servername = "localhost";
$username = "root";
$password = "";
$dbname = "218";
//session_start();
// Create connection
$conn = mysqli_connect($servername, $username, $password, $dbname);
// Check connection
if (!$conn) {
    die("Connection failed: " . mysqli_connect_error());
}
echo"<h1> Project 2 by Max Alekhnovich</h1>";
$sql="SELECT DISTINCT STABBR FROM COLLEGES";
$result=  mysqli_query($conn, $sql);
$total=  mysqli_num_rows($result);

 //output data of each row
?>
        <form action="First.php" method="GET">
          <select id="drop" name="drop">;
              
       
        <?php
    
    while($row=  mysqli_fetch_array($result)){
        
         $state_abbreviation=$row["STABBR"];
        $row_1[]=$state_abbreviation;
        sort($row_1);
         
    }
    foreach($row_1 as $state){
           
     echo"<option name=drop value =" .$state."'>".$state."</option<br>";
    }
   echo "</select>";
   
 
?>
<input type="submit"/>
    </form>    
 <?php $sql2="SELECT DISTINCT ICLEVEL FROM COLLEGES";
        $result2=  mysqli_query($conn, $sql2);
 ?>
        <form action="Second.php" method="GET">
            <select id="level" name="level">;
                <?php
                while($row2=  mysqli_fetch_assoc($result2)){
                    $leveled=$row2["ICLEVEL"];
                    echo "<option name=level value=".$leveled."'>".$leveled."</option <br>";
                }
                echo "</select>";
                ?>
                <input type="submit"/>
        </form>
        <?php $sql3="SELECT DISTINCT STABBR FROM COLLEGES";
                $result3=  mysqli_query($conn, $sql3);
                ?>
        <form action="Third.php" method="GET">
            <select id="hospital" name="hospital">;
                <?php 
                while($hospitaled=  mysqli_fetch_assoc($result3)){
         $state_abbreviation2=$hospitaled["STABBR"];
         echo "<option name=hospital value =".$state_abbreviation2."'>".$state_abbreviation2."</option <br>";
               
                }
                echo "</select>";
                ?>
                <input type="submit"/>
                </form>
       <?php 
       ?>
        <form action="Fourth.php" method="GET">
             <input name="Question4" value="Question4"type="submit"/>  
        <?php 
               ?>
        </form>
        
        
        <form action="Fifth.php" method="GET">
<input type="submit" value="Question5" name="Question5"/>
<br>
        </form>

<?php $sql6="SELECT DISTINCT STABBR FROM COLLEGES";
        $result6=  mysqli_query($conn, $sql6);
        ?>


<form action="Sixth.php" method="GET">
    
        <?php
        /*
        while($pubRank=  mysqli_fetch_assoc($result6)){
            $rankPublic=$pubRank["STABBR"];
            echo"<option name=publicRank value=".$rankPublic."'>".$rankPublic."</option <br>";
        }
        echo "</select>";
        ?>
         * 
         */?>
<input name="Question6" value="Question6"type="submit"/>
</form>