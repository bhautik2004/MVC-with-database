<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form method="post" action="controlerservlet" > 
    <table border="2px" align="center">
        <tr>
            <th colspan="2" align="center">Login Form</th>
        </tr>
        <tr>
            <td>Username</td>
            <td><input type="text" name="name" required>
            	<input type="hidden" name="isregister" value="no">
            </td>
            	
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password" required></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" name="submit" value="Login"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><a href="index.jsp">Signup</a></td>
        </tr>
    </table>
    </form>

</body>
</html>