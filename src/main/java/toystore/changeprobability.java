package toystore;

import java.util.ArrayList;
import java.util.Scanner;

public class changeprobability {


    public static void changeProbability(ArrayList<Toy> anyList) {

        System.out.println("Введите id игрушки, у которой нужно изменить процент вероятности выпадения в розыгрыше");
        Scanner sc = new Scanner(System.in);
        String inputId = sc.nextLine().toUpperCase();
        for (Toy toy : anyList) {
            String strId = toy.getId().toString();
            if (strId.equalsIgnoreCase(inputId)) {
                System.out.println("Введите новую величину процента вероятности выпадения игрушки в розыгрыше: ");
                int newWeight = sc.nextInt();
                toy.setWeightToy(newWeight);
            }
        }

    }
}
