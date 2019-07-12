package com.training.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.training.bean.LoginBean;
import com.training.bean.RegDBBean;
import com.training.connection.GetConnection;
import com.training.utility.LoadDBDetails;

//Data Access Object 

public class UniformDAO {

Properties properties; 
	
	public UniformDAO() {
		 try {
			properties = new Properties();
			FileInputStream inStream = new FileInputStream("./resources/sql.properties");
			properties.load(inStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List<RegDBBean> getLogins(){
		String sql = properties.getProperty("get.logins"); 
		
		GetConnection gc  = new GetConnection(); 
		List<RegDBBean> list = null;
		try {
			gc.ps1 = GetConnection.getMySqlConnection(LoadDBDetails.getDBDetails()).prepareStatement(sql); 
			list = new ArrayList<RegDBBean>(); 
			
			gc.rs1 = gc.ps1.executeQuery(); 
			
			while(gc.rs1.next()) {
			
				RegDBBean temp = new RegDBBean(); 
				temp.setFirstName(gc.rs1.getString(1));
				temp.setLastName(gc.rs1.getString(2));
				temp.setEmail(gc.rs1.getString(3));
			    temp.setTelephone(gc.rs1.getString(4));
			    temp.setCompany(gc.rs1.getString(5));
			    temp.setAddress1(gc.rs1.getString(6));
			    temp.setAddress2(gc.rs1.getString(7));
			    temp.setCity(gc.rs1.getString(8));
			    temp.setPostcode(gc.rs1.getString(9));
			    temp.setCountry(gc.rs1.getString(10));
			    temp.setZone_id(gc.rs1.getString(11));
			    temp.setPassword(gc.rs1.getString(12));
			    temp.setConfirm(gc.rs1.getString(13));

				list.add(temp); 
				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list; 
	}
	
	public static void main(String[] args) {
		new UniformDAO().getLogins().forEach(System.out :: println);
	}
	
}
