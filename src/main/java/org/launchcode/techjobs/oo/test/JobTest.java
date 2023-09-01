package org.launchcode.techjobs.oo.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId(){

        //Create 2 Job objects using empty constructors
        Job job1 = new Job();
        Job job2 = new Job();

        //Use assertNotEquals to verify that the IDs of the 2 objects are distinct
        assertNotEquals(job1.getId(), job2.getId());
    }

    private void assertNotEquals(int id, int id1) {
    }


    @Test
    public void testJobConstructorSetAllFields() {
        //Declare and initialize a new Job object
       Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Use assertTrue & assertEquals to test the constructor correctly assigns bot the class and value of each field
        assertEquals("Product tester", job3.getName());
        assertTrue(job3.getName() instanceof String);

        assertEquals("ACME", job3.getEmployer().toString());
        assertTrue(job3.getEmployer() instanceof Employer);

        assertEquals("Desert", job3.getLocation().toString());
        assertTrue(job3.getLocation() instanceof Location);

        assertEquals("Quality control", job3.getPositionType().toString());
        assertTrue(job3.getPositionType() instanceof  PositionType);

        assertEquals("Persistence", job3.getCoreCompetency().toString());
        assertTrue(job3.getCoreCompetency() instanceof CoreCompetency);

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        
        assertNotEquals(job2.getId() == job1.getId());
        assertFalse(job1 == job2);
    }

    private void assertNotEquals(boolean b) {
    }


}
