public class Admin {
    private static Admin admin = new Admin();
    /*
        private: you can't use it outside of this class. (not even subclasses)
        static: it belongs to it's class not objects of class
    */


    private Admin () {} // private constructor: you can't new this class outside of it.

    public static Admin getInstance() { // static: you can only use this method on class not it's objects.
        return admin;
    }

}
