package uvsq.pglp_5_1;

import java.util.ArrayList;

public class AfficheParGroupe {
	
	ArrayList<GroupePersonnes> persApres;
	
	GroupePersonnes premier;

	public AfficheParGroupe(GroupePersonnes persAvant) {
		premier = persAvant;
		persApres = new  ArrayList<GroupePersonnes>();
	}
	
	
	
	private class GrpIterator implements Iterator{
		int index =0;
		
		public GrpIterator() {
			
			persApres.add(premier);
			
			int i =0;
			
			while(i < persApres.size()) {
				if(persApres.get(i) instanceof CompositePersonnels) {
					for(GroupePersonnes p : persApres.get(i).getPersonnes()) {
						persApres.add(p);
					}
				}
				i++;
			}
			
		}
		
		public boolean hasNext() {
			if(index < persApres.size()) {
				return true;
			}
			
			return false;
		}

		public GroupePersonnes next() {
			GroupePersonnes gp = persApres.get(index);
			index++;
			return gp;
		}
	}
	
	public Iterator getIterator() {
		return new GrpIterator();
	}

}
