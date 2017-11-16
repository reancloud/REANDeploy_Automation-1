package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;
import com.opex.test.utils.FileUtils;

public class Philips_Usecase_Attributes {

	
	//PU-VPCs
	//VPC 1
	String PU_vpc1_rname;
	String PU_vpc1_cidrblock;
	//VPC 2
	String PU_vpc2_rname;
	String PU_vpc2_cidrblock;
	//PU-Subnet1
	String PU_subnet1_rname;
	String PU_subnet1_cidr;
	String PU_subnet1_vpcid; 
	//PU-Subnet2
	String PU_subnet2_rname; 
	String PU_subnet2_cidr; 
	String PU_subnet2_vpcid; 
	//PU-Subnet3
	String PU_subnet3_rname; 
	String PU_subnet3_cidr; 
	String PU_subnet3_vpcid; 
	//PU-Subnet4
	String PU_subnet4_rname; 
	String PU_subnet4_cidr; 
	String PU_subnet4_vpcid; 
	//PU-Subnet5
	String PU_subnet5_rname; 
	String PU_subnet5_cidr; 
	String PU_subnet5_vpcid; 
	//PU-Subnet6
	String PU_subnet6_rname; 
	String PU_subnet6_cidr; 
	String PU_subnet6_vpcid; 
	//PU-route
	//dmz-route
	String PU_dmz_route_Rname; 
	String PU_dmz_route_destn_cidr;  
	String PU_dmz_routeTable_id ;  
	String PU_dmz_route_gateway_id ;  
	String PU_dmz_route_depends_on;
	String PU_dmz_route_connection; 
	String PU_dmz_route_instance_id;
	String PU_dmz_route_nat_gateway_id;
	String PU_dmz_route_network_interface_id;
	String PU_dmz_route_vpc_peering_conn_id;
	//admin-route
	String PU_admin_route_Rname; 
	String PU_admin_route_destn_cidr;
	String PU_admin_routeTable_id ;  
	String PU_admin_route_gateway_id ;  
	String PU_admin_route_depends_on;
	String PU_admin_route_connection; 
	String PU_admin_route_instance_id;
	String PU_admin_route_nat_gateway_id;
	String PU_admin_route_network_interface_id;
	String PU_admin_route_vpc_peering_conn_id;
	//PU-IGW
	String PU_IGW1_rname; 
	String PU_IGW1_vpc_id; 
	//PU-IGW2
	String PU_IGW2_rname;
	String PU_IGW2_vpc_id;

	//PU-RouteTable1
	String PU_public_Rt_rname; 
	String PU_public_Rt_vpcid; 
	String PU_public_Rt_json; 
	//PU-RouteTable2
	String PU_private_Rt_rname; 
	String PU_private_Rt_vpcid; 
	String PU_private_Rt_json; 
	//PU-RouteTable3
	String PU_IGW2_Rt1_rname;
	String PU_IGW2_Rt1_vpcid; 
	String PU_IGW2_Rt1_json; 
	//PU-RouteTable4
	String PU_IGW2_Rt2_rname; 
	String PU_IGW2_Rt2_vpcid;
	String PU_IGW2_Rt2_json; 

	//PU-RTA1
	String PU_public_RTA1_rname; 
	String PU_public_RTA1_routetable_id; 
	String PU_public_RTA1_subnetid; 
	//PU-RTA2
	String PU_public_RTA2_rname; 
	String PU_public_RTA2_routetable_id; 
	String PU_public_RTA2_subnetid; 
	//PU-RTA3
	String PU_nat_RTA1_rname; 
	String PU_nat_RTA1_routetable_id; 
	String PU_nat_RTA1_subnetid; 
	//PU-RTA4
	String PU_nat_RTA2_rname; 
	String PU_nat_RTA2_routetable_id; 
	String PU_nat_RTA2_subnetid; 
	//PU-RTA5
	String PU_private_RTA1_rname; 
	String PU_private_RTA1_routetable_id; 
	String PU_private_RTA1_subnetid; 
	//PU-RTA6
	String PU_private_RTA2_rname;
	String PU_private_RTA2_routetable_id; 
	String PU_private_RTA2_subnetid; 
	 
	//PU-EIP
	String PU_EIP_rnam ;
	String PU_EIP_DependsOn; 
	String PU_EIP_vpc; 
	//String PU_natgateway 
	String PU_natgateway_rname; 
	String PU_natgateway_allocationId; 
	String PU_natgateway_subnetId; 
	String PU_natgateway_dependsOn; 
	String PU_natgateway_networkInterfaceId;
	String PU_natgateway_privateIp;
	String PU_natgateway_publicIp;

	//String PU_Vpc_peer_connection
	String PU_vpcPeering_Rname; 
	String PU_vpcPeering_peer_owner_id; 
	String PU_vpcPeering_peer_vpc_id; 
	String PU_vpcPeering_vpc_id; 
	String PU_vpcPeering_dependson;
	String PU_vpcPeering_connection;
	String PU_vpcPeering_acceptor; 
	String PU_vpcPeering_auto_accept;
	String PU_vpcPeering_requestor; 
	String PU_vpcPeering_tag; 

	//PU Security Groups
	String PU_elb_sg_rname;  
	String PU_elb_sg_ingress;  
	String PU_elb_sg_vpcid; 

	String PU_sg_rname; 
	String PU_sg_ingress; 
	String PU_sg_vpcid; 

	String PU_node1_sg_rname ;  
	String PU_node1_sg_ingress ;  
	String PU_node1_sg_vpcid ; 

	String PU_node2_sg_rname ; 
	String PU_node2_sg_ingress ; 
	String PU_node2_sg_vpcid ;  

	String PU_node3_sg_rname ; 
	String PU_node3_sg_ingress ;  
	String PU_node3_sg_vpcid ;  

	String PU_node4_sg_rname ;  
	String PU_node4_sg_ingress ;  
	String PU_node4_sg_vpcid ;  

	//PU_output
	String PU_output_resourceName; 
	String PU_output_dependsOn;
	String PU_output_connection;
	String PU_output_outputJson;
	

