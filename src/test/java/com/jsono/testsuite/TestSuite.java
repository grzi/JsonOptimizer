package com.jsono.testsuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import com.jsono.JsonoTestSuite;
import com.jsono.internal.InternalTestSuite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
	InternalTestSuite.class,
	JsonoTestSuite.class
})

public class TestSuite {}
