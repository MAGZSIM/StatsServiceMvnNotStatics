import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldSumSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int sum = service.sum(sale);
        System.out.println(sum);
    }

    @Test
    public void shouldAverageSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int average = service.averageSale(sale);
        System.out.println(average);
    }

    @Test
    public void shouldMaxMonthSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 7;
        int actualMonth = service.getMaxSaleMonth(sale);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }

    @Test
    public void shouldMinMonthSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.getMinSaleMonth(sale);
        Assertions.assertEquals(expectedMonth, actualMonth);
        System.out.println(actualMonth);
    }

    @Test
    public void shouldBelowAverageSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int count = service.belowAverageSale(sale);
        System.out.println(count);
    }

    @Test
    public void shouldAboveAverageSale() {
        StatsService service = new StatsService();
        long[] sale = new long[]{8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int count = service.aboveAverageSale(sale);
        System.out.println(count);
    }
}