	public String getPU_vpc1_rname() {
		return PU_vpc1_rname;
	}
	public void setPU_vpc1_rname(String PU_vpc1_rname) {
		this.PU_vpc1_rname = PU_vpc1_rname;
	}
	public String getPU_vpc1_cidrblock() {
		return PU_vpc1_cidrblock;
	}
	public void setPU_vpc1_cidrblock(String PU_vpc1_cidrblock) {
		this.PU_vpc1_cidrblock = PU_vpc1_cidrblock;
	}
	public String getPU_vpc2_rname() {
		return PU_vpc2_rname;
	}
	public void setPU_vpc2_rname(String PU_vpc2_rname) {
		this.PU_vpc2_rname = PU_vpc2_rname;
	}
	public String getPU_vpc2_cidrblock() {
		return PU_vpc2_cidrblock;
	}
	public void setPU_vpc2_cidrblock(String PU_vpc2_cidrblock) {
		this.PU_vpc2_cidrblock = PU_vpc2_cidrblock;
	}
	public String getPU_subnet1_rname() {
		return PU_subnet1_rname;
	}
	public void setPU_subnet1_rname(String PU_subnet1_rname) {
		this.PU_subnet1_rname = PU_subnet1_rname;
	}
	public String getPU_subnet1_cidr() {
		return PU_subnet1_cidr;
	}
	public void setPU_subnet1_cidr(String PU_subnet1_cidr) {
		this.PU_subnet1_cidr = PU_subnet1_cidr;
	}
	public String getPU_subnet1_vpcid() {
		return PU_subnet1_vpcid;
	}
	public void setPU_subnet1_vpcid(String PU_subnet1_vpcid) {
		this.PU_subnet1_vpcid = PU_subnet1_vpcid;
	}
	public String getPU_subnet2_rname() {
		return PU_subnet2_rname;
	}
	public void setPU_subnet2_rname(String PU_subnet2_rname) {
		this.PU_subnet2_rname = PU_subnet2_rname;
	}
	public String getPU_subnet2_cidr() {
		return PU_subnet2_cidr;
	}
	public void setPU_subnet2_cidr(String PU_subnet2_cidr) {
		this.PU_subnet2_cidr = PU_subnet2_cidr;
	}
	public String getPU_subnet2_vpcid() {
		return PU_subnet2_vpcid;
	}
	public void setPU_subnet2_vpcid(String PU_subnet2_vpcid) {
		this.PU_subnet2_vpcid = PU_subnet2_vpcid;
	}
	public String getPU_subnet3_rname() {
		return PU_subnet3_rname;
	}
	public void setPU_subnet3_rname(String PU_subnet3_rname) {
		this.PU_subnet3_rname = PU_subnet3_rname;
	}
	public String getPU_subnet3_cidr() {
		return PU_subnet3_cidr;
	}
	public void setPU_subnet3_cidr(String PU_subnet3_cidr) {
		this.PU_subnet3_cidr = PU_subnet3_cidr;
	}
	public String getPU_subnet3_vpcid() {
		return PU_subnet3_vpcid;
	}
	public void setPU_subnet3_vpcid(String PU_subnet3_vpcid) {
		this.PU_subnet3_vpcid = PU_subnet3_vpcid;
	}
	public String getPU_subnet4_rname() {
		return PU_subnet4_rname;
	}
	public void setPU_subnet4_rname(String PU_subnet4_rname) {
		this.PU_subnet4_rname = PU_subnet4_rname;
	}
	public String getPU_subnet4_cidr() {
		return PU_subnet4_cidr;
	}
	public void setPU_subnet4_cidr(String PU_subnet4_cidr) {
		this.PU_subnet4_cidr = PU_subnet4_cidr;
	}
	public String getPU_subnet4_vpcid() {
		return PU_subnet4_vpcid;
	}
	public void setPU_subnet4_vpcid(String PU_subnet4_vpcid) {
		this.PU_subnet4_vpcid = PU_subnet4_vpcid;
	}
	public String getPU_subnet5_rname() {
		return PU_subnet5_rname;
	}
	public void setPU_subnet5_rname(String PU_subnet5_rname) {
		this.PU_subnet5_rname = PU_subnet5_rname;
	}
	public String getPU_subnet5_cidr() {
		return PU_subnet5_cidr;
	}
	public void setPU_subnet5_cidr(String PU_subnet5_cidr) {
		this.PU_subnet5_cidr = PU_subnet5_cidr;
	}
	public String getPU_subnet5_vpcid() {
		return PU_subnet5_vpcid;
	}
	public void setPU_subnet5_vpcid(String PU_subnet5_vpcid) {
		this.PU_subnet5_vpcid = PU_subnet5_vpcid;
	}
	public String getPU_subnet6_rname() {
		return PU_subnet6_rname;
	}
	public void setPU_subnet6_rname(String PU_subnet6_rname) {
		this.PU_subnet6_rname = PU_subnet6_rname;
	}
	public String getPU_subnet6_cidr() {
		return PU_subnet6_cidr;
	}
	public void setPU_subnet6_cidr(String PU_subnet6_cidr) {
		this.PU_subnet6_cidr = PU_subnet6_cidr;
	}
	public String getPU_subnet6_vpcid() {
		return PU_subnet6_vpcid;
	}
	public void setPU_subnet6_vpcid(String PU_subnet6_vpcid) {
		this.PU_subnet6_vpcid = PU_subnet6_vpcid;
	}
	public String getPU_dmz_route_Rname() {
		return PU_dmz_route_Rname;
	}
	public void setPU_dmz_route_Rname(String PU_dmz_route_Rname) {
		this.PU_dmz_route_Rname = PU_dmz_route_Rname;
	}
	public String getPU_dmz_route_destn_cidr() {
		return PU_dmz_route_destn_cidr;
	}
	public void setPU_dmz_route_destn_cidr(String PU_dmz_route_destn_cidr) {
		this.PU_dmz_route_destn_cidr = PU_dmz_route_destn_cidr;
	}
	public String getPU_dmz_routeTable_id() {
		return PU_dmz_routeTable_id;
	}
	public void setPU_dmz_routeTable_id(String PU_dmz_routeTable_id) {
		this.PU_dmz_routeTable_id = PU_dmz_routeTable_id;
	}
	public String getPU_dmz_route_gateway_id() {
		return PU_dmz_route_gateway_id;
	}
	public void setPU_dmz_route_gateway_id(String PU_dmz_route_gateway_id) {
		this.PU_dmz_route_gateway_id = PU_dmz_route_gateway_id;
	}
	public String getPU_dmz_route_depends_on() {
		return PU_dmz_route_depends_on;
	}
	public void setPU_dmz_route_depends_on(String PU_dmz_route_depends_on) {
		this.PU_dmz_route_depends_on = PU_dmz_route_depends_on;
	}
	public String getPU_dmz_route_connection() {
		return PU_dmz_route_connection;
	}
	public void setPU_dmz_route_connection(String PU_dmz_route_connection) {
		this.PU_dmz_route_connection = PU_dmz_route_connection;
	}
	public String getPU_dmz_route_instance_id() {
		return PU_dmz_route_instance_id;
	}
	public void setPU_dmz_route_instance_id(String PU_dmz_route_instance_id) {
		this.PU_dmz_route_instance_id = PU_dmz_route_instance_id;
	}
	public String getPU_dmz_route_nat_gateway_id() {
		return PU_dmz_route_nat_gateway_id;
	}
	public void setPU_dmz_route_nat_gateway_id(String PU_dmz_route_nat_gateway_id) {
		this.PU_dmz_route_nat_gateway_id = PU_dmz_route_nat_gateway_id;
	}
	public String getPU_dmz_route_network_interface_id() {
		return PU_dmz_route_network_interface_id;
	}
	public void setPU_dmz_route_network_interface_id(String PU_dmz_route_network_interface_id) {
		this.PU_dmz_route_network_interface_id = PU_dmz_route_network_interface_id;
	}
	public String getPU_dmz_route_vpc_peering_conn_id() {
		return PU_dmz_route_vpc_peering_conn_id;
	}
	public void setPU_dmz_route_vpc_peering_conn_id(String PU_dmz_route_vpc_peering_conn_id) {
		this.PU_dmz_route_vpc_peering_conn_id = PU_dmz_route_vpc_peering_conn_id;
	}
	public String getPU_admin_route_Rname() {
		return PU_admin_route_Rname;
	}
	public void setPU_admin_route_Rname(String PU_admin_route_Rname) {
		this.PU_admin_route_Rname = PU_admin_route_Rname;
	}
	public String getPU_admin_route_destn_cidr() {
		return PU_admin_route_destn_cidr;
	}
	public void setPU_admin_route_destn_cidr(String PU_admin_route_destn_cidr) {
		this.PU_admin_route_destn_cidr = PU_admin_route_destn_cidr;
	}
	public String getPU_admin_routeTable_id() {
		return PU_admin_routeTable_id;
	}
	public void setPU_admin_routeTable_id(String PU_admin_routeTable_id) {
		this.PU_admin_routeTable_id = PU_admin_routeTable_id;
	}
	public String getPU_admin_route_gateway_id() {
		return PU_admin_route_gateway_id;
	}
	public void setPU_admin_route_gateway_id(String PU_admin_route_gateway_id) {
		this.PU_admin_route_gateway_id = PU_admin_route_gateway_id;
	}
	public String getPU_admin_route_depends_on() {
		return PU_admin_route_depends_on;
	}
	public void setPU_admin_route_depends_on(String PU_admin_route_depends_on) {
		this.PU_admin_route_depends_on = PU_admin_route_depends_on;
	}
	public String getPU_admin_route_connection() {
		return PU_admin_route_connection;
	}
	public void setPU_admin_route_connection(String PU_admin_route_connection) {
		this.PU_admin_route_connection = PU_admin_route_connection;
	}
	public String getPU_admin_route_instance_id() {
		return PU_admin_route_instance_id;
	}
	public void setPU_admin_route_instance_id(String PU_admin_route_instance_id) {
		this.PU_admin_route_instance_id = PU_admin_route_instance_id;
	}
	public String getPU_admin_route_nat_gateway_id() {
		return PU_admin_route_nat_gateway_id;
	}
	public void setPU_admin_route_nat_gateway_id(String PU_admin_route_nat_gateway_id) {
		this.PU_admin_route_nat_gateway_id = PU_admin_route_nat_gateway_id;
	}
	public String getPU_admin_route_network_interface_id() {
		return PU_admin_route_network_interface_id;
	}
	public void setPU_admin_route_network_interface_id(String PU_admin_route_network_interface_id) {
		this.PU_admin_route_network_interface_id = PU_admin_route_network_interface_id;
	}
	public String getPU_admin_route_vpc_peering_conn_id() {
		return PU_admin_route_vpc_peering_conn_id;
	}
	public void setPU_admin_route_vpc_peering_conn_id(String PU_admin_route_vpc_peering_conn_id) {
		this.PU_admin_route_vpc_peering_conn_id = PU_admin_route_vpc_peering_conn_id;
	}
	public String getPU_IGW1_rname() {
		return PU_IGW1_rname;
	}
	public void setPU_IGW1_rname(String PU_IGW1_rname) {
		this.PU_IGW1_rname = PU_IGW1_rname;
	}
	public String getPU_IGW1_vpc_id() {
		return PU_IGW1_vpc_id;
	}
	public void setPU_IGW1_vpc_id(String PU_IGW1_vpc_id) {
		this.PU_IGW1_vpc_id = PU_IGW1_vpc_id;
	}
	public String getPU_IGW2_rname() {
		return PU_IGW2_rname;
	}
	public void setPU_IGW2_rname(String PU_IGW2_rname) {
		this.PU_IGW2_rname = PU_IGW2_rname;
	}
	public String getPU_IGW2_vpc_id() {
		return PU_IGW2_vpc_id;
	}
	public void setPU_IGW2_vpc_id(String PU_IGW2_vpc_id) {
		this.PU_IGW2_vpc_id = PU_IGW2_vpc_id;
	}
	public String getPU_public_Rt_rname() {
		return PU_public_Rt_rname;
	}
	public void setPU_public_Rt_rname(String PU_public_Rt_rname) {
		this.PU_public_Rt_rname = PU_public_Rt_rname;
	}
	public String getPU_public_Rt_vpcid() {
		return PU_public_Rt_vpcid;
	}
	public void setPU_public_Rt_vpcid(String PU_public_Rt_vpcid) {
		this.PU_public_Rt_vpcid = PU_public_Rt_vpcid;
	}
	public String getPU_public_Rt_json() {
		return PU_public_Rt_json;
	}
	public void setPU_public_Rt_json(String PU_public_Rt_json) {
		this.PU_public_Rt_json = PU_public_Rt_json;
	}
	public String getPU_private_Rt_rname() {
		return PU_private_Rt_rname;
	}
	public void setPU_private_Rt_rname(String PU_private_Rt_rname) {
		this.PU_private_Rt_rname = PU_private_Rt_rname;
	}
	public String getPU_private_Rt_vpcid() {
		return PU_private_Rt_vpcid;
	}
	public void setPU_private_Rt_vpcid(String PU_private_Rt_vpcid) {
		this.PU_private_Rt_vpcid = PU_private_Rt_vpcid;
	}
	public String getPU_private_Rt_json() {
		return PU_private_Rt_json;
	}
	public void setPU_private_Rt_json(String PU_private_Rt_json) {
		this.PU_private_Rt_json = PU_private_Rt_json;
	}
	public String getPU_IGW2_Rt1_rname() {
		return PU_IGW2_Rt1_rname;
	}
	public void setPU_IGW2_Rt1_rname(String PU_IGW2_Rt1_rname) {
		this.PU_IGW2_Rt1_rname = PU_IGW2_Rt1_rname;
	}
	public String getPU_IGW2_Rt1_vpcid() {
		return PU_IGW2_Rt1_vpcid;
	}
	public void setPU_IGW2_Rt1_vpcid(String PU_IGW2_Rt1_vpcid) {
		this.PU_IGW2_Rt1_vpcid = PU_IGW2_Rt1_vpcid;
	}
	public String getPU_IGW2_Rt1_json() {
		return PU_IGW2_Rt1_json;
	}
	public void setPU_IGW2_Rt1_json(String PU_IGW2_Rt1_json) {
		this.PU_IGW2_Rt1_json = PU_IGW2_Rt1_json;
	}
	public String getPU_IGW2_Rt2_rname() {
		return PU_IGW2_Rt2_rname;
	}
	public void setPU_IGW2_Rt2_rname(String PU_IGW2_Rt2_rname) {
		this.PU_IGW2_Rt2_rname = PU_IGW2_Rt2_rname;
	}
	public String getPU_IGW2_Rt2_vpcid() {
		return PU_IGW2_Rt2_vpcid;
	}
	public void setPU_IGW2_Rt2_vpcid(String PU_IGW2_Rt2_vpcid) {
		this.PU_IGW2_Rt2_vpcid = PU_IGW2_Rt2_vpcid;
	}
	public String getPU_IGW2_Rt2_json() {
		return PU_IGW2_Rt2_json;
	}
	public void setPU_IGW2_Rt2_json(String PU_IGW2_Rt2_json) {
		this.PU_IGW2_Rt2_json = PU_IGW2_Rt2_json;
	}
	public String getPU_public_RTA1_rname() {
		return PU_public_RTA1_rname;
	}
	public void setPU_public_RTA1_rname(String PU_public_RTA1_rname) {
		this.PU_public_RTA1_rname = PU_public_RTA1_rname;
	}
	public String getPU_public_RTA1_routetable_id() {
		return PU_public_RTA1_routetable_id;
	}
	public void setPU_public_RTA1_routetable_id(String PU_public_RTA1_routetable_id) {
		this.PU_public_RTA1_routetable_id = PU_public_RTA1_routetable_id;
	}
	public String getPU_public_RTA1_subnetid() {
		return PU_public_RTA1_subnetid;
	}
	public void setPU_public_RTA1_subnetid(String PU_public_RTA1_subnetid) {
		this.PU_public_RTA1_subnetid = PU_public_RTA1_subnetid;
	}
	public String getPU_public_RTA2_rname() {
		return PU_public_RTA2_rname;
	}
	public void setPU_public_RTA2_rname(String PU_public_RTA2_rname) {
		this.PU_public_RTA2_rname = PU_public_RTA2_rname;
	}
	public String getPU_public_RTA2_routetable_id() {
		return PU_public_RTA2_routetable_id;
	}
	public void setPU_public_RTA2_routetable_id(String PU_public_RTA2_routetable_id) {
		this.PU_public_RTA2_routetable_id = PU_public_RTA2_routetable_id;
	}
	public String getPU_public_RTA2_subnetid() {
		return PU_public_RTA2_subnetid;
	}
	public void setPU_public_RTA2_subnetid(String PU_public_RTA2_subnetid) {
		this.PU_public_RTA2_subnetid = PU_public_RTA2_subnetid;
	}
	public String getPU_nat_RTA1_rname() {
		return PU_nat_RTA1_rname;
	}
	public void setPU_nat_RTA1_rname(String PU_nat_RTA1_rname) {
		this.PU_nat_RTA1_rname = PU_nat_RTA1_rname;
	}
	public String getPU_nat_RTA1_routetable_id() {
		return PU_nat_RTA1_routetable_id;
	}
	public void setPU_nat_RTA1_routetable_id(String PU_nat_RTA1_routetable_id) {
		this.PU_nat_RTA1_routetable_id = PU_nat_RTA1_routetable_id;
	}
	public String getPU_nat_RTA1_subnetid() {
		return PU_nat_RTA1_subnetid;
	}
	public void setPU_nat_RTA1_subnetid(String PU_nat_RTA1_subnetid) {
		this.PU_nat_RTA1_subnetid = PU_nat_RTA1_subnetid;
	}
	public String getPU_nat_RTA2_rname() {
		return PU_nat_RTA2_rname;
	}
	public void setPU_nat_RTA2_rname(String PU_nat_RTA2_rname) {
		this.PU_nat_RTA2_rname = PU_nat_RTA2_rname;
	}
	public String getPU_nat_RTA2_routetable_id() {
		return PU_nat_RTA2_routetable_id;
	}
	public void setPU_nat_RTA2_routetable_id(String PU_nat_RTA2_routetable_id) {
		this.PU_nat_RTA2_routetable_id = PU_nat_RTA2_routetable_id;
	}
	public String getPU_nat_RTA2_subnetid() {
		return PU_nat_RTA2_subnetid;
	}
	public void setPU_nat_RTA2_subnetid(String PU_nat_RTA2_subnetid) {
		this.PU_nat_RTA2_subnetid = PU_nat_RTA2_subnetid;
	}
	public String getPU_private_RTA1_rname() {
		return PU_private_RTA1_rname;
	}
	public void setPU_private_RTA1_rname(String PU_private_RTA1_rname) {
		this.PU_private_RTA1_rname = PU_private_RTA1_rname;
	}
	public String getPU_private_RTA1_routetable_id() {
		return PU_private_RTA1_routetable_id;
	}
	public void setPU_private_RTA1_routetable_id(String PU_private_RTA1_routetable_id) {
		this.PU_private_RTA1_routetable_id = PU_private_RTA1_routetable_id;
	}
	public String getPU_private_RTA1_subnetid() {
		return PU_private_RTA1_subnetid;
	}
	public void setPU_private_RTA1_subnetid(String PU_private_RTA1_subnetid) {
		this.PU_private_RTA1_subnetid = PU_private_RTA1_subnetid;
	}
	public String getPU_private_RTA2_rname() {
		return PU_private_RTA2_rname;
	}
	public void setPU_private_RTA2_rname(String PU_private_RTA2_rname) {
		this.PU_private_RTA2_rname = PU_private_RTA2_rname;
	}
	public String getPU_private_RTA2_routetable_id() {
		return PU_private_RTA2_routetable_id;
	}
	public void setPU_private_RTA2_routetable_id(String PU_private_RTA2_routetable_id) {
		this.PU_private_RTA2_routetable_id = PU_private_RTA2_routetable_id;
	}
	public String getPU_private_RTA2_subnetid() {
		return PU_private_RTA2_subnetid;
	}
	public void setPU_private_RTA2_subnetid(String PU_private_RTA2_subnetid) {
		this.PU_private_RTA2_subnetid = PU_private_RTA2_subnetid;
	}
	public String getPU_EIP_rnam() {
		return PU_EIP_rnam;
	}
	public void setPU_EIP_rnam(String PU_EIP_rnam) {
		this.PU_EIP_rnam = PU_EIP_rnam;
	}
	public String getPU_EIP_DependsOn() {
		return PU_EIP_DependsOn;
	}
	public void setPU_EIP_DependsOn(String PU_EIP_DependsOn) {
		this.PU_EIP_DependsOn = PU_EIP_DependsOn;
	}
	public String getPU_EIP_vpc() {
		return PU_EIP_vpc;
	}
	public void setPU_EIP_vpc(String PU_EIP_vpc) {
		this.PU_EIP_vpc = PU_EIP_vpc;
	}
	public String getPU_natgateway_rname() {
		return PU_natgateway_rname;
	}
	public void setPU_natgateway_rname(String PU_natgateway_rname) {
		this.PU_natgateway_rname = PU_natgateway_rname;
	}
	public String getPU_natgateway_allocationId() {
		return PU_natgateway_allocationId;
	}
	public void setPU_natgateway_allocationId(String PU_natgateway_allocationId) {
		this.PU_natgateway_allocationId = PU_natgateway_allocationId;
	}
	public String getPU_natgateway_subnetId() {
		return PU_natgateway_subnetId;
	}
	public void setPU_natgateway_subnetId(String PU_natgateway_subnetId) {
		this.PU_natgateway_subnetId = PU_natgateway_subnetId;
	}
	public String getPU_natgateway_dependsOn() {
		return PU_natgateway_dependsOn;
	}
	public void setPU_natgateway_dependsOn(String PU_natgateway_dependsOn) {
		this.PU_natgateway_dependsOn = PU_natgateway_dependsOn;
	}
	public String getPU_natgateway_networkInterfaceId() {
		return PU_natgateway_networkInterfaceId;
	}
	public void setPU_natgateway_networkInterfaceId(String PU_natgateway_networkInterfaceId) {
		this.PU_natgateway_networkInterfaceId = PU_natgateway_networkInterfaceId;
	}
	public String getPU_natgateway_privateIp() {
		return PU_natgateway_privateIp;
	}
	public void setPU_natgateway_privateIp(String PU_natgateway_privateIp) {
		this.PU_natgateway_privateIp = PU_natgateway_privateIp;
	}
	public String getPU_natgateway_publicIp() {
		return PU_natgateway_publicIp;
	}
	public void setPU_natgateway_publicIp(String PU_natgateway_publicIp) {
		this.PU_natgateway_publicIp = PU_natgateway_publicIp;
	}
	public String getPU_vpcPeering_Rname() {
		return PU_vpcPeering_Rname;
	}
	public void setPU_vpcPeering_Rname(String PU_vpcPeering_Rname) {
		this.PU_vpcPeering_Rname = PU_vpcPeering_Rname;
	}
	public String getPU_vpcPeering_peer_owner_id() {
		return PU_vpcPeering_peer_owner_id;
	}
	public void setPU_vpcPeering_peer_owner_id(String PU_vpcPeering_peer_owner_id) {
		this.PU_vpcPeering_peer_owner_id = PU_vpcPeering_peer_owner_id;
	}
	public String getPU_vpcPeering_peer_vpc_id() {
		return PU_vpcPeering_peer_vpc_id;
	}
	public void setPU_vpcPeering_peer_vpc_id(String PU_vpcPeering_peer_vpc_id) {
		this.PU_vpcPeering_peer_vpc_id = PU_vpcPeering_peer_vpc_id;
	}
	public String getPU_vpcPeering_vpc_id() {
		return PU_vpcPeering_vpc_id;
	}
	public void setPU_vpcPeering_vpc_id(String PU_vpcPeering_vpc_id) {
		this.PU_vpcPeering_vpc_id = PU_vpcPeering_vpc_id;
	}
	public String getPU_vpcPeering_dependson() {
		return PU_vpcPeering_dependson;
	}
	public void setPU_vpcPeering_dependson(String PU_vpcPeering_dependson) {
		this.PU_vpcPeering_dependson = PU_vpcPeering_dependson;
	}
	public String getPU_vpcPeering_connection() {
		return PU_vpcPeering_connection;
	}
	public void setPU_vpcPeering_connection(String PU_vpcPeering_connection) {
		this.PU_vpcPeering_connection = PU_vpcPeering_connection;
	}
	public String getPU_vpcPeering_acceptor() {
		return PU_vpcPeering_acceptor;
	}
	public void setPU_vpcPeering_acceptor(String PU_vpcPeering_acceptor) {
		this.PU_vpcPeering_acceptor = PU_vpcPeering_acceptor;
	}
	public String getPU_vpcPeering_auto_accept() {
		return PU_vpcPeering_auto_accept;
	}
	public void setPU_vpcPeering_auto_accept(String PU_vpcPeering_auto_accept) {
		this.PU_vpcPeering_auto_accept = PU_vpcPeering_auto_accept;
	}
	public String getPU_vpcPeering_requestor() {
		return PU_vpcPeering_requestor;
	}
	public void setPU_vpcPeering_requestor(String PU_vpcPeering_requestor) {
		this.PU_vpcPeering_requestor = PU_vpcPeering_requestor;
	}
	public String getPU_vpcPeering_tag() {
		return PU_vpcPeering_tag;
	}
	public void setPU_vpcPeering_tag(String PU_vpcPeering_tag) {
		this.PU_vpcPeering_tag = PU_vpcPeering_tag;
	}
	public String getPU_elb_sg_rname() {
		return PU_elb_sg_rname;
	}
	public void setPU_elb_sg_rname(String PU_elb_sg_rname) {
		this.PU_elb_sg_rname = PU_elb_sg_rname;
	}
	public String getPU_elb_sg_ingress() {
		return PU_elb_sg_ingress;
	}
	public void setPU_elb_sg_ingress(String PU_elb_sg_ingress) {
		this.PU_elb_sg_ingress = PU_elb_sg_ingress;
	}
	public String getPU_elb_sg_vpcid() {
		return PU_elb_sg_vpcid;
	}
	public void setPU_elb_sg_vpcid(String PU_elb_sg_vpcid) {
		this.PU_elb_sg_vpcid = PU_elb_sg_vpcid;
	}
	public String getPU_sg_rname() {
		return PU_sg_rname;
	}
	public void setPU_sg_rname(String PU_sg_rname) {
		this.PU_sg_rname = PU_sg_rname;
	}
	public String getPU_sg_ingress() {
		return PU_sg_ingress;
	}
	public void setPU_sg_ingress(String PU_sg_ingress) {
		this.PU_sg_ingress = PU_sg_ingress;
	}
	public String getPU_sg_vpcid() {
		return PU_sg_vpcid;
	}
	public void setPU_sg_vpcid(String PU_sg_vpcid) {
		this.PU_sg_vpcid = PU_sg_vpcid;
	}
	public String getPU_node1_sg_rname() {
		return PU_node1_sg_rname;
	}
	public void setPU_node1_sg_rname(String PU_node1_sg_rname) {
		this.PU_node1_sg_rname = PU_node1_sg_rname;
	}
	public String getPU_node1_sg_ingress() {
		return PU_node1_sg_ingress;
	}
	public void setPU_node1_sg_ingress(String PU_node1_sg_ingress) {
		this.PU_node1_sg_ingress = PU_node1_sg_ingress;
	}
	public String getPU_node1_sg_vpcid() {
		return PU_node1_sg_vpcid;
	}
	public void setPU_node1_sg_vpcid(String PU_node1_sg_vpcid) {
		this.PU_node1_sg_vpcid = PU_node1_sg_vpcid;
	}
	public String getPU_node2_sg_rname() {
		return PU_node2_sg_rname;
	}
	public void setPU_node2_sg_rname(String PU_node2_sg_rname) {
		this.PU_node2_sg_rname = PU_node2_sg_rname;
	}
	public String getPU_node2_sg_ingress() {
		return PU_node2_sg_ingress;
	}
	public void setPU_node2_sg_ingress(String PU_node2_sg_ingress) {
		this.PU_node2_sg_ingress = PU_node2_sg_ingress;
	}
	public String getPU_node2_sg_vpcid() {
		return PU_node2_sg_vpcid;
	}
	public void setPU_node2_sg_vpcid(String PU_node2_sg_vpcid) {
		this.PU_node2_sg_vpcid = PU_node2_sg_vpcid;
	}
	public String getPU_node3_sg_rname() {
		return PU_node3_sg_rname;
	}
	public void setPU_node3_sg_rname(String PU_node3_sg_rname) {
		this.PU_node3_sg_rname = PU_node3_sg_rname;
	}
	public String getPU_node3_sg_ingress() {
		return PU_node3_sg_ingress;
	}
	public void setPU_node3_sg_ingress(String PU_node3_sg_ingress) {
		this.PU_node3_sg_ingress = PU_node3_sg_ingress;
	}
	public String getPU_node3_sg_vpcid() {
		return PU_node3_sg_vpcid;
	}
	public void setPU_node3_sg_vpcid(String PU_node3_sg_vpcid) {
		this.PU_node3_sg_vpcid = PU_node3_sg_vpcid;
	}
	public String getPU_node4_sg_rname() {
		return PU_node4_sg_rname;
	}
	public void setPU_node4_sg_rname(String PU_node4_sg_rname) {
		this.PU_node4_sg_rname = PU_node4_sg_rname;
	}
	public String getPU_node4_sg_ingress() {
		return PU_node4_sg_ingress;
	}
	public void setPU_node4_sg_ingress(String PU_node4_sg_ingress) {
		this.PU_node4_sg_ingress = PU_node4_sg_ingress;
	}
	public String getPU_node4_sg_vpcid() {
		return PU_node4_sg_vpcid;
	}
	public void setPU_node4_sg_vpcid(String PU_node4_sg_vpcid) {
		this.PU_node4_sg_vpcid = PU_node4_sg_vpcid;
	}
	public String getPU_output_resourceName() {
		return PU_output_resourceName;
	}
	public void setPU_output_resourceName(String PU_output_resourceName) {
		this.PU_output_resourceName = PU_output_resourceName;
	}
	public String getPU_output_dependsOn() {
		return PU_output_dependsOn;
	}
	public void setPU_output_dependsOn(String PU_output_dependsOn) {
		this.PU_output_dependsOn = PU_output_dependsOn;
	}
	public String getPU_output_connection() {
		return PU_output_connection;
	}
	public void setPU_output_connection(String PU_output_connection) {
		this.PU_output_connection = PU_output_connection;
	}
	public String getPU_output_outputJson() {
		return PU_output_outputJson;
	}
	public void setPU_output_outputJson(String PU_output_outputJson) {
		this.PU_output_outputJson = PU_output_outputJson;
	}
		
