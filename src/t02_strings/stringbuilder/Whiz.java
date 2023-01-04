package t02_strings.stringbuilder;

public class Whiz {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Whiz");
        sb.append("Labs");
        System.out.println(sb.length() + sb.capacity());
    }
}
