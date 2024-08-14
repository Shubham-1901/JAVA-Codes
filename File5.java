public class File5 {
    int x = 5; // Instance variable

    public static void main(String[] args) {
        File5 myObj = new File5(); // Creating an object of File5
        File5 myObj2 = new File5(); // Creating another object of File5

        myObj2.x = 25; // Setting the value of x in the second object

        System.out.println(myObj.x); // Output the value of x from the first object
        System.out.println(myObj2.x); // Output the value of x from the second object
    }
}
