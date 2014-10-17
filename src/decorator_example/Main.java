package decorator_example;

public class Main {
    public static void main(String[] args) {
        Speaker cat = new Cat();
        System.out.println(cat.speak());

        Loud loudCat = new Loud(cat);
        System.out.println(loudCat.speak());

        Loud superLoudCat = new Loud(loudCat);
        System.out.println(superLoudCat.speak());

    }
}
