package ch04_class;

// 단계 1 : 클래스 정의 (선언)
public class Saram01 {
    // 지역(로컬)(오토매틱)변수: 메소드 내, 초기화 필요, 까만색 / 멤버(인스턴스)변수: 클래스 내, 초기화 불필요, 보라색 / 스태틱변수
    // 멤버 변수들은 기본 값이 존재합니다. (null, 0, 0.0)
    static String nationality;
    String name;
    double height;
    double weight;
    String hobby;
    String blood;

    // 메소드 정의
    // 반환타입 메소드이름 (매개 변수 리스트){...}
    String showGenderInfo(int IDnum){
        String gender = "";
        switch (IDnum){
            case 1,3 : gender = "남자";break;
            case 2,4 : gender = "여자";break;
        }
        String message = name + "님은 " + gender + "입니다.";
        return message;
        // 정의한 메소드 반환타입에 맞춰 return
    }

    // 반환타입 메소드이름 (매개 변수 리스트){...}
    String showBmiInfo(){
        double newHeight = height/100.0;
        double rate = weight/(newHeight*newHeight);
        String bmi = "";
        if(rate>=25){
            bmi = "비만";
        }else if(rate>=23) {
            bmi = "과체중";
        }else if(rate>=18.5) {
            bmi = "정상";
        }else {
            bmi = "저체중";
        }
        return name + "님은 " + bmi + "입니다.";
    }

    // 반환타입 메소드이름 (매개 변수 리스트){...}
    void display(){
        System.out.println(name + "님의 신상 정보");
        System.out.println("국적 : " + nationality);
        System.out.println("키 : " + height + "cm");
        System.out.println("몸무게 : " + weight + "kg");
        System.out.println("혈액형 : " + blood);
    } // 작업을 수행하고 결과값을 반환하는 위 두 메소드와 달리 display 메소드는 그저 출력만 하므로 void를 사용함. 반환하지 않으므로 return도 필요없음.
}
