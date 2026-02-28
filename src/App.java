
public class App {
    public static void main(String[] args) {
        System.out.println("Hello SonarQube Demo!");

        // Intentional issue: unused variable
        int unusedVariable = 42;

        // Intentional bug: empty catch block
        try {
            int result = 10 / 0;
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}