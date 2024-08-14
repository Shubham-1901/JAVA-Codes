class Test1 {
    public static void main(String[] args) {
        int arr[] = m1(); // Call the method to get the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " "); // Print the array elements
        }
    }

    public static int[] m1() {
        return new int[] { 1, 2, 3 }; // Return an array
    }
}
