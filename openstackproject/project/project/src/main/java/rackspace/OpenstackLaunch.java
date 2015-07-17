package rackspace;


import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeoutException;

import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.trove.v1.TroveApi;
import org.jclouds.openstack.trove.v1.domain.Flavor;
import org.jclouds.openstack.trove.v1.domain.Instance;
import org.jclouds.openstack.trove.v1.features.FlavorApi;
import org.jclouds.openstack.trove.v1.utils.TroveUtils;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Iterables;
import com.google.common.io.Closeables;
import com.google.inject.Module;
import rackspace.openstack.*;

public class OpenstackLaunch 
{
	public String provider_281 = "openstack-nova";
	public String identity_281 = "admin:admin"; // tenantName:userName
	public String credential_281 = "Passw0rd";
	public  String url_281= "http://192.168.47.141";
	static OpenstackLaunch OSL_281;
    
	public static void  main(String args[])throws IOException
	{
		try
		{
			 OSL_281 =new OpenstackLaunch();
		}
		finally
		{
			
		}
		
	}
	
	public OpenstackLaunch ()throws IOException
	{		
		try
		{
			
			JCloudsNova jcn = new JCloudsNova(provider_281, credential_281, identity_281, url_281);
		}
		finally
		{
			
		}
		
	}

}
