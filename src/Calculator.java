import java.util.Scanner;
class Main {

    public static void main(String[] args) {

        System.out.println("Введите арабские числа 1-10 либо римские I-X. \nДля закрытия программы введите пустую строку.\n");

        while(true) {
            System.out.print("Ввод: ");

            Scanner input = new Scanner(System.in); // пользовательский ввод
            String str = input.nextLine();

            Scanner s = new Scanner(str); // обработка пользовательского ввода
            boolean bl1 = s.hasNextInt();
            boolean bl2 = s.hasNext();

            try {
                if (bl1 == true) { // можно ли преобразовать первое слово строки в число
                    String sum = Calculator.clc(str);
                    System.out.println("Ответ: " + sum);
                } else if (bl1 == false && bl2 == true) { // имеется ли строка, которую нельзя преобразовать в число
                    String str1 = s.next();
                    String str2 = s.next();
                    String str3 = s.next();

                    String sum = Calculator.clc(str1, str2, str3);
                    System.out.println("Ответ: " + sum);
                } else {
                    System.out.println("Выход"); // если на входе пустая строка, закрываем программу
                    break;
                }
            } catch (Exception e) {
                System.out.println("Ошибка!");
            }
        }
    }
}