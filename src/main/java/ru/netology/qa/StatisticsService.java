package ru.netology.qa;
import org.jetbrains.annotations.NotNull;

public class StatisticsService {
    public long findMax(long @NotNull [] incomes) {
        long currentMax = incomes[0];
        for (long income : incomes) {
            if (currentMax < income) {
                currentMax = income;
            }
        }
        return currentMax;
    }
}