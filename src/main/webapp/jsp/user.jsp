<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>用户操作</title>
</head>
<body>
    <p>新增账号：</p>
    <form action="<%=path%>/demos/addUser.action" method="post">
        <p>账号：<input type="text" name="userName" /></p>
        <input type="submit" value="提交" />
    </form>
    <hr/>

    <p>用户列表：</p>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>账号</th>
            <th>操作</th>
        </tr>
        <s:iterator var="user" value="users">
            <tr>
                <td><s:property value="#user.id" /></td>
                <td><s:property value="#user.userName" /></td>
                <td><a href="<%=path%>/demos/deleteUserById.action?id=<s:property value="#user.id" />">删除</a></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
