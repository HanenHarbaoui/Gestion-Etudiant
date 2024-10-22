package model;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Etudiant e1 = new Etudiant();
		Etudiant e2 = new Etudiant("Hanen Harbaoui", 25, 12.25, "Tunis");
		Etudiant e3 = new Etudiant("Afrah ", 24, 13, "Tbarka");
		e1.info();
		e2.info();
		e3.info();
		
		
		
		System.out.println("********************");
		
		
		
		 Scanner sc = new Scanner(System.in);

	        // Lecture des informations du premier étudiant
	        System.out.println("Veuillez entrer les informations du premier étudiant :");

	        System.out.print("Nom : ");
	        String nom1 = sc.nextLine();

	        System.out.print("Âge : ");
	        int age1 = sc.nextInt();

	        System.out.print("Moyenne : ");
	        double moyenne1 = sc.nextDouble();
	        sc.nextLine();  // Consommer le saut de ligne après la moyenne

	        System.out.print("Adresse : ");
	        String adresse1 = sc.nextLine();

	        // Création de la première instance d'étudiant avec les infos saisies
	        Etudiant etudiant1 = new Etudiant(nom1, age1, moyenne1, adresse1);

	        // Lecture des informations du deuxième étudiant
	        System.out.println("\nVeuillez entrer les informations du deuxième étudiant :");

	        System.out.print("Nom : ");
	        String nom2 = sc.nextLine();

	        System.out.print("Âge : ");
	        int age2 = sc.nextInt();

	        System.out.print("Moyenne : ");
	        double moyenne2 = sc.nextDouble();
	        sc.nextLine();  // Consommer le saut de ligne après la moyenne

	        System.out.print("Adresse : ");
	        String adresse2 = sc.nextLine();

	        // Création de la deuxième instance d'étudiant avec les infos saisies
	        Etudiant etudiant2 = new Etudiant(nom2, age2, moyenne2, adresse2);

	        // Affichage des informations de chaque étudiant
	        System.out.println("\nInformations du premier étudiant :");
	        etudiant1.info();
	        
	        System.out.println("\nInformations du deuxième étudiant :");
	        etudiant2.info();
	        
	        // Fermer le scanner pour éviter les fuites de mémoire
	        sc.close();
	        
	        
	}

}
