package exception.basic.checked;

public class Service {
    Client client = new Client();

    /**
     * 예외를 잡아서 처리하는 코드
     */
    public void callCatch() {

        try {
            client.call();

            System.out.println("예외 이후 try 내부 코드"); // client.call()에서 예외가 발생하기 때문에 실행되지 않는다.

        }
        // catch에 예외를 지정하면 해당 예외와 그 하위 타입 예외를 모두 잡아준다.
        // 따라서 catch의 매개변수로 MyCheckedException의 상위 타입(부모 클래스)인 Exception을 적어도 MyCheckedException을 잡을 수 있다.
        catch (MyCheckedException e) {
            //예외 처리 로직
            System.out.println("예외 처리, message=" + e.getMessage());
        }

        System.out.println("정상 흐름");
    }

    /**
     * 체크 예외를 밖으로 던지는 코드
     * 체크 예외는 예외를 잡지 않고 밖으로 던지려면 throws 예외를 메서드에 필수로 선언해야 한다.
     */
    public void catchThrow() throws MyCheckedException {
        client.call();
    }
}
