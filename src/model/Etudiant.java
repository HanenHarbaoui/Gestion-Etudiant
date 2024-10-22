package model;

public class Etudiant {

	// attributs d'instance
	private String nom;
	private int age;
	private double moyenne;
	private String adresse;

	// une méthode info == methode toString
	public void info() {
		System.out.println(
				"Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + ", adresse=" + adresse + "]");
	}

	// constructeur par défaut
	public Etudiant() {
	}

	// constructeur avec quatre paramètres
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		super();
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}
	// les getters =récuperer le contenu de la variable
	// les setters = modifier le contenu de la variable
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		if(nom.length()>=8 && nom.length()<=30) {
		this.nom = nom;}
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		 if (age >= 18 && age <= 28) {
		this.age = age;}
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		 if (moyenne >= 0 && moyenne <= 20) {
		this.moyenne = moyenne;}
		 
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
