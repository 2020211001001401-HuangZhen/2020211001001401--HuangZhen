
<%@include file="header.jsp"%>
<form method="post" action="/register">

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
    </div>
    <div class="info"> <input id="submit" type="submit" value="Register">

    </div>

</form>
<%@include file="footer.jsp"%>
