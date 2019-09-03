package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/",glue="org.test",plugin={"html:target","rerun:src/test/resources/failed.txt"},dryRun=false,monochrome=true,strict=true,tags= {"~@tag2"})
public class TestRunner {

}
