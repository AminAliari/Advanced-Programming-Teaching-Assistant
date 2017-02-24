public class Main {

    // topic: use of this keyword as a function

    public static void main(String[] args) {
        Multiplier test = new Multiplier(4);
        test.print();

        /*
            first, public Multiplier (int value) is called. this(4)
            then in public Multiplier (int value) body we have, this()
            after that in this we have a = 2;
            so the result will be a *= 4 -> 2 *4  = 8
         */
    }
}
