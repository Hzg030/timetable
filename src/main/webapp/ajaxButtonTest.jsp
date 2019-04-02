<%--
  Created by IntelliJ IDEA.
  User: supermac
  Date: 2019-03-30
  Time: 18:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button class="layui-btn" type="button" onclick="sendAuthMessage();">获取所有教学班</button>
<script>
    function sendAuthMessage(){
        // var phone = document.getElementById("user.phone").value;
        $.ajax({
            url:'/MyWebsite/pushAuthMessages',
            type:'POST',//GET 或POST
            async:true,//false是否异步
            data:{"phone":phone},
            processData: false,
            contentType: false,
            dataType:'text',//返回的数据格式类型json/xml/html/script/jsonp/text    （返回的值很关键，如果不是text类型，页面可能会被重写）
            success:function(data){
                alert(1);
            },
            error:function(data){
                alert(2);
            }
        });
    }
</script>

</body>
</html>
