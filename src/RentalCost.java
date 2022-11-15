public class RentalCost {
    private static int costPerDay = 35;
    private static int discountFor7Days = 40;
    private static int discountFor3Days = 10;

    public static int totalCost(int days) {
        int total = days * costPerDay;
        if (days >= 7){
            total = total-discountFor7Days;
            return total;
        }
        if (days >= 3){
            total = total-discountFor3Days;
            return total;
        }
        return total;
    }
}
