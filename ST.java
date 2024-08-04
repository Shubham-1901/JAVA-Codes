import java.util.StringTokenizer;

public class ST {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Shubham", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
