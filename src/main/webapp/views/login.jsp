<%@ page pageEncoding="UTF-8" language="java" %>
<html>
<head>
<title>Login Page</title>
</head>
<body>
<h2>Xin chào, ${ name }</h2>
<form action="/login" method="POST">
    <div>
        <label>Username</label>
        <input type="text" name="username" />
    </div>
    <div>
        <label>Password</label>
        <input type="password" name="password" />
    </div>
    <div>
        <button>Login</button>
    </div>
</form>

</body>
</html>