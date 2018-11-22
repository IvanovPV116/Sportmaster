import ru.itpark.BonusService;

public class Main {

    public static void main(String[] args) {

        BonusService service = new BonusService();
        int bonus = (int) service.calculateBonus(500000,1000);
        System.out.println(bonus);
        System.out.println(0.5+0.9);
    }

}
