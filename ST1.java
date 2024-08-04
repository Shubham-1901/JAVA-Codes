import java.util.StringTokenizer;

public class ST1 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name, is, Shubham", ",");
        if (st.hasMoreTokens()) {
            System.out.println("Next token is: " + st.nextToken().trim());
        }
    }
}
