package lang.wrapper.test;

public class WrapperTest4 {

    public static void main(String[] args) {

        String str = "100";

        //String -> Integer
        Integer integer1 = Integer.valueOf(str); //parseInt는 int타입을 반환, valueOf는 래퍼 클래스를 반환
        System.out.println("integer1 = " + integer1);

        //Integer -> int
        int intValue = integer1;
        System.out.println("intValue = " + intValue);

        //int -> Integer
        Integer integer2 = intValue;
        System.out.println("integer2 = " + integer2);




    }
}
