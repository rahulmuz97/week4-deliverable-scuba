package com.tests.ExtentReports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginTest1 {
	public static ExtentReports extent;
	public static ExtentSparkReporter htmlReporter;
	public void login1() {
	 extent = new ExtentReports();
	htmlReporter=new ExtentSparkReporter("Extentreports/Regressionreports.html");
	

}}
