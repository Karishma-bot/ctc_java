package jadbcp;
import java.sql.*;
import javax.sql.*;
public class PreparedStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctc","root","karishma");
			//create statement
			Statement st=conn.createStatement();
			String sqlin="insert into emp values('sita',200000,'hr')";
			int countrow=st.executeUpdate(sqlin);
			System.out.println(countrow+"records inserted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
