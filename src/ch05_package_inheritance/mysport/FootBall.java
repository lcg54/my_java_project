package ch05_package_inheritance.mysport;

public class FootBall extends Sport{
    private int halves; // 하프 타임
    private int goals; // 골수

    public FootBall(String name, int entry, int halves, int goals) {
        super(name, entry);
        this.halves = halves;
        this.goals = goals;
    }
    public void show() {
        super.supershow();
        System.out.print(halves + "개의 하프타임으로 구성이 되며, ");
        System.out.println(goals + "골이 들어갔습니다!");
        System.out.println();
    }
}
