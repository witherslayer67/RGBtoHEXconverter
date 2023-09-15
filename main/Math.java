import java.util.Scanner;  

public class Math{
    public static int r;
    public static int g;
    public static int b;
    public static Scanner scanner = new Scanner(System.in);
    public static String hex;
    public static void main(String[] args){
        System.out.println("Insert R Value:");
        r = scanner.nextInt();
        System.out.println("Insert G Value:");
        g = scanner.nextInt();
        System.out.println("Insert B value:");
        b = scanner.nextInt();
        checkValue();
    }
    public static void checkValue(){
        if(r > 255){
            System.out.println("Invalid R Value: R Value cannot be more than 255");
            System.out.println("Insert R Value:");
            r = scanner.nextInt();
        } else if (g > 255){
            System.out.println("Invalid G Value: G Value cannot be more than 255");
            System.out.println("Insert G Value:");
            g = scanner.nextInt();
        } else if (b > 255){
            System.out.println("Invalid R Value: B Value cannot be more than 255");
            System.out.println("Insert B Value:");
            b = scanner.nextInt();
        } else if ((r > 255) || (g > 255) || (b > 255)){
            checkValue();
        } else {
            convert();
        }
    }
    public static void convert(){
        hex = String.format("#%02X%02X%02X", r, g, b);
        System.out.println(hex);
    }
}