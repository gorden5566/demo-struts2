<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String path = request.getContextPath(); %>
<html>
  <head>
    <title>欢迎</title>
  </head>
  <body>
    <p>demos列表：</p>
    <table border="1">
        <tr>
            <th>序号</th>
            <th>名称</th>
            <th>说明</th>
            <th>备注</th>
        </tr>
        <tr>
            <td>1</td>
            <td><a href="<%=path%>/demos/helloworld.action" target="_blank">HellWorldAction</a> </td>
            <td>第一个struts2 demo</td>
            <td>无</td>
        </tr>
        <tr>
            <td>2</td>
            <td><a href="<%=path%>/demos/showAllUser.action" target="_blank">数据库读取</a> </td>
            <td>数据库操作demo</td>
            <td>需先执行USER.sql</td>
        </tr>
    </table>
  </body>
</html>
