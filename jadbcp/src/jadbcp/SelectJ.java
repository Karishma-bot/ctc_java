package jadbcp;
import java.sql.*;
import javax.sql.*;
public class SelectJ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ctc","root","karishma");
			//step 4 create a statement
			Statement st =conn.createStatement();
			//execute the query
			String strSelect="select * from emp";
			System.out.println("the sql statement is "+strSelect);
			
			//process the result
			ResultSet rst=st.executeQuery(strSelect);
			System.out.println("the records are");
			int rowcount=0;
			while(rst.next()) {
				String name=rst.getString("name");
				int salary=rst.getInt("salary");
				String dept=rst.getString("dept");
				System.out.println(name+" "+salary+" "+dept);
				++rowcount;
			}
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
