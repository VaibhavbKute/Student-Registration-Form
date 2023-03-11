<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Student Registration</title>
    <style>
        /* Header styling */
        header {
            background-color: #008080;
            color: #fff;
            padding: 20px;
        }
        h1 {
            font-size: 36px;
            margin: 0;
            text-align: center;
        }
        /* Form styling */
        form {
            background-color: #fff;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
            margin: 20px auto;
            max-width: 500px;
            padding: 40px;
        }
        h2 {
            color: #008080;
            font-size: 28px;
            margin-bottom: 20px;
            text-align: center;
        }
        label {
            color: #008080;
            display: block;
            font-size: 18px;
            margin-bottom: 5px;
        }
        input[type="text"],
        input[type="number"] {
            border: none;
            border-radius: 5px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
            font-size: 16px;
            margin-bottom: 20px;
            padding: 10px;
            width: 100%;
        }
        input[type="text"]:focus,
        input[type="number"]:focus {
            outline: none;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.3);
        }
        input[type="submit"] {
            background-color: #008080;
            border: none;
            border-radius: 5px;
            color: #fff;
            cursor: pointer;
            font-size: 18px;
            padding: 10px;
            transition: background-color 0.3s ease;
            width: 100%;
        }
        input[type="submit"]:hover {
            background-color: #005050;
        }
        p {
            color: #f00;
            font-size: 16px;
            margin-top: 10px;
            text-align: center;
        }
    </style>
</head>
<body>
    <header>
        <h1>Student Registration</h1>
    </header>
    <form action="saveStud" method="post"> 
        <h2>Student Information</h2>
        <label for="firstName">First Name:</label>
        <input type="text" name="firstName" placeholder="First Name" required>
    
        <label for="lastName">Last Name:</label>
        <input type="text" name="lastName" placeholder="Last Name" required>
    
        <label for="stream">Stream:</label>
        <input type="text" name="stream" placeholder="Stream" required>
    
        <label for="email">Email:</label>
        <input type="text" name="email" placeholder="Email" required>
    
        <label for="mobile">Mobile:</label>
        <input type="number" name="mobile" placeholder="Mobile" required>
    
        <input type="submit" value="Save"/>
    </form>
      
      <div style="text-align:center;">
    					${msg}
</div>       
</body>
</html>
