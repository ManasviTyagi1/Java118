package Unit3;
import java.util.Scanner;
import java.util.HashSet;


public class Hashset1 {
    public static void main(String[] args) {
        HashSet<String> hs1 = new HashSet<>();
        HashSet<String> hs2 = new HashSet<>();
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter the element of hs 1: ");
        int m = sc.nextInt();
        System.out.println("Enter the element of hs 2: ");
        int n = sc.nextInt();
        for (int i = 1; i < m; i++) {
            hs1.add(sc.next());

        }
        for (int i = 1; i < n; i++) {
            hs2.add(sc.next());

        }

        System.out.println(hs2);
        hs1.removeAll(hs2);
        System.out.println(hs1);
    }
}