import com.caiwen.core.TestCase;
import com.caiwen.core.TestStep;
import com.caiwen.core.TestSuite;
import org.testng.SuiteRunner;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.internal.TestNGMethod;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainTest {

    @Test
    public void test() {

        TestSuite testSuite = new TestSuite();

        TestCase testCase = new TestCase();


//        Action action = new HtmlAction();

        TestNG testNG = new TestNG();


        XmlTest xmlTest = new XmlTest();

        XmlSuite xmlSuite = new XmlSuite();





    }
}
