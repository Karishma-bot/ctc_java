package jadbcp;
import java.sql.*;
import javax.sql.*;
public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctc","root","karishma");
			//create statement
			Statement st=conn.createStatement();
			//execute sql insert via executeupdate()
			String sqlin="delete from emp where name='sita'";
			int countrow=st.executeUpdate(sqlin);
			System.out.println(countrow+"records deleted");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
