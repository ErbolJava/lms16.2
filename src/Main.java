import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Backend[] backends = {new Java(), new Python(), new CSharp()};
        for (Backend b : backends) {
            System.out.println(b.getClass());
            System.out.println(b.toString());
            boolean v = b instanceof Backend;
            System.out.println(v);
        }
    }
}