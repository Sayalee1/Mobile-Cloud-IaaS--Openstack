package rackspace.openstack;

import java.io.Closeable;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.concurrent.TimeoutException;
import java.sql.Date;

import org.jclouds.ContextBuilder;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.trove.v1.TroveApi;
import org.jclouds.openstack.trove.v1.domain.Flavor;
import org.jclouds.openstack.trove.v1.domain.Instance;
import org.jclouds.openstack.trove.v1.features.FlavorApi;
import org.jclouds.openstack.trove.v1.utils.TroveUtils;
import org.jclouds.rackspace.cloudidentity.*;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.nova.v2_0.domain.Image;
import org.jclouds.openstack.nova.v2_0.domain.Server;
import org.jclouds.openstack.nova.v2_0.domain.ServerCreated;
import org.jclouds.openstack.nova.v2_0.features.ImageApi;
import org.jclouds.openstack.nova.v2_0.features.ServerApi;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.io.Closeables;
import com.google.inject.Module;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;


/**
 * This example creates a Cloud Databases instance.
 * This instance will be used to run a database later on in the Create Database example.
 */
public class CreateInstance implements Closeable {
	private  TroveApi troveApi_281;
	private  FlavorApi flavorApi_281;
	public String provider_281 = "openstack-nova";
	public String identity_281 = "admin:admin"; // tenantName:userName
	public String credential_281 = "Passw0rd";
	public String url_281 = "http://192.168.47.141";


	public static void main(String[] args) throws IOException 
	{
		CreateInstance createInst_281 =new CreateInstance( "",  "");
	}

	public  CreateInstance(String username, String apiKey) 
	{

		String machineName_281 = "Virtual Machine";
		Iterable<Module> modules_281 = ImmutableSet.<Module>of(new SLF4JLoggingModule());
		// Authentication in jclouds is lazy and happens on the first call to the cloud.
		NovaApi novaApi = ContextBuilder.newBuilder(provider_281)
				.endpoint(url_281+":5000/v2.0/")
				.credentials(identity_281, credential_281)
				.modules(modules_281)
				.buildApi(NovaApi.class);
		ImageApi imageApi = novaApi.getImageApiForZone(novaApi.getConfiguredZones().iterator().next());

		System.out.println("Instance Details: "+ novaApi.getConfiguredZones().iterator().next());
		ImmutableList<? extends Image> images = imageApi.listInDetail().concat().toList();
		System.out.println("URL is"+ url_281);
		System.out.println("Detail of images:"+images);

		System.out.println("Image ID: " + images.get(0).getId().toString());
		org.jclouds.openstack.nova.v2_0.features.FlavorApi flavorApi_281 = novaApi.getFlavorApiForZone(""+ novaApi.getConfiguredZones().iterator().next());

		ImmutableList<? extends org.jclouds.openstack.nova.v2_0.domain.Flavor> flavors = flavorApi_281.listInDetail().concat().toList();
		ServerApi serverApi = novaApi.getServerApiForZone(""+ novaApi.getConfiguredZones().iterator().next());
		ServerCreated serverCreated = serverApi.create(machineName_281, images.get(0).getId().toString(), "1");
		System.out.println("Server ID: " + serverCreated.getId());

		//Database connectivity:
		
		String JDBC_Driver = "com.mysql.jdbc.Driver";
		String DB_URl = "jdbc:mysql://us-cdbr-iron-east-02.cleardb.net/ad_dd04da4b2fa8fee";
		String user = "b1a0963e48fe10";
		String password = "3bb69fb409842cf";

		Connection conn = null;
		Statement stmt = null;
		int isTaken = 0;

		try{
			Class.forName(JDBC_Driver);
			conn = (Connection) DriverManager.getConnection(DB_URl,user,password);
			
			String sqlSelect = "select * from ad_dd04da4b2fa8fee.virtualmachine";
			stmt = (Statement) conn.createStatement();
			ResultSet rs = stmt.executeQuery(sqlSelect);
			
			String sqlInsert = "INSERT INTO ad_dd04da4b2fa8fee.virtualmachine (vmId,vmName,isTaken,userId,startTime) VALUES (?,?,?,?,?)";
			PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(sqlInsert);
			preparedStatement.setString(1,serverCreated.getId().toString());
			preparedStatement.setString(2,machineName_281);
			preparedStatement.setInt(3, isTaken);
			preparedStatement.setString(4,"1234");
			preparedStatement.setTimestamp(5, new Timestamp(System.currentTimeMillis()));
			preparedStatement.execute();
		}

		catch(Exception e){
			System.out.println(e);	
		}
		finally{
			System.out.println("Final block!!");
		} 

	}

	public void close() throws IOException {
		Closeables.close(troveApi_281, true);
	}



}