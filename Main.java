import java.util.Scanner;
import java.util.Arrays;

class MyException extends Exception {
    private int detail;
    MyException (int a) {
        detail = a;
    }
    public String toString () {
        return "My"
    }
}

public class Main {
    private static String ComputeValue(int x) throws ArithmeticException {
        return "Целая часть: " + 285/x + " Дробная часть: " + (285%x)/(double)x;
    }

    private static void enterArray(int ind, char ch, char[] array) throws ArrayIndexOutOfBoundsException {
        array[ind] = ch;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        int req;
        char [] array = new char[5];
        Arrays.fill(array,'0');
        do {
            System.out.println("\n\t\t1 - Вычислить значение функции" +
                    "\n\t\t2 - Создание символьного массива" +
                    "\n\t\t3 - Ввести 2 буквы английского алфавита" +
                    "\n\t\t4 - Выход" +
                    "\n\t\tМесто для ввода запроса: ");
            req = scanner.nextInt();
            switch (req) {
                case 1:
                    System.out.println("Введите значение X: ");
                    int x = scanner.nextInt();
                    try {
                        System.out.println(ComputeValue(x));
                    }
                    catch (ArithmeticException zero){
                        System.out.println("Деление на ноль невозможно!");
                    }
                    break;
                case 2:
                    do {
                        System.out.println("\n\t\t1 - Добавить элемент в массив" +
                                "\n\t\t2 - Вывести массив" +
                                "\n\t\t3 - Выйти");
                        req = scanner.nextInt();
                        switch (req) {
                            case 1:
                                System.out.println("Введите индекс(от 0 до 4): ");
                                int ind = scanner.nextInt();
                                System.out.println("Введите символ, считывется только первый символ: ");
                                char ch = scanner1.next().charAt(0);
                                try {
                                    enterArray(ind,ch,array);
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    System.out.println("Выход за границы массива");
                                }
                                break;
                            case 2:
                                for (int i = 0; i < array.length; i++) {
                                    System.out.print(array[i] + " ");
                                }
                                break;
                            case 3:
                                break;
                            default:
                                System.out.println("Неправильный ввод!");
                        }
                    } while (req != 3);
                    break;
                case 3:
                    System.out.println("Введите символ заглавной буквы на латинеце(считывается только первый символ): ");
                    char Firstlet = scanner1.next().toUpperCase().charAt(0);
                    System.out.println("Введите символ строчной буквы на латинице(считывается только первый символ): ");
                    char Secondlet = scanner1.next().toLowerCase().charAt(0);

                    break;
                    case 4:
                        return;
                default:
                    System.out.println("Неправильный ввод!");
            }
        }while(req != 4);




    }
}
