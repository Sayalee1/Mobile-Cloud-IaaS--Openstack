package mvcdemo.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

//import org.apache.tomcat.jni.Time;

public class DBConnection {

	public List<ValueStore> dbconn(){
		String JDBC_Driver = "com.mysql.jdbc.Driver";
		String DB_URl = "jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/ad_dd04da4b2fa8fee";
		String user = "b1a0963e48fe10";
		String password = "3bb69fb409842cf";

		Connection m_connection = null;
		Statement m_statement = null;
		int i_isTaken = 0;
		String s_tempString="hi";
		//System.out.println(s);
		List<ValueStore> l = new ArrayList<ValueStore>();
	

		try{
			Class.forName(JDBC_Driver);
			m_connection = (Connection) DriverManager.getConnection(DB_URl,user,password);
			
			//Fetching Virtual Machine Data
			System.out.println("Done");
			String sqlSelect = "select * from ad_dd04da4b2fa8fee.virtualmachine";
			//String sqlSelect = "select * from t";
			m_statement = (Statement) m_connection.createStatement();

			ResultSet rs = m_statement.executeQuery(sqlSelect);
			System.out.println("hi"+rs);
			while(rs.next()){
				System.out.println("here inside");
				//String tempVmName = rs.getString("vmName");
				ValueStore v = new ValueStore();
				v.setVmid(rs.getString("vmId"));
				v.setStartTime(rs.getDate("startTime"));
				v.setEndTime(new Date());
				//System.out.println(v.getStartTime().getTime())
				
				long time = v.getStartTime().getTime() - v.getEndTime().getTime();
				float hours = (int) ((time / (1000*60*60)) % 24);
				hours = hours+2;
				System.out.println("Time:"+ time);
				System.out.println("Hours:"+ hours);
				
				v.setHours(hours);
				v.setBillAmount(hours*2);
				v.setVmName(rs.getString("vmName"));
				
				
			//	String tempVmName = rs.getString("x");
				l.add(v);				
				//System.out.println(tempVmName);
			}

		}

		catch(Exception e){
			System.out.println("exception");
			System.out.println(e);
		}
		System.out.println(l+"sending list");
		return l;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DBConnection db= new DBConnection();
		List<ValueStore> s  = db.dbconn();
		
		for (ValueStore v : s ){
			System.out.println(v.getVmid());
			System.out.println(v.getBillAmount());
		}
		
	}

}
