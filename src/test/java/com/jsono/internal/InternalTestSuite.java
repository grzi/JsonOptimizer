package com.jsono.internal;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	   DuplicateTest.class,
	   JsonUtilsTest.class,
	   KeyGeneratorTest.class
})
public class InternalTestSuite {

}
