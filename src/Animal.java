public class Animal {
    public String name;
    public static int total = 0;

    public Animal (String name) {
        this.name = name;
        total++;
    }

    public void run (int distance) {
        System.out.println(this.name + " пробежал " + distance + " метров");
    }

    public void swim (int distance) {
        System.out.println(this.name + " проплыл " + distance + " метров");
    }
}
