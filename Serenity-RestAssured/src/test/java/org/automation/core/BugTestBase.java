package org.automation.core;



import net.serenitybdd.rest.RestRequests;
import net.serenitybdd.rest.SerenityRest;
import org.junit.BeforeClass;

/**
 * Created by shantonu on 12/23/16.
 */
// following best practice, I am putting my all settings in before class so that it can be initialized before test class.// following best practice, I am putting my all settings in before class so that it can be initialized before test class.
public abstract class BugTestBase {
    protected static final String base = "http://localhost:9100";
    protected static final String user = "shantonu";
    protected static final String pass = "123456";
    protected static final Long globalResponseTimeout = 2000l;


    @BeforeClass
    public static void initClass(){

    }
    @BeforeClass
    public static void cleanupClass(){
        // causing errors => RestAssured.reset();
    }

}
