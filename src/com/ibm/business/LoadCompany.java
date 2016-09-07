/**
 * 
 */
package com.ibm.business;

import java.util.ResourceBundle;

/**
 * @author jose.castiblanco
 * 
 */
public class LoadCompany {

	/**
	 * 
	 */
	public LoadCompany() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Method to get the company
	 * 
	 * @return
	 */
	public Company getCompany() {
		Company company = new Company();
		company.setAddress1("Cra 35D 76 - 38");
		company.setAddress2("Cra 22C 68 - 24");
		company.setCity("Barranquilla");
		company.setCompanyName("Pragma");
		company.setCountry("Colombia");
		company.setState("Antioquia");
		company.setZip("01478");
		return company;
	}

	/**
	 * Method to get the company using properties
	 * 
	 * @param porletBundle
	 * @return
	 */
	public Company getCompany(ResourceBundle porletBundle) {
		Company company = new Company();
		company.setCompanyName(porletBundle
				.getString("companyInfo.companyName"));
		company.setAddress1(porletBundle.getString("companyInfo.address1"));
		company.setAddress2(porletBundle.getString("companyInfo.address2"));
		company.setCity(porletBundle.getString("companyInfo.city"));
		company.setCountry(porletBundle.getString("companyInfo.country"));
		company.setState(porletBundle.getString("companyInfo.state"));
		company.setZip(porletBundle.getString("companyInfo.zip"));
		return company;
	}

}
