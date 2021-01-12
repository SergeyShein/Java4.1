public class BonusMilesService {
    public int calculate(int priceTicket) {
        int fixedAmount = 20;
        int bonusMiles = priceTicket / fixedAmount;
        return bonusMiles;
    }
}
