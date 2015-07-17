package rackspace.openstack;

import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.concurrent.TimeoutException;

import org.jclouds.ContextBuilder;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.nova.v2_0.domain.Image;
import org.jclouds.openstack.nova.v2_0.domain.Server;
import org.jclouds.openstack.nova.v2_0.domain.ServerCreated;
import org.jclouds.openstack.nova.v2_0.features.ImageApi;
import org.jclouds.openstack.nova.v2_0.features.ServerApi;
import org.jclouds.openstack.trove.v1.TroveApi;
import org.jclouds.openstack.trove.v1.domain.Flavor;
import org.jclouds.openstack.trove.v1.domain.Instance;
import org.jclouds.openstack.trove.v1.features.FlavorApi;
import org.jclouds.openstack.trove.v1.utils.TroveUtils;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.io.Closeables;
import com.google.inject.Module;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;

public class DeleteInstance 
{
	private  TroveApi troveApi_281;
	private  FlavorApi flavorApi_281;
	public String provider_281 = "openstack-nova";
	public String identity_281 = "admin:admin"; // tenantName:userName
	public String credential_281 = "Passw0rd";
	public String url_281 = "http://192.168.47.141";


	public static void main(String[] args) throws IOException 
	{
		DeleteInstance di =new DeleteInstance( "",  "");
	}

	public  DeleteInstance(String username, String apiKey) 
	{
		Iterable<Module> modules_281 = ImmutableSet.<Module>of(new SLF4JLoggingModule());
		// Authentication in jclouds is lazy and happens on the first call to the cloud.
		NovaApi novaApi = ContextBuilder.newBuilder(provider_281)
				.endpoint(url_281+":5000/v2.0/")
				.credentials(identity_281, credential_281)
				.modules(modules_281)
				.buildApi(NovaApi.class);
		ImageApi imageApi = novaApi.getImageApiForZone(novaApi.getConfiguredZones().iterator().next());

		System.out.println(""+ novaApi.getConfiguredZones().iterator().next());
		ImmutableList<? extends Image> images = imageApi.listInDetail().concat().toList();


		System.out.println("first image -- " + images.get(0).getId().toString());
		org.jclouds.openstack.nova.v2_0.features.FlavorApi flavorApi_281 = novaApi.getFlavorApiForZone(""+ novaApi.getConfiguredZones().iterator().next());

		ImmutableList<? extends org.jclouds.openstack.nova.v2_0.domain.Flavor> flavors = flavorApi_281.listInDetail().concat().toList();
		ServerApi serverApi = novaApi.getServerApiForZone(""+ novaApi.getConfiguredZones().iterator().next());
		ImmutableList<? extends Server> servers = serverApi.listInDetail().concat().toList();



		serverApi.delete(servers.get(0).getId().toString());

		System.out.println("VM Delteted successfully");

		//Database Connectivity
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
			
			String sqldelete = "delete from ad_dd04da4b2fa8fee.virtualmachine LIMIT 1"; 
			PreparedStatement preparedStatement = (PreparedStatement) conn.prepareStatement(sqldelete);
			
			preparedStatement.execute();

		}

		catch(Exception e){
			System.out.println(e);	
		}
		finally{
			System.out.println("Final block");
		} 



	}


	public void close() throws IOException {
		Closeables.close(troveApi_281, true);
	}

}
