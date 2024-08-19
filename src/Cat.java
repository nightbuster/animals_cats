public class Cat extends Animal {
    public static int total = 0;
    public int maxRunDistance = 200;
    public int maxSwimDistance = 0;

    /**
     * сытость (по умолчанию голодный)
     */
    public boolean fill = false;

    public Cat (String name) {
        // вызов конструктора родительского класса
        super(name);
        total++;
    }

    public void eat (int count) {
        // пробуем поесть из миски
        this.fill = Bowl.eat(count);
    }

    public String toString () {
        return this.name + (fill ? " сыт" : " голоден");
    }

}
