import org.junit.jupiter.api.Test;
import ru.itpark.BonusService;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void calculateBonus()
    {
        BonusService service = new BonusService();
        int sum = service.calculateBonus(1000, 1000);
        assertEquals(50, sum);
        System.out.println(sum);
    }

    {
        BonusService service = new BonusService();
        int sum = service.calculateBonus(20000, 1000);
        assertEquals(70, sum);
        System.out.println(sum);
    }

    {
        BonusService service = new BonusService();
        int sum = service.calculateBonus(200000, 1000);
        assertEquals(100, sum);
        System.out.println(sum);
    }

    {
        BonusService service = new BonusService();
        int sum = service.calculateBonus(-15001, 1000);
        assertEquals(0, sum);
        System.out.println(sum);
    }
}