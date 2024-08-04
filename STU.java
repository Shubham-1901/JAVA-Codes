class Student {
    public int roll_no;
    public String name; // Corrected field name to match the constructor

    // Constructor
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name; // Corrected field name to match the class field
    }
}

public class STU {
    public static void main(String[] args) {
        // Initialize an array of Student objects
        Student[] arr = new Student[5];

        // Create and assign Student objects to the array
        arr[0] = new Student(1, "Shubham");
        arr[1] = new Student(2, "Ram");
        arr[2] = new Student(3, "Shyam");
        arr[3] = new Student(4, "Soham");
        arr[4] = new Student(5, "Durvank");

        // Print details of each student
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll Number: " + arr[i].roll_no + " Name: " + arr[i].name); // Corrected concatenation
                                                                                            // and field name
        }
    }
}
