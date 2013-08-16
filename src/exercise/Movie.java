package exercise;

// Movie represents the notion of a film. A video store might have several tapes in stock of the same movie

public class Movie extends DomainObject {
    public static final int  CHILDRENS = 2;
    public static final int  REGULAR = 0;
    public static final int  NEW_RELEASE = 1;


	private int priceCode;

	public Movie(String name, int priceCode) {
		this.name = name;
		this.priceCode = priceCode;
	}

	public int priceCode() {
		return priceCode;
	}

	public void persist() {
		Registrar.add ("Movies", this);
	}

	public static Movie get(String name) {
		return (Movie) Registrar.get ("Movies", name);
	}
}
