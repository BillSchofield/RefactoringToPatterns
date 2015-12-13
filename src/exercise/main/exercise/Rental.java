package exercise;


//The rental class represents a customer renting a movie.

class Rental extends DomainObject {
    private int daysRented;
    private Tape tape;

    public Rental(Tape tape, int daysRented) {
        this.tape = tape;
        this.daysRented = daysRented;
    }

    public int daysRented() {
        return daysRented;
    }

    public Tape tape() {
        return tape;
    }
}

