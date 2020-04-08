package uvsq.pglp_5_1;
import java.io.Serializable;
import java.util.ArrayList;

public final class Personnels implements GroupePersonnes, Serializable{

	private String nom;
	private String prenom;
	private String fonction;
	private java.time.LocalDateTime date_naissance;
	private ArrayList<Integer> num_tel;
	
	public static class Builder{
		private String nom;
		private String prenom;
		private String fonction = "fonction";
		private java.time.LocalDateTime date_naissance;
		private ArrayList<Integer> num_tel;
		
		public Builder(String nom, String prenom,java.time.LocalDateTime date_naissance ) {
			this.nom = nom;
			this.prenom = prenom;
			this.date_naissance = date_naissance;
			num_tel = new ArrayList<Integer>();
		}
		
		public Builder function(String fonc) {
			this.fonction = fonc;
			return this;
		}
		
		public Builder add_tel(int tel) {
			this.num_tel.add(tel);
			return this;
		}
		
		public Personnels build() {
			return new Personnels(this);
		}
	}
	public Personnels(Builder builder) {
		nom = builder.nom;
		prenom = builder.prenom;
		fonction = builder.fonction;
		num_tel = builder.num_tel;
		date_naissance = builder.date_naissance;
	}
	
	public void print() {
		System.out.println(nom);
	}

	public ArrayList<GroupePersonnes> getPersonnes() {
		// TODO Auto-generated method stub
		return null;
	}

}
