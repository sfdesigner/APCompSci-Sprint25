public class Main {

    public static void main(String[] args) {
        outFunction();
        System.out.println();
        inFunction();
    }

    public static void outFunction() {
        System.out.println("Outer Function");
        inFunction();
    }

    public static void inFunction() {
        System.out.println("Inner Function");
    }

    public static void infiniteFunction() {
        System.out.println("This goes on forever!");
        infiniteFunction();
    }

}
