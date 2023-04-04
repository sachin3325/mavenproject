package testcases;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\maven\\src\\test\\resources\\FeatureFiles\\MaretSigin.feature",
                     glue="stepdefinitions",
                     plugin= {"pretty","html:target/MaretSigin.html",
		         "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},publish=true)

public class Runnerclass 

{
	
	

}
