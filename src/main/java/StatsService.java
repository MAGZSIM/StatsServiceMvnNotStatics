public class StatsService {
    public int getMinSaleMonth(long[] sale) {
        int minMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] <= sale[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth;
    }

    public int getMaxSaleMonth(long[] sale) {
        int maxMonth = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] >= sale[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int sum(long[] sale) {
        int sum = 0;
        for (long number : sale) {
            sum += number;
        }
        return sum;
    }

    public int averageSale(long[] sale) {
        int average = sum(sale) / sale.length;
        return average;
    }

    public int belowAverageSale(long[] sale) {
        int count = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] < averageSale(sale))
                count++;
        }
        return count;
    }


    public int aboveAverageSale(long[] sale) {
        int count = 0;
        for (int i = 0; i < sale.length; i++) {
            if (sale[i] > averageSale(sale))
                count++;
        }
        return count;
    }
}




