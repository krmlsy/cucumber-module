package runner;


import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "Feature/",
        glue= "setDefinition/",
        plugin =  {"pretty","html:target/cucumber","json:target/cucumber/cucumber.json"}
//        tags = "@Regression"
)
public class TestRunner {

 @BeforeClass
 public static void config() throws IOException {
	
	 
	 File reportOutputDirectory = new File("target/");
	 
	 
	 Path path = Paths.get("target/cucumber/cucumber.json");
	 Charset charset = StandardCharsets.UTF_8;

	 String content = new String(Files.readAllBytes(path), charset);
	 content = content.replaceAll("failed", "FAILED");
	 content = content.replaceAll("skipped", "SKIPPED");
	 Files.write(path, content.getBytes(charset));
	 
	 List<String> jsonFiles = new ArrayList<String>();
	 jsonFiles.add("target/cucumber/cucumber.json");
	 
	 String buildNumber = "1";
	 String projectName = "cucumberProject";
	 boolean runWithJenkins = false;
	 boolean parallelTesting = true;

	 Configuration configuration = new Configuration(reportOutputDirectory, projectName);
	 // optional configuration
	 configuration.setParallelTesting(parallelTesting);
	 configuration.setRunWithJenkins(runWithJenkins);
	 configuration.setBuildNumber(buildNumber);
	 // addidtional metadata presented on main page
	 configuration.addClassifications("Platform", "Windows");
	 configuration.addClassifications("Browser", "Firefox");
	 configuration.addClassifications("Branch", "release/1.0");


	 ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
	 Reportable result = reportBuilder.generateReports();
 }
 


}