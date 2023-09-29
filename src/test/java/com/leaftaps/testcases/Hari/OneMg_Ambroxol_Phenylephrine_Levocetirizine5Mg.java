package com.leaftaps.testcases.Hari;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.MainPage_Netmeds;
import com.leaftaps.pages.OneMG_MainPage;

public class OneMg_Ambroxol_Phenylephrine_Levocetirizine5Mg extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Ambroxol (60Mg) + Phenylephrine (5Mg) + Levocetirizine (5Mg)";
		testDescription ="Extract Data from One MG App and store it in Excel for Molecule - Ambroxol (60Mg) + Phenylephrine (5Mg) + Levocetirizine (5Mg)";
		authors="Hari";
		category ="Extract Datas";
		excelFileName="SourceData";
	}
	
	@Test
	public void runTests() {
		
		new OneMG_MainPage()
		 .closeBanner()
		 .enterMoleculeName_PressEnter("Ambroxol (60Mg) + Phenylephrine (5Mg) + Levocetirizine (5Mg)")
		 .getAll_Alternatives_Of_Molecule_StoreInMap("Ambroxol (60Mg) + Phenylephrine (5Mg) + Levocetirizine (5Mg)")
		 .get_AlternativesDetails_StoreInMap("Ambroxol (60Mg) + Phenylephrine (5Mg) + Levocetirizine (5Mg)");
		 
		
	}

}
