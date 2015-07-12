package testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import test.*;

@RunWith(Suite.class)
@SuiteClasses({FiveStoneTest.class, FourFourPlaceTest.class,
	GameFunctionTest.class, GetStateTest.class, LenjuRuleTest.class,
	PutStoneTest.class, SixStoneTest.class, ThreeThreePlaceTest.class })
public class TestInTest {

}
