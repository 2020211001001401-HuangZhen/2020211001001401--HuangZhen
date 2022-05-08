<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
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
            height: 330px;
            width: 430px;
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
        #Username,#Password{
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
    </style>
</head>
<body>

<%@include file="header.jsp"%>
<h2>Login</h2>
<%
    if (!(request.getAttribute("message")==null)){
        out.print("<h3>"+request.getAttribute("message")+"</h3>");
    }

%>
<div class="all">
    <div style="display: flex;">
        <h3>This is my Login JSP page</h3>
    </div>
    <div class="box1">
        <div class="content">
            <text style="display: flex;margin-bottom: 20px;font-size: 13px">Welcome Login !</text>
            <form class="box" onsubmit="return check()" method="post" action="<%=request.getContextPath()+"login"%>" >
                <input type="text" placeholder="Username" id="Username" name="username" required/>
                <input type="password" placeholder="Password" id="Password" name="password" required />
                <input type="submit" value="Login" id="login" style="text-align: center;height: 40px;
            width: 300px;" />
            </form>
        </div>
    </div>
</div>

<%@include file="footer.jsp"%>

<script>
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
