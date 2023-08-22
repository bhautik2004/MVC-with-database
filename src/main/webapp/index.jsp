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
            <th colspan="2" align="center">Registration Form</th>
        </tr>
        <tr>
            <td>Username</td>
            <td><input type="text" name="name" required>
            	<input type="hidden" name="isregister" value="yes">
            </td>
            	
        </tr>
        <tr>
            <td>Email</td>
            <td><input type="email" name="email" required></td>
        </tr>
        <tr>
            <td>password</td>
            <td><input type="password" name="password" required></td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>
                MALE <input type="radio" name="gender" value="male">
                FEMALE <input type="radio" name="gender" value="female">
            </td>
        </tr>
        <tr>
            <td>Counrty</td>
            <td><select name="country">
            <option value="" disabled selected>Country</option>
                <option value="india">india</option>
                <option value="us">us</option>
                <option value="japan">japan</option>
            </select></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><input type="submit" name="submit" value="Sign Up"></td>
        </tr>
        <tr>
            <td colspan="2" align="center"><a href="login.jsp">Login</a></td>
        </tr>
    </table>
    </form>
 
</body>
</html>