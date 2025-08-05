package ch05_package_inheritance.animalpkg01;

public class AnimalMain {
    public static void main(String[] args) {
        //업캐스팅 그룹 생성
        Animal01[] animal01 = {
                new Fish01("금붕어", 2, "거실 어항", 10, 2),
                new Mammal01("사자", 15, "세렝게티", 10, 4),
                new Bird01("독수리", 20, "푸른 창공", 50, 2),
                new Fish01("연어", 4, "알래스카", 30, 5),
                new Bird01("타조", 11, "초원", 60, 2),
                new Mammal01("하이에나", 6, "사바나", 10, 4)
        };
        // 다운캐스팅 간략화하기 :
        // if(객체명 instanceof 생성자명 새객체명)
        for (int i = 0; i < animal01.length; i++) {
            if (animal01[i] instanceof Fish01 fish01){
                fish01.show();
            }else if (animal01[i] instanceof Mammal01 mammal01){
                mammal01.show();
            }else if (animal01[i] instanceof Bird01 bird01){
                bird01.show();
            }
        }
    }
}
