class VariablesTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Вывод значений переменных на консоль.");
        byte cpuCores = 2;
        float cpuFrequency = 2.4f;
        short ram = 8;
        double rom = 476.55d;
        int refreshRate = 144;
        long modelGpu = 3_050;
        boolean isLaptop = true;
        char laptopModel = 'V';
        System.out.println("\nКоличество ядер процессора - " + cpuCores + "\n" +
                "Частота процессора - " + cpuFrequency + "Ghz\n" +
                "ОЗУ - " + ram + "Gb\n" +
                "SSD - " + rom + "Gb\n" +
                "Частота обновления монитора - " + refreshRate + "Hz\n" +
                "Модель видеокарты - " + modelGpu + "Ti\n" +
                "Ноутбук - " + isLaptop + "\n" +
                "Модель ноутбука - " + laptopModel);

        System.out.println("\n2 - Расчет стоимости товара со скидкой.");
        int penPrice = 100;
        int bookPrice = 200;
        int discount = 11;
        int discountAmount = (penPrice + bookPrice) * discount / 100;
        System.out.println("Сумма скидки - " + discountAmount + " руб.\n" +
                "Стоимость товаров со скидкой - " + ((penPrice + bookPrice) - discountAmount) + " руб.");

        System.out.println("\n3 - Вывод слова JAVA");
        System.out.println("   J    a  v     v  a     \n" + 
                "   J   a a  v   v  a a    \n" +
                "J  J  aaaaa  V V  aaaaa   \n" +
                " JJ  a     a  V  a     a");

        System.out.println("\n4 - Вывод min и max значений целых числовых типов.");
        byte maxByte = 127;
        short maxShort = 32_767;
        int maxInt = 2_147_483_647;
        long maxLong = 9_223_372_036_854_775_807L;
        System.out.println("Первоначальные значения: max byte - " + maxByte +
                ", max short - " + maxShort + ", max integer - " + maxInt + ", max long - " + maxLong + ".");
        System.out.println("Значение после инкремента - inc byte - " + ++maxByte + 
                ", inc short - " + ++maxShort + ", inc integer - " + ++maxInt + ", inc long - " + ++maxLong);
        System.out.println("Значение после декремента: dec byte - " + --maxByte +
                ", dec short - " + --maxShort + ", dec integer - " + --maxInt + ", dec long - " + --maxLong);

        System.out.println("\n5 - Перестановка значений переменных.");
        int num1 = 2;
        int num2 = 5;
        System.out.println("1.Третья переменная. \nИсходные значения переменных: число 1 - " + num1 +
                ", число 2 - " + num2);
        int tmp = num2;
        num2 = num1;
        num1 = tmp;
        System.out.println("Новые значения переменных: число 1 - " + num1 + ", число 2 - " + num2);
        System.out.println("2.Арифметическая операция. \nИсходные значения переменных: число 1 - " + num1 +
                ", число 2 - " + num2);
        tmp = num1 + num2;
        num1 = tmp - num1;
        num2 = tmp - num2;
        System.out.println("Новые значения переменных: число 1 - " + num1 + ", число 2 - " + num2);
        System.out.println("3.Побитовая операция '^'. \nИсходные значения переменных: число 1 - " + num1 +
                ", число 2 - " + num2);
        tmp = num1 ^ num2;
        num1 ^= tmp;
        num2 ^= tmp;
        System.out.println("Новые значения переменных: число 1 - " + num1 + ", число 2 - " + num2);

        System.out.println("\n6 - Вывод символов и их кодов.");
        char sym1 = '#';
        char sym2 = '&';
        char sym3 = '@';
        char sym4 = '^';
        char sym5 = '_';
        System.out.println((int) sym1 + " - " + sym1 + "\n" +
                (int) sym2 + " - " + sym2 + "\n" +
                (int) sym3 + " - " + sym3 + "\n" +
                (int) sym4 + " - " + sym4 + "\n" +
                (int) sym5 + " - " + sym5 + "\n");

                System.out.println("\n7 - Вывод в консоль ASCII-арт Дюка.");
        char slash = '/';
        char backSlash = '\\';
        char lowLine = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backSlash + "    \n" +
                "   " + slash + "  " + backSlash + "   \n" +
                "  " + slash + lowLine + leftParenthesis + " " + rightParenthesis + backSlash + "\n" +
                " " + slash + "      " + backSlash + "\n" +
                slash + "" + lowLine + lowLine + lowLine +lowLine + slash + backSlash + lowLine +lowLine + backSlash);

        System.out.println("\n8 - Вывод количества сотен, десятков и единиц числа.");
        int scrNum = 123;
        int hundreds = scrNum / 100;
        int dozens = scrNum / 10 % 10;
        int units = scrNum % 10;
        System.out.println("Число - " + scrNum + " содержит:\n" +
                hundreds + " сотня\n" +
                dozens + " десятка\n" +
                units + " единицы\n");
        System.out.println("Сумма его цифр = " + (hundreds + dozens + units));
        System.out.println("Произведение его цифр = " + (hundreds * dozens * units));

        System.out.println("\n9 - Вывод времени.");
        scrNum = 86_399;
        int hours = scrNum / 3600;
        int minutes = (scrNum % 3600) / 60;
        int seconds = minutes % 60;
        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}