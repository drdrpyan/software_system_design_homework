package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fs.aoracle.*;

@RunWith(Suite.class)
@SuiteClasses({AllowedFourFourTest.class, AllowedSixStoneTest.class,
	AllowedThreeThreeTest.class, FiveStoneMethodTest.class,
	FiveStoneTest.class, FourFourExceptionTest.class,
	GeneralRuleTest.class, SixStoneExceptionTest.class,
	ThreeThreeExceptionTest.class})

public class TestInOracle {

}
