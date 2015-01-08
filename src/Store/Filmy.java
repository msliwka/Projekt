package Store;

import java.util.List;

public class Filmy {
private String tytul;
private String rezyser;
private int czas;
private List<Filmy> filmy;
private User user;
public Filmy()
{
	
}
public String getTytul() {
	return tytul;
}
public String getRezyser() {
	return rezyser;
}
public int getCzas() {
	return czas;
}
public List<Filmy> getFilms() {
	return filmy;
}
public User getUser() {
	return user;
}
public void setTytul(String tytul) {
	this.tytul = tytul;
}
public void setRezyser(String rezyser) {
	this.rezyser = rezyser;
}
public void setCzas(int czas) {
	this.czas = czas;
}
public void setFilmy(List<Filmy> filmy) {
	this.filmy = filmy;
}
public void setUser(User user) {
	this.user = user;
}
}
