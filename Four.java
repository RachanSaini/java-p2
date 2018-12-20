import java.util.Scanner;

public class Four {
    public static void main ( String[] args) {
        System.out.println("Enter a no.: ");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if ( n == 4 ){
            System.out.println(n + " is a power of 4 .");
        }
        else if ( (n>15) && (n% 4 == 0) ){
            System.out.println(n + " is a power of 4 .");
        } else
            System.out.println("not a power of 4. ");
    }
}
