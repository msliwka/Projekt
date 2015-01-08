package Store;

import java.util.List;

public class Vinyl {

	private String tytul;
	private String kategoria;
	private List<Vinyl> Vinyle;
	private User user;
	public Vinyl()
	{
		
	}
	public String getTytul() {
		return tytul;
	}
	public String getKategoria() {
		return kategoria;
	}
	public List<Vinyl> getVinyle() {
		return Vinyle;
	}
	public User getUser() {
		return user;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public void setKategoria(String kategoria) {
		this.kategoria = kategoria;
	}
	
	public void setVinyle(List<Vinyl> vinyle) {
		Vinyle = vinyle;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
