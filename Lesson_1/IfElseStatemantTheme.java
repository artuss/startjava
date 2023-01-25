class IfElseStatemantTheme {
    
    public static void main(String[] args) {
        System.out.println("1 - Перевод псевдокода на язык Java.");
        int age = 21;
        if (age > 20) {
            System.out.println("Доступ разрешен!");
        } else {
            System.out.println("Доступ запрещен!");
        }
        boolean isMaleGender = true;
        if (!isMaleGender) {
            System.out.println("Женщина!");
        } else {
            System.out.println("Мужчина!");
        }
        double height = 1.7d;
        if (height < 1.8) {
            System.out.println("Вы ниже 180 см.");
        } else {
            System.out.println("Вы выше 180 см");
        }
        char firtstLetterName = "Michael".charAt(0);
        if (firtstLetterName == 'M') {
            System.out.println("Первая буква вашего имени - " + firtstLetterName);
        } else if (firtstLetterName == 'I') {
            System.out.println("Первая буква вашего имени - " + firtstLetterName);
        } else {
            System.out.println("Другая буква.");
        }

        System.out.println("\n2 - Поиск max и min числа.");
        int num1 = 11;
        int num2 = 11;
        if (num1 > num2) {
            System.out.println("Число - " + num1 + " больше числа - " + num2);
        } else if (num2 > num1) {
            System.out.println("Число - " + num2 + " больше числа - " + num1);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3 - Проверка числа.");
        int num = 3;
        if (num != 0) {
            System.out.print("Число - " + num);
            if (num % 2 == 0) {
                System.out.print(" четное");
            } else {
                System.out.print(" не четное");
            }
            if (num > 0) {
                System.out.print(" , положительное");
            } else {
                System.out.print(" , отрицательное");
            }
        } else {
            System.out.print("Число равно - 0");
        }

        System.out.println("\n\n4 - Поиск одинаковых цифр в числах.");
        num1 = 123;
        num2 = 124;
        System.out.print("В числах - " + num1 + " и " + num2 + ":\n");
        int hundredsNum1 = num1 / 100;
        int hundredsNum2 = num2 / 100;
        int tensNum1 = (num1 / 10) % 10;
        int tensNum2 = (num2 / 10) % 10;
        int onesNum1 = num1 % 10;
        int onesNum2 = num2 % 10;
        if (hundredsNum1 != hundredsNum2 && tensNum1 != tensNum2 && onesNum1 != onesNum2) {
            System.out.print(" нет одинаковых цифр.");
        } else {
            if (hundredsNum1 == hundredsNum2) {
                System.out.println(" одинаковые цифры - " + hundredsNum1 + " в 3-ем разряде");
            }
            if (tensNum1 == tensNum2) {
                System.out.println(" одинаковые цифры - " + tensNum1 + " во 2-ом разряде");
            }
            if (onesNum1 == onesNum2) {
                System.out.println(" одинаковые цифры - " + onesNum1 + " в 1-ом разряде");
            }
        }
        
        System.out.println("\n5 - Определение символа по его коду.");
        char symbol = '\u0057';
        System.out.print("Символ - '" + symbol + "' это ");
        if (symbol >= '0' && symbol <= '9') {
            System.out.print("число.");
        } else if (symbol >= 'A' && symbol <= 'Z') {
            System.out.print("большая буква.");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.print("маленькая буква.");
        } else {
            System.out.print("не буква и не число.");
        }

        System.out.println("\n\n6 - Подсчет суммы вклада и начисленных банком %.");
        double depositAmount = 300_000;
        System.out.println("Сумма вклада: " + depositAmount + " руб.");
        double accruedInterest = .0d;
        if (depositAmount < 100_000) {
            accruedInterest = depositAmount * .05d;
        } else if (depositAmount >= 100_000 && depositAmount <= 300_000) {
            accruedInterest = depositAmount * .07d;
        } else if (depositAmount > 300_000) {
            accruedInterest = depositAmount * .1d;
        }
        double grandTotal = depositAmount + accruedInterest;
        System.out.println("Начисленный процент: " + accruedInterest + " руб.\n" +
                "Итоговая сумма, с %: " + grandTotal + " руб.");

        System.out.println("\n7 - Определение оценки по предметам.");
        int percentHystory = 59;
        int percentProgramming = 91;
        int gradeHystory = 2;
        int gradeProgramming = 2;

        if (percentHystory > 60 && percentHystory <= 73) {
            gradeHystory = 3;
        } else if (percentHystory > 73 && percentHystory <= 91) {
            gradeHystory = 4;
        } else if (percentHystory > 91) {
            gradeHystory = 5;
        }

        if (percentProgramming > 60 && percentProgramming <= 73) {
            gradeProgramming = 3;
        } else if (percentProgramming > 73 && percentProgramming <= 91) {
            gradeProgramming = 4;
        } else if (percentProgramming > 91) {
            gradeProgramming = 5;
        }

        System.out.println(gradeHystory + " - история\n" + gradeProgramming + " - программирование");
        System.out.println("Средний бал оценок по предметам - " + ((gradeHystory + gradeProgramming) / 2) + "\n" +
                "Средний % по предметам - " + ((percentHystory + percentProgramming) / 2) + "%");

        System.out.println("\n8 - Расчет прибыли за год.");
        int roomRental = 5_000;
        int mounthlyIncome = 13_000;
        int costPrice = 9_000;
        int annualIncome = (mounthlyIncome - (roomRental + costPrice)) * 12;
        if (annualIncome > 0) {
            System.out.print("Прибыль за год: +" + annualIncome + " руб.");
        } else {
            System.out.print("Прибыль за год: " + annualIncome + " руб.");
        }

        System.out.println("\n\n9 - Подсчет количества банкнот.");
        int requestAmount = 567;
        int denomination100 = 10;
        int denomination10 = 5;
        int denomination1 = 50;
        int moneyAtAtm = (denomination100 * 100) + (denomination10 * 10) + denomination1;
        int requestBanknotes100 = requestAmount / 100;
        int requestBanknotes10 = (requestAmount / 10) % 10;
        int requestBanknotes1 = requestAmount % 10;

        if (requestAmount > moneyAtAtm) {
            System.out.print("В банкомате недостаточно денег!");
        } else if (requestBanknotes10 > denomination10 && requestBanknotes1 > denomination1) {
            System.out.print("В банкомате недостаточно купюр - 1$ и 10$, закажите сумму кратной 100$");
        } else if (requestBanknotes1 > denomination1) {
            System.out.print("В банкомате недостаточно купюр - 1$, закажите сумму кратной 10$");
        } else {
            System.out.println("Для выдачи необходимой суммы необходимы следующие номиналы:");
            
            if (requestBanknotes100 >= denomination100) {
                requestBanknotes10 += ((requestBanknotes100 - denomination100) * 10);
                requestBanknotes100 = denomination100;
            }

            if (requestBanknotes10 >= denomination10) {
                requestBanknotes1 += ((requestBanknotes10 - denomination10) * 10);
                requestBanknotes10 = denomination10;
            }

            System.out.println("100$ в количестве - " + requestBanknotes100 + "шт\n"+
                    "10$ в количестве - " + requestBanknotes10 + "шт\n" +
                    "1$ в количестве - " + requestBanknotes1 + "шт\n" +
                    "Выдаваемая сумма - " +
                    (requestBanknotes1 + requestBanknotes10 * 10 + requestBanknotes100 * 100) + "$");
        }
    }
}