	private static Properties properties;
	private static Philips_Usecase_Attributes Philips_Usecase_Attributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";

	
	//PU-VPCs
		//VPC 1
	private static final String PU_VPC1_RNAME="PU_vpc1_rname";
	private static final String PU_VPC1_CIDRBLOCK="PU_vpc1_cidrblock";
		//VPC 2
	private static final String PU_VPC2_RNAME="PU_vpc2_rname";
	private static final String PU_VPC2_CIDRBLOCK="PU_vpc2_cidrblock";
		//PU-Subnet1
	private static final String PU_SUBNET1_RNAME="PU_subnet1_rname";
	private static final String PU_SUBNET1_CIDR="PU_subnet1_cidr";
	private static final String PU_SUBNET1_VPCID="PU_subnet1_vpcid"; 
		//PU-Subnet2
	private static final String PU_SUBNET2_RNAME="PU_subnet2_rname"; 
	private static final String PU_SUBNET2_CIDR="PU_subnet2_cidr"; 
	private static final String PU_SUBNET2_VPCID="PU_subnet2_vpcid"; 
		//PU-Subnet3
	private static final String PU_SUBNET3_RNAME="PU_subnet3_rname"; 
	private static final String PU_SUBNET3_CIDR="PU_subnet3_cidr"; 
	private static final String PU_SUBNET3_VPCID="PU_subnet3_vpcid"; 
		//PU-Subnet4
	private static final String PU_SUBNET4_RNAME="PU_subnet4_rname"; 
	private static final String PU_SUBNET4_CIDR="PU_subnet4_cidr"; 
	private static final String PU_SUBNET4_VPCID="PU_subnet4_vpcid"; 
		//PU-Subnet5
	private static final String PU_SUBNET5_RNAME="PU_subnet5_rname"; 
	private static final String PU_SUBNET5_CIDR="PU_subnet5_cidr"; 
	private static final String PU_SUBNET5_VPCID="PU_subnet5_vpcid"; 
		//PU-Subnet6
	private static final String PU_SUBNET6_RNAME="PU_subnet6_rname"; 
	private static final String PU_SUBNET6_CIDR="PU_subnet6_cidr"; 
	private static final String PU_SUBNET6_VPCID="PU_subnet6_vpcid"; 
		//PU-route
		//dmz-route
	private static final String PU_DMZ_ROUTE_RNAME="PU_dmz_route_Rname"; 
	private static final String PU_DMZ_ROUTE_DESTN_CIDR="PU_dmz_route_destn_cidr";  
	private static final String PU_DMZ_ROUTETABLE_ID="PU_dmz_routeTable_id";  
	private static final String PU_DMZ_ROUTE_GATEWAY_ID="PU_dmz_route_gateway_id" ;  
	private static final String PU_DMZ_ROUTE_DEPENDS_ON="PU_dmz_route_depends_on";
	private static final String PU_DMZ_ROUTE_CONNECTION ="PU_dmz_route_connection"; 
	private static final String PU_DMZ_ROUTE_INSTANCE_ID ="PU_dmz_route_instance_id";
	private static final String PU_DMZ_ROUTE_NAT_GATEWAY_ID ="PU_dmz_route_nat_gateway_id";
	private static final String PU_DMZ_ROUTE_NETWORK_INTERFACE_ID ="PU_dmz_route_network_interface_id";
	private static final String PU_DMZ_ROUTE_VPC_PEERING_CONN_ID="PU_dmz_route_vpc_peering_conn_id";
		//admin-route
	private static final String PU_ADMIN_ROUTE_RNAME="PU_admin_route_Rname"; 
	private static final String PU_ADMIN_ROUTE_DESTN_CIDR="PU_admin_route_destn_cidr";
	private static final String PU_ADMIN_ROUTETABLE_ID="PU_admin_routeTable_id";  
	private static final String PU_ADMIN_ROUTE_GATEWAY_ID="PU_admin_route_gateway_id";  
	private static final String PU_ADMIN_ROUTE_DEPENDS_ON="PU_admin_route_depends_on";
	private static final String PU_ADMIN_ROUTE_CONNECTION="PU_admin_route_connection"; 
	private static final String PU_ADMIN_ROUTE_INSTANCE_ID="PU_admin_route_instance_id";
	private static final String PU_ADMIN_ROUTE_NAT_GATEWAY_ID="PU_admin_route_nat_gateway_id";
	private static final String PU_ADMIN_ROUTE_NETWORK_INTERFACE_ID="PU_admin_route_network_interface_id";
	private static final String PU_ADMIN_ROUTE_VPC_PEERING_CONN_ID="PU_admin_route_vpc_peering_conn_id";
		//PU-IGW
	private static final String PU_IGW1_RNAME="PU_IGW1_rname"; 
	private static final String PU_IGW1_VPC_ID="PU_IGW1_vpc_id"; 
	//PU_IGW2
	private static final String PU_IGW2_RNAME="PU_IGW2_rname"; 
	private static final String PU_IGW2_VPC_ID="PU_IGW2_vpc_id"; 

