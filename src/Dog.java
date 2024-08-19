public class Dog extends Animal {
    public static int total = 0;
    public int maxRunDistance = 500;
    public int maxSwimDistance = 10;

    public Dog (String name) {
        super(name);
        total++;
    }
}
