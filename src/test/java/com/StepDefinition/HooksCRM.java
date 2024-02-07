package com.StepDefinition;


import java.io.FileNotFoundException;
import java.io.IOException;

import BaseClass.BaseClass;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksCRM extends BaseClass {

//	@Before
	@BeforeAll
	public static void Browser() throws FileNotFoundException, IOException {
		getDriver("Chrome");
		loadUrl(getPropertyFileValue("Url"));
		driver.manage().window().maximize();
		elementWait();
	}

}