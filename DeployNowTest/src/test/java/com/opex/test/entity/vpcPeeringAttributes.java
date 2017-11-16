package com.opex.test.entity;

import java.io.InputStream;
import java.util.Properties;

import com.opex.test.utils.FileUtils;

public class vpcPeeringAttributes {
	//vpc peering
	String vpcPeering_Rname;
	String vpcPeering_peer_owner_id;
	String vpcPeering_peer_vpc_id;
	String vpcPeering_vpc_id;
	String vpcPeering_dependson;
	String vpcPeering_connection;
	String vpcPeering_acceptor;
	String vpcPeering_auto_accept;
	String vpcPeering_requestor;
	String vpcPeering_tag;
	//vpc peering-route1
	String vpcPeering_route1_Rname;
	String vpcPeering_route1_destination_cidr_block;
	String vpcPeering_route1_table_id;
	String vpcPeering_route1_vpc_peering_connection_id;
	//vpc peering-Vpc1
	String vpcPeering_vpc1_Rname;
	String vpcPeering_vpc1_cidrblock;
	String vpcPeering_vpc1_enable_dns_hostnames;
	String vpcPeering_vpc1_enable_dns_support;
	//vpc peering-igw1
	String vpcPeering_igw1_Rname;
	String vpcPeering_igw1_vpc_id;
	String vpcPeering_igw1_dependson;
	//vpc peering-Subnet1
	String vpcPeering_subnet1_Rname;
	String vpcPeering_subnet1_cidr_block;
	String vpcPeering_subnet1_vpc_id;
	String vpcPeering_subnet1_dependson;
	String vpcPeering_subnet1_availability_zone;
	String vpcPeering_subnet1_map_public_ip_on_launch;
	//vpc peering-routetable1
	String vpcPeering_routetable1_Rname;
	String vpcPeering_routetable1_vpc_id;
	String vpcPeering_routetable1_dependson;
	String vpcPeering_routetable1_route;
	//vpc peering-routetable association1
	String vpcPeering_rta1_Rname;
	String vpcPeering_rta1_route_table_id;
	String vpcPeering_rta1_subnet_id;
	String vpcPeering_rta1_dependson;

	//vpc peering-Vpc2
	String vpcPeering_vpc2_Rname;
	String vpcPeering_vpc2_cidrblock;
	String vpcPeering_vpc2_enable_dns_hostnames;
	String vpcPeering_vpc2_enable_dns_support;
	//vpc peering-igw2
	String vpcPeering_igw2_Rname;
	String vpcPeering_igw2_vpc_id;
	String vpcPeering_igw2_dependson;
	//vpc peering-Subnet2
	String vpcPeering_subnet2_Rname;
	String vpcPeering_subnet2_cidr_block;
	String vpcPeering_subnet2_vpc_id;
	String vpcPeering_subnet2_dependson;
	String vpcPeering_subnet2_availability_zone;
	String vpcPeering_subnet2_map_public_ip_on_launch;
	//vpc peering-routetable2
	String vpcPeering_routetable2_Rname;
	String vpcPeering_routetable2_vpc_id;
	String vpcPeering_routetable2_dependson;
	String vpcPeering_routetable2_route;
	//vpc peering-routetable association1
	String vpcPeering_rta2_Rname;
	String vpcPeering_rta2_route_table_id;
	String vpcPeering_rta2_subnet_id;
	String vpcPeering_rta2_dependson;

	//vpc peering
	public String getVpcPeering_Rname() {
		return vpcPeering_Rname;
	}
	public void setVpcPeering_Rname(String vpcPeering_Rname) {
		this.vpcPeering_Rname = vpcPeering_Rname;
	}

	public String getVpcPeering_peer_owner_id() {
		return vpcPeering_peer_owner_id;
	}
	public void setVpcPeering_peer_owner_id(String vpcPeering_peer_owner_id) {
		this.vpcPeering_peer_owner_id = vpcPeering_peer_owner_id;
	}

	public String getVpcPeering_peer_vpc_id() {
		return vpcPeering_peer_vpc_id;
	}
	public void setVpcPeering_peer_vpc_id(String vpcPeering_peer_vpc_id) {
		this.vpcPeering_peer_vpc_id = vpcPeering_peer_vpc_id;
	}

	public String getVpcPeering_vpc_id() {
		return vpcPeering_vpc_id;
	}
	public void setVpcPeering_vpc_id(String vpcPeering_vpc_id) {
		this.vpcPeering_vpc_id = vpcPeering_vpc_id;
	}
	public String getVpcPeering_dependson() {
		return vpcPeering_dependson;
	}
	public void setVpcPeering_dependson(String vpcPeering_dependson) {
		this.vpcPeering_dependson = vpcPeering_dependson;
	}
	public String getVpcPeering_connection() {
		return vpcPeering_connection;
	}
	public void setVpcPeering_connection(String vpcPeering_connection) {
		this.vpcPeering_connection = vpcPeering_connection;
	}
	public String getVpcPeering_acceptor() {
		return vpcPeering_acceptor;
	}
	public void setVpcPeering_acceptor(String vpcPeering_acceptor) {
		this.vpcPeering_acceptor = vpcPeering_acceptor;
	}
	public String getVpcPeering_auto_accept() {
		return vpcPeering_auto_accept;
	}
	public void setVpcPeering_auto_accept(String vpcPeering_auto_accept) {
		this.vpcPeering_auto_accept = vpcPeering_auto_accept;
	}
	public String getVpcPeering_requestor() {
		return vpcPeering_requestor;
	}
	public void setVpcPeering_requestor(String vpcPeering_requestor) {
		this.vpcPeering_requestor = vpcPeering_requestor;
	}
	public String getVpcPeering_tag() {
		return vpcPeering_tag;
	}
	public void setVpcPeering_tag(String vpcPeering_tag) {
		this.vpcPeering_tag = vpcPeering_tag;
	}

