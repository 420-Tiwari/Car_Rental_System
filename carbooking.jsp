<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Car Booking Form</title>
    
    <style>
        body {
            background-image: url('Start_booking.png');
            background-size: cover; 
            font-family: 'Arial', sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: 100vh;
            margin: 0;
            background-color: dimgray;
            background-size: 1400px 680px;
            background-position: center center;
            background-repeat: no-repeat;
            color: #333;
        }

        /* Container Styles */
        .container {
            width: 350px;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5); /* Add shadow with blur */
            background-color: rgba(173, 255, 47, 0.9); 
            text-align: center;
            color: #333;
        }

        /* Form Styles */
        form {
            display: flex;
            flex-direction: column;
            align-items: center;
        }

        .form-group {
            width: 100%;
            margin: 10px 0;
        }

        label {
            display: block;
            margin-bottom: 5px;
            color: #333;
        }

        input[type="text"],
        select,
        input[type="date"] {
            width: calc(100% - 20px);
            padding: 8px;
            border-radius: 5px;
            border: 1px solid #ddd;
        }

        input[type="submit"] {
            margin-top: 10px;
            padding: 10px 20px;
            border: none;
            border-radius: 5px;
            background-color: #4CAF50;
            color: white;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        .message {
            color: darkorange;
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
    <h1>Booke you car</h1>
   <form action="CarServlet" method="post">
            <div class="form-group">
                <label for="name">Enter your name:</label>
                <input type="text" id="name" name="name" required>
            </div>
            
            <div class="form-group">
                <label for="carModel">Car Model:</label>
                <select id="carModel" name="carModel" required>
                    <option value="Toyota">Toyota</option>
                    <option value="Honda">Honda</option>
                    <option value="Ford">Ford</option>
                    <option value="BMW">BMW</option>
                </select>
            </div>

            <div class="form-group">
                <label for="date">Booking Date:</label>
                <input type="date" id="bookingdate" name="bookingdate" required>
            </div>
       
            <div class="form-group">
                <label for="date">Return Date:</label>
                <input type="date" id="returndate" name="returndate" required>
            </div>

            <div class="form-group">
                <input type="submit" value="Book Now">
            </div>
        </form>
</body>
</html>
