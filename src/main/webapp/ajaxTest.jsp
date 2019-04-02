<%--
  Created by IntelliJ IDEA.
  User: supermac
  Date: 2019-03-27
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>欢迎进入排课系统</title>

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim 和 Respond.js 是为了让 IE8 支持 HTML5 元素和媒体查询（media queries）功能 -->
    <!-- 警告：通过 file:// 协议（就是直接将 html 页面拖拽到浏览器中）访问页面时 Respond.js 不起作用 -->
    <!--[if lt IE 9]>
    <script src="https://cdn.jsdelivr.net/npm/html5shiv@3.7.3/dist/html5shiv.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/respond.js@1.4.2/dest/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<h3 style="text-align:center;">需要排课表:<br>  </h3>
<form action="" >
    <div class="form-group" align="center">
        <h5>请选择学院：</h5>
        <select class="selectpicker" name="institute" onchange="sub(1,this.value)" data-live-search="true">
            <option value="1" style="color: #b6b6b6" disabled selected>请选择学院</option>
            <c:forEach items="${instituteList}" var="institute">
                <option value="${institute}">${institute}</option>
            </c:forEach>
        </select>
    </div>
</form>


<div id="Result"></div>
<br>

<script type="text/javascript">

    //ajax回显数据
    // function  sub(){
    //     $.ajax({
    //         dataType:"json",    //数据类型为json格式
    //         contentType: "application/x-www-form-urlencoded;charset=UTF-8",
    //         type:"post",
    //         url:"TestServlet",
    //         statusCode: {
    //             404: function() {
    //                 alert('提交地址url未发现。 ');
    //             }
    //         },
    //         success:function(data,textStatus){
    //             //alert(data);//对象
    //             alert("返回状态："+textStatus);//状态
    //             document.getElementById("Result").innerHTML=xmlhttp.responseText;
    //
    //         }
    //     });
    // }
    function sub(currentPage,institute)
    {
        var xmlhttp;
        if (window.XMLHttpRequest)
        {
            // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
            xmlhttp=new XMLHttpRequest();
        }
        else
        {
            // IE6, IE5 浏览器执行代码
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange=function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                document.getElementById("Result").innerHTML=xmlhttp.responseText;
                // alert("请求成功")
            }
        }
        xmlhttp.open("GET","getAllTeachingClass?currentPage="+currentPage+"&institute="+institute,true);
        xmlhttp.send();
    }

</script>

<h3 style="text-align:center;">已排课表:<br>  </h3>
<form action="" >
    <div class="form-group" align="center">
        <select class="selectpicker" data-style="btn-primary" name="teacher" onchange="timeTable('teacher',this.value)" data-live-search="true">
            <option value="1" style="color: #b6b6b6" disabled selected>按教室查看课表</option>
            <c:forEach items="${teacherList}" var="teacher">
                <option value="${teacher}">${teacher}</option>
            </c:forEach>
        </select>
    </div>
</form>
<form action="" >
    <div class="form-group" align="center">
        <select class="selectpicker" data-style="btn-primary" name="classes" onchange="timeTable('class',this.value)" data-live-search="true">
            <option value="1" style="color: #b6b6b6" disabled selected>按行政班查看课表</option>
            <c:forEach items="${classList}" var="cla">
                <option value="${cla}">${cla}</option>
            </c:forEach>
        </select>
    </div>
</form>

<script type="text/javascript">

    //ajax回显数据
    // function  sub(){
    //     $.ajax({
    //         dataType:"json",    //数据类型为json格式
    //         contentType: "application/x-www-form-urlencoded;charset=UTF-8",
    //         type:"post",
    //         url:"TestServlet",
    //         statusCode: {
    //             404: function() {
    //                 alert('提交地址url未发现。 ');
    //             }
    //         },
    //         success:function(data,textStatus){
    //             //alert(data);//对象
    //             alert("返回状态："+textStatus);//状态
    //             document.getElementById("Result").innerHTML=xmlhttp.responseText;
    //
    //         }
    //     });
    // }
    function timeTable(type,name)
    {
        var xmlhttp;
        if (window.XMLHttpRequest)
        {
            // IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
            xmlhttp=new XMLHttpRequest();
        }
        else
        {
            // IE6, IE5 浏览器执行代码
            xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
        }
        xmlhttp.onreadystatechange=function()
        {
            if (xmlhttp.readyState==4 && xmlhttp.status==200)
            {
                document.getElementById("TimeTable").innerHTML=xmlhttp.responseText;
                // alert("请求成功")
            }
        }
        xmlhttp.open("GET","getTimeTable?type="+type+"&name="+name,true);
        xmlhttp.send();
    }

</script>
<div id="TimeTable"></div>
<br>

</body>
</html>