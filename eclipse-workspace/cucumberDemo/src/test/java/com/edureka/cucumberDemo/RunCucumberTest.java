package com.edureka.cucumberDemo;

import org.junit.platform.suite.api.ConfigurationParameter;

import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.PLUGIN_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.EXECUTION_DRY_RUN_PROPERTY_NAME;
@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("com/edureka/cucumberDemo")
@ConfigurationParameter(key = PLUGIN_PROPERTY_NAME, value = "pretty,html:target/results.html")
@ConfigurationParameter(key = EXECUTION_DRY_RUN_PROPERTY_NAME, value = "true")
public class RunCucumberTest {
}
