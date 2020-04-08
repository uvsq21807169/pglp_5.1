package uvsq.pglp_5_1;

public class DAOFactory {

	public static DAO<Personnels> getPersonneDAO(){
		return new PersonneDAO();
	}

}
