package ase.suite;

import ase.test.AplicaDiscountTest;
import ase.test.PoateRezervaTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({
        AplicaDiscountTest.class,
        PoateRezervaTest.class
})

public class SuitaCompleta {
    
}
