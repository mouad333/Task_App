<?php

     DEFINE('DB_USERNAME', 'root');
     DEFINE('DB_PASSWORD', '');
     DEFINE('DB_HOST', 'localhost');
     DEFINE('DB_DATABASE', 'tasks_db');

     $conn = mysqli_connect(DB_HOST, DB_USERNAME, DB_PASSWORD, DB_DATABASE);
     /* if($conn){
      echo "success";
        }else{
      echo "error";
      }
    */
?>