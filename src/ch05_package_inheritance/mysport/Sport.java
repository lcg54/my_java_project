package ch05_package_inheritance.mysport;

public class Sport {
    private String name; // 종목 이름
    private int entry; // 선수 명수

    public Sport(String name, int entry) {
        this.name = name;
        this.entry = entry;
    }

    protected void supershow() {
        System.out.println(name + " 경기는 " + entry + "명의 엔트리로 구성이 됩니다.");
    }
}
