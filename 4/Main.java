public class Main {

    /*
        topics:
            ArrayList,
            inheritance, super keyword, polymorphism, abstract classes,
            getters, constructor, public and private (protection level)
     */

    public static void main(String[] args) {
        Bag bag = new Bag();

        // test 1
        bag.pickItem(new Axe());
        bag.pickItem(new Food(0.4));
        bag.pickItem(new Food(0.1));

        System.out.println("Test 1");
        bag.dropItems();

        // test 2
        bag.pickItem(new Food(4.1));
        bag.pickItem(new Axe());
        bag.pickItem(new Food(1.2));

        System.out.println("\nTest 2");
        bag.useItems();

    }
}
