<html>
<head>
    <title>Login</title>
    <style>
        body {
            font-family: Arial, Helvetica, sans-serif;
            background-color: black;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        label {
            color: white;
            font-weight: bold;
            margin-bottom: 10px;
        }

        input[type="text"],input[type="email"],input[type="password"] {
            width: 300px;
            padding: 12px 20px;
            box-sizing: border-box;
            margin-bottom: 10px;
        }

        button {
            background-color: #71818e;
            color: white;
            padding: 14px 20px;
            width: 150px;
            margin-top: 10px;
        }

        button:hover {
            opacity: 0.8;
        }
    </style>
</head>
<body>
<form>
    <label for="uname">Username</label><br>
    <input type="text" id="uname" name="uname" placeholder="Enter username" required><br>

    <label for="psw">Password</label><br>
    <input type="password" id="psw" name="psw" placeholder="Enter password" required><br>

    <button type="submit">Login</button>
    <button type="submit">Register</button>
</form>
</body>
</html>