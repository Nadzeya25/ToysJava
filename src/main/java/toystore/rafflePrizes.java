package toystore;


import java.util.ArrayList;
import java.util.Collections;

import static toystore.Date.dateNow;
import static toystore.MethodAddFileWinToy.AddWinToyInFile;

public class rafflePrizes {
    public static void methodRafflePrizes(ArrayList<Toy> anyList) {
        System.out.println();
        int[] genProbability = new int[]{25, 25, 25, 50, 50, 50, 50, 50, 50, 0, 0, 0};
        int index = (int) (Math.random() * (genProbability.length));

        if (genProbability[index] == 25) {
            Collections.shuffle(anyList);
            for (Toy toy : anyList) {
                if (toy.getWeightToy() == 25) {
                    System.out.println("Поздравляем," + dateNow() + " вы выиграли игрушку " + toy.getNameToy() + "!");
                    String addLine = "Игрушка => " + toy.getNameToy() + " = 1 шт. => " +  dateNow() +"\n";
                    AddWinToyInFile(addLine);

                    break;
                }
            }


        } else if (genProbability[index] == 50) {
            Collections.shuffle(anyList);
            for (Toy toy : anyList) {
                if (toy.getWeightToy() == 50) {
                    System.out.println("Поздравляем," + dateNow() + "  вы выиграли игрушку " + toy.getNameToy() + "!");
                    String addLine = "Игрушка => " + toy.getNameToy() + " = 1 шт. => " +  dateNow() +"\n";
                    AddWinToyInFile(addLine);
                    break;
                }
            }

        } else {
            System.out.println("На этот раз вы ничего не выиграли, повезет в другой раз");


        }

    }

}