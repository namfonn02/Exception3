package exception3;

public class LAB3 {

    public static void main(String[] args) {
        int[] list = new int[0];
        try {
            System.out.println("Statement 1");
            System.out.println(list[10]);
            System.out.println("Statement 3");
        } 
        catch (ArithmeticException ex) {
        } 
        finally {
            System.out.println("Statement 4");
        }
        System.out.println("Statement 5");
    }

}
