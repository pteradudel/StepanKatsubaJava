import java.util.Scanner;

public class Tasks {
        public static void Task1(Scanner scanner) {

            System.out.println("Введите число:"); // выводим приглашение для ввода
            double number = scanner.nextInt(); // считываем целое число и присваиваем его переменной number
            if (number > 7) { // если число больше 7, то
                System.out.println("Привет"); // выводим "Привет"
            }
        }



    public static void Task2(Scanner scanner) {
            System.out.println("Введите имя:"); // выводим приглашение для ввода
            String name = scanner.next(); // считываем строку и присваиваем ее переменной name
            if (name.equals("Вячеслав")) { // если строка равна "Вячеслав", то
                System.out.println("Привет, Вячеслав"); // выводим "Привет, Вячеслав"
            } else { // иначе
                System.out.println("Нет такого имени"); // выводим "Нет такого имени"
            }
        }


    public static void Task3(Scanner scanner){

                System.out.println("Введите размер массива:"); // выводим приглашение для ввода размера массива
                int size = scanner.nextInt(); // считываем целое число и присваиваем его переменной size
                int[] array = new int[size]; // объявляем и создаем массив целых чисел заданного размера
                System.out.println("Введите элементы массива:"); // выводим приглашение для ввода элементов массива
                for (int i = 0; i < size; i++) { // для каждого индекса от 0 до size - 1
                    array[i] = scanner.nextInt(); // считываем целое число и присваиваем его элементу массива с данным индексом
                }
                System.out.println("Элементы массива кратные 3:"); // выводим сообщение о том, что будем выводить элементы кратные 3
                for (int element : array) { // для каждого элемента массива
                    if (element % 3 == 0) { // если элемент делится на 3 без остатка, то
                        System.out.println(element); // выводим его на экран
                    }
                }
            }
        }

//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18,
//                19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36};
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] % 3 == 0){
//                System.out.println(numbers[i]);
//            }
//        }
//    }
