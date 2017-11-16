package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;
import com.opex.test.utils.FileUtils;

public class RouteAttributes {
	
	String route_Rname;
	String route_depends_on;
	String route_connection;
	String route_instance_id;
	String route_network_interface_id;
	String route_vpc_peering_conn_id;
	String route_igw_Rname;
	String route_igw_vpcid;
	String route_RT_Rname;
	String route_RT_vpcid;
	String route_vpc_Rname;
	String route_cidrblock;
	String route_destn_cidr;
	String routeTable_id;
	String route_gateway_id;
	String route_nat_gateway_id;
	String route_RT_route;
	
		
		public String getroute_Rname() {
			return route_Rname;
		}
		public void setroute_Rname(String route_Rname) {
			this.route_Rname = route_Rname;
		}
		public String getroute_RT_route() {
			return route_RT_route;
		}
		public void setroute_RT_route(String route_RT_route) {
			this.route_RT_route = route_RT_route;
		}
		public String getroute_nat_gateway_id() {
			return route_nat_gateway_id;
		}
		public void setroute_nat_gateway_id(String route_nat_gateway_id) {
			this.route_nat_gateway_id = route_nat_gateway_id;
		}
		public String getroute_depends_on() {
			return route_depends_on;
		}
		public void setroute_depends_on(String route_depends_on) {
			this.route_depends_on = route_depends_on;
		}
		public String getroute_connection() {
			return route_connection;
		}
		public void setroute_connection(String route_connection) {
			this.route_connection = route_connection;
		}
		public String getroute_instance_id() {
			return route_instance_id;
		}
		public void setroute_instance_id(String route_instance_id) {
			this.route_instance_id = route_instance_id;
		}
		
		public String getroute_network_interface_id() {
			return route_network_interface_id;
		}
		public void setroute_network_interface_id(String route_network_interface_id) {
			this.route_network_interface_id = route_network_interface_id;
		}
		
		public String getroute_vpc_peering_conn_id() {
			return route_vpc_peering_conn_id;
		}
		public void setroute_vpc_peering_conn_id(String route_vpc_peering_conn_id) {
			this.route_vpc_peering_conn_id = route_vpc_peering_conn_id;
		}
		
		public String getroute_igw_Rname() {
			return route_igw_Rname;
		}
		public void setroute_igw_Rname(String route_igw_Rname) {
			this.route_igw_Rname = route_igw_Rname;
		}
		
		public String getroute_igw_vpcid() {
			return route_igw_vpcid;
		}
		public void setroute_igw_vpcid(String route_igw_vpcid) {
			this.route_igw_vpcid = route_igw_vpcid;
		}
		
		public String getroute_RT_Rname() {
			return route_RT_Rname;
		}
		public void setroute_RT_Rname(String route_RT_Rname) {
			this.route_RT_Rname = route_RT_Rname;
		}
		
		public String getroute_RT_vpcid() {
			return route_RT_vpcid;
		}
		public void setroute_RT_vpcid(String route_RT_vpcid) {
			this.route_RT_vpcid = route_RT_vpcid;
		}
		public String getroute_vpc_Rname() {
			return route_vpc_Rname;
		}
		public void setroute_vpc_Rname(String route_vpc_Rname) {
			this.route_vpc_Rname = route_vpc_Rname;
		}
		public String getroute_cidrblock() {
			return route_cidrblock;
		}
		public void setroute_cidrblock(String route_cidrblock) {
			this.route_cidrblock = route_cidrblock;
		}
		public String getDestn_cidr() {
			return route_destn_cidr;
		}
		public void setDestn_cidr(String route_destn_cidr) {
			this.route_destn_cidr = route_destn_cidr;
		}
		
		public String getRouteTable_id() {
			return routeTable_id;
		}
		public void setRouteTable_id(String routeTable_id) {
			this.routeTable_id = routeTable_id;
		}
		
		public String getGateway_id() {
			return route_gateway_id;
		}
		public void setGateway_id(String route_gateway_id) {
			this.route_gateway_id = route_gateway_id;
		}

