
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.ExcludeTags;
import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectPackages({"io.adarsh.productionTestCases","io.adarsh.general"," io.adarsh.ArgumentPassing"}) // include packages to run the test cases 
//@ExcludeTags("PROD")  //use this to exclude the test cases 
//@IncludeTags({"subtraction","calculation","general"}) //use this to include the test cases 

public class SuiteRunner {

}
