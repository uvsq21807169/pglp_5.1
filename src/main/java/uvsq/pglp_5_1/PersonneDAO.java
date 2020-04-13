package uvsq.pglp_5_1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PersonneDAO implements DAO<CompositePersonnels>{

	String filename = "Personnes.ser";
	
	@Override
	public CompositePersonnels create(CompositePersonnels obj) {

        try {
        	ObjectOutputStream out = 
            		new ObjectOutputStream(
            				new FileOutputStream(filename));
            out.writeObject(obj);
            
            out.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
		return obj;
	}

	@Override
	public CompositePersonnels read() {
		
		CompositePersonnels person = null;

		try {
			ObjectInputStream in = new ObjectInputStream(
        		new FileInputStream(filename));
			
			person = (CompositePersonnels) in.readObject();
            in.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        } 
        
		return person;
	}

	@Override
	public CompositePersonnels update(CompositePersonnels obj) {
		return create(obj);
	}

	@Override
	public void delete(CompositePersonnels obj) {

		try {
			ObjectOutputStream out = 
	        		new ObjectOutputStream(
	        				new FileOutputStream(filename));
            out.writeObject(null);
            out.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
		
	}

}
