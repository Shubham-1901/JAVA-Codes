public class File4 {
    final int x = 10; // Final variable, cannot be modified

    public static void main(String[] args) {
        File4 myObj = new File4(); // Create an instance of File4
        // myObj.x = 25; // This line would cause a compilation error

        System.out.println(myObj.x); // This will correctly print 10
    }
}
