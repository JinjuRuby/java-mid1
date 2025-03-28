package enumeration.ref2;

public class DiscountSerivce {

    public int discount(Grade grade, int price) {
        return price * grade.getDiscountPercent() / 100;
    }
}
