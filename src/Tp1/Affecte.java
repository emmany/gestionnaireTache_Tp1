package Tp1;

public class Affecte {
private int id_affecte;
private int id_member;
private int id_tache;

 Affecte(int id_affecte, int id_member, int id_tache){
	this.id_affecte = id_affecte;
	this.id_member = id_member;
	this.id_tache = id_tache;	
}

public int getId_affecte() {
	return id_affecte;
}
public void setId_affecte(int id_affecte) {
	this.id_affecte = id_affecte;
}
public int getId_member() {
	return id_member;
}
public void setId_member(int id_member) {
	this.id_member = id_member;
}
public int getId_tache() {
	return id_tache;
}
public void setId_tache(int id_tache) {
	this.id_tache = id_tache;
 }
}