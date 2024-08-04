public class Student {
    public int roll_no;
    public String name;

    // Constructor
    public Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }

}

    public class{

    public static void main(String[] args) {
        // Initialize an array of Student objects
        Student[] arr = new Student[5];

        // Create and assign Student objects to the array
        arr[0] = new Student(1, "Amit");
        arr[1] = new Student(2, "Sita");
        arr[2] = new Student(3, "Dinsha");
        arr[3] = new Student(4, "Rajat");
        arr[4] = new Student(5, "Shubham");

        // Print details of each student
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll number: " + arr[i].roll_no + " Name: " + arr[i].name);
        }
    }
}
