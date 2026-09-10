import java.util.Arrays;
import java.util.Scanner;

public class lab_1 {
    //? Вариант 1
    //* Задание 1
    public static double fraction(double x) {
        return x - (long) x;
    }

    public static int sumLastNums (int x) {
        int last = Math.abs(x % 10);
        int prev_last = Math.abs((x / 10) % 10);
        return last + prev_last;
    }

    public static int charToNum (char x) {
        return x - '0';
    }

    public static boolean isPositive (int x) {
        return x > 0;
    }

    public static boolean is2Digits (int x) {
        return (Math.abs(x) >= 10) && (Math.abs(x) <= 99);
    }

    //* Задание 2
    public static int abs (int x) {
        if (x < 0) {
            return Math.abs(x);
        } else {
            return x;
        }
    }

    public static double safeDiv (int x, int y) {
        if (y == 0) {
            return 0;
        } else {
            return (double) x / y; 
        }
    }

    public static boolean is35 (int x) {
        if ((x % 3 == 0) && (x % 5 == 0)) {
            return false;
        }
        if ((x % 3 == 0) || (x % 5 == 0)){
            return true;
        } else {
            return false;
        }
    }

    public static String makeDecision (int x, int y) {
        if (x > y) {
            return x + ">" + y;
        } else if (x < y) {
            return x + "<" + y;
        } else {
            return x + "=" + y;
        }
    }

    public static int max3 (int x, int y, int z) {
        int max = x;
        if (y > max) {
            max = y;
        }
        if (z > max) {
            max = z;
        }
        return max;
    }

