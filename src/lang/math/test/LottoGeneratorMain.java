package lang.math.test;

public class LottoGeneratorMain {

    public static void main(String[] args) {
        LottoGenerator generator = new LottoGenerator();

        int[] lottoNumber = generator.generate();

        //생성된 로또 번호 출력
        System.out.print("로또 번호: ");
        for (int num : lottoNumber) {
            System.out.print(num + " ");
        }

    }
}
