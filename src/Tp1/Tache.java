package Tp1;

public class Tache {
private int id_tache; 
private String nom_tache;
private String description_tache;
private String status_tache;

public Tache(int id_tache, String nom_tache, String description_tache,
		String status_tache) {
	super();
	this.id_tache = id_tache;
	this.nom_tache = nom_tache;
	this.description_tache = description_tache;
	this.status_tache = status_tache;
}

public String getDescription_tache() {
	return description_tache;
}
public void setDescription_tache(String description_tache) {
	this.description_tache = description_tache;
}
public String getStatus_tache() {
	return status_tache;
}
public void setStatus_tache(String status_tache) {
	this.status_tache = status_tache;
}
public int getId_tache() {
	return id_tache;
}
public void setId_tache(int id_tache) {
	this.id_tache = id_tache;
}
public String getNom_tache() {
	return nom_tache;
}
public void setNom_tache(String nom_tache) {
	this.nom_tache = nom_tache;
}
}