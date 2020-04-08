package uvsq.pglp_5_1;

import java.util.ArrayList;

public class CompositePersonnels implements GroupePersonnes {

	int id;
	private ArrayList<GroupePersonnes> personnes = new ArrayList<GroupePersonnes>();
	
	
	public CompositePersonnels(int id) {
		this.id = id;
	}
	
	public ArrayList<GroupePersonnes> getPersonnes(){
		return personnes;
	}
	public void print() {
			System.out.println(id);
	}
	
	public void add(GroupePersonnes groupe) {
		personnes.add(groupe);
	}

}
