package ch06_abstract_interface.myinterface;

public class PhoneMain01 {
    public static void main(String[] args) {
        String phoneNo = "01012345678" ;
        String songName = "광화문 연가" ;
        int playtime = 210 ; // 재생 시간

        SmartPhone phone01 = new SmartPhone(phoneNo, songName, playtime);

        phone01.sendCall();
        phone01.play();

        System.out.println("사칙 연산");
        double x = 14.0, y = 5.0 ;
        String operator = "*" ;
        double result = phone01.calculate(operator, x, y);
        System.out.println("계산 결과 01 : "+ result);

        operator = "#" ; // 잘못된 연산자
        result = phone01.calculate(operator, x, y) ;
        System.out.println("계산 결과 02 : "+ result);

        phone01.receiveSms();
        phone01.stop();
    }
}
