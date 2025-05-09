package jmri.jmrit.operations.trains.gui;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import jmri.jmrit.operations.OperationsTestCase;
import jmri.jmrit.operations.trains.Train;

/**
 * @author Paul Bender Copyright (C) 2017
 */
public class TrainConductorActionTest extends OperationsTestCase {

    @Test
    public void testCTor() {
        Train train1 = new Train("TESTTRAINID", "TESTTRAINNAME");
        TrainConductorAction t = new TrainConductorAction(train1);
        Assert.assertNotNull("exists", t);
    }

    // private final static Logger log =
    // LoggerFactory.getLogger(TrainConductorActionTest.class);

}
