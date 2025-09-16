package Entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Es1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        HashSet<String> parole = new HashSet<>();
        ArrayList<String> paroleduplicate = new ArrayList<>();
        System.out.println("Il numero di parole che vuoi inserire");
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {

            System.out.println("Quali parole vuoi inserire?");

            String nparole = scanner.nextLine();


            if (parole.contains(nparole)) {


                paroleduplicate.add(nparole);

            } else {
                parole.add(nparole);
            }


        }
        System.out.println("set parole distinte :" + parole);
        System.out.println("set parole duplicate :" + paroleduplicate);
        System.out.println("parole distinte : " + parole.size());


    }
}
