package toystore;

import java.util.ArrayList;
import java.util.Scanner;

public class changecount {

    public static void changeCountHand(ArrayList<Toy> anyList) {

        System.out.println("Введите id игрушки, количество  которой нужно изменить ");
        Scanner sc = new Scanner(System.in);
        String inputId = sc.nextLine().toUpperCase();
        for (Toy toy : anyList) {
            String strId = toy.getId().toString();
            if (strId.equalsIgnoreCase(inputId)) {
                System.out.println("Введите новое количество(шт.): ");
                int newCount = sc.nextInt();
                toy.setCountToy(newCount);
            }
        }
    }
}
