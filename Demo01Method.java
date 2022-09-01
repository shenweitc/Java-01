package Demo01Method;

public class Demo01Method {
    public static void main(String[] args) {
        printMethod();
     }

    public static void printMethod() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
