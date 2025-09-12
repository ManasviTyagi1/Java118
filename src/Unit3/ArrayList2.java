package Unit3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String>  products  = new ArrayList<>();
        System.out.println("Enter product name:");
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            products.add(sc.nextLine());
        }
        Iterator<String> it = products.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
