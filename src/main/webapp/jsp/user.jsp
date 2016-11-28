<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="/struts-tags" prefix="s"%>
<html>
<head>
    <title>用户列表</title>
</head>
<body>
    <p>用户列表：</p>
    <table border="1">
        <tr>
            <th>ID</th>
            <th>账号</th>
        </tr>
        <s:iterator var="user" value="users">
            <tr>
                <td><s:property value="#user.id" /></td>
                <td><s:property value="#user.userName" /></td>
            </tr>
        </s:iterator>
    </table>
</body>
</html>