	//vpc peering-route1
	public String getVpcPeering_route1_Rname() {
		return vpcPeering_route1_Rname;
	}
	public void setVpcPeering_route1_Rname(String vpcPeering_route1_Rname) {
		this.vpcPeering_route1_Rname= vpcPeering_route1_Rname;
	}

	public String getVpcPeering_route1_destination_cidr_block() {
		return vpcPeering_route1_destination_cidr_block;
	}
	public void setVpcPeering_route1_destination_cidr_block(String vpcPeering_route1_destination_cidr_block) {
		this.vpcPeering_route1_destination_cidr_block= vpcPeering_route1_destination_cidr_block;
	}
	public String getVpcPeering_route1_table_id() {
		return vpcPeering_route1_table_id;
	}
	public void setVpcPeering_route1_table_id(String vpcPeering_route1_table_id) {
		this.vpcPeering_route1_table_id= vpcPeering_route1_table_id;
	}
	public String getVpcPeering_route1_vpc_peering_connection_id() {
		return vpcPeering_route1_vpc_peering_connection_id;
	}
	public void setVpcPeering_route1_vpc_peering_connection_id(String vpcPeering_route1_vpc_peering_connection_id) {
		this.vpcPeering_route1_vpc_peering_connection_id= vpcPeering_route1_vpc_peering_connection_id;
	}
	//vpc peering-Vpc1
	public String getVpcPeering_vpc1_Rname() {
		return vpcPeering_vpc1_Rname;
	}
	public void setVpcPeering_vpc1_Rname(String vpcPeering_vpc1_Rname) {
		this.vpcPeering_vpc1_Rname= vpcPeering_vpc1_Rname;
	}
	public String getVpcPeering_vpc1_cidrblock() {
		return vpcPeering_vpc1_cidrblock;
	}
	public void setVpcPeering_vpc1_cidrblock(String vpcPeering_vpc1_cidrblock) {
		this.vpcPeering_vpc1_cidrblock=vpcPeering_vpc1_cidrblock;
	}

	public String getVpcPeering_vpc1_enable_dns_hostnames() {
		return vpcPeering_vpc1_enable_dns_hostnames;
	}
	public void setVpcPeering_vpc1_enable_dns_hostnames(String vpcPeering_vpc1_enable_dns_hostnames) {
		this.vpcPeering_vpc1_enable_dns_hostnames= vpcPeering_vpc1_enable_dns_hostnames;
	}

	public String getVpcPeering_vpc1_enable_dns_support() {
		return vpcPeering_vpc1_enable_dns_support;
	}
	public void setVpcPeering_vpc1_enable_dns_support(String vpcPeering_vpc1_enable_dns_support) {
		this.vpcPeering_vpc1_enable_dns_support=vpcPeering_vpc1_enable_dns_support;
	}
	//vpc peering-igw1
	public String getVpcPeering_igw1_Rname() {
		return vpcPeering_igw1_Rname;
	}
	public void setVpcPeering_igw1_Rname(String vpcPeering_igw1_Rname) {
		this.vpcPeering_igw1_Rname=vpcPeering_igw1_Rname;
	}
	public String getVpcPeering_igw1_vpc_id() {
		return vpcPeering_igw1_vpc_id;
	}
	public void setVpcPeering_igw1_vpc_id(String vpcPeering_igw1_vpc_id) {
		this.vpcPeering_igw1_vpc_id=vpcPeering_igw1_vpc_id;
	}
	public String getVpcPeering_igw1_dependson() {
		return vpcPeering_igw1_dependson;
	}
	public void setVpcPeering_igw1_dependson(String vpcPeering_igw1_dependson) {
		this.vpcPeering_igw1_dependson=vpcPeering_igw1_dependson;
	}
	//vpc peering-Subnet1
	public String getVpcPeering_subnet1_Rname() {
		return vpcPeering_subnet1_Rname;
	}
	public void setVpcPeering_subnet1_Rname(String vpcPeering_subnet1_Rname) {
		this.vpcPeering_subnet1_Rname=vpcPeering_subnet1_Rname;
	}
	public String getVpcPeering_subnet1_cidr_block() {
		return vpcPeering_subnet1_cidr_block;
	}
	public void setVpcPeering_subnet1_cidr_block(String vpcPeering_subnet1_cidr_block) {
		this.vpcPeering_subnet1_cidr_block=vpcPeering_subnet1_cidr_block;
	}

