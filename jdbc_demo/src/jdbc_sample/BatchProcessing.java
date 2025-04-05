package jdbc_sample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchProcessing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String q1="update city set population=35000 where district='thanjavur'";
			String q2="update city set population=15000 where district='manhattan'";
			String q3="update city set population=25000 where district='central region'";
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Mani123");
			Statement st = con.createStatement();
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			
			int[] batch = st.executeBatch();
			
			for(int i:batch) {
				System.out.println(i);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
