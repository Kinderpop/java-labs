public class Main {
    public static void main(String[] args) throws Exception {
        //! Вариант 1
        //? Задание 1
        System.out.println("Задание 1: Точка координат");

        Point point1 = new Point(5.0, 10.5);
        Point point2 = new Point(-3.2, 7.0);
        Point point3 = new Point(0.0, -15.8);

        System.out.println("Точка 1: " + point1);
        System.out.println("Точка 2: " + point2);
        System.out.println("Точка 3: " + point3);

        //? Задание 2
        System.out.println("Задание 2: Прямая");

        Point line1Start = new Point(1, 3);
        Point line1End = new Point(23, 8);
        
        Point line2Start = new Point(5, 10);
        Point line2End = new Point(25, 10);

        // 1.
        Line line1 = new Line(line1Start, line1End);

        // 2. 
        Line line2 = new Line(line2Start, line2End);

        // 3.
        Line line3 = new Line(line1Start, line2End);

        System.out.println("Шаг 1-3: Созданы три линии:");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);
        System.out.println();

        // 4

        line1Start.setX(2);
        line1Start.setY(4);

        line2End.setX(30);
        line2End.setY(10);

        System.out.println("Шаг 4: Изменили координаты точек (Линия 3 изменилась автоматически):");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);
        System.out.println();

        line1.setStart(new Point(100, 200));

        System.out.println("Шаг 5: Перезаписали точку начала Линии 1 (Линия 3 осталась прежней):");
        System.out.println("Линия 1: " + line1);
        System.out.println("Линия 2: " + line2);
        System.out.println("Линия 3: " + line3);

        //? Задание 3
        System.out.println("--- Задание 3: Студент ---");

        // 1
        int[] vasyaGrades = {3, 4, 5};
        Student vasya = new Student("Вася", vasyaGrades);

        // 2
        Student petya = new Student("Петя", vasya.getGrades());

        // 3
        petya.getGrades()[0] = 5;

        System.out.println("Шаг 3: Вывод после изменения оценки Пети:");
        System.out.println(vasya);
        System.out.println(petya);
        
        System.out.println("Оценка изменилась у обоих студентов");

        // 4
        Student andrey = new Student("Андрей", vasya.getGrades().clone());

        vasya.getGrades()[0] = 3;

        System.out.println("Шаг 4: Изменили оценку Васи обратно на 3 (у Андрея осталась 5):");
        System.out.println(vasya);
        System.out.println(andrey);

        //? Задание 4
        System.out.println("Задание 4 обнова точки");

        Point task4Point1 = new Point(3, 5);
        Point task4Point2 = new Point(25, 6);
        Point task4Point3 = new Point(7, 8);

        System.out.println("Точка 1: " + task4Point1);
        System.out.println("Точка 2: " + task4Point2);
        System.out.println("Точка 3: " + task4Point3);

        //? Задание 5
        System.out.println("Задание 5 обнова линии");
        Point line4Start = new Point(1,3);
        Point line4End = new Point(23,8);
        Line line4 = new Line(line4Start, line4End);

        Point line5Start = new Point(5,10);
        Point line5End = new Point(25,10);
        Line line5 = new Line(line5Start, line5End);

        Line line6 = new Line(line4Start,line5End);
        System.out.println(line4);
        System.out.println(line5);
        System.out.println(line6);

        System.out.println("Задание 6 обнова линии 2");
        Line line7 = new Line(1,10,1,15);
        System.out.println(line7.getLenght());
    }
}