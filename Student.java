public class student {
    public int roll_no;
    public String name;

    // Constructor
    Student(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;
    }
}

public class Student {
    public static void main(String[] args) {
        // Initialize an array of Student objects
        Student[] arr = new Student[5];

        // Create and assign Student objects to the array
        arr[0] = new student(1, "Amit");
        arr[1] = new student(2, "Sita");
        arr[2] = new student(3, "Dinsha");
        arr[3] = new student(4, "Rajat");
        arr[4] = new student(5, "Shubham");

        // Print details of each student
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Roll number: " + arr[i].roll_no + " Name: " + arr[i].name);
        }
    }
}
