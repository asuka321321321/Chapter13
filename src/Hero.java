public class Hero {
    private int hp;
    private String name;
    private Sword sword;

    Hero(){
        hp = 40;
        name = "ミナト";
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {// 妥当性チェック
        if (name == null) {
            throw new IllegalArgumentException("名前がnullである。処理を中断。");
        }
        if (name.length() <= 1) {
            throw new IllegalArgumentException("名前が短すぎる。処理を中断。");
        }
        if (name.length() >= 8) {
            throw new IllegalArgumentException("名前が長すぎる。処理を中断。");
        }
        this.name = name;
    }
    public int getHp(){
        return this.hp;
    }
    public void setHp(int hp){
        this.hp = hp;
    }
    void bye() {
        System.out.println("勇者は別れを告げた");
    }
    public void die() {
        System.out.println(this.getName() + "は死んでしまった！");
        System.out.println("GAME OVERです。");
    }
    void sleep() {
        this.hp = 100;
        System.out.println(this.getName() + "は、眠って回復した！");
    }
    public void attack(Matango m) {
        System.out.println(this.getName() + "の攻撃！");
        System.out.println("お化けキノコ" + m.suffix + "から１００ポイントの反撃を受けた");
        this.hp -= 2;
        if (this.hp <= 0) {
            this.die();
        }
    }
}