		//PU-RouteTable1
	private static final String PU_PUBLIC_RT_RNAME="PU_public_Rt_rname"; 
	private static final String PU_PUBLIC_RT_VPCID="PU_public_Rt_vpcid"; 
	private static final String PU_PUBLIC_RT_JSON="PU_public_Rt_json"; 
		//PU-RouteTable2
	private static final String PU_PRIVATE_RT_RNAME="PU_private_Rt_rname"; 
	private static final String PU_PRIVATE_RT_VPCID="PU_private_Rt_vpcid"; 
	private static final String PU_PRIVATE_RT_JSON="PU_private_Rt_json"; 
	
	//PU-RouteTable3
	private static final String PU_IGW2_RT1_RNAME="PU_IGW2_Rt1_rname";
	private static final String PU_IGW2_RT1_VPCID="PU_IGW2_Rt1_vpcid";
	private static final String PU_IGW2_RT1_JSON="PU_IGW2_Rt1_json";
	//PU-RouteTable4
	private static final String PU_IGW2_RT2_RNAME="PU_IGW2_Rt2_rname";
	private static final String PU_IGW2_RT2_VPCID="PU_IGW2_Rt2_vpcid";
	private static final String PU_IGW2_RT2_JSON="PU_IGW2_Rt2_json";

	
	//PU-RTA1
	private static final String PU_PUBLIC_RTA1_RNAME="PU_public_RTA1_rname"; 
	private static final String PU_PUBLIC_RTA1_ROUTETABLE_ID="PU_public_RTA1_routetable_id"; 
	private static final String PU_PUBLIC_RTA1_SUBNETID="PU_public_RTA1_subnetid"; 
		//PU-RTA2
	private static final String PU_PUBLIC_RTA2_RNAME="PU_public_RTA2_rname"; 
	private static final String PU_PUBLIC_RTA2_ROUTETABLE_ID="PU_public_RTA2_routetable_id"; 
	private static final String PU_PUBLIC_RTA2_SUBNETID= "PU_public_RTA2_subnetid"; 
		//PU-RTA3
	private static final String PU_NAT_RTA1_RNAME="PU_nat_RTA1_rname"; 
	private static final String PU_NAT_RTA1_ROUTETABLE_ID="PU_nat_RTA1_routetable_id"; 
	private static final String PU_NAT_RTA1_SUBNETID="PU_nat_RTA1_subnetid"; 
		//PU-RTA4
	private static final String PU_NAT_RTA2_RNAME= "PU_nat_RTA2_rname"; 
	private static final String PU_NAT_RTA2_ROUTETABLE_ID="PU_nat_RTA2_routetable_id"; 
	private static final String PU_NAT_RTA2_SUBNETID="PU_nat_RTA2_subnetid"; 
		//PU-RTA5
	private static final String PU_PRIVATE_RTA1_RNAME="PU_private_RTA1_rname"; 
	private static final String PU_PRIVATE_RTA1_ROUTETABLE_ID="PU_private_RTA1_routetable_id"; 
	private static final String PU_PRIVATE_RTA1_SUBNETID="PU_private_RTA1_subnetid"; 
		//PU-RTA6
	private static final String PU_PRIVATE_RTA2_RNAME="PU_private_RTA2_rname"; 
	private static final String PU_PRIVATE_RTA2_ROUTETABLE_ID= "PU_private_RTA2_routetable_id"; 
	private static final String PU_PRIVATE_RTA2_SUBNETID="PU_private_RTA2_subnetid"; 
		 
