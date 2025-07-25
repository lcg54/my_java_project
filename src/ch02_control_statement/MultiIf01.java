package ch02_control_statement;

public class MultiIf01 {
    public static void main(String[] args) {
        int temp = 24;
        String msg;

        if (temp >= 35) {
            msg = "폭염 경보";
        } else if (temp >= 30) {
            msg = "무더운 날씨";
        } else if (temp >= 20) {
            msg = "쾌적한 날씨";
        } else if (temp >= 10) {
            msg = "쌀쌀한 날씨";
        } else {
            msg = "추운 날씨";
        }
        System.out.println(temp + "도는 " + msg + "입니다.");
    }
}
