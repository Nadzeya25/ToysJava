package toystore;
import java.util.*;
import static toystore.IdGenerator.createId;
import static toystore.changecount.changeCountHand;
import static toystore.changeprobability.changeProbability;
import static toystore.rafflePrizes.methodRafflePrizes;

public class ToyStore {
    public static void main(String[] args) {
        Toy t1 = new Toy(createId(),
                "Мяч-1",
                50,
                13);

        Toy t2 = new Toy(createId(),
                "Мишка-1",
                50,
                33);

        Toy t3 = new Toy(createId(),
                "Мяч2",
                25,
                14);

        Toy t4 = new Toy(createId(),
                "скакалка-1",
                50,
                78);

        Toy t5 = new Toy(createId(),
                "Кукла-1",
                25,
                333 );

        Toy t6 = new Toy(createId(),
                "Мяч-3",
                50,
                58);

        Toy t7 = new Toy(createId(),
                "Мяч-4",
                50,
                22);

        ArrayList<Toy> toyList = new ArrayList<>();

        toyList.add(t1);
        toyList.add(t2);
        toyList.add(t3);
        toyList.add(t4);
        toyList.add(t5);
        toyList.add(t6);
        toyList.add(t7);

        System.out.println(toyList.hashCode());
        Scanner in = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            System.out.println();
            System.out.println("""
                    Выберите действие:
                    1 - Добавить игрушку в базу
                    2 - Показать все игрушки
                    3 - Изменить процент вероятности выпадения игрушки в розыгрыше
                    4 - demo розыгрышa игрушки для проверки работы программы
                    5 - изменить количество игрушек вручную
                    0 - Выход""");
            String choice = in.nextLine();
            switch (choice) {
                case "1" -> {
                    UUID id = createId();
                    System.out.println("Введите название игрушки: ");
                    Scanner sc = new Scanner(System.in);
                    String nameToy = sc.nextLine().toUpperCase();
                    System.out.println("""
                            Введите категорию игрушки в розыгрыше: \n
                            25 - игрушка выпадает в 25 % случаев из 100 \n
                            50 - игрушка выпадает в 50 % случаев из 100 \n
                            0 - игрушка не участвует в розыгрыше
                            """);
                    int weightToy = sc.nextInt();
                    System.out.println("Введите количество игрушек для добавления : ");
                    int countToy = sc.nextInt();
                    Toy newToy = new Toy(id, nameToy, weightToy, countToy);
                    toyList.add(newToy);
                    System.out.println();
                    System.out.println("Игрушка добавлена в общую базу товаров");
                }
                case "2" -> {
                    if (toyList.size() != 0) {

                        for (Toy toy : toyList) {
                            System.out.println(toy.toString());
                        }
                    } else {

                        System.out.println("База игрушек пуста\n");
                    }
                }
                case "3" -> {
                    if (toyList.size() != 0) {
                        changeProbability(toyList);
                    } else {
                        System.out.println("База игрушек пуста\n");
                    }
                }
                case "4" -> {
                    if (toyList.size() != 0) {
                        methodRafflePrizes(toyList);
                        System.out.println("Ждите следующий розыгрыш через неделю");
                    } else {
                        System.out.println("База игрушек пуста\n");
                    }
                }
                case "5" -> {
                    if (toyList.size() != 0) {
                        changeCountHand(toyList);
                    } else {
                        System.out.println("База игрушек пуста\n");
                    }
                }
                case "0" -> {
                    flag = false;
                    System.out.println();
                    System.out.println("Работа завершена\n");
                }
                default -> System.out.println("Повторите выбор пункта меню ");
            }
        }
    }
}