		//PU-EIP
	private static final String PU_EIP_RNAME ="PU_EIP_rname" ;
	private static final String PU_EIP_DEPENDSON="PU_EIP_DependsOn"; 
	private static final String PU_EIP_VPC="PU_EIP_vpc"; 
		//String PU_natgateway 
	private static final String PU_NATGATEWAY_RNAME="PU_natgateway_rname"; 
	private static final String PU_NATGATEWAY_ALLOCATIONID="PU_natgateway_allocationId"; 
	private static final String PU_NATGATEWAY_SUBNETID="PU_natgateway_subnetId"; 
	private static final String PU_NATGATEWAY_DEPENDSON="PU_natgateway_dependsOn"; 
	private static final String PU_NATGATEWAY_NETWORKINTERFACEID="PU_natgateway_networkInterfaceId";
	private static final String PU_NATGATEWAY_PRIVATEIP="PU_natgateway_privateIp";
	private static final String PU_NATGATEWAY_PUBLICIP="PU_natgateway_publicIp";

		//String PU_Vpc_peer_connection
	private static final String PU_VPCPEERING_RNAME="PU_vpcPeering_Rname"; 
	private static final String PU_VPCPEERING_PEER_OWNER_ID="PU_vpcPeering_peer_owner_id"; 
	private static final String PU_VPCPEERING_PEER_VPC_ID="PU_vpcPeering_peer_vpc_id"; 
	private static final String PU_VPCPEERING_VPC_ID="PU_vpcPeering_vpc_id"; 
	private static final String PU_VPCPEERING_DEPENDSON="PU_vpcPeering_dependson";
	private static final String PU_VPCPEERING_CONNECTION="PU_vpcPeering_connection";
	private static final String PU_VPCPEERING_ACCEPTOR="PU_vpcPeering_acceptor"; 
	private static final String PU_VPCPEERING_AUTO_ACCEPT="PU_vpcPeering_auto_accept";
	private static final String PU_VPCPEERING_REQUESTOR="PU_vpcPeering_requestor"; 
	private static final String PU_VPCPEERING_TAG="PU_vpcPeering_tag"; 

