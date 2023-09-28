package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

public class RunnerClass {
	@CucumberOptions(
			tags="",
			features = "src\\test\\resources\\features",
			glue ="com.stepdefinition",
			plugin = {"pretty:target/cucumber-reports/cucumber.html","pretty:target/cucumber-reports/cucumber.json","pretty:target/cucumber-reports/cucumber.xml","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
			)
	public class CucumberRunnerTests extends AbstractTestNGCucumberTests {
//		@Override
//	    @DataProvider(parallel = true)
//	    public Object[][] scenarios() {
//	        return super.scenarios();
//	    }
	}
}