	public String getVpcPeering_subnet1_vpc_id() {
		return vpcPeering_subnet1_vpc_id;
	}
	public void setVpcPeering_subnet1_vpc_id(String vpcPeering_subnet1_vpc_id) {
		this.vpcPeering_subnet1_vpc_id=vpcPeering_subnet1_vpc_id;
	}
	public String getVpcPeering_subnet1_dependson() {
		return vpcPeering_subnet1_dependson;
	}
	public void setVpcPeering_subnet1_dependson(String vpcPeering_subnet1_dependson) {
		this.vpcPeering_subnet1_dependson=vpcPeering_subnet1_dependson;
	}
	public String getVpcPeering_subnet1_availability_zone() {
		return vpcPeering_subnet1_availability_zone;
	}
	public void setVpcPeering_subnet1_availability_zone(String vpcPeering_subnet1_availability_zone) {
		this.vpcPeering_subnet1_availability_zone=vpcPeering_subnet1_availability_zone;
	}
	public String getVpcPeering_subnet1_map_public_ip_on_launch() {
		return vpcPeering_subnet1_map_public_ip_on_launch;
	}
	public void setVpcPeering_subnet1_map_public_ip_on_launch(String vpcPeering_subnet1_map_public_ip_on_launch) {
		this.vpcPeering_subnet1_map_public_ip_on_launch=vpcPeering_subnet1_map_public_ip_on_launch;
	}
	//vpc peering-routetable1
	public String getVpcPeering_routetable1_Rname() {
		return vpcPeering_routetable1_Rname;
	}
	public void setVpcPeering_routetable1_Rname(String vpcPeering_routetable1_Rname) {
		this.vpcPeering_routetable1_Rname=vpcPeering_routetable1_Rname;
	}
	public String getVpcPeering_routetable1_vpc_id() {
		return vpcPeering_routetable1_vpc_id;
	}
	public void setVpcPeering_routetable1_vpc_id(String vpcPeering_routetable1_vpc_id) {
		this.vpcPeering_routetable1_vpc_id=vpcPeering_routetable1_vpc_id;
	}
	public String getVpcPeering_routetable1_dependson() {
		return vpcPeering_routetable1_dependson;
	}
	public void setVpcPeering_routetable1_dependson(String vpcPeering_routetable1_dependson) {
		this.vpcPeering_routetable1_dependson=vpcPeering_routetable1_dependson;
	}
	public String getVpcPeering_routetable1_route() {
		return vpcPeering_routetable1_route;
	}
	public void setVpcPeering_routetable1_route(String vpcPeering_routetable1_route) {
		this.vpcPeering_routetable1_route=vpcPeering_routetable1_route;
	}

	//vpc peering-routetable association1
	public String getVpcPeering_rta1_Rname() {
		return vpcPeering_rta1_Rname;
	}
	public void setVpcPeering_rta1_Rname(String vpcPeering_rta1_Rname) {
		this.vpcPeering_rta1_Rname=vpcPeering_rta1_Rname;
	}
	public String getVpcPeering_rta1_route_table_id() {
		return vpcPeering_rta1_route_table_id;
	}
	public void setVpcPeering_rta1_route_table_id(String vpcPeering_rta1_route_table_id) {
		this.vpcPeering_rta1_route_table_id=vpcPeering_rta1_route_table_id;
	}
	public String getVpcPeering_rta1_subnet_id() {
		return vpcPeering_rta1_subnet_id;
	}
	public void setVpcPeering_rta1_subnet_id(String vpcPeering_rta1_subnet_id) {
		this.vpcPeering_rta1_subnet_id=vpcPeering_rta1_subnet_id;
	}
	public String getVpcPeering_rta1_dependson() {
		return vpcPeering_rta1_dependson;
	}
	public void setVpcPeering_rta1_dependson(String vpcPeering_rta1_dependson) {
		this.vpcPeering_rta1_dependson=vpcPeering_rta1_dependson;
	}

	//vpc peering-Vpc2
	public String getVpcPeering_vpc2_Rname() {
		return vpcPeering_vpc2_Rname;
	}
	public void setVpcPeering_vpc2_Rname(String vpcPeering_vpc2_Rname) {
		this.vpcPeering_vpc2_Rname= vpcPeering_vpc2_Rname;
	}
	public String getVpcPeering_vpc2_cidrblock() {
		return vpcPeering_vpc2_cidrblock;
	}
	public void setVpcPeering_vpc2_cidrblock(String vpcPeering_vpc2_cidrblock) {
		this.vpcPeering_vpc2_cidrblock=vpcPeering_vpc2_cidrblock;
	}

	public String getVpcPeering_vpc2_enable_dns_hostnames() {
		return vpcPeering_vpc2_enable_dns_hostnames;
	}
	public void setVpcPeering_vpc2_enable_dns_hostnames(String vpcPeering_vpc2_enable_dns_hostnames) {
		this.vpcPeering_vpc2_enable_dns_hostnames= vpcPeering_vpc2_enable_dns_hostnames;
	}

	public String getVpcPeering_vpc2_enable_dns_support() {
		return vpcPeering_vpc2_enable_dns_support;
	}
	public void setVpcPeering_vpc2_enable_dns_support(String vpcPeering_vpc1_enable_dns_support) {
		this.vpcPeering_vpc2_enable_dns_support=vpcPeering_vpc1_enable_dns_support;
	}

