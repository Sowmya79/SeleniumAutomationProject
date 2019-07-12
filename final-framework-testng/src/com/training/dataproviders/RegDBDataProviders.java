package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;
import com.training.bean.RegDBBean;
import com.training.dao.UniformDAO;

public class RegDBDataProviders {

	@DataProvider(name = "db-inputs")
	public Object [][] getDBData() {

		List<RegDBBean> list = new UniformDAO().getLogins(); 
		
		Object[][] result = new Object[list.size()][]; 
		int count = 0; 
		for(RegDBBean temp : list){
			Object[]  obj = new Object[2]; 
			obj[0] = temp.getFirstName(); 
			obj[1] = temp.getLastName(); 
			obj[2] = temp.getEmail();
			obj[3] = temp.getTelephone();
			obj[4] = temp.getCompany();
			obj[5] = temp.getAddress1();
			obj[6] = temp.getAddress2();
			obj[7] = temp.getCity();
			obj[8] = temp.getPostcode();
			obj[9] = temp.getCountry();
			obj[10] = temp.getZone_id();
			obj[11] = temp.getPassword();
			obj[12] = temp.getConfirm();
			
			result[count ++] = obj; 
		}
		
		
		return result;
	}
	
}
