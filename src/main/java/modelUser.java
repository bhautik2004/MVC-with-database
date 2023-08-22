import java.io.Console;
import java.sql.*;

public class modelUser {
	
public boolean register(String name ,String email, String password, String gender ,String country ) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MVCDB","root","");
		PreparedStatement pstm = con.prepareStatement("insert into user(name,email,password,gender,country) values(?,?,?,?,?)");
		pstm.setString(1, name);
		pstm.setString(2, email);
		pstm.setString(3, password);
		pstm.setString(4, gender);
		pstm.setString(5, country);
		int i = pstm.executeUpdate();
		if(i>0) {
			return true;
		}
	}catch(Exception e) {
		System.out.println("error"+e.toString());
	}
	return false;
}
public boolean login(String name ,String password ) {
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/MVCDB","root","");
		PreparedStatement pstm = con.prepareStatement("select * from user where name=? and password=?");
		pstm.setString(1, name);
		pstm.setString(2, password);
		ResultSet rs = pstm.executeQuery();
		if(rs.next()) {
			return true;
		}
	}catch(Exception e) {
		System.out.println("error"+e.toString());
	}
	return false;
}

}
