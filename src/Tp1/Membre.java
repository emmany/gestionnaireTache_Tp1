package Tp1;

public class Membre {
private int id_member;
private String name_member;
Membre (int id_member, String name_member){
	this.id_member = id_member;
	this.name_member = name_member;
}
public int getId_member() {
	return id_member;
}
public void setId_member(int id_member) {
	this.id_member = id_member;
}
public String getName_member() {
	return name_member;
}
public void setName_member(String name_member) {
	this.name_member = name_member;
}

}
