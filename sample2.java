public class FormatExample {
    public static void main(String[] args) {
        String name = "Azhar";
        int age = 30;
        System.out.printf("Name: %s, Age: %d%n", name, age); // %n is platform newline
        String s = String.format("Name: %s, Age: %d", name, age);
        System.out.println(s);
    }
}