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
    	Personnels person1 = new Personnels
        		.Builder("ismail1", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("directeur")
        		.build();
    	Personnels person2 = new Personnels
        		.Builder("ismail2", "ben", LocalDateTime.now())
        		.add_tel(3)
        		.function("directeur")
        		.build();
    	
    	CompositePersonnels g1 = new CompositePersonnels(1);
        g1.add(person1);
    	
    	DAO<CompositePersonnels> personneDAO = DAOFactory.getPersonneDAO();
    	
    	personneDAO.create(g1);

    	personneDAO.read().print();;
    	
    }
    
}









