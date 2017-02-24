public class Multiplier {

    private int number;

    public Multiplier () {
        number = 2;
    }

    public Multiplier (int value) {
        this();
        number *= value;
    }

    public void print() {
        System.out.println(number);
    }
}
