package uvsq.pglp_5_1;

public class DAOFactory {

	public static DAO<CompositePersonnels> getPersonneDAO(){
		return new PersonneDAO();
	}

}
