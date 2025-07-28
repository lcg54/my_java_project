package ch02_control_statement;

public class Stringswitch {
    public static void main(String[] args) {
        String month = "January";
        int num = 0;

        switch (month) {
            case "January": num = 1;break; case "Fabrary": num = 2;break;
            case "March": num = 3;break;
            case "April": num = 4;break;
            case "May": num = 5;break;
            case "June": num = 6;break;
            case "July": num = 7;break;
            case "August": num = 8;break;
            case "September": num = 9;break;
            case "October": num = 10;break;
            case "November": num = 11;break;
            case "December": num = 12;break;
            default:
                System.out.println("잘못된 입력입니다");
                System.exit(0);
            }
            String message = month + "는(은) " + num + "월입니다.";
            System.out.println(message);
        }
    }
