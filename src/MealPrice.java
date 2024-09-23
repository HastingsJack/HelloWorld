public class MealPrice {
    public static double calculateTotalMealPrice(double listedPrice,
                                               double tipRate,
                                               double taxRate) {
        double tip = tipRate * listedPrice;
        double tax = taxRate * listedPrice;
        double result = listedPrice + tip + tax;
        return result;
    }
    public static void main(String[] args) {
        double groupTotalMealCost = calculateTotalMealPrice(15, .2,.08);
        double meal2 = calculateTotalMealPrice(25, .18,.08);
        System.out.println("Total meal cost: " + groupTotalMealCost);
        double individualTotalMealCost = groupTotalMealCost/2;
        System.out.println("Total individual meal cost: " + individualTotalMealCost);
    }
}
