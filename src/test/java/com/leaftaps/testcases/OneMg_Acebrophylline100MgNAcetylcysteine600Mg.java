package com.leaftaps.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.MainPage_Netmeds;
import com.leaftaps.pages.OneMG_MainPage;

public class OneMg_Acebrophylline100MgNAcetylcysteine600Mg extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Acebrophylline 100 Mg+N-Acetylcysteine 600 Mg";
		testDescription ="Extract Data from One MG App and store it in Excel for Molecule - Acebrophylline 100 Mg+N-Acetylcysteine 600 Mg";
		authors="Hari";
		category ="Extract Datas";
		excelFileName="SourceData";
	}
	
	@Test
	public void runTests() {
		
		new OneMG_MainPage()
		 .closeBanner()
		 .enterMoleculeName_PressEnter("Acebrophylline 100 Mg+N-Acetylcysteine 600 Mg")
		 .getAll_Alternatives_Of_Molecule_StoreInMap("Acebrophylline 100 Mg+N-Acetylcysteine 600 Mg")
		 .get_AlternativesDetails_StoreInMap("Acebrophylline 100 Mg+N-Acetylcysteine 600 Mg");
		 
		
	}

}
