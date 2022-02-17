package Cycle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите коллическтво строк массива: ");
        a = in.nextInt();

        System.out.println("Введите колличество столбцов массива: ");
        b = in.nextInt();

        int [] [] array = new  int[a][b];
        for (int i = 0; i < array.length; i++ ) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.println("Введите элемент array[" + i + "] [" + j + "]:");
                array[i][j] = in.nextInt();
            }
        }
        in.close();
        for (int j = 0; j < array[0].length; j++) {
            System.out.printf(array[0][j] + " * " + 3 + " = " + array[0][j]*3 + "; ");

        }
    }
}
