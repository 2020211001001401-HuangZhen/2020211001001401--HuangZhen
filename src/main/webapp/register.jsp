
<%@ page contentType="text/html;charset=UTF-8" language="java" %>





<html>
<head>
    <title>New User Registration!</title>
    <style type="text/css">
        body{
            /*background-color:lightyellow;*/
            background-color: lavender;
            /*display: flex;*/
            align-items: center;
            justify-content: center;
        }
        .all{
            display: flex;
            align-items: center;
            justify-content: center;
            flex-direction: column;
        }
        .box1{
            display: flex;
            align-items: center;
            justify-content: center;
            height: 400px;
            width: 500px;
            border:2px solid gainsboro;
            box-shadow: 0px 0px 15px 3px darkgray;
            border-radius: 20px;
            background-color: lavenderblush;
        }
        /*.content{*/
        /*    */
        /*}*/
        .box{
            display: flex;
            flex-direction: column;
        }
        #Username,#Password,#Email,#Date{
            /*background-color: darksalmon;*/
            display: flex;
            align-items: center;
            box-sizing: border-box;
            /*text-align: center;*/
            margin-bottom: 10px;
            /*margin-top: 10px;*/
            height: 40px;
            width: 300px;
           outline: none;/*去掉input选中后的黑色边框*/
        }
        #man,#woman{
            /*margin-top: 0;*/
            margin-left: 40px;
        }
        .change::placeholder {
            color: #ff0000;
        }
    </style>

</head>
<body>

<%@include file="header.jsp"%>

<div class="all">
    <div style="display: flex;">
        <h3>This is my register JSP page</h3>
    </div>
<div class="box1">
    <div class="content">
           <text style="display: flex;margin-bottom: 20px;font-size: 13px">New User Registration!</text>
     <form class="box" onsubmit="return check()" method="post" action="register">
         <input type="text" placeholder="Username" id="Username" name="username" required/>
         <input type="password" placeholder="Password" id="Password" name="password" required />
         <input type="email" placeholder="Email" id="Email" name="email" required/>
      <div>
         <text>Gender</text>
         <input id="man" type="radio" checked="checked" name="gender" value="male"/>Male
         <input id="woman" type="radio" name="gender" value="female"/>female
      </div>
         <input type="text" id="Date" style="margin-top: 10px" placeholder="Date of Birth(yyyy-mm-dd)" name="birthDate" required/>
         <input type="submit" value="Register" id="register" style="text-align: center;height: 40px;
            width: 300px;" />
     </form>
    </div>
</div>
</div>

<%@include file="footer.jsp"%>

<script>
    let birth = document.querySelectorAll("input")[5];
    let email = document.querySelectorAll("input")[2];
    birth.onblur = function(){
        let reg = /^\d{4}\-\d{2}\-\d{2}$/;
        if(birth.value != '' && !reg.test(birth.value)){
            alert("Error Birth Format");
            console.log(`[error] Error Birth Format`)
        }
    };
    email.onblur = function(){
        let reg =/^[0-9a-zA-Z_.-]+[@][0-9a-zA-Z_.-]+([.][a-zA-Z]+){1,2}$/;
        if(email.value != '' && !reg.test(email.value)){
            alert("Error Email Format");
            console.log(`[error] Error Email Format`)
        }
    };
    function check() {
        var pwd = document.getElementById('Password');
        if (pwd.value.length < 8) {
            pwd.value = "";
            pwd.className="change";
            pwd.placeholder = "length must be at least 8 characters!";
            return false;
        }
        else {
            return true
        }

    }
</script>



</body>
</html>

