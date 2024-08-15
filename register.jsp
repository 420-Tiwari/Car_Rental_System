<%-- 
    Document   : register
    Created on : 07-Aug-2024, 6:25:18 pm
    Author     : Arpan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title> Register </title>
    </head>
     <style>
 body {
        font-family: 'Arial', sans-serif;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 10px;
        background-color: dimgray;
        background-image: url('Register.jpg');
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
        color: #333;
    }


.container {
    width: 600px;
    padding: 20px;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 1, 0.5);
    background-color: rgba(0, 0, 0, 0.7);  /* added transparency */
    text-align: center;
    color: #fff;
}
input {
        width: 50%;
        height: 10px;
        padding: 10px;
        margin: 10px 0;
        border: none;
        border-radius: 5px;
        font-size: 18px;
    }
    label{
        display: block;
        margin: 10px 0;
        color: #fff;
        font-size: 18px;
    }
    a {
                color: blue; /* Changes the text color to blue */
                font-weight: bold; /* Makes the text bold */
                font-size: 18px; /* Optional: increases the font size */
                text-decoration: none; /* Removes underline */
            }
       a:hover {
                text-decoration: underline; /* Adds underline on hover */
            }
    </style>

    <body>
    <div class ="container">
        <h1>Register</h1>
        <form action="RegistrationServlet" method="post">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username" required><br>
        <label for="email">Email: </label>
        <input type="text" id="email" name="email" required><br>
        <label for="password">Password: </label>
        <input type="possword" id="password" name="password" required><br>
        <button type="submit"> Submit </button>
        </form>
        <p><a href="index.html">Back to home page</a></p>
    </body>
</html>