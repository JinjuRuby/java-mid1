package enumeration.ref2;

public class ClassGradeRefMain2 {

    public static void main(String[] args) {

        int price = 10000;

        DiscountSerivce discountSerivce = new DiscountSerivce();
        int basic = discountSerivce.discount(Grade.BASIC, price);
        int gold = discountSerivce.discount(Grade.GOLD, price);
        int diamond = discountSerivce.discount(Grade.DIAMOND, price);

        System.out.println("BASIC 등급의 할인 금액: " + basic);
        System.out.println("GOLD 등급의 할인 금액: " + gold);
        System.out.println("DIAMOND 등급의 할인 금액: " + diamond);
    }
}
