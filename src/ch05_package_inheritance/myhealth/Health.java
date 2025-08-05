package ch05_package_inheritance.myhealth;

public class Health extends Human{
    private double s_weight; //표준 체중
    private double fatrate; //비만률
    private String result; //결과 값

    public Health(String name, String gender, double height, double weight) {
        super(name, gender, height, weight);
        switch (gender){
            case "M" : s_weight = (height-100.0)*0.9; break;
            case "F" : s_weight = (height-100.0)*0.85; break;
        }
        fatrate = weight/s_weight*100;
        if (fatrate<=90){
            result = "저체중";
        }else if (fatrate>90 && fatrate<=110){
            result = "정상(표준 체중)";
        }else if (fatrate>110 && fatrate<=120){
            result = "과체중";
        }else if (fatrate>110 && fatrate<=130){
            result = "경도 비만";
        }else if (fatrate>130 && fatrate<=150){
            result = "중도 비만";
        }else{
            result = "고도 비만";
        }//calculate로 빼고 부모클래스에도 같은메소드 넣고 오버라이딩 해보기
    }

    public void output2() {
        super.output1();
        String showFatrate = String.format("%.3f", fatrate/100.0);
        System.out.print(getName() + "님은 비만율이 " + showFatrate + "이고, ");
        System.out.println(result + "입니다.");
        System.out.println();
    }
}
