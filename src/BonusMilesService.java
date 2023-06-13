public class BonusMilesService {

    public int calculate(int price, int rublesPerMile) {
        int result;
       if (price == 10_000) {
        result = 500;
       }
        return result;
    }
}