package enumeration.ex2;

public class ClassGradeEx2_1 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountSerivce discountSerivce = new DiscountSerivce();
        int basic = discountSerivce.discount(ClassGrade.BASIC, price);
        int gold = discountSerivce.discount(ClassGrade.GOLD, price);
        int diamond = discountSerivce.discount(ClassGrade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
