<%-- 
    Document   : login
    Created on : 07-Aug-2024, 6:24:52 pm
    Author     : Arpan
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login </title>
    </head>
    <body>
        <style>
   body {
        font-family: 'Arial', sans-serif;
        display: flex;
        flex-direction: column;
        align-items: center;
        justify-content: center;
        height: 100vh;
        margin: 0;
        background-color: #AEFD6C;
        background-image: url('loginimage.png');
        background-size: cover;
        background-position: center center;
        background-repeat: no-repeat;
        color: #333;
    }

    /* Container Styles */
    .container {
        width: 350px;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 1, 0.5);
        background-color: rgba(0, 0, 0, 0.5);  /* added transparency */
        text-align: center;
        color: #fff;
    }

    /* Form Styles */
    form {
        display: flex;
        flex-direction: column;
        align-items: center;
    }

    label {
        display: block;
        margin: 10px 0;
        color: white;
        font-size: 18px;
    }

    input {
        width: 60%;
        height: 25px;
        padding: 10px;
        margin: 10px 0;
        border: none;
        border-radius: 5px;
        font-size: 18px;
    }

    

   
    a {
        text-decoration: none;
        color: blue;
    }

    a:hover {
        color: blue;
    }
    </style>
<body>
    <div class ="container">
        <h1>Login</h1>
        <form action="LoginServlet" method="post">
        <label for="username">Username: </label>
        <input type="text" id="username" name="username" required><br>
        <label for="password">Password: </label>
        <input type="password" id="password" name="password" required><br>
        <button type="submit"> Submit </button>
        </form>
        <p><a href="index.html">Back to home page</a></p>
    </body>
</html>
