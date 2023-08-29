package com.mastercard.demofinal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class T3SearchServiceImpl implements T3SearchService {

	@Value("${t3url}")
	private String t3url;

	@Value("${t3username}")
	private String t3username;

	@Value("${t3password}")
	private String t3password;

	List<T3SearchResults> lstSrchRes = new ArrayList<T3SearchResults>();
	T3SearchResults t3srchres = new T3SearchResults();

	public List<T3SearchResults> putT3SrchResultsAll() {

		// connect to t3 and fetch the results code

		T3SearchResults t3srchres1 = new T3SearchResults();
		T3SearchResults t3srchres2 = new T3SearchResults();

	
		
		
		  t3srchres1.setDescription("cis_ac_ecomm test created desc");
		  t3srchres1.setFolderPath("users/e145904/testfolder");
		  t3srchres1.setTestName("CIS_AC_ECOMM");
		
		
		
		  t3srchres1.setDescription("cis_ac_ecomm test created desc");
		  t3srchres1.setFolderPath("users/e145904/testfolder");
		  t3srchres1.setTestName("CIS_AC_ECOMM");
		 

		t3srchres2.setDescription("cis_des_amm test created desc");
		t3srchres2.setFolderPath("users/e145904/testfolder");
		t3srchres2.setTestName("CIS_DES_AMM");

		lstSrchRes.add(t3srchres1);
		lstSrchRes.add(t3srchres2);
		return lstSrchRes;
	}

	public T3SearchResults putT3SrchResults(String name) {

		// connect to t3 and fetch the results code

		t3srchres.setDescription("cis_ac_ecomm test created desc");
		t3srchres.setFolderPath("users/e145904/testfolder");
		t3srchres.setTestName("CIS_AC_ECOMM");

		return t3srchres;
	}

	public T3SearchResults getT3SearchResults(String name) {
		t3srchres.setDescription("cis_ac_ecomm test created desc");
		t3srchres.setFolderPath("users/e145904/testfolder");
		t3srchres.setTestName("CIS_AC_ECOMM");
		if (!t3srchres.getTestName().equals(name)) {
			t3srchres.getDescription();

			t3srchres.getFolderPath();

			t3srchres.setTestName(name);

		} else {
			t3srchres.getDescription();

			t3srchres.getFolderPath();

			t3srchres.getTestName();
		}

		return t3srchres;
	}

	public List<T3SearchResults> getT3SearchResultsAll() {
		T3SearchResults t3srchres1 = new T3SearchResults();
		T3SearchResults t3srchres2 = new T3SearchResults();

		t3srchres1.setDescription("cis_ac_ecomm test created desc");
		t3srchres1.setFolderPath("users/e145904/testfolder");
		t3srchres1.setTestName("CIS_AC_ECOMM");

		t3srchres2.setDescription("cis_des_amm test created desc");
		t3srchres2.setFolderPath("users/e145904/testfolder");
		t3srchres2.setTestName("CIS_DES_AMM");

		lstSrchRes.add(t3srchres1);
		lstSrchRes.add(t3srchres2);

		for (T3SearchResults t3Res : lstSrchRes) {
			t3Res.getDescription();
			t3Res.getFolderPath();
			t3Res.getTestName();
		}
		return lstSrchRes;

	}

}
