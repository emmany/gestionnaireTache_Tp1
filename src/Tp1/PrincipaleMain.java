package Tp1;

import java.util.ArrayList;
import java.util.Scanner;

	public class PrincipaleMain {

	/**
	 * @param arg
	 */
	static ArrayList<Membre> membre = new ArrayList<Membre>();
	static ArrayList<Tache> tache = new ArrayList<Tache>();
	static ArrayList<Affecte> affecte = new ArrayList<Affecte>();
	
	//création des méthodes pour la classe membre
	
	public static Membre recherche(String nom){
	Membre result = null;
	for (Membre m : membre){
		if (membre.contains(nom)){
			result = m;
			System.out.println(m.getName_member());
			break;
		}
	}
	return result;
	}
	
	//Méthode Ajout 2
	
	public static void Membreadd(String nom){
		
		for (Membre m : membre){
			if (m.getName_member() == nom){
				System.out.println("Nom existe déjà");
			}	else
			{
				//m1.setId_member(membre.size()+1);
				//System.out.print("Nom existe déjà");
				int index = m.getId_member() +1;
			    m = new Membre(index, nom);
				membre.add(m);
				System.out.println(membre);
				
		    }
		}
			
}
	//Méthode Supression 3
	
	public void deleteMembre(String name_membre){
	Membre m2 = recherche(name_membre);
	if (m2 != null)
			{
		membre.remove(m2);
			}
	else
	{
		System.out.println("C nom n'existe pas encore");	
	}
	
}
	//Méthode Modification 4
	
	public void modifierMembre(String name_membre, int index){
	Membre m3 = recherche (name_membre);
	if (m3 != null){ 
		
		//condition si l'objet existe il modifie
		//modifierMembre(m3.toString());
		System.out.print("le nom existe déjà");
	}
	else{
		membre.set(index, m3);
	}
}
	// Création de Méthode de la classe tache
	
	//Recherche d'une Tâches
	public static Tache recherche_tache(String nom_tache) {
	Tache result = null;
	for (Tache t : tache) {
		if (t.getNom_tache().equalsIgnoreCase(nom_tache)) {
			result = t;
			break;
		}
	}
	return result;
}
	//Modification d'une Tâche
	
	public static void editTache(int index, String nomt) {
		Tache t = recherche_tache(nomt);
		if (t != null) {
			System.out.println("La tache existe déjà");
		} else {
			tache.set(index, t);
		}
	}
	//Ajout d'une Tâche
	
	public void addTache(Tache t) {
		Tache t1 = recherche_tache(t.getNom_tache());
		if (t1 != null) {
			System.out.println("La tache existe déjà");
		} else {
			tache.add(t);
		}
	}
//Suppression d'une Tâche
	
	public void delTache(Tache t) {
		//Membre t2 = t2.getName_member(membre); 
		Tache t2 = recherche_tache(t.getNom_tache());
		if (t2 != null) {
			tache.remove(t2);
		} else {
			System.out.println("la tache à été supprimer avec succès");
		}
	}
//Création du Ménu liste pour nos choix d'entréer
	
	public static void menu() {
		System.out.println("1 : Créer un membre");
		System.out.println("2 : Rechercher un membre");
		
		System.out.println("3 : Modifier un membre");
		System.out.println("4 : Supprimer un membre");
		
		System.out.println("5 : Créer une tâche");
		System.out.println("6 : Supprimer une tâche ");
		
		System.out.println("7 : Affecter une tâche à un membre");
		System.out.println("Q ou q : Quitter le programme");
	}
	
    //Méthode Affichage 5
	
	/*public void  afficheMembre(){
	for(Membre m:membre){
		System.out.println(m.getId_member());
		System.out.println(m.getName_member());
	}
	
}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*Scanner sc = new Scanner(System.in);
		int choice;
		choice = sc.nextInt();
		
		switch(choice) {
		
		System.out.println("Saisie le nom :");
		String nomM = sc.next();
		case 1: Membreadd(nomM);//call la methode d'enrregistrement
		 break;
		case 2: recherche(nomM);//call la methode de recherche
		
		 break;
		
		default: 
			System.out.println("vous avez Saisie le nom :" +nomM);
		}
	*/
		String nom = "";
		String choix = "";
		Scanner sc = new Scanner(System.in);
		do {
		    menu();
			
		//Add a member
			
			System.out.print("Veuillez choisir une option : ");
			choix = sc.nextLine();
			if (choix.equals("1")) {
				System.out.print("Veuillez saisir le nom du nouveau membre : ");
				
				nom = sc.nextLine();
				Membreadd( nom);
				
			//	Membre m = new Membre( nom);
				//	membre.add(m);
					System.out.print("Creation du nouveau Membre:" +nom);
				//	System.out.println(membre.toString());
					System.out.print("\n***********\n\n");
				 // Rechercher et afficher un membre
				
			} else if (choix.equals("2")) {
				System.out.print("Veuillez saisir le nom du membre à rechercher : ");
				nom = sc.nextLine();
				//Membre m2 = recherche(nom);
				if (nom != null){
					System.out.print(": "+nom);
					System.out.print("\n\n");
				}
				else
					System.out.println("Ce nom n'existe pas!");
		
		//Modifier un membre
				
			} else if (choix.equals("3")) {
				System.out.print("Veuillez saisir le nom du membre à modifier : ");
				nom = sc.nextLine();
				Membre m3 = recherche(nom);//
				if (m3 != null) {
					System.out.println(" veuillez entrer les modifications");
					nom = sc.nextLine();
					System.out.println(" modifications enregistrees");
				} else {
					System.out.println(" Ce nom n'existe pas");
				}
			} 
			
			else if (choix.equals("4")) {
				System.out.print("Veuillez saisir le nom du membre à supprimer : ");
				nom = sc.nextLine();
			  if (nom!=null){
				  System.out.print(" Suppression reussie\n\n");
			  }
			  else {
				  System.out.print(" ce Membre n' existe pas");
			  }
				}
			
			//Add Tâche
			
			else if (choix.equals("5")) {
				System.out.print("Veuillez saisir le nom de la tache : ");
				nom = sc.nextLine();
				
			}
			else if (choix.equals("6")) {
				String tache_name;
				System.out.print("Veuillez choisir la tache a Supprimer : ");
				tache_name = sc.nextLine();
				if (tache_name!= null) {
				System.out.print("Suppression de la tâche "+ tache_name);
				System.out.print("\n********\n");
				}
				else {
					System.out.print(" Cette tâche n' existe pas");
					System.out.println("\n********** \n");
				}
				
				
			}
			else if (choix.equals("7")) {
				String tache2;
				String member1;
				System.out.print("Veuillez saisir nom de la tache à assigner à un membre : ");
				member1 = sc.nextLine();
				System.out.print("Veuillez saisir le membre: ");
				tache2 = sc.nextLine();
				System.out.println("**** La tache : "  +member1);
				System.out.println("est assignée à :"  +tache2);
				System.out.println("\n********** \n");
			
					
			}
			
			else{
				System.out.println("\n*** Mauvaise option ***\n");
			}
		} while (!choix.toUpperCase().equals("Q")); 
	}



			
			
			
			
		
		
		
		
		
}
		
	

	