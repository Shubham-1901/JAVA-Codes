import java.util.StringTokenizer;

public class ST3 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer("My name is Shubham", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
