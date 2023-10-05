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
    public void testJobConstructorSetsAllFields() {
        //Declare and initialize a new Job object
       Job job3 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        //Use assertTrue & assertEquals to test the constructor correctly assigns bot the class and value of each field
        assertEquals("Product tester", job3.getName());
        assertTrue(job3.getName() != null);

        assertEquals("ACME", job3.getEmployer().toString());
        assertTrue(job3.getEmployer() != null);

        assertEquals("Desert", job3.getLocation().toString());
        assertTrue(job3.getLocation() == null);

        assertEquals("Quality control", job3.getPositionType().toString());
        assertTrue(job3.getPositionType() != null);

        assertEquals("Persistence", job3.getCoreCompetency().toString());
        assertTrue(job3.getCoreCompetency() != null);

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

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job4 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job4.toString();
        assertEquals('\n', jobString.charAt(0));
        assertEquals('\n', jobString.charAt(jobString.length() - 1));

        String expected = "\n" + System.lineSeparator() +
                "ID: " + job4.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator() + "\n";




    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));

        String jobString = job.toString();

        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Product tester" + System.lineSeparator() +
                "Employer: ACME" + System.lineSeparator() +
                "Location: Desert" + System.lineSeparator() +
                "Position Type: Quality control" + System.lineSeparator() +
                "Core Competency: Persistence" + System.lineSeparator();

        assertEquals(expected, jobString);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer(""), new Location(""), new PositionType(""), new CoreCompetency(""));

        String jobString = job.toString();

        String expected = System.lineSeparator() +
                "ID: " + job.getId() + System.lineSeparator() +
                "Name: Data not available" + System.lineSeparator() +
                "Employer: Data not available" + System.lineSeparator() +
                "Location: Data not available" + System.lineSeparator() +
                "Position Type: Data not available" + System.lineSeparator() +
                "Core Competency: Data not available" + System.lineSeparator();

        assertEquals(expected, jobString);
    }


}
