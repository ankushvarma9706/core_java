public class Example5 {
    public static void main(String[] args) {
        // int length() - size of the string/ length of the string
        String a = "Hello";
        String b = "Hello";
        String c = "hello";


        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.equalsIgnoreCase(c));
    }
}
