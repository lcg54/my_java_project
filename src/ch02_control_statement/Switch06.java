package ch02_control_statement;

public class Switch06 {
    public static void main(String[] args) {
        int month = 4;
        String season = "";

        switch(month){
            case 3,4,5:
                season = "봄";
                break;
            case 6,7,8:
                season = "여름";
                break;
            case 9,10,11:
                season = "가을";
                break;
            case 12,1,2:
                season = "겨울";
                break;
            default:
                System.out.println("잘못된 입력입니다.");
                System.exit(0); // 프로그램 강제 종료
        }
        System.out.println(month + "월은 " + season + "입니다.");
    }
}
