public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int bonusMiles = service.calculate(10000);
        System.out.println(bonusMiles);
    }
}
