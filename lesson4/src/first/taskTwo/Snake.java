package first.taskTwo;

public class Snake {
    private final byte parrots = 38;
    private final byte monkeys = 5;
    private final byte elephants = 2;

    // calculate the number of parrots in <i> snake(s)
    public int SnakesToParrot(int i) {
        return i * parrots;
    }

    // calculate the number of monkeys in <i> snake(s)
    public int SnakesToMonkey(int i) {
        return i * monkeys;
    }

    // calculate the number of elephants in <i> snake(s)
    public int SnakesToElephant(int i) {
        return i * elephants;
    }
}
