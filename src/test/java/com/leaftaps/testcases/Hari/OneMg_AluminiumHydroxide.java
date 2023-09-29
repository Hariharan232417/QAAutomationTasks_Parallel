package com.leaftaps.testcases.Hari;

import java.util.HashMap;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.framework.testng.api.base.ProjectHooks;
import com.leaftaps.pages.MainPage_Netmeds;
import com.leaftaps.pages.OneMG_MainPage;

public class OneMg_AluminiumHydroxide extends ProjectHooks{
	@BeforeTest
	public void setValues() {
		testcaseName = "Aluminium Hydroxide-0.291Gm + Magnesium Hydroxide-98Mg + Oxetacaine-10Mg";
		testDescription ="Extract Data from One MG App and store it in Excel for Molecule - Aluminium Hydroxide-0.291Gm + Magnesium Hydroxide-98Mg + Oxetacaine-10Mg";
		authors="Hari";
		category ="Extract Datas";
		excelFileName="SourceData";
	}
	
	@Test
	public void runTests() {
		
		new OneMG_MainPage()
		 .closeBanner()
		 .enterMoleculeName_PressEnter("Aluminium Hydroxide-0.291Gm + Magnesium Hydroxide-98Mg + Oxetacaine-10Mg")
		 .getAll_Alternatives_Of_Molecule_StoreInMap("Aluminium Hydroxide-0.291Gm + Magnesium Hydroxide-98Mg + Oxetacaine-10Mg")
		 .get_AlternativesDetails_StoreInMap("Aluminium Hydroxide-0.291Gm + Magnesium Hydroxide-98Mg + Oxetacaine-10Mg");
		 
		
	}

}