		private static Properties properties;
		private static RouteAttributes routeAttributes = null;
		private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";
		private static final String DESTN_CIDR = "route_destn_cidr";
		private static final String ROUTE_TABLE_ID = "routeTable_id";
		private static final String GATEWAY_ID = "route_gateway_id";
		private static final String ROUTE_RNAME = "route_Rname";
		private static final String ROUTE_DEPENDSON = "route_depends_on";
		private static final String ROUTE_CONNECTION = "route_connection";
		private static final String ROUTE_INSTANCE_ID = "route_instance_id";
		private static final String ROUTE_NETWORK_INTERFACE_ID = "route_network_interface_id";
		private static final String ROUTE_VPC_PEERING_CONNID = "route_vpc_peering_conn_id";
		private static final String ROUTE_IGW_RNAME = "route_igw_Rname";
		private static final String ROUTE_IGW_VPCID = "route_igw_vpcid";
		private static final String ROUTE_RT_Rname = "route_RT_Rname";
		private static final String ROUTE_rt_VPCID = "route_RT_vpcid";
		private static final String ROUTE_VPC_RNAME = "route_vpc_Rname";
		private static final String ROUTE_VPCID = "route_cidrblock";
		private static final String ROUTE_NATGATEWAY = "route_nat_gateway_id";
		private static final String ROUTE_RT_ROUTE = "route_RT_route";
		public static RouteAttributes getRouteAttributesFromProperties(){
			routeAttributes.getReadPropertiesFile();
			
			String destn_cidr = properties.getProperty(DESTN_CIDR);
			String route_nat_gateway_id = properties.getProperty(ROUTE_NATGATEWAY);
			String routeTable_id = properties.getProperty(ROUTE_TABLE_ID);
			String route_gateway_id = properties.getProperty(GATEWAY_ID);
			String route_Rname = properties.getProperty(ROUTE_RNAME);
			String route_depends_on = properties.getProperty(ROUTE_DEPENDSON);
			String route_connection = properties.getProperty(ROUTE_CONNECTION);
			String route_instance_id = properties.getProperty(ROUTE_INSTANCE_ID);
			String route_network_interface_id = properties.getProperty(ROUTE_NETWORK_INTERFACE_ID);
			String route_vpc_peering_conn_id = properties.getProperty(ROUTE_VPC_PEERING_CONNID);
			String route_igw_Rname = properties.getProperty(ROUTE_IGW_RNAME);
			String route_igw_vpcid = properties.getProperty(ROUTE_IGW_VPCID);
			String route_RT_vpcid = properties.getProperty(ROUTE_rt_VPCID);
			String route_vpc_Rname = properties.getProperty(ROUTE_VPC_RNAME);
			String route_cidrblock = properties.getProperty(ROUTE_VPCID);
			String route_RT_Rname = properties.getProperty(ROUTE_RT_Rname);
			String route_RT_route=properties.getProperty(ROUTE_RT_ROUTE);
			routeAttributes = new RouteAttributes();
			routeAttributes.setDestn_cidr(destn_cidr);
			routeAttributes.setGateway_id(route_gateway_id);
			routeAttributes.setRouteTable_id(routeTable_id);
			routeAttributes.setroute_Rname(route_Rname);
			routeAttributes.setroute_depends_on(route_depends_on);
			routeAttributes.setroute_connection(route_connection);
			routeAttributes.setroute_instance_id(route_instance_id);
			routeAttributes.setroute_network_interface_id(route_network_interface_id);
			routeAttributes.setroute_vpc_peering_conn_id(route_vpc_peering_conn_id);
			routeAttributes.setroute_igw_Rname(route_igw_Rname);
			routeAttributes.setroute_RT_vpcid(route_RT_vpcid);
			routeAttributes.setroute_vpc_Rname(route_vpc_Rname);
			routeAttributes.setroute_cidrblock(route_cidrblock);
			routeAttributes.setroute_nat_gateway_id(route_nat_gateway_id);
			routeAttributes.setroute_igw_vpcid(route_igw_vpcid);
			routeAttributes.setroute_RT_Rname(route_RT_Rname);
			routeAttributes.setroute_RT_route(route_RT_route);
			return routeAttributes;
			
		}
		
		public static void getReadPropertiesFile() {
			if(routeAttributes == null || routeAttributes ==null){
				InputStream is = null;
				try{
					is = FileUtils.readFileFromClassPath(TEST_PARAMETER_PROPERTIES);
					properties = new Properties();
					properties.load(is);
					
				}catch(Exception e){
					e.printStackTrace();
					throw new RuntimeException(e);
				}finally{
					FileUtils.close(is);
				}	
			}
		}

}
