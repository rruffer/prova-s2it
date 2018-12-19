package suite;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

import questao8.InteiroCTest;
import questao9.BinaryTest;

@RunWith(JUnitPlatform.class)
@SelectClasses({InteiroCTest.class, BinaryTest.class})
public class SuiteTest {

}
