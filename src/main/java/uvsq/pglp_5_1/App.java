package uvsq.pglp_5_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
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
        
        
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(filename);
            in = new ObjectInputStream(fis);
            Personnels person2 = (Personnels) in.readObject();
            in.close();
            person2.print();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    
}
