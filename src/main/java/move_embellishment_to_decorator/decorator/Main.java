package move_embellishment_to_decorator.decorator;

public class Main {
    public static void main(String[] args) {
        Speaker cat = new Cat();
        System.out.println(cat.speak());

        Speaker loudCat = new Loud(cat);
        System.out.println(loudCat.speak());

        Speaker superLoudCat = new Loud(loudCat);
        System.out.println(superLoudCat.speak());
    }
}
