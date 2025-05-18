package in.sp.test;
import java.sql.DriverManager;
public class InsertDemo {

	public static void main(String[] args) throws ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","system");
		System.out.println("this is error");
	}
}
