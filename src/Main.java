public class Main {
    public static void main(String[] args) {
        System.out.println("Урок 4 Переменные. часть 2");
        System.out.println("Задание 1");
        int westernUnion = 2_147_483_640;
        System.out.println("Значение переменной westernUnion - с типом int (целочисленные) равно " + westernUnion);
        byte sigalOne = -120;
        System.out.println("Значение переменной sigalOne - с типом byte (целочисленные) равно " + sigalOne);
        short xeniumTwoFerrum = 32_760;
        System.out.println("Значение переменной xeniumTwoFerrum - с типом short (целочисленные) равно " + xeniumTwoFerrum);
        long vektorPlan = 9_223_372_036_854_775_805L;
        System.out.println("Значение переменной vektorPlan - с типом long (целочисленные) равно " + vektorPlan);
        float fitnesMan = 12.1234567f;
        System.out.println("Значение переменной fitnesMan - с типом float (с плавающей запятой) равно " + fitnesMan);
        double dixiSpecialSix = 46.1234567891123456;
        System.out.println("Значение переменной dixiSpecialSix - с типом double (с плавающей запятой) равно " + dixiSpecialSix);

        System.out.println("Задание 2");
        float f = 27.12f;
        System.out.println("Значение " + f + " - переменная float");
        long l = 987_678_965_549L;
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
        short house4 = 27_897;
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

        System.out.println("Задание 7");
        short weiht = 7000;
        short day1 = 250;
        short day2 = 500;
        System.out.println("Чтобы похудеть на 7 кг боксеру потребуется " + weiht / day1 + " дней, если он будет худеть на 250 грамм в день");
        System.out.println("и " + weiht / day2 + " дней если будет худеть на 500 грамм ежедневно.");

        System.out.println("Задание 8");
        int mari = 67_760;
        int den = 83_690;
        int kris = 76_230;
        // годовой доход до повышения;
        int mariYear1 = mari * 12;
        int denYear1 = den * 12;
        int krisYear1 = kris * 12;
        //зарплата после повышения на 10 %ж
        float mari10 = mari * 1.1f;
        float den10 = den * 1.1f;
        float kris10 = kris * 1.1f;
        // годовой доход после повышения
        double mariYear2 = mari10 * 12;
        double denYear2 = den10 * 12;
        double krisYear2 = kris10 * 12;

        System.out.println("Маша теперь получает " + mari10 + " рублей." + " Годовой доход вырос на " + (mariYear2 - mariYear1) + " рублей");
        System.out.println("Денис теперь получает " + den10 + " рублей." + " Годовой доход вырос на " + (denYear2 - denYear1) + " рублей");
        System.out.println("Кристина теперь получает " + kris10 + " рублей." + " Годовой доход вырос на " + (krisYear2 - krisYear1) + " рублей");
    }
}