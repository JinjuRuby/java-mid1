package lang.wrapper;

public class AutoBoxingMain2 {

    public static void main(String[] args) {
        //Primitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; //오도 박싱(Auto-Boxing)

        //Wrapper -> Primitive
        int unboxedValue = boxedValue; //오토 언박싱(Auto-Unboxing)

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);


    }
}