	//vpc peering-igw1
	public String getVpcPeering_igw2_Rname() {
		return vpcPeering_igw2_Rname;
	}
	public void setVpcPeering_igw2_Rname(String vpcPeering_igw2_Rname) {
		this.vpcPeering_igw2_Rname=vpcPeering_igw2_Rname;
	}
	public String getVpcPeering_igw2_vpc_id() {
		return vpcPeering_igw2_vpc_id;
	}
	public void setVpcPeering_igw2_vpc_id(String vpcPeering_igw2_vpc_id) {
		this.vpcPeering_igw2_vpc_id=vpcPeering_igw2_vpc_id;
	}
	public String getVpcPeering_igw2_dependson() {
		return vpcPeering_igw2_dependson;
	}
	public void setVpcPeering_igw2_dependson(String vpcPeering_igw2_dependson) {
		this.vpcPeering_igw2_dependson=vpcPeering_igw2_dependson;
	}
	//vpc peering-Subnet1
	public String getVpcPeering_subnet2_Rname() {
		return vpcPeering_subnet2_Rname;
	}
	public void setVpcPeering_subnet2_Rname(String vpcPeering_subnet2_Rname) {
		this.vpcPeering_subnet2_Rname=vpcPeering_subnet2_Rname;
	}
	public String getVpcPeering_subnet2_cidr_block() {
		return vpcPeering_subnet2_cidr_block;
	}
	public void setVpcPeering_subnet2_cidr_block(String vpcPeering_subnet2_cidr_block) {
		this.vpcPeering_subnet2_cidr_block=vpcPeering_subnet2_cidr_block;
	}

	public String getVpcPeering_subnet2_vpc_id() {
		return vpcPeering_subnet2_vpc_id;
	}
	public void setVpcPeering_subnet2_vpc_id(String vpcPeering_subnet2_vpc_id) {
		this.vpcPeering_subnet2_vpc_id=vpcPeering_subnet2_vpc_id;
	}
	public String getVpcPeering_subnet2_dependson() {
		return vpcPeering_subnet2_dependson;
	}
	public void setVpcPeering_subnet2_dependson(String vpcPeering_subnet2_dependson) {
		this.vpcPeering_subnet2_dependson=vpcPeering_subnet2_dependson;
	}
	public String getVpcPeering_subnet2_availability_zone() {
		return vpcPeering_subnet2_availability_zone;
	}
	public void setVpcPeering_subnet2_availability_zone(String vpcPeering_subnet2_availability_zone) {
		this.vpcPeering_subnet2_availability_zone=vpcPeering_subnet2_availability_zone;
	}
	public String getVpcPeering_subnet2_map_public_ip_on_launch() {
		return vpcPeering_subnet2_map_public_ip_on_launch;
	}
	public void setVpcPeering_subnet2_map_public_ip_on_launch(String vpcPeering_subnet2_map_public_ip_on_launch) {
		this.vpcPeering_subnet2_map_public_ip_on_launch=vpcPeering_subnet2_map_public_ip_on_launch;
	}
	//vpc peering-routetable1
	public String getVpcPeering_routetable2_Rname() {
		return vpcPeering_routetable2_Rname;
	}
	public void setVpcPeering_routetable2_Rname(String vpcPeering_routetable2_Rname) {
		this.vpcPeering_routetable2_Rname=vpcPeering_routetable2_Rname;
	}
	public String getVpcPeering_routetable2_vpc_id() {
		return vpcPeering_routetable2_vpc_id;
	}
	public void setVpcPeering_routetable2_vpc_id(String vpcPeering_routetable2_vpc_id) {
		this.vpcPeering_routetable2_vpc_id=vpcPeering_routetable2_vpc_id;
	}
	public String getVpcPeering_routetable2_dependson() {
		return vpcPeering_routetable2_dependson;
	}
	public void setVpcPeering_routetable2_dependson(String vpcPeering_routetable2_dependson) {
		this.vpcPeering_routetable2_dependson=vpcPeering_routetable2_dependson;
	}
	public String getVpcPeering_routetable2_route() {
		return vpcPeering_routetable2_route;
	}
	public void setVpcPeering_routetable2_route(String vpcPeering_routetable2_route) {
		this.vpcPeering_routetable2_route=vpcPeering_routetable2_route;
	}

	//vpc peering-routetable association1
	public String getVpcPeering_rta2_Rname() {
		return vpcPeering_rta2_Rname;
	}
	public void setVpcPeering_rta2_Rname(String vpcPeering_rta2_Rname) {
		this.vpcPeering_rta2_Rname=vpcPeering_rta2_Rname;
	}
	public String getVpcPeering_rta2_route_table_id() {
		return vpcPeering_rta2_route_table_id;
	}
	public void setVpcPeering_rta2_route_table_id(String vpcPeering_rta2_route_table_id) {
		this.vpcPeering_rta2_route_table_id=vpcPeering_rta2_route_table_id;
	}
	public String getVpcPeering_rta2_subnet_id() {
		return vpcPeering_rta2_subnet_id;
	}
	public void setVpcPeering_rta2_subnet_id(String vpcPeering_rta2_subnet_id) {
		this.vpcPeering_rta2_subnet_id=vpcPeering_rta2_subnet_id;
	}
	public String getVpcPeering_rta2_dependson() {
		return vpcPeering_rta2_dependson;
	}
	public void setVpcPeering_rta2_dependson(String vpcPeering_rta2_dependson) {
		this.vpcPeering_rta2_dependson=vpcPeering_rta2_dependson;
	}

	private static Properties properties;
	private static vpcPeeringAttributes vpcPeeringAttributes = null;
	private static final String TEST_PARAMETER_PROPERTIES = "test_parameter.properties";



