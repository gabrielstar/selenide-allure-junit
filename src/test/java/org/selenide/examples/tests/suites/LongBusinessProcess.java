package org.selenide.examples.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.selenide.examples.tests.myapp.OrderTest;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        OrderTest.class,

})

public class LongBusinessProcess {
}
