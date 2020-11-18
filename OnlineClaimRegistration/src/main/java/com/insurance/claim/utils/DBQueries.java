package com.insurance.claim.utils;

public class DBQueries {
	//public static final String ADDEMPLQUERY = "insert into employee values(?,?,?,?)";
	public static final String VIEWCLAIMQUERIES = "select * from claim";
	public static final String CREATECLAIM = "insert into claim values (?, ?, ?, ?, ?, ?, ?, ?)";
	public static final String GENERATEREPORT = "select * from claim";
	public static final String CREATEPROFILE = "insert into userrole value (?, ?, ?)";
	
}
