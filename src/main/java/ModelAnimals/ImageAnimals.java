package ModelAnimals;

public class ImageAnimals {
	int IdImage;
	String NameAnimal;
	String UrlImage;
	
	public ImageAnimals(int idImage, String nameAnimal, String urlImage) {
		super();
		IdImage = idImage;
		NameAnimal = nameAnimal;
		UrlImage = urlImage;
	}
	public int getIdImage() {
		return IdImage;
	}
	public void setIdImage(int idImage) {
		IdImage = idImage;
	}
	public String getNameAnimal() {
		return NameAnimal;
	}
	public void setNameAnimal(String nameAnimal) {
		NameAnimal = nameAnimal;
	}
	public String getUrlImage() {
		return UrlImage;
	}
	public void setUrlImage(String urlImage) {
		UrlImage = urlImage;
	}
	

}
