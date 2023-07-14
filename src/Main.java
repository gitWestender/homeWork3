public class Main {
    public static void main(String[] args) {
        tak1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
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

    public static void task3() {
        System.out.println("Задача 3:");
        byte studentsOfLudmila = 23;
        byte studentsOfAnna = 27;
        byte studentsOfEkaterina = 30;
        short sheetsOfPaper = 480;

        int result = sheetsOfPaper / (studentsOfAnna + studentsOfEkaterina + studentsOfLudmila);

        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги\n");
    }

    public static void task4() {
        System.out.println("Задача 4:");
        int bouttlesPerMinute = 8;
        int timeOfWork;

        timeOfWork = 20;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute * timeOfWork) + " штук бутылок");

        timeOfWork = 24 * 60;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute * timeOfWork) + " штук бутылок");

        timeOfWork *= 3;
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute * timeOfWork) + " штук бутылок");

        timeOfWork *= 10; // Предположим что в месяце 30 дней
        System.out.println("За " + timeOfWork + " минут машина произвела " + (bouttlesPerMinute * timeOfWork) + " штук бутылок\n");
    }

    public static void task5() {
        System.out.println("Задача 5:");
        int classes;
        int tinsOfWhite;
        int tinsOfBrown;
        byte tinsOfPaint = 120;
        byte whitePaintPerClass = 2;
        byte brownPaintPerClass = 4;

        classes = tinsOfPaint / (whitePaintPerClass + brownPaintPerClass); // узнаем количество классов в школе
        tinsOfWhite = classes * whitePaintPerClass;
        tinsOfBrown = classes * brownPaintPerClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + tinsOfWhite + " банок белой краски и " + tinsOfBrown + " банок кориченовой краски\n");
    }

    public static void task6() {
        System.out.println("Задача 6:");
        byte weightOfBanana = 80;
        byte volumeOfMilk = 105;
        byte weightOfIceCream = 100;
        byte weightOfEgg = 70;

        int recipeInGrams = (5 * weightOfBanana) + (2 * volumeOfMilk) + (2 * weightOfIceCream) + (4 * weightOfEgg);
        System.out.println("Вес спортивного завтрака в граммах равен " + recipeInGrams);

        float recipeInKilograms = recipeInGrams / 1000f;
        System.out.println("Вес спортивного завтрака в киллограммах равен " + recipeInKilograms + "\n");
    }

    public static void task7() {
        System.out.println("Задача 7:");
        byte kgToGo = 7;
        short minWeight = 250;
        short maxWeight = 500;

        float daysOnMin = 7 / (minWeight / 100f);
        float daysOnMax = 7 / (maxWeight / 100f);

        float averageDays = (daysOnMin + daysOnMax) / 2;

        System.out.println("Если спортсмен будет терять каждый день по 250 грамм, то достигнет результат за " + daysOnMin + " дней.");
        System.out.println("Если спортсмен будет терять каждый день по 500 грамм, то достигнет результат за " + daysOnMax + " дней.");
        System.out.println("В среднем потребуется " + averageDays + " дней\n");
    }

    public static void task8() {
        System.out.println("Задача 8:");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;

        float increase = 0.1f;

        System.out.println("Маша теперь получает " + ((mashaSalary * increase) + mashaSalary) + " рублей. Годовой доход вырос на " + (mashaSalary * increase) + " рублей");
        System.out.println("Денис теперь получает " + ((denisSalary * increase) + denisSalary) + " рублей. Годовой доход вырос на " + (denisSalary * increase) + " рублей");
        System.out.println("Кристина теперь получает " + ((kristinaSalary * increase) + kristinaSalary) + " рублей. Годовой доход вырос на " + (kristinaSalary * increase) + " рублей");
    }
}