package List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List <String> goods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите варианты:");
            System.out.println("1. Добавить\n2. Показать\n3. Удалить");
            String operation = scanner.next();

            switch (operation) {
                case ("1") : {
                    System.out.println("Какую покупку хотите добавить?");
                    String good = scanner.next();
                    goods.add(good);
                    System.out.printf("%s\nИтого в списке покупок: %d товар(ов/а)\n" , good, goods.size());
                    break;
                }

                case ("2") : {
                    print(goods);
                    break;

                }

                case ("3") : {
                    System.out.println("Какую покупку хотите удалить? Введите номер или название");
                    String numberOrName = scanner.next();
                    if (checkOperations(numberOrName)) {
                        goods.remove((Integer.parseInt(numberOrName)) - 1);
                    }
                    goods.remove(numberOrName);
                    System.out.printf("Удалена покупка %s, списко покупок:\n", numberOrName);
                    print(goods);
                    break;
                }

                }

             }
        }

        public static void print(List<String> goods) {
        for (int i = 1; i < goods.size(); i++) {
            System.out.printf("%d. %s\n", i, goods.get(i));
        }
        }
        private static boolean checkOperations(String numberOrName) {
        try {
            Integer.parseInt(numberOrName);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }

    }
}
