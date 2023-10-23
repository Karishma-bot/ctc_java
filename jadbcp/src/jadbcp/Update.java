package jadbcp;
import java.sql.*;
import javax.sql.*;
public class Update {

	public static void main(String[] args) {
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctc","root","karishma");
			//create statement
			Statement st=conn.createStatement();
			//execute sql update via executeupdate()
			String sqlin="delete from emp set salary=25000 where name='ram'";
			int countrow=st.executeUpdate(sqlin);
			System.out.println(countrow+"records updated");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