	//vpc peering
	private static final String VPCPEERING_RNAME="vpcPeering_Rname";
	private static final String VPCPEERING_PEER_OWNER_ID="vpcPeering_peer_owner_id";
	private static final String VPCPEERING_PEER_VPC_ID="vpcPeering_peer_vpc_id";
	private static final String VPCPEERING_VC_ID="vpcPeering_vpc_id";
	private static final String VPCPEERING_DEPENDSON="vpcPeering_dependson";
	private static final String VPCPEERING_CONNECTION="vpcPeering_connection";
	private static final String VPCPEERING_ACCEPTOR="vpcPeering_acceptor";
	private static final String VPCPEERING_AUTO_ACCEPT="vpcPeering_auto_accept";
	private static final String VPCPEERING_REQUESTOR="vpcPeering_requestor";
	private static final String VPCPEERING_TAG="vpcPeering_tag";
	//vpc peering-route1
	private static final String VPCPEERING_ROUTE1_RNAME="vpcPeering_route1_Rname";
	private static final String VPCPEERING_ROUTE1_DESTINATION_CIDR_BLOCK="vpcPeering_route1_destination_cidr_block";
	private static final String VPCPEERING_ROUTE1_TABLE_ID="vpcPeering_route1_table_id";
	private static final String VPCPEERING_ROUTE1_VPC_PEERING_CONNECTION_ID="vpcPeering_route1_vpc_peering_connection_id";
	//vpc peering-Vpc1
	private static final String VPCPEERING_VPC1_RNAME="vpcPeering_vpc1_Rname";
	private static final String VPCPEERING_VPC1_CIDRBLOCK="vpcPeering_vpc1_cidrblock";
	private static final String VPCPEERING_VPC1_ENABLE_DNS_HOSTNAMES="vpcPeering_vpc1_enable_dns_hostnames";
	private static final String VPCPEERING_VPC1_ENABLE_DNS_SUPPORT="vpcPeering_vpc1_enable_dns_support";
	//vpc peering-igw1
	private static final String VPCPEERING_IGW1_RNAME="vpcPeering_igw1_Rname";
	private static final String VPCPEERING_IGW1_VPC_ID="vpcPeering_igw1_vpc_id";
	private static final String VPCPEERING_IGW1_DEPENDSON="vpcPeering_igw1_dependson";
	//vpc peering-Subnet1
	private static final String VPCPEERING_SUBNET1_RNAME="vpcPeering_subnet1_Rname";
	private static final String VPCPEERING_SUBNET1_CIDR_BLOCK="vpcPeering_subnet1_cidr_block";
	private static final String VPCPEERING_SUBNET1_VPC_ID="vpcPeering_subnet1_vpc_id";
	private static final String VPCPEERING_SUBNET1_DEPENDSON="vpcPeering_subnet1_dependson";
	private static final String VPCPEERING_SUBNET1_AVAILABILITY_ZONE="vpcPeering_subnet1_availability_zone";
	private static final String VPCPEERING_SUBNET1_MAP_PUBLIC_IP_ON_LAUNCH="vpcPeering_subnet1_map_public_ip_on_launch";
	//vpc peering-routetable1
	private static final String VPCPEERING_ROUTETABLE1_RNAME="vpcPeering_routetable1_Rname";
	private static final String VPCPEERING_ROUTETABLE1_VPC_ID="vpcPeering_routetable1_vpc_id";
	private static final String VPCPEERING_ROUTETABLE1_DEPENDSON="vpcPeering_routetable1_dependson";
	private static final String VPCPEERING_ROUTETABLE1_ROUTE="vpcPeering_routetable1_route";
	//vpc peering-routetable association1
	private static final String VPCPEERING_RTA1_RNAME="vpcPeering_rta1_Rname";
	private static final String VPCPEERING_RTA1_ROUTE_TABLE_ID="vpcPeering_rta1_route_table_id";
	private static final String VPCPEERING_RTA1_SUBNET_ID="vpcPeering_rta1_subnet_id";
	private static final String VPCPEERING_RTA1_DEPENDSON="vpcPeering_rta1_dependson";

	//vpc peering-Vpc2
	private static final String VPCPEERING_VPC2_RNAME="vpcPeering_vpc2_Rname";
	private static final String VPCPEERING_VPC2_CIDRBLOCK="vpcPeering_vpc2_cidrblock";
	private static final String VPCPEERING_VPC2_ENABLE_DNS_HOSTNAMES="vpcPeering_vpc2_enable_dns_hostnames";
	private static final String VPCPEERING_VPC2_ENABLE_DNS_SUPPORT="vpcPeering_vpc2_enable_dns_support";
	//vpc peering-igw1
	private static final String VPCPEERING_IGW2_RNAME="vpcPeering_igw2_Rname";
	private static final String VPCPEERING_IGW2_VPC_ID="vpcPeering_igw2_vpc_id";
	private static final String VPCPEERING_IGW2_DEPENDSON="vpcPeering_igw2_dependson";
	//vpc peering-Subnet1
	private static final String VPCPEERING_SUBNET2_RNAME="vpcPeering_subnet2_Rname";
	private static final String VPCPEERING_SUBNET2_CIDR_BLOCK="vpcPeering_subnet2_cidr_block";
	private static final String VPCPEERING_SUBNET2_VPC_ID="vpcPeering_subnet2_vpc_id";
	private static final String VPCPEERING_SUBNET2_DEPENDSON="vpcPeering_subnet2_dependson";
	private static final String VPCPEERING_SUBNET2_AVAILABILITY_ZONE="vpcPeering_subnet2_availability_zone";
	private static final String VPCPEERING_SUBNET2_MAP_PUBLIC_IP_ON_LAUNCH="vpcPeering_subnet2_map_public_ip_on_launch";
	//vpc peering-routetable1
	private static final String VPCPEERING_ROUTETABLE2_RNAME="vpcPeering_routetable2_Rname";
	private static final String VPCPEERING_ROUTETABLE2_VPC_ID="vpcPeering_routetable2_vpc_id";
	private static final String VPCPEERING_ROUTETABLE2_DEPENDSON="vpcPeering_routetable2_dependson";
	private static final String VPCPEERING_ROUTETABLE2_ROUTE="vpcPeering_routetable2_route";
	//vpc peering-routetable association1
	private static final String VPCPEERING_RTA2_RNAME="vpcPeering_rta2_Rname";
	private static final String VPCPEERING_RTA2_ROUTE_TABLE_ID="vpcPeering_rta2_route_table_id";
	private static final String VPCPEERING_RTA2_SUBNET_ID="vpcPeering_rta2_subnet_id";
	private static final String VPCPEERING_RTA2_DEPENDSON="vpcPeering_rta2_dependson";

