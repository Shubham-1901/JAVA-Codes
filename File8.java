public class File8 {
    static void myStat() {
        System.out.println("Static methods can be called without creating objects");
    }

    public void myPub() {
        System.out.println("Public methods must be called by creating objects");
    }

    public static void main(String[] args) {
        myStat(); // Calling the static method

        File8 myobj = new File8(); // Creating an object of File8
        myobj.myPub(); // Calling the public method using the object
    }
}
