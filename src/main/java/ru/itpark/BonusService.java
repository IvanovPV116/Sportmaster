package ru.itpark;

public class BonusService {
    public int calculateBonus(int accumulatedAmount, int amountPurchase    ) {
        int bonusPer1K = 1000;
        int bonus;
        int minValueBlue = 1;
        int maxValueBlue = 15000;
        int minValueSilver = 15001;
        int maxValueSilver = 150000;
        int minValueGold = 150001;

        if (accumulatedAmount >= minValueBlue && accumulatedAmount <= maxValueBlue) {
            bonus = 50;
        } else if (accumulatedAmount >= minValueSilver && accumulatedAmount <= maxValueSilver) {
            bonus = 70;
        } else if (accumulatedAmount >= minValueGold) {
            bonus = 100;
        }
        else {
            bonus = 0;
        }
        int sum = (amountPurchase / bonusPer1K) * bonus;
        return sum;
    }
}