    //* Задание 3
    public static String listNums (int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            result.append(i);
            if (i < x) result.append(" ");
        }
        return result.toString();
    }

    public static String reverseListNums (int x) {
        StringBuilder result = new StringBuilder();
        for (int i = x; i >= 0; i--) {
            result.append(i);
            if (i > 0) result.append(" ");
        }
        return result.toString();
    }

    public static String chet (int x) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            result.append(i);
            if (i + 2 <= x) result.append(" ");
        }
        return result.toString();
    }

    public static int pow (int x, int y) {
        int result = 1;
        for (int i = 0; i < y; i++) {
            result *= x;
        }
        return result;
    }

    public static int numLen (long x) {
        if (x == 0) return 1;
        int count = 0;
        long absX = Math.abs(x);
        while (absX > 0) {
            absX /= 10;
            count++;
        }
        return count;
    }

    //* Задание 4
    public static int findFirst(int[] arr, int x) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1;
    }

    public static int findLast(int[] arr, int x) {
    for (int i = arr.length - 1; i >= 0; i--) {
        if (arr[i] == x) {
            return i;
        }
    }
    return -1;
    }

    public static int maxAbs(int[] arr) {
    if (arr == null || arr.length == 0) {
        return 0; 
    }

    int max = Math.abs(arr[0]);

    for (int i = 1; i < arr.length; i++) {
        int currentAbs = Math.abs(arr[i]);
        if (currentAbs > max) {
            max = currentAbs;
        }
    }

    return max;
    }

    public static int[] add(int[] arr, int x, int pos) {
    int[] result = new int[arr.length + 1];

    System.arraycopy(arr, 0, result, 0, pos);

    result[pos] = x;

    System.arraycopy(arr, pos, result, pos + 1, arr.length - pos);

    return result;
    }

    public static int[] add(int[] arr, int[] insertArr, int pos) {
    if (insertArr == null || insertArr.length == 0) {
        return arr.clone();
    }

    int[] result = new int[arr.length + insertArr.length];

    System.arraycopy(arr, 0, result, 0, pos);

    System.arraycopy(insertArr, 0, result, pos, insertArr.length);

    System.arraycopy(arr, pos, result, pos + insertArr.length, arr.length - pos);

    return result;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //! 1. Тест метода fraction
        System.out.print("Введите вещественное число для fraction: ");
        while (!in.hasNextDouble()) {
            System.out.print("Ошибка! Введите корректное вещественное число: ");
            in.next();
        }
        double doubleValue = in.nextDouble();
        System.out.println("Дробная часть: " + fraction(doubleValue));
        System.out.println();

        //! 2. Тест метода sumLastNums
        System.out.print("Введите целое число для sumLastNums: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int intValue1 = in.nextInt();
        System.out.println("Сумма двух последних цифр: " + sumLastNums(intValue1));
        System.out.println();

        //! 3. Тест метода charToNum
        char charValue;
        while (true) {
            System.out.print("Введите ОДИН символ-цифру от '0' до '9' для charToNum: ");
            String input = in.next();
            if (input.length() == 1 && Character.isDigit(input.charAt(0))) {
                charValue = input.charAt(0);
                break;
            }
            System.out.println("Ошибка! Это должна быть именно одна цифра.");
        }
        System.out.println("Числовое значение: " + charToNum(charValue));
        System.out.println();

        //! 4. Тест метода isPositive
        System.out.print("Введите целое число для isPositive: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int intValue2 = in.nextInt();
        System.out.println("Число положительное? " + isPositive(intValue2));
        System.out.println();

        //! 5. Тест метода is2Digits
        System.out.print("Введите целое число для is2Digits: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int intValue3 = in.nextInt();
        System.out.println("Число двузначное? " + is2Digits(intValue3));
        System.out.println();

        //! 6. Тест метода abs
        System.out.print("Введите целое число для abs: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int absInput = in.nextInt();
        System.out.println("Модуль числа: " + abs(absInput));
        System.out.println();

        //! 7. Тест метода safeDiv
        System.out.print("Введите первое целое число (делимое) для safeDiv: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int divX = in.nextInt();

        System.out.print("Введите второе целое число (делитель) для safeDiv: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int divY = in.nextInt();
        System.out.println("Результат безопасного деления: " + safeDiv(divX, divY));
        System.out.println();

        //! 8. Тест метода is35
        System.out.print("Введите целое число для is35: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int is35Input = in.nextInt();
        System.out.println("Делится только на 3 или только на 5? " + is35(is35Input));
        System.out.println();

        //! 9. Тест метода makeDecision
        System.out.print("Введите первое целое число (X) для makeDecision: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int decX = in.nextInt();

        System.out.print("Введите второе целое число (Y) для makeDecision: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int decY = in.nextInt();
        System.out.println("Результат сравнения: " + makeDecision(decX, decY));
        System.out.println();

        //! 10. Тест метода max3
        System.out.print("Введите первое число для max3: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int m1 = in.nextInt();

        System.out.print("Введите второе число для max3: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int m2 = in.nextInt();

        System.out.print("Введите третье число для max3: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите корректное целое число: ");
            in.next();
        }
        int m3 = in.nextInt();
        System.out.println("Максимальное из трех: " + max3(m1, m2, m3));

        //! 11. Тест метода listNums
        System.out.print("Введите целое неотрицательное число для listNums: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        int listX = in.nextInt();
        System.out.println("Строка чисел: " + listNums(listX) + "\n");

        //! 12. Тест метода reverseListNums
        System.out.print("Введите целое неотрицательное число для reverseListNums: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        int revListX = in.nextInt();
        System.out.println("Обратная строка чисел: " + reverseListNums(revListX) + "\n");

        //! 13. Тест метода chet
        System.out.print("Введите целое неотрицательное число для chet: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        int chetX = in.nextInt();
        System.out.println("Четные числа: " + chet(chetX) + "\n");

        //! 14. Тест метода pow
        System.out.print("Введите основание степени (X) для pow: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        int powX = in.nextInt();
        System.out.print("Введите показатель степени (Y, >=0) для pow: ");
        while (!in.hasNextInt()) {
            System.out.print("Ошибка! Введите целое число: ");
            in.next();
        }
        int powY = in.nextInt();
        System.out.println("Результат возведения в степень: " + pow(powX, powY) + "\n");

        //! 15. Тест метода numLen
        System.out.print("Введите большое целое число (long) для numLen: ");
        while (!in.hasNextLong()) {
            System.out.print("Ошибка! Введите корректное число типа long: ");
            in.next();
        }
        long lenX = in.nextLong();
        System.out.println("Количество цифр в числе: " + numLen(lenX));

        System.out.println("--- Создание основного массива для методов findFirst, findLast, maxAbs ---");
        int[] mainArr = readArray(in);

        //! 16. Тест метода findFirst
        System.out.print("Введите искомое число X для findFirst: ");
        while (!in.hasNextInt()) { System.out.print("Ошибка! Введите целое число: "); in.next(); }
        int findX1 = in.nextInt();
        System.out.println("Индекс первого вхождения: " + findFirst(mainArr, findX1) + "\n");

        //! 17. Тест метода findLast
        System.out.print("Введите искомое число X для findLast: ");
        while (!in.hasNextInt()) { System.out.print("Ошибка! Введите целое число: "); in.next(); }
        int findX2 = in.nextInt();
        System.out.println("Индекс последнего вхождения: " + findLast(mainArr, findX2) + "\n");

        //! 18. Тест метода maxAbs
        System.out.println("Максимальное по модулю значение в массиве: " + maxAbs(mainArr) + "\n");

        //! 19. Тест ИСПРАВЛЕННОГО метода add_x (вставка ОДНОГО элемента)
        System.out.println("--- Подготовка данных для add_x (вставка одного элемента) ---");
        System.out.println("Создаем базовый массив:");
        int[] baseArrForX = readArray(in);
        
        System.out.print("Введите целое число X, которое нужно вставить: ");
        while (!in.hasNextInt()) { System.out.print("Ошибка! Введите целое число: "); in.next(); }
        int elementX = in.nextInt();

        int posForX;
        while (true) {
            System.out.print("Введите позицию для вставки (pos от 0 до " + baseArrForX.length + "): ");
            while (!in.hasNextInt()) { System.out.print("Ошибка! Введите целое число: "); in.next(); }
            posForX = in.nextInt();
            if (posForX >= 0 && posForX <= baseArrForX.length) {
                break;
            }
            System.out.println("Ошибка! Позиция выходит за пределы массива.");
        }
        int[] resAddX = add(baseArrForX, elementX, posForX);
        System.out.println("Результат add_x: " + Arrays.toString(resAddX) + "\n");

        //! 20. Тест метода add_mass (вставка МАССИВА)
        System.out.println("--- Подготовка массивов для add_mass (вставка массива) ---");
        System.out.println("Создаем базовый массив:");
        int[] baseArr = readArray(in);
        System.out.println("Создаем массив для вставки:");
        int[] insertArr = readArray(in);
        
        int posForMass;
        while (true) {
            System.out.print("Введите позицию для вставки (pos от 0 до " + baseArr.length + "): ");
            while (!in.hasNextInt()) { System.out.print("Ошибка! Введите целое число: "); in.next(); }
            posForMass = in.nextInt();
            if (posForMass >= 0 && posForMass <= baseArr.length) {
                break;
            }
            System.out.println("Ошибка! Позиция выходит за пределы массива.");
        }
        int[] resAddMass = add(baseArr, insertArr, posForMass);
        System.out.println("Результат add_mass: " + Arrays.toString(resAddMass));
        
        in.close();
    }

    //! метод для безопасного ввода массива с клавиатуры
    private static int[] readArray(Scanner in) {
        int size = -1;
        while (size < 0) {
            System.out.print("Введите размер массива (целое неотрицательное число): ");
            while (!in.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                in.next();
            }
            size = in.nextInt();
            if (size < 0) System.out.println("Размер массива не может быть отрицательным!");
        }

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент [" + i + "]: ");
            while (!in.hasNextInt()) {
                System.out.print("Ошибка! Введите целое число: ");
                in.next();
            }
            arr[i] = in.nextInt();
        }
        return arr;
    }
}