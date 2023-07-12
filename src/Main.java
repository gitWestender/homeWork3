public class Main {
    public static void main(String[] args) {
        tak1();
        task2();
        task3();
        task4();
    }

    public static void tak1() {
        System.out.println("Задача 1:");
        int a = Integer.MAX_VALUE;
        byte b = Byte.MAX_VALUE;
        short c = Short.MAX_VALUE;
        long d = Long.MAX_VALUE;
        float x = Float.MAX_VALUE;
        double y = Double.MAX_VALUE;

        System.out.println("Значение переменной \"a\" с типом \"int\" равно " + a); // здесь и далее двойная кавычка заэкранирована
        System.out.println("Значение переменной \"b\" с типом \"byte\" равно " + b);
        System.out.println("Значение переменной \"c\" с типом \"short\" равно " + c);
        System.out.println("Значение переменной \"d\" с типом \"long\" равно " + d);
        System.out.println("Значение переменной \"x\" с типом \"float\" равно " + x);
        System.out.println("Значение переменной \"y\" с типом \"double\" равно " + y + "\n");
    }

    public static void task2() {
        System.out.println("Задача 2:");
        byte a = 67;
        short b = -159;
        int c = 27897;
        long d = 987678965549l;
        float x = 2.786f;
        double y = 27.12;
        System.out.println(); // строка для лучшей читаемости вывода
    }

    public static void task3(){
        System.out.println("Задача 3:");
        byte studentsOfLudmila = 23;
        byte studentsOfAnna = 27;
        byte studentsOfEkaterina = 30;
        short sheetsOfPaper = 480;

        int result = sheetsOfPaper/(studentsOfAnna+studentsOfEkaterina+studentsOfLudmila);

        System.out.println("На каждого ученика рассчитано " + result+" листов бумаги\n");
    }

    public static void task4(){
        System.out.println("Задача 4:");
        int bouttlesPerMinute = 8;
        int timeOfWork;

        timeOfWork = 20;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute*timeOfWork) + " штук бутылок");

        timeOfWork = 24*60;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute*timeOfWork) + " штук бутылок");

        timeOfWork *=3;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute*timeOfWork) + " штук бутылок");

        timeOfWork *=10; // Предположим что в месяце 30 дней
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute*timeOfWork) + " штук бутылок\n");
    }
}