		//PU Security Groups
	private static final String PU_ELB_SG_RNAME="PU_elb_sg_rname";  
	private static final String PU_ELB_SG_INGRESS="PU_elb_sg_ingress";  
	private static final String PU_ELB_SG_VPCID="PU_elb_sg_vpcid"; 

	private static final String PU_SG_RNAME="PU_sg_rname"; 
	private static final String PU_SG_INGRESS="PU_sg_ingress"; 
	private static final String PU_SG_VPCID="PU_sg_vpcid"; 

	private static final String PU_NODE1_SG_RNAME="PU_node1_sg_rname";  
	private static final String PU_NODE1_SG_INGRESS ="PU_node1_sg_ingress";  
	private static final String PU_NODE1_SG_VPCID ="PU_node1_sg_vpcid"; 

	private static final String PU_NODE2_SG_RNAME="PU_node2_sg_rname"; 
	private static final String PU_NODE2_SG_INGRESS ="PU_node2_sg_ingress"; 
	private static final String PU_NODE2_SG_VPCID ="PU_node2_sg_vpcid";  

	private static final String PU_NODE3_SG_RNAME="PU_node3_sg_rname"; 
	private static final String PU_NODE3_SG_INGRESS="PU_node3_sg_ingress";  
	private static final String PU_NODE3_SG_VPCID="PU_node3_sg_vpcid";  

	private static final String PU_NODE4_SG_RNAME="PU_node4_sg_rname";  
	private static final String PU_NODE4_SG_INGRESS="PU_node4_sg_ingress";  
	private static final String PU_NODE4_SG_VPCID ="PU_node4_sg_vpcid";  

		//PU_output
	private static final String PU_OUTPUT_RESOURCENAME="PU_output_resourceName"; 
	private static final String PU_OUTPUT_DEPENDSON="PU_output_dependsOn";
	private static final String PU_OUTPUT_CONNECTION="PU_output_connection";
	private static final String PU_OUTPUT_OUTPUTJSON="PU_output_outputJson";
	