	public static vpcPeeringAttributes getvpcPeeringAttributesFromProperties(){

		vpcPeeringAttributes.getReadPropertiesFile();
		//vpc peering
		String vpcPeering_Rname= properties.getProperty(VPCPEERING_RNAME);
		String vpcPeering_peer_owner_id= properties.getProperty(VPCPEERING_PEER_OWNER_ID);
		String vpcPeering_peer_vpc_id= properties.getProperty(VPCPEERING_PEER_VPC_ID);
		String vpcPeering_vpc_id= properties.getProperty(VPCPEERING_VC_ID);
		String vpcPeering_dependson= properties.getProperty(VPCPEERING_DEPENDSON);
		String vpcPeering_connection= properties.getProperty(VPCPEERING_CONNECTION);
		String vpcPeering_acceptor= properties.getProperty(VPCPEERING_ACCEPTOR);
		String vpcPeering_auto_accept= properties.getProperty(VPCPEERING_AUTO_ACCEPT);
		String vpcPeering_requestor= properties.getProperty(VPCPEERING_REQUESTOR);
		String vpcPeering_tag= properties.getProperty(VPCPEERING_TAG);
		//vpc peering-route1
		String vpcPeering_route1_Rname= properties.getProperty(VPCPEERING_ROUTE1_RNAME);
		String vpcPeering_route1_destination_cidr_block= properties.getProperty(VPCPEERING_ROUTE1_DESTINATION_CIDR_BLOCK);
		String vpcPeering_route1_table_id= properties.getProperty(VPCPEERING_ROUTE1_TABLE_ID);
		String vpcPeering_route1_vpc_peering_connection_id= properties.getProperty(VPCPEERING_ROUTE1_VPC_PEERING_CONNECTION_ID);
		//vpc peering-Vpc1
		String vpcPeering_vpc1_Rname= properties.getProperty(VPCPEERING_VPC1_RNAME);
		String vpcPeering_vpc1_cidrblock= properties.getProperty(VPCPEERING_VPC1_CIDRBLOCK);
		String vpcPeering_vpc1_enable_dns_hostnames= properties.getProperty(VPCPEERING_VPC1_ENABLE_DNS_HOSTNAMES);
		String vpcPeering_vpc1_enable_dns_support= properties.getProperty(VPCPEERING_VPC1_ENABLE_DNS_SUPPORT);
		//vpc peering-igw1
		String vpcPeering_igw1_Rname= properties.getProperty(VPCPEERING_IGW1_RNAME);
		String vpcPeering_igw1_vpc_id= properties.getProperty(VPCPEERING_IGW1_VPC_ID);
		String vpcPeering_igw1_dependson= properties.getProperty(VPCPEERING_IGW1_DEPENDSON);
		//vpc peering-Subnet1
		String vpcPeering_subnet1_Rname= properties.getProperty(VPCPEERING_SUBNET1_RNAME);
		String vpcPeering_subnet1_cidr_block= properties.getProperty(VPCPEERING_SUBNET1_CIDR_BLOCK);
		String vpcPeering_subnet1_vpc_id= properties.getProperty(VPCPEERING_SUBNET1_VPC_ID);
		String vpcPeering_subnet1_dependson= properties.getProperty(VPCPEERING_SUBNET1_DEPENDSON);
		String vpcPeering_subnet1_availability_zone= properties.getProperty(VPCPEERING_SUBNET1_AVAILABILITY_ZONE);
		String vpcPeering_subnet1_map_public_ip_on_launch= properties.getProperty(VPCPEERING_SUBNET1_MAP_PUBLIC_IP_ON_LAUNCH);
		//vpc peering-routetable1
		String vpcPeering_routetable1_Rname= properties.getProperty(VPCPEERING_ROUTETABLE1_RNAME);
		String vpcPeering_routetable1_vpc_id= properties.getProperty(VPCPEERING_ROUTETABLE1_VPC_ID);
		String vpcPeering_routetable1_dependson= properties.getProperty(VPCPEERING_ROUTETABLE1_DEPENDSON);
		String vpcPeering_routetable1_route= properties.getProperty(VPCPEERING_ROUTETABLE1_ROUTE);
		//vpc peering-routetable association1
		String vpcPeering_rta1_Rname= properties.getProperty(VPCPEERING_RTA1_RNAME);
		String vpcPeering_rta1_route_table_id= properties.getProperty(VPCPEERING_RTA1_ROUTE_TABLE_ID);
		String vpcPeering_rta1_subnet_id= properties.getProperty(VPCPEERING_RTA1_SUBNET_ID);
		String vpcPeering_rta1_dependson= properties.getProperty(VPCPEERING_RTA1_DEPENDSON);

		//vpc peering-Vpc2
		String vpcPeering_vpc2_Rname= properties.getProperty(VPCPEERING_VPC2_RNAME);
		String vpcPeering_vpc2_cidrblock= properties.getProperty(VPCPEERING_VPC2_CIDRBLOCK);
		String vpcPeering_vpc2_enable_dns_hostnames= properties.getProperty(VPCPEERING_VPC2_ENABLE_DNS_HOSTNAMES);
		String vpcPeering_vpc2_enable_dns_support= properties.getProperty(VPCPEERING_VPC2_ENABLE_DNS_SUPPORT);
		//vpc peering-igw2
		String vpcPeering_igw2_Rname= properties.getProperty(VPCPEERING_IGW2_RNAME);
		String vpcPeering_igw2_vpc_id= properties.getProperty(VPCPEERING_IGW2_VPC_ID);
		String vpcPeering_igw2_dependson= properties.getProperty(VPCPEERING_IGW2_DEPENDSON);
		//vpc peering-Subnet2
		String vpcPeering_subnet2_Rname= properties.getProperty(VPCPEERING_SUBNET2_RNAME);
		String vpcPeering_subnet2_cidr_block= properties.getProperty(VPCPEERING_SUBNET2_CIDR_BLOCK);
		String vpcPeering_subnet2_vpc_id= properties.getProperty(VPCPEERING_SUBNET2_VPC_ID);
		String vpcPeering_subnet2_dependson= properties.getProperty(VPCPEERING_SUBNET2_DEPENDSON);
		String vpcPeering_subnet2_availability_zone= properties.getProperty(VPCPEERING_SUBNET2_AVAILABILITY_ZONE);
		String vpcPeering_subnet2_map_public_ip_on_launch= properties.getProperty(VPCPEERING_SUBNET2_MAP_PUBLIC_IP_ON_LAUNCH);
		//vpc peering-routetable2
		String vpcPeering_routetable2_Rname= properties.getProperty(VPCPEERING_ROUTETABLE2_RNAME);
		String vpcPeering_routetable2_vpc_id= properties.getProperty(VPCPEERING_ROUTETABLE2_VPC_ID);
		String vpcPeering_routetable2_dependson= properties.getProperty(VPCPEERING_ROUTETABLE2_DEPENDSON);
		String vpcPeering_routetable2_route= properties.getProperty(VPCPEERING_ROUTETABLE2_ROUTE);
		//vpc peering-routetable association1
		String vpcPeering_rta2_Rname= properties.getProperty(VPCPEERING_RTA2_RNAME);
		String vpcPeering_rta2_route_table_id= properties.getProperty(VPCPEERING_RTA2_ROUTE_TABLE_ID);
		String vpcPeering_rta2_subnet_id= properties.getProperty(VPCPEERING_RTA2_SUBNET_ID);
		String vpcPeering_rta2_dependson= properties.getProperty(VPCPEERING_RTA2_DEPENDSON);

		vpcPeeringAttributes = new vpcPeeringAttributes();

		//vpc peering
		vpcPeeringAttributes.setVpcPeering_Rname(vpcPeering_Rname);
		vpcPeeringAttributes.setVpcPeering_peer_owner_id(vpcPeering_peer_owner_id);
		vpcPeeringAttributes.setVpcPeering_peer_vpc_id(vpcPeering_peer_vpc_id);
		vpcPeeringAttributes.setVpcPeering_vpc_id(vpcPeering_vpc_id);
		vpcPeeringAttributes.setVpcPeering_dependson(vpcPeering_dependson);
		vpcPeeringAttributes.setVpcPeering_connection(vpcPeering_connection);
		vpcPeeringAttributes.setVpcPeering_acceptor(vpcPeering_acceptor);
		vpcPeeringAttributes.setVpcPeering_auto_accept(vpcPeering_auto_accept);
		vpcPeeringAttributes.setVpcPeering_requestor(vpcPeering_requestor);
		vpcPeeringAttributes.setVpcPeering_tag(vpcPeering_tag);
		//vpc peering-route1
		vpcPeeringAttributes.setVpcPeering_route1_Rname(vpcPeering_route1_Rname);
		vpcPeeringAttributes.setVpcPeering_route1_destination_cidr_block(vpcPeering_route1_destination_cidr_block);
		vpcPeeringAttributes.setVpcPeering_route1_table_id(vpcPeering_route1_table_id);
		vpcPeeringAttributes.setVpcPeering_route1_vpc_peering_connection_id(vpcPeering_route1_vpc_peering_connection_id);
		//vpc peering-Vpc1
		vpcPeeringAttributes.setVpcPeering_vpc1_Rname(vpcPeering_vpc1_Rname);
		vpcPeeringAttributes.setVpcPeering_vpc1_cidrblock(vpcPeering_vpc1_cidrblock);
		vpcPeeringAttributes.setVpcPeering_vpc1_enable_dns_hostnames(vpcPeering_vpc1_enable_dns_hostnames);
		vpcPeeringAttributes.setVpcPeering_vpc1_enable_dns_support(vpcPeering_vpc1_enable_dns_support);
		//vpc peering-igw1
		vpcPeeringAttributes.setVpcPeering_igw1_Rname(vpcPeering_igw1_Rname);
		vpcPeeringAttributes.setVpcPeering_igw1_vpc_id(vpcPeering_igw1_vpc_id);
		vpcPeeringAttributes.setVpcPeering_igw1_dependson(vpcPeering_igw1_dependson);
		//vpc peering-Subnet1
		vpcPeeringAttributes.setVpcPeering_subnet1_Rname(vpcPeering_subnet1_Rname);
		vpcPeeringAttributes.setVpcPeering_subnet1_cidr_block(vpcPeering_subnet1_cidr_block);
		vpcPeeringAttributes.setVpcPeering_subnet1_vpc_id(vpcPeering_subnet1_vpc_id);
		vpcPeeringAttributes.setVpcPeering_subnet1_dependson(vpcPeering_subnet1_dependson);
		vpcPeeringAttributes.setVpcPeering_subnet1_availability_zone(vpcPeering_subnet1_availability_zone);
		vpcPeeringAttributes.setVpcPeering_subnet1_map_public_ip_on_launch(vpcPeering_subnet1_map_public_ip_on_launch);
		//vpc peering-routetable1
		vpcPeeringAttributes.setVpcPeering_routetable1_Rname(vpcPeering_routetable1_Rname);
		vpcPeeringAttributes.setVpcPeering_routetable1_vpc_id(vpcPeering_routetable1_vpc_id);
		vpcPeeringAttributes.setVpcPeering_routetable1_dependson(vpcPeering_routetable1_dependson);
		vpcPeeringAttributes.setVpcPeering_routetable1_route(vpcPeering_routetable1_route);
		//vpc peering-routetable association1
		vpcPeeringAttributes.setVpcPeering_rta1_Rname(vpcPeering_rta1_Rname);
		vpcPeeringAttributes.setVpcPeering_rta1_route_table_id(vpcPeering_rta1_route_table_id);
		vpcPeeringAttributes.setVpcPeering_rta1_subnet_id(vpcPeering_rta1_subnet_id);
		vpcPeeringAttributes.setVpcPeering_rta1_dependson(vpcPeering_rta1_dependson);


		//vpc peering-Vpc2
		vpcPeeringAttributes.setVpcPeering_vpc2_Rname(vpcPeering_vpc2_Rname);
		vpcPeeringAttributes.setVpcPeering_vpc2_cidrblock(vpcPeering_vpc2_cidrblock);
		vpcPeeringAttributes.setVpcPeering_vpc2_enable_dns_hostnames(vpcPeering_vpc2_enable_dns_hostnames);
		vpcPeeringAttributes.setVpcPeering_vpc2_enable_dns_support(vpcPeering_vpc2_enable_dns_support);
		//vpc peering-igw1
		vpcPeeringAttributes.setVpcPeering_igw2_Rname(vpcPeering_igw2_Rname);
		vpcPeeringAttributes.setVpcPeering_igw2_vpc_id(vpcPeering_igw2_vpc_id);
		vpcPeeringAttributes.setVpcPeering_igw2_dependson(vpcPeering_igw2_dependson);
		//vpc peering-Subnet1
		vpcPeeringAttributes.setVpcPeering_subnet2_Rname(vpcPeering_subnet2_Rname);
		vpcPeeringAttributes.setVpcPeering_subnet2_cidr_block(vpcPeering_subnet2_cidr_block);
		vpcPeeringAttributes.setVpcPeering_subnet2_vpc_id(vpcPeering_subnet2_vpc_id);
		vpcPeeringAttributes.setVpcPeering_subnet2_dependson(vpcPeering_subnet2_dependson);
		vpcPeeringAttributes.setVpcPeering_subnet2_availability_zone(vpcPeering_subnet2_availability_zone);
		vpcPeeringAttributes.setVpcPeering_subnet2_map_public_ip_on_launch(vpcPeering_subnet2_map_public_ip_on_launch);
		//vpc peering-routetable1
		vpcPeeringAttributes.setVpcPeering_routetable2_Rname(vpcPeering_routetable2_Rname);
		vpcPeeringAttributes.setVpcPeering_routetable2_vpc_id(vpcPeering_routetable2_vpc_id);
		vpcPeeringAttributes.setVpcPeering_routetable2_dependson(vpcPeering_routetable2_dependson);
		vpcPeeringAttributes.setVpcPeering_routetable2_route(vpcPeering_routetable2_route);
		//vpc peering-routetable association1
		vpcPeeringAttributes.setVpcPeering_rta2_Rname(vpcPeering_rta2_Rname);
		vpcPeeringAttributes.setVpcPeering_rta2_route_table_id(vpcPeering_rta2_route_table_id);
		vpcPeeringAttributes.setVpcPeering_rta2_subnet_id(vpcPeering_rta2_subnet_id);
		vpcPeeringAttributes.setVpcPeering_rta2_dependson(vpcPeering_rta2_dependson);

		return vpcPeeringAttributes;


	}
	public static void getReadPropertiesFile() {
		if(vpcPeeringAttributes == null ){
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

