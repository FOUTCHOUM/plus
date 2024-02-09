package com.combat.cmr;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class IntegrationTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Robot rob1 = new Robot("bob1");
            Robot rob2 = new Robot("bob2");
        assertEquals( "bob2",Robot.getNom());
    }
}
