package lang.string.test;

public class TestString11 {

    public static void main(String[] args) {
        String str = "Hello Java";
        String reversed = new StringBuilder(str).reverse().toString(); //StringBuilder에서 toString은 String타입으로 변환할 때 사용한다.
        System.out.println(reversed);

    }
}
