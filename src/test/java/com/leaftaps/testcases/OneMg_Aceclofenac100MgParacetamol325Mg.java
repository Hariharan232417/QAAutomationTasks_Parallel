package com.leaftaps.testcases;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.MainPage_Netmeds;
import com.leaftaps.pages.OneMG_MainPage;

public class OneMg_Aceclofenac100MgParacetamol325Mg extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "OneMg_Aceclofenac100MgParacetamol325Mg";
		testDescription ="Extract Data from One MG App and store it in Excel for Molecule - OneMg_Aceclofenac100MgParacetamol325Mg";
		authors="Hari";
		category ="Extract Datas";
		excelFileName="SourceData";
	}
	
	@Test
	public void runTests() {
		
		new OneMG_MainPage()
		 .closeBanner()
		 .enterMoleculeName_PressEnter("OneMg_Aceclofenac100MgParacetamol325Mg")
		 .getAll_Alternatives_Of_Molecule_StoreInMap("OneMg_Aceclofenac100MgParacetamol325Mg")
		 .get_AlternativesDetails_StoreInMap("OneMg_Aceclofenac100MgParacetamol325Mg");
		 
		
	}

}
