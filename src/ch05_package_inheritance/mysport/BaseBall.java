package ch05_package_inheritance.mysport;

public class BaseBall extends Sport{
    private int innings; // 이닝 수
    private double hitrate; // 타율

    public BaseBall(String name, int entry, int innings, double hitrate) {
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }
    public void show() {
        super.supershow();
        System.out.print(innings + "개의 이닝으로 구성이 되며, ");
        System.out.println("타율 " + hitrate + "을(를) 기록하였습니다.");
    }
}
