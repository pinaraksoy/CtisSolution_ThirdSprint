package com.ctisSolution.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {//"pretty",
                "json:target/cucumber.json",
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "me.jvt.cucumber.report.PrettyReports:target/cucumber"},
        features = "src/test/resources/Features",
        glue = "com/ctisSolution/step_definitions",
        dryRun = false,
        tags = "@CTS10-333",
        publish = true
)
public class CukesRunner {
}

