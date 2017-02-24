import java.util.ArrayList;

public class Bag {

    private ArrayList<BagItem> bagItems;

    public Bag () {
        bagItems = new ArrayList<BagItem>(); // dynamic array
    }

    public void pickItem(BagItem item) {
        bagItems.add(item);
    }

    public void dropItems() {
        if (bagItems.size() > 0) {
            for (BagItem item : bagItems) {
                item.drop();
            }
            bagItems.clear(); // to remove all objects in an array list
        }else{
            System.out.println("no item to drop.");
        }
    }

    public void useItems() {
        if (bagItems.size() > 0) {
            for (BagItem item : bagItems) {
                item.use();
            }
            bagItems.clear();
        }else{
            System.out.println("no item to use.");
        }
    }

    public ArrayList<BagItem> getItems () { // it's a function with return type of a dynamic array
        return bagItems;
    }

}

abstract class BagItem {

    private String name;
    private double weight;

    public BagItem (String name, double weight) { // you can not new a abstract class but you can use it's constructor in it's children (subclasses)
        this.name = name;
        this.weight = weight;
    }

    public abstract void use(); // an abstract function doesn't have a body so it has to be implemented in children class

    public void drop() { // not everything has to be abstract in a abstract class
        System.out.println(getName() + " has been dropped from bag. [weight: " + getWeight() + "]");
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

class Axe extends BagItem {

    public Axe() {
        super("Axe", 3);
    }

    public void use () { // if you don't implement an abstract method you will get compile error
        System.out.println(getName() + " has been used to chop a tree.");
    }
}

class Food extends BagItem {

    public Food(double weight) { // different constructor from parent
        super("Food", weight); // super keyword: it uses parent constructor. [must be used in first line]

        /*
            parent constructor:
                public BagItem (String name, double weight) {
                    this.name = name;
                    this.weight = weight;
                }
         */
    }

    public void use () { // different implementation from Axe class
        System.out.println(getName() + " has been eaten. [energy: " + getWeight() * 2 + "]");
    }
}
