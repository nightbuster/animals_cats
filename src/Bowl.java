/**
 * класс миски
 */
public class Bowl {
    /**
     * всего еды в миске
     */
    public static int total = 0;

    /**
     * метод добавляет еду в миску
     * @param count количество еды
     */
    public static void addFood (int count) {
        total += count;
    }

    /**
     * Метод, проыверяет возможно ли поесть сейчас из миски на указанное количество еды
     * Если да то ест
     *
     * @param count сколько нужно съесть
     * @return возвращает результат поел или нет
     */
    public static boolean eat (int count) {
        if (count <= total) {
            total -= count;
            return true;
        } else {
            return false;
        }
    }
}
