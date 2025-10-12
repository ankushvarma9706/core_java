public class Example6 {

        public static void main(String[] args) {
            // int length() - size of the string/ length of the string
            String a = "Hello";
            String b = "Hello";
            String c = "hello";


            System.out.println(a.compareTo(b));
            System.out.println(a.compareTo(c));
            System.out.println(a.compareToIgnoreCase(c));
        }
    }

