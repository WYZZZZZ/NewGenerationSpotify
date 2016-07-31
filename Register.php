<?php
    $con = mysqli_connect("http://localhost/phpmyadmin", "root", "", "usrinfo");
    
    $nickname = $_POST["nickname"];
    $username = $_POST["username"];
    $password = $_POST["password"];
    $email = $_POST["email"];

    $statement = mysqli_prepare($con, "INSERT INTO user (nickname, username, password, email) VALUES (?, ?, ?, ?)");
    mysqli_stmt_bind_param($statement, "siss", $nickname, $username, $password, $email);
    mysqli_stmt_execute($statement);
    
    $response = array();
    $response["success"] = true;  
    
    echo json_encode($response);
?>
