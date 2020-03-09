package org.selenide.examples.tests.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.selenide.examples.tests.StopOnFailureSuite;
import org.selenide.examples.tests.myapp.OrderTestAsSuiteDevelopment;

@RunWith(StopOnFailureSuite.class)
@Suite.SuiteClasses({
        OrderTestAsSuiteDevelopment.class,

})

public class LongBusinessProcess {
}
