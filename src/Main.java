public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 4 Переменные. часть 2");
        System.out.println("Задание 1");
        int westernUnion = 2147483640;
        System.out.println("Значение переменной westernUnion - с типом int (целочисленные) равно " + westernUnion);
        byte sigalOne = -120;
        System.out.println("Значение переменной sigalOne - с типом byte (целочисленные) равно " + sigalOne);
        short xeniumTwoFerrum = 32760;
        System.out.println("Значение переменной xeniumTwoFerrum - с типом short (целочисленные) равно " + xeniumTwoFerrum);
        long vektorPlan = 9223372036854775805L;
        System.out.println("Значение переменной vektorPlan - с типом long (целочисленные) равно " + vektorPlan);
        float fitnesMan = 12.1234567f;
        System.out.println("Значение переменной fitnesMan - с типом float (с плавающей запятой) равно " + fitnesMan);
        double dixiSpecialSix = 46.1234567891123456;
        System.out.println("Значение переменной dixiSpecialSix - с типом double (с плавающей запятой) равно " + dixiSpecialSix);

        System.out.println("Задание 2");
        float f = 27.12f;
        System.out.println("Значение " + f + " - переменная float");
        long l = 987678965549L;
        System.out.println("Значение " + l + " - переменная long");
        byte b = 2;
        System.out.println("Значение " + b + " - переменная byte");
        short h = 786;
        System.out.println("Значение " + h + " - переменная short");
        boolean bl = false;
        System.out.println("Значение " + bl + " - переменная boolean");
        short house2 = 786;
        System.out.println("Значение " + house2 + " - переменная short" );
        short house3 = -159;
        System.out.println("Значение " + house3 + " - переменная short" );
        short house4 = 27897;
        System.out.println("Значение " + house4 + " - переменная short" );
        byte bigFut = 67;
        System.out.println("Значение " + bigFut + " - переменная byte" );

        System.out.println("Задание 3");
        byte teacherLuda = 23;
        byte teacherAnna = 27;
        byte teacherCaterina = 30;
        short total = 480;
        System.out.println("На каждого ученика рассчитано " + total / (teacherLuda + teacherAnna + teacherCaterina) + " листов бумаги" );

        System.out.println("Задание 4");
        byte bootle = 16;
        byte timeMinut = 2;
        byte time_Minut = 20;
        System.out.println("За 20 минут машина произвела " + (bootle / timeMinut) * time_Minut + " штук бутылок");
        int timeHours = time_Minut * 3;
        System.out.println("За 1 час машина произвела " + (bootle / timeMinut) * timeHours + " штук бутылок");
        int timeDay = timeHours * 24;
        System.out.println("За 1 сутки машина произвела " + (bootle / timeMinut) * timeDay + " штук бутылок");
        int timeDay3 = timeDay * 3;
        System.out.println("За 3 дня машина произвела " + (bootle / timeMinut) * timeDay3 + " штук бутылок");
        int timeMonth = timeDay3 *10;
        System.out.println("За 1 месяц машина произвела " + (bootle / timeMinut) * timeMonth + " штук бутылок");

        System.out.println("Задание 5");
        byte totalWhiteBrown = 120;
        byte classWhite = 2;
        byte classBrown =4;
        int totalClass = totalWhiteBrown / (classWhite + classBrown);
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalClass * classWhite + " банок белой краски и " + totalClass * classBrown + " банок коричневой краски");

        System.out.println("Задание 6");
        byte bananas = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        double totalGramm = (5 * bananas) + (2 * milk) + (2 * iceCream) + (4 * egg);
        System.out.println("Общий вес продуктов в спорт-завтраке составляет " + totalGramm + " грамм или ");
        System.out.println(totalGramm / 1000 + " кг");
    }
}