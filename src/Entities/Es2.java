package Entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {


        ArrayList<Integer> memoriaarray1 = randomnumbers();


        reverseNumbers(memoriaarray1);

        ArrayList<Integer> memoriaarray2 = reverseNumbers(memoriaarray1);
        boolean controllooddoreven = true;
        isEvenorOdd(memoriaarray2, controllooddoreven);
    }


    public static ArrayList<Integer> randomnumbers() {
        ArrayList<Integer> numeriordinati = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("dammi un numero");
        int nscanner = Integer.parseInt(scanner.nextLine());

        int limite = nscanner;

        Random generatoren = new Random(0);

        for (int i = 0; i < nscanner; i++) {

            int numero = generatoren.nextInt(100);

            numeriordinati.add(numero);

            Collections.sort(numeriordinati);

        }

        System.out.println("Lista ordinata : " + numeriordinati.toString());
        return numeriordinati;
    }


    public static ArrayList<Integer> reverseNumbers(ArrayList<Integer> memoriaarray1) {


        ArrayList<Integer> numeriordinatireverse = new ArrayList<>(memoriaarray1);
        Collections.reverse(numeriordinatireverse);


        System.out.println(numeriordinatireverse);


        ArrayList<Integer> finalresult = new ArrayList<>();

        finalresult.addAll(memoriaarray1);
        finalresult.addAll(numeriordinatireverse);
        System.out.println("lista reverse : " + finalresult);
        return finalresult;

    }


    public static ArrayList<Integer> isEvenorOdd(ArrayList<Integer> finalresult, boolean controllooddoreven) {

        ArrayList<Integer> Listaoddoreven = new ArrayList<>();

        for (Integer num : finalresult) {
            if (controllooddoreven) {

                if (num % 2 == 0) {
                    Listaoddoreven.add(num);
                }
            } else {

                if (num % 2 != 0) {
                    Listaoddoreven.add(num);
                }
            }
        }

        //
        if (controllooddoreven) {
            System.out.println("i numeri pari sono: " + Listaoddoreven);
        } else {
            System.out.println("i numeri dispari sono: " + Listaoddoreven);
        }

        return Listaoddoreven;
    }
}


//
// System.out.println("i numeri pari sono : " + Listaoddoreven);
//                System.out.println("i numeri dispari sono : " + Listaoddoreven);


