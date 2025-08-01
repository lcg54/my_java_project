package ch04_class;

public class SaramMain05 {
    public static void main(String[] args) {
        //int[] arr = new int[3];
        //타입[] 배열명 = new 타입[요소개수];
        Saram05[] saram = new Saram05[2];
        // 반환타입이 배열인 saram을 정의. 여기 붙어있는 애는 생성자가 아닌 타입임
        saram[0] = new Saram05("이순신",180.5,75.0,"농구","AB");
        // 0번째 객체 생성. 얘가 생성자임
        saram[1] = new Saram05("김유신",180.2,70.0,"O");

        for (int i = 0; i < saram.length; i++) {
            saram[i].display();
        }

        // array - 초기화 기법으로 할 경우
        Saram05[] mylist = {
                new Saram05("박영희",150.5,55.0,"수영","A"),
                new Saram05("최진철",180.2,66.0,"A")
        };
        for (int i = 0; i < saram.length; i++) {
            mylist[i].display();
            System.out.println();
        }
    }
}
