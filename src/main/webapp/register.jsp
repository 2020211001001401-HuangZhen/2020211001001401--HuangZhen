
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>

</head>

<body>
<form actions="" method="post" action="/register">

    <div class="info">
        <p>New User Registration</p>
    </div>
    <div class="info">
        <label><input type="text" name="name" placeholder="UserName" size="30" maxlength="100" /></label>
        <br />
        <label><input type="password" name="password" placeholder="password" size="30"
                      maxlength="100" /></label><br />
        <label><input type="text" name="Email" placeholder="Email" size="30" maxlength="100" /></label>
    </div>
    <div class="info">
        <label>Gender</label>
        <label><input type="radio" name="sex" value="Male">Male</label>
        <label><input type="radio" name="sex" value="Female">Female</label>
    </div>
    <div class="info">
        <label><input type="text" name="Date of Birth" placeholder="Date of Birth(yyyy-mm-dd)" size="30"
                      maxlength="100" /></label><br />
        <div class="info"> <input id="submit" type="submit" value="Register">

        </div>

</form>


</body>

</html>