/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package rackspace.openstack;

import com.google.common.collect.ImmutableSet;
import com.google.common.io.Closeables;
import com.google.inject.Module;

import org.jclouds.ContextBuilder;
import org.jclouds.compute.ComputeService;
import org.jclouds.compute.ComputeServiceContext;
import org.jclouds.logging.slf4j.config.SLF4JLoggingModule;
import org.jclouds.openstack.nova.v2_0.NovaApi;
import org.jclouds.openstack.nova.v2_0.NovaAsyncApi;
import org.jclouds.rest.RestContext;

import java.io.Closeable;
import java.io.IOException;
import java.util.Set;


public class Logging implements Closeable {
	public  ComputeService computeService;
	public  RestContext<NovaApi, NovaAsyncApi> nova;

	public String provider_281 = "openstack-nova";
	public String identity_281 = "admin:admin"; 
	public String credential = "Passw0rd";
	public String url_281 = "http://192.168.49.129";

	public Logging (String provider_281, String credential,String identity_281,String url_281) throws IOException 
	{
		this.credential=credential;
		this.identity_281=identity_281;
		this.provider_281=provider_281;
		this.url_281=url_281;
		Logging logging = new Logging();

		try {
			logging.getConfiguredZones();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			logging.close();
		}
	}

	public Logging() {

		Iterable<Module> modules = ImmutableSet.<Module> of(new SLF4JLoggingModule());
		String provider_281 = "openstack-nova";
		String identity_281 = "admin:admin"; 
		String credential = "Passw0rd";
		ComputeServiceContext context = ContextBuilder.newBuilder(provider_281)
				.credentials(identity_281, credential)
				.endpoint(url_281+":5000/v2.0/")
				.modules(modules) 
				.buildView(ComputeServiceContext.class);

		computeService = context.getComputeService();
		nova = context.unwrap();
	}

	private void getConfiguredZones() {
		
		Set<String> zones = nova.getApi().getConfiguredZones();

		System.out.format("Zones%n");

		for (String zone : zones) {
			System.out.format("  %s%n", zone);
		}
	}


	public void close() throws IOException {
		Closeables.close(computeService.getContext(), true);
	}
}
