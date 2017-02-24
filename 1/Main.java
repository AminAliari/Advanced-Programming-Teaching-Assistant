public class Main {

    // topic: singleton, private constructor, static keyword

    public static void main(String[] args) {
        Admin admin = Admin.getInstance(); // Admin: class name not object name.
    }
}
