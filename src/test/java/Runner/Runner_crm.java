package Runner;	

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import BaseClass.BaseClass;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "src\\test\\resources\\Feature",
//			features="@target/rerun.txt",
//			tags =  "@LoginPage or @ClientGroup",
//			tags =  "@LoginPage or @SupportTicket",
//			tags =  "@LoginPage or @LeadManagement",
//			tags =  "@LoginPage or @SpotOrder", 
			tags =  "@LoginPage or @OpenOrder_Export",
			
			dryRun = !true,
			monochrome = true,
			glue = "com.StepDefinition", 
			publish = true,
			
			  plugin = { "pretty", "html:reports/report.html",
			  "json:target/json/report.json",
			  "rerun:target/rerun.txt",
			  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			},
			 
			snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
			stepNotifications = true		
			)
	
	public class Runner_crm  extends BaseClass{
		
		@AfterClass
		public static void afterClass() throws FileNotFoundException, IOException {
//			Reports.generateJVMReport(System.getProperty("user.dir")+getPropertyFileValue("JsonPath"));
		}

	}

