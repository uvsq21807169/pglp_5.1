package uvsq.pglp_5_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testSerializable()
    {
    	String filename = "Personnes.ser";
    	
    	Personnels person1 = new Personnels
        		.Builder("ismail 1", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("directeur")
        		.build();

        // save the object to file
        FileOutputStream fos = null;
        try (ObjectOutputStream out = 
        		new ObjectOutputStream(
        				new FileOutputStream(filename))) {
            out.writeObject(person1);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        Personnels person2 = null;
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            person2 = (Personnels) in.readObject();
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        assertTrue(person1.getName().equals(person2.getName()));
    }
}
