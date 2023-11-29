import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello world, give me number!");
        int[] bob = new int[5];
        for (int i = 0; i < bob.length; i++) {
            bob[i] = scan.nextInt();
        }
        for (int i = 0; i < bob.length; i++) {
            System.out.println(bob[i]);
        }
    }
}