	public static Philips_Usecase_Attributes getPhilipsUsecaseFromProperties() {
		
		Philips_Usecase_Attributes.getReadPropertiesFile();
		
		//PU-VPCs
		//VPC 1
		String PU_vpc1_rname=properties.getProperty(PU_VPC1_RNAME);
		String PU_vpc1_cidrblock=properties.getProperty(PU_VPC1_CIDRBLOCK);
		//VPC 2
		String PU_vpc2_rname=properties.getProperty(PU_VPC2_RNAME);
		String PU_vpc2_cidrblock=properties.getProperty(PU_VPC2_CIDRBLOCK);
		//PU-Subnet1
		String PU_subnet1_rname=properties.getProperty(PU_SUBNET1_RNAME);
		String PU_subnet1_cidr=properties.getProperty(PU_SUBNET1_CIDR);
		String PU_subnet1_vpcid=properties.getProperty(PU_SUBNET1_VPCID); 
		//PU-Subnet2
		String PU_subnet2_rname=properties.getProperty(PU_SUBNET2_RNAME); 
		String PU_subnet2_cidr=properties.getProperty(PU_SUBNET2_CIDR); 
		String PU_subnet2_vpcid=properties.getProperty(PU_SUBNET2_VPCID); 
		//PU-Subnet3
		String PU_subnet3_rname=properties.getProperty(PU_SUBNET3_RNAME); 
		String PU_subnet3_cidr=properties.getProperty(PU_SUBNET3_CIDR); 
		String PU_subnet3_vpcid=properties.getProperty(PU_SUBNET3_VPCID); 
		//PU-Subnet4
		String PU_subnet4_rname=properties.getProperty(PU_SUBNET4_RNAME); 
		String PU_subnet4_cidr=properties.getProperty(PU_SUBNET4_CIDR); 
		String PU_subnet4_vpcid=properties.getProperty(PU_SUBNET4_VPCID); 
		//PU-Subnet5
		String PU_subnet5_rname=properties.getProperty(PU_SUBNET5_RNAME); 
		String PU_subnet5_cidr=properties.getProperty(PU_SUBNET5_CIDR); 
		String PU_subnet5_vpcid=properties.getProperty(PU_SUBNET5_VPCID); 
		//PU-Subnet6
		String PU_subnet6_rname=properties.getProperty(PU_SUBNET6_RNAME); 
		String PU_subnet6_cidr=properties.getProperty(PU_SUBNET6_CIDR); 
		String PU_subnet6_vpcid=properties.getProperty(PU_SUBNET6_VPCID); 
		//PU-route
		//dmz-route
		String PU_dmz_route_Rname=properties.getProperty(PU_DMZ_ROUTE_RNAME); 
		String PU_dmz_route_destn_cidr=properties.getProperty(PU_DMZ_ROUTE_DESTN_CIDR);  
		String PU_dmz_routeTable_id =properties.getProperty(PU_DMZ_ROUTETABLE_ID);  
		String PU_dmz_route_gateway_id =properties.getProperty(PU_DMZ_ROUTE_GATEWAY_ID) ;  
		String PU_dmz_route_depends_on=properties.getProperty(PU_DMZ_ROUTE_DEPENDS_ON);
		String PU_dmz_route_connection=properties.getProperty(PU_DMZ_ROUTE_CONNECTION); 
		String PU_dmz_route_instance_id=properties.getProperty(PU_DMZ_ROUTE_INSTANCE_ID);
		String PU_dmz_route_nat_gateway_id=properties.getProperty(PU_DMZ_ROUTE_NAT_GATEWAY_ID);
		String PU_dmz_route_network_interface_id=properties.getProperty(PU_DMZ_ROUTE_NETWORK_INTERFACE_ID);
		String PU_dmz_route_vpc_peering_conn_id=properties.getProperty(PU_DMZ_ROUTE_VPC_PEERING_CONN_ID);
		//admin-route
		String PU_admin_route_Rname=properties.getProperty(PU_ADMIN_ROUTE_RNAME); 
		String PU_admin_route_destn_cidr=properties.getProperty(PU_ADMIN_ROUTE_DESTN_CIDR);
		String PU_admin_routeTable_id =properties.getProperty(PU_ADMIN_ROUTETABLE_ID);  
		String PU_admin_route_gateway_id=properties.getProperty(PU_ADMIN_ROUTE_GATEWAY_ID) ;  
		String PU_admin_route_depends_on=properties.getProperty(PU_ADMIN_ROUTE_DEPENDS_ON);
		String PU_admin_route_connection=properties.getProperty(PU_ADMIN_ROUTE_CONNECTION); 
		String PU_admin_route_instance_id=properties.getProperty(PU_ADMIN_ROUTE_INSTANCE_ID);
		String PU_admin_route_nat_gateway_id=properties.getProperty(PU_ADMIN_ROUTE_NAT_GATEWAY_ID);
		String PU_admin_route_network_interface_id=properties.getProperty(PU_ADMIN_ROUTE_NETWORK_INTERFACE_ID);
		String PU_admin_route_vpc_peering_conn_id=properties.getProperty(PU_ADMIN_ROUTE_VPC_PEERING_CONN_ID);
		//PU-IGW
		String PU_IGW1_rname=properties.getProperty(PU_IGW1_RNAME); 
		String PU_IGW1_vpc_id=properties.getProperty(PU_IGW1_VPC_ID); 
		//PU-IGW2
		String PU_IGW2_rname=properties.getProperty(PU_IGW2_RNAME);
		String PU_IGW2_vpc_id=properties.getProperty(PU_IGW2_VPC_ID);

		//PU-RouteTable1
		String PU_public_Rt_rname=properties.getProperty(PU_PUBLIC_RT_RNAME); 
		String PU_public_Rt_vpcid=properties.getProperty(PU_PUBLIC_RT_VPCID); 
		String PU_public_Rt_json=properties.getProperty(PU_PUBLIC_RT_JSON); 
		//PU-RouteTable2
		String PU_private_Rt_rname=properties.getProperty(PU_PRIVATE_RT_RNAME); 
		String PU_private_Rt_vpcid=properties.getProperty(PU_PRIVATE_RT_VPCID); 
		String PU_private_Rt_json=properties.getProperty(PU_PRIVATE_RT_JSON); 
		//PU-RouteTable3
		String PU_IGW2_Rt1_rname=properties.getProperty(PU_IGW2_RT1_RNAME);
		String PU_IGW2_Rt1_vpcid=properties.getProperty(PU_IGW2_RT1_VPCID); 
		String PU_IGW2_Rt1_json=properties.getProperty(PU_IGW2_RT1_JSON); 
		//PU-RouteTable4
		String PU_IGW2_Rt2_rname=properties.getProperty(PU_IGW2_RT2_RNAME); 
		String PU_IGW2_Rt2_vpcid=properties.getProperty(PU_IGW2_RT2_VPCID);
		String PU_IGW2_Rt2_json=properties.getProperty(PU_IGW2_RT2_JSON); 

		//PU-RTA1
		String PU_public_RTA1_rname=properties.getProperty(PU_PUBLIC_RTA1_RNAME); 
		String PU_public_RTA1_routetable_id=properties.getProperty(PU_PUBLIC_RTA1_ROUTETABLE_ID); 
		String PU_public_RTA1_subnetid=properties.getProperty(PU_PUBLIC_RTA1_SUBNETID); 
		//PU-RTA2
		String PU_public_RTA2_rname=properties.getProperty(PU_PUBLIC_RTA2_RNAME); 
		String PU_public_RTA2_routetable_id=properties.getProperty(PU_PUBLIC_RTA2_ROUTETABLE_ID); 
		String PU_public_RTA2_subnetid=properties.getProperty(PU_PUBLIC_RTA2_SUBNETID); 
		//PU-RTA3
		String PU_nat_RTA1_rname=properties.getProperty(PU_NAT_RTA1_RNAME); 
		String PU_nat_RTA1_routetable_id=properties.getProperty(PU_NAT_RTA1_ROUTETABLE_ID); 
		String PU_nat_RTA1_subnetid=properties.getProperty(PU_NAT_RTA1_SUBNETID); 
		//PU-RTA4
		String PU_nat_RTA2_rname=properties.getProperty(PU_NAT_RTA2_RNAME); 
		String PU_nat_RTA2_routetable_id=properties.getProperty(PU_NAT_RTA2_ROUTETABLE_ID); 
		String PU_nat_RTA2_subnetid=properties.getProperty(PU_NAT_RTA2_SUBNETID); 
		//PU-RTA5
		String PU_private_RTA1_rname=properties.getProperty(PU_PRIVATE_RTA1_RNAME); 
		String PU_private_RTA1_routetable_id=properties.getProperty(PU_PRIVATE_RTA1_ROUTETABLE_ID); 
		String PU_private_RTA1_subnetid=properties.getProperty(PU_PRIVATE_RTA1_SUBNETID); 
		//PU-RTA6
		String PU_private_RTA2_rname=properties.getProperty(PU_PRIVATE_RTA2_RNAME);
		String PU_private_RTA2_routetable_id=properties.getProperty(PU_PRIVATE_RTA2_ROUTETABLE_ID); 
		String PU_private_RTA2_subnetid=properties.getProperty(PU_PRIVATE_RTA2_SUBNETID); 
		 
		//PU-EIP
		String PU_EIP_rnam =properties.getProperty(PU_EIP_RNAME);
		String PU_EIP_DependsOn=properties.getProperty(PU_EIP_DEPENDSON); 
		String PU_EIP_vpc=properties.getProperty(PU_EIP_VPC); 
		//String PU_natgateway 
		String PU_natgateway_rname=properties.getProperty(PU_NATGATEWAY_RNAME); 
		String PU_natgateway_allocationId=properties.getProperty(PU_NATGATEWAY_ALLOCATIONID); 
		String PU_natgateway_subnetId=properties.getProperty(PU_NATGATEWAY_SUBNETID); 
		String PU_natgateway_dependsOn=properties.getProperty(PU_NATGATEWAY_DEPENDSON); 
		String PU_natgateway_networkInterfaceId=properties.getProperty(PU_NATGATEWAY_NETWORKINTERFACEID);
		String PU_natgateway_privateIp=properties.getProperty(PU_NATGATEWAY_PRIVATEIP);
		String PU_natgateway_publicIp=properties.getProperty(PU_NATGATEWAY_PUBLICIP);

		//String PU_Vpc_peer_connection
		String PU_vpcPeering_Rname=properties.getProperty(PU_VPCPEERING_RNAME); 
		String PU_vpcPeering_peer_owner_id=properties.getProperty(PU_VPCPEERING_PEER_OWNER_ID); 
		String PU_vpcPeering_peer_vpc_id=properties.getProperty(PU_VPCPEERING_PEER_VPC_ID); 
		String PU_vpcPeering_vpc_id=properties.getProperty(PU_VPCPEERING_VPC_ID); 
		String PU_vpcPeering_dependson =properties.getProperty(PU_VPCPEERING_DEPENDSON);
		String PU_vpcPeering_connection=properties.getProperty(PU_VPCPEERING_CONNECTION);
		String PU_vpcPeering_acceptor=properties.getProperty(PU_VPCPEERING_ACCEPTOR); 
		String PU_vpcPeering_auto_accept=properties.getProperty(PU_VPCPEERING_AUTO_ACCEPT);
		String PU_vpcPeering_requestor=properties.getProperty(PU_VPCPEERING_REQUESTOR); 
		String PU_vpcPeering_tag=properties.getProperty(PU_VPCPEERING_TAG); 

		//PU Security Groups
		String PU_elb_sg_rname=properties.getProperty(PU_ELB_SG_RNAME);  
		String PU_elb_sg_ingress=properties.getProperty(PU_ELB_SG_INGRESS);  
		String PU_elb_sg_vpcid=properties.getProperty(PU_ELB_SG_VPCID); 

		String PU_sg_rname=properties.getProperty(PU_SG_RNAME); 
		String PU_sg_ingress=properties.getProperty(PU_SG_INGRESS); 
		String PU_sg_vpcid=properties.getProperty(PU_SG_VPCID); 

		String PU_node1_sg_rname =properties.getProperty(PU_NODE1_SG_RNAME);  
		String PU_node1_sg_ingress=properties.getProperty(PU_NODE1_SG_INGRESS) ;  
		String PU_node1_sg_vpcid =properties.getProperty(PU_NODE1_SG_VPCID); 

		String PU_node2_sg_rname =properties.getProperty(PU_NODE2_SG_RNAME); 
		String PU_node2_sg_ingress =properties.getProperty(PU_NODE2_SG_INGRESS); 
		String PU_node2_sg_vpcid =properties.getProperty(PU_NODE2_SG_VPCID);  

		String PU_node3_sg_rname =properties.getProperty(PU_NODE3_SG_RNAME); 
		String PU_node3_sg_ingress=properties.getProperty(PU_NODE3_SG_INGRESS) ;  
		String PU_node3_sg_vpcid =properties.getProperty(PU_NODE3_SG_VPCID);  

		String PU_node4_sg_rname =properties.getProperty(PU_NODE4_SG_RNAME);  
		String PU_node4_sg_ingress =properties.getProperty(PU_NODE4_SG_INGRESS);  
		String PU_node4_sg_vpcid =properties.getProperty(PU_NODE4_SG_VPCID);  

		//PU_output
		String PU_output_resourceName=properties.getProperty(PU_OUTPUT_RESOURCENAME); 
		String PU_output_dependsOn=properties.getProperty(PU_OUTPUT_DEPENDSON);
		String PU_output_connection=properties.getProperty(PU_OUTPUT_CONNECTION);
		String PU_output_outputJson=properties.getProperty(PU_OUTPUT_OUTPUTJSON);
		
		Philips_Usecase_Attributes= new Philips_Usecase_Attributes();
		Philips_Usecase_Attributes.setPU_vpc1_rname(PU_vpc1_rname);
		Philips_Usecase_Attributes.setPU_vpc1_cidrblock(PU_vpc1_cidrblock);
		Philips_Usecase_Attributes.setPU_vpc2_rname(PU_vpc2_rname);
		Philips_Usecase_Attributes.setPU_vpc2_cidrblock(PU_vpc2_cidrblock);
		Philips_Usecase_Attributes.setPU_subnet1_rname(PU_subnet1_rname);
		Philips_Usecase_Attributes.setPU_subnet1_cidr(PU_subnet1_cidr);
		Philips_Usecase_Attributes.setPU_subnet1_vpcid(PU_subnet1_vpcid);
		Philips_Usecase_Attributes.setPU_subnet2_rname(PU_subnet2_rname);
		Philips_Usecase_Attributes.setPU_subnet2_cidr(PU_subnet2_cidr);
		Philips_Usecase_Attributes.setPU_subnet2_vpcid(PU_subnet2_vpcid);
		Philips_Usecase_Attributes.setPU_subnet3_rname(PU_subnet3_rname);
		Philips_Usecase_Attributes.setPU_subnet3_cidr(PU_subnet3_cidr);
		Philips_Usecase_Attributes.setPU_subnet3_vpcid(PU_subnet3_vpcid);
		Philips_Usecase_Attributes.setPU_subnet4_rname(PU_subnet4_rname);
		Philips_Usecase_Attributes.setPU_subnet4_cidr(PU_subnet4_cidr);
		Philips_Usecase_Attributes.setPU_subnet4_vpcid(PU_subnet4_vpcid);
		Philips_Usecase_Attributes.setPU_subnet5_rname(PU_subnet5_rname);
		Philips_Usecase_Attributes.setPU_subnet5_cidr(PU_subnet5_cidr);
		Philips_Usecase_Attributes.setPU_subnet5_vpcid(PU_subnet5_vpcid);
		Philips_Usecase_Attributes.setPU_subnet6_rname(PU_subnet6_rname);
		Philips_Usecase_Attributes.setPU_subnet6_cidr(PU_subnet6_cidr);
		Philips_Usecase_Attributes.setPU_subnet6_vpcid(PU_subnet6_vpcid);
		Philips_Usecase_Attributes.setPU_admin_route_Rname(PU_admin_route_Rname);
		Philips_Usecase_Attributes.setPU_admin_route_connection(PU_admin_route_connection);
		Philips_Usecase_Attributes.setPU_admin_route_depends_on(PU_admin_route_depends_on);
		Philips_Usecase_Attributes.setPU_admin_route_destn_cidr(PU_admin_route_destn_cidr);
		Philips_Usecase_Attributes.setPU_admin_route_gateway_id(PU_admin_route_gateway_id);
		Philips_Usecase_Attributes.setPU_admin_route_instance_id(PU_admin_route_instance_id);
		Philips_Usecase_Attributes.setPU_admin_route_nat_gateway_id(PU_admin_route_nat_gateway_id);
		Philips_Usecase_Attributes.setPU_admin_route_network_interface_id(PU_admin_route_network_interface_id);
		Philips_Usecase_Attributes.setPU_admin_route_vpc_peering_conn_id(PU_admin_route_vpc_peering_conn_id);
		Philips_Usecase_Attributes.setPU_admin_routeTable_id(PU_admin_routeTable_id);
		Philips_Usecase_Attributes.setPU_dmz_route_connection(PU_dmz_route_connection);
		Philips_Usecase_Attributes.setPU_dmz_route_depends_on(PU_dmz_route_depends_on);
		Philips_Usecase_Attributes.setPU_dmz_route_destn_cidr(PU_dmz_route_destn_cidr);
		Philips_Usecase_Attributes.setPU_dmz_route_gateway_id(PU_dmz_route_gateway_id);
		Philips_Usecase_Attributes.setPU_dmz_route_instance_id(PU_dmz_route_instance_id);
		Philips_Usecase_Attributes.setPU_dmz_route_nat_gateway_id(PU_dmz_route_nat_gateway_id);
		Philips_Usecase_Attributes.setPU_dmz_route_network_interface_id(PU_dmz_route_network_interface_id);
		Philips_Usecase_Attributes.setPU_dmz_route_Rname(PU_dmz_route_Rname);
		Philips_Usecase_Attributes.setPU_dmz_route_vpc_peering_conn_id(PU_dmz_route_vpc_peering_conn_id);
		Philips_Usecase_Attributes.setPU_dmz_routeTable_id(PU_dmz_routeTable_id);
		Philips_Usecase_Attributes.setPU_IGW1_rname(PU_IGW1_rname);
		Philips_Usecase_Attributes.setPU_IGW1_vpc_id(PU_IGW1_vpc_id);
		Philips_Usecase_Attributes.setPU_IGW2_rname(PU_IGW2_rname);
		Philips_Usecase_Attributes.setPU_IGW2_vpc_id(PU_IGW2_vpc_id);
		Philips_Usecase_Attributes.setPU_public_Rt_json(PU_public_Rt_json);
		Philips_Usecase_Attributes.setPU_public_Rt_rname(PU_public_Rt_rname);
		Philips_Usecase_Attributes.setPU_public_Rt_vpcid(PU_public_Rt_vpcid);
		Philips_Usecase_Attributes.setPU_private_Rt_rname(PU_private_Rt_rname);
		Philips_Usecase_Attributes.setPU_private_Rt_json(PU_private_Rt_json);
		Philips_Usecase_Attributes.setPU_private_Rt_vpcid(PU_private_Rt_vpcid);
		Philips_Usecase_Attributes.setPU_IGW2_Rt1_json(PU_IGW2_Rt1_json);
		Philips_Usecase_Attributes.setPU_IGW2_Rt1_rname(PU_IGW2_Rt1_rname);
		Philips_Usecase_Attributes.setPU_IGW2_Rt1_vpcid(PU_IGW2_Rt1_vpcid);
		Philips_Usecase_Attributes.setPU_IGW2_Rt2_rname(PU_IGW2_Rt2_rname);
		Philips_Usecase_Attributes.setPU_IGW2_Rt2_vpcid(PU_IGW2_Rt2_vpcid);
		Philips_Usecase_Attributes.setPU_IGW2_Rt2_json(PU_IGW2_Rt2_json);
		Philips_Usecase_Attributes.setPU_public_RTA1_rname(PU_public_RTA1_rname);
		Philips_Usecase_Attributes.setPU_public_RTA1_routetable_id(PU_public_RTA1_routetable_id);
		Philips_Usecase_Attributes.setPU_public_RTA1_subnetid(PU_public_RTA1_subnetid);
		Philips_Usecase_Attributes.setPU_public_RTA2_rname(PU_public_RTA2_rname);
		Philips_Usecase_Attributes.setPU_public_RTA2_routetable_id(PU_public_RTA2_routetable_id);
		Philips_Usecase_Attributes.setPU_public_RTA2_subnetid(PU_public_RTA2_subnetid);
		Philips_Usecase_Attributes.setPU_private_RTA1_rname(PU_private_RTA1_rname);
		Philips_Usecase_Attributes.setPU_private_RTA1_routetable_id(PU_private_RTA1_routetable_id);
		Philips_Usecase_Attributes.setPU_private_RTA1_subnetid(PU_private_RTA1_subnetid);
		Philips_Usecase_Attributes.setPU_private_RTA2_rname(PU_private_RTA2_rname);
		Philips_Usecase_Attributes.setPU_private_RTA2_routetable_id(PU_private_RTA2_routetable_id);
		Philips_Usecase_Attributes.setPU_private_RTA2_subnetid(PU_private_RTA2_subnetid);
		Philips_Usecase_Attributes.setPU_vpcPeering_Rname(PU_vpcPeering_Rname);
		Philips_Usecase_Attributes.setPU_vpcPeering_peer_owner_id(PU_vpcPeering_peer_owner_id);
		Philips_Usecase_Attributes.setPU_vpcPeering_peer_vpc_id(PU_vpcPeering_peer_vpc_id);
		Philips_Usecase_Attributes.setPU_vpcPeering_vpc_id(PU_vpcPeering_vpc_id);
		Philips_Usecase_Attributes.setPU_vpcPeering_requestor(PU_vpcPeering_requestor);
		Philips_Usecase_Attributes.setPU_vpcPeering_tag(PU_vpcPeering_tag);
		Philips_Usecase_Attributes.setPU_vpcPeering_dependson(PU_vpcPeering_dependson);
		Philips_Usecase_Attributes.setPU_vpcPeering_connection(PU_vpcPeering_connection);
		Philips_Usecase_Attributes.setPU_vpcPeering_auto_accept(PU_vpcPeering_auto_accept);
		Philips_Usecase_Attributes.setPU_vpcPeering_acceptor(PU_vpcPeering_acceptor);
		Philips_Usecase_Attributes.setPU_nat_RTA1_rname(PU_nat_RTA1_rname);
		Philips_Usecase_Attributes.setPU_nat_RTA1_routetable_id(PU_nat_RTA1_routetable_id);
		Philips_Usecase_Attributes.setPU_nat_RTA1_subnetid(PU_nat_RTA1_subnetid);
		Philips_Usecase_Attributes.setPU_nat_RTA2_rname(PU_nat_RTA2_rname);
		Philips_Usecase_Attributes.setPU_nat_RTA2_routetable_id(PU_nat_RTA2_routetable_id);
		Philips_Usecase_Attributes.setPU_nat_RTA2_subnetid(PU_nat_RTA2_subnetid);
		Philips_Usecase_Attributes.setPU_natgateway_rname(PU_natgateway_rname);
		Philips_Usecase_Attributes.setPU_natgateway_allocationId(PU_natgateway_allocationId);
		Philips_Usecase_Attributes.setPU_natgateway_dependsOn(PU_natgateway_dependsOn);
		Philips_Usecase_Attributes.setPU_natgateway_networkInterfaceId(PU_natgateway_networkInterfaceId);
		Philips_Usecase_Attributes.setPU_natgateway_privateIp(PU_natgateway_privateIp);
		Philips_Usecase_Attributes.setPU_natgateway_publicIp(PU_natgateway_publicIp);
		Philips_Usecase_Attributes.setPU_natgateway_subnetId(PU_natgateway_subnetId);
		Philips_Usecase_Attributes.setPU_EIP_rnam(PU_EIP_rnam);
		Philips_Usecase_Attributes.setPU_EIP_DependsOn(PU_EIP_DependsOn);
		Philips_Usecase_Attributes.setPU_EIP_vpc(PU_EIP_vpc);
		Philips_Usecase_Attributes.setPU_sg_rname(PU_sg_rname);
		Philips_Usecase_Attributes.setPU_sg_ingress(PU_sg_ingress);
		Philips_Usecase_Attributes.setPU_sg_vpcid(PU_sg_vpcid);
		Philips_Usecase_Attributes.setPU_elb_sg_rname(PU_elb_sg_rname);
		Philips_Usecase_Attributes.setPU_elb_sg_ingress(PU_elb_sg_ingress);
		Philips_Usecase_Attributes.setPU_elb_sg_vpcid(PU_elb_sg_vpcid);
		Philips_Usecase_Attributes.setPU_node1_sg_rname(PU_node1_sg_rname);
		Philips_Usecase_Attributes.setPU_node1_sg_ingress(PU_node1_sg_ingress);
		Philips_Usecase_Attributes.setPU_node1_sg_vpcid(PU_node1_sg_vpcid);
		Philips_Usecase_Attributes.setPU_node2_sg_rname(PU_node2_sg_rname);
		Philips_Usecase_Attributes.setPU_node2_sg_vpcid(PU_node2_sg_vpcid);
		Philips_Usecase_Attributes.setPU_node2_sg_ingress(PU_node2_sg_ingress);
		Philips_Usecase_Attributes.setPU_node3_sg_rname(PU_node3_sg_rname);
		Philips_Usecase_Attributes.setPU_node3_sg_ingress(PU_node3_sg_ingress);
		Philips_Usecase_Attributes.setPU_node3_sg_vpcid(PU_node3_sg_vpcid);
		Philips_Usecase_Attributes.setPU_node4_sg_rname(PU_node4_sg_rname);
		Philips_Usecase_Attributes.setPU_node4_sg_ingress(PU_node4_sg_ingress);
		Philips_Usecase_Attributes.setPU_node4_sg_vpcid(PU_node4_sg_vpcid);
		Philips_Usecase_Attributes.setPU_output_resourceName(PU_output_resourceName);
		Philips_Usecase_Attributes.setPU_output_connection(PU_output_connection);
		Philips_Usecase_Attributes.setPU_output_dependsOn(PU_output_dependsOn);
		Philips_Usecase_Attributes.setPU_output_outputJson(PU_output_outputJson);
		return Philips_Usecase_Attributes;
	}

	public static void getReadPropertiesFile() {
		if(Philips_Usecase_Attributes == null || Philips_Usecase_Attributes ==null){
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
