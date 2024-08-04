import java.util.StringTokenizer;

public class ST2 {
    public static void main(String[] args) {
        StringTokenizer st = new StringTokenizer(
                "My name is Shubham. I am a Second year student pursuing B.Tech in AI ML at VIT Chennai.", " ");
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
