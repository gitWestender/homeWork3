public class Main {
    public static void main(String[] args) {
        tak1();
    }
    public static void tak1(){
        System.out.println("Задача 1:");
        int a = Integer.MAX_VALUE;
        byte b = Byte.MAX_VALUE;
        short c = Short.MAX_VALUE;
        long d = Long.MAX_VALUE;
        float x = Float.MAX_VALUE;
        double y = Double.MAX_VALUE;

        System.out.println("Значение переменной \"a\" с типом \"int\" равно " + a);
        System.out.println("Значение переменной \"b\" с типом \"byte\" равно " + b);
        System.out.println("Значение переменной \"c\" с типом \"short\" равно " + c);
        System.out.println("Значение переменной \"d\" с типом \"long\" равно " + d);
        System.out.println("Значение переменной \"x\" с типом \"float\" равно " + x);
        System.out.println("Значение переменной \"y\" с типом \"double\" равно " + y + "\n");
    }
}