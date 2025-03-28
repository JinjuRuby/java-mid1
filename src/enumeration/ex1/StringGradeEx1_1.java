package enumeration.ex1;

public class StringGradeEx1_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountSerivce discountSerivce = new DiscountSerivce();
        int basic = discountSerivce.discount(StringGrade.BASIC, price);
        int gold = discountSerivce.discount(StringGrade.GOLD, price);
        int diamond = discountSerivce.discount(StringGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);

    }
}
