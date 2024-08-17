 package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/features"},dryRun=!true
,glue="stepdef",snippets =SnippetType.CAMELCASE,monochrome=true )



public class Runner  {

}
