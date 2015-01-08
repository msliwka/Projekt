package Store;

import java.util.List;

public class BluRay {

	private String tytul;
	private String rezyser;
	private List<BluRay> blurays;
	private User user;
	public BluRay()
	{
		
	}
	public String getTytul() {
		return tytul;
	}
	public String getRezyser() {
		return rezyser;
	}
	public List<BluRay> getBluRay() {
		return blurays;
	}
	public void setTytul(String tytul) {
		this.tytul = tytul;
	}
	public void setRezyser(String rezyser) {
		this.rezyser = rezyser;
	}
	public void setBluRay(List<BluRay> blurays) {
		this.blurays = blurays;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}
