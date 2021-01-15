import java.util.Scanner;
class Calculator {

    public static String clc(String str) { // метод для арабских чисел

        Scanner s = new Scanner(str); // разбиваем строку на операнды и операцию
        int a = s.nextInt();
        String b = s.next();
        int c = s.nextInt();

        String sum = "Вычисление арабских чисел";

        if(a<=10 && a>0 && c<=10 && c>0) { // ограничиваем допустимый ввод и обрабатываем пример

            int num = 0;

            switch(b) {
                case "+": num = a + c; break;
                case "-": num = a - c; break;
                case "*": num = a * c; break;
                case "/": num = a / c; break;
                default: System.out.println("Ошибка!");
            }
            sum = Integer.toString(num); // конвертируем резульат в строку
        }
        else {
            System.out.println("Вне допустимых значений");

        }
        return sum;
    }

    public static String clc(String str1, String str2, String str3) { // переопределенный метод для римских чисел

        String sum = "Вычисление римских чисел";

        RomNum opr1  = RomNum.valueOf(str1); // проверяем наличие строк в перечислении
        RomNum opr2  = RomNum.valueOf(str3);

        int a = opr1.ordinal(); // присваиваем индекс перечислений переменным
        int b = opr2.ordinal();

        String arb = Integer.toString(++a) + " " + str2 + " " + Integer.toString(++b); // собираем новую строку
        String rims = Calculator.clc(arb); // передаем ее в уже готовый метод

        Scanner s = new Scanner(rims); // конвертируем ответ в число (для индекса)
        int c = s.nextInt();

        if(c==0){
            sum = "0";
        }
        else if(c<0){
            c = -c;
            RomNum rim[] = RomNum.values(); //ищем в перечислении константу по полученному индексу
            RomNum num = rim[--c];

            sum = "-" + num.toString(); //присваиваем значение константы строке и возвращаем ее
        }
        else {
            RomNum rim[] = RomNum.values(); //ищем в перечислении константу по полученному индексу
            RomNum num = rim[--c];

            sum = num.toString(); //присваиваем значение константы строке и возвращаем ее
        }
        return sum;
    }
}