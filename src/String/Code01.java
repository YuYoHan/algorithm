package String;

public class Code01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();

        sb.append("study java");
        sb.insert(0, "Good ");

        System.out.println(sb.toString());
    }
}
