public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        Matango m = new Matango();

        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        Inn i = new Inn();

        King k = new King();
        k.talk(h);
        System.out.println("宿屋で回復中...");
        i.checkIn(h);
        System.out.println(h.getName() + "の現在のHP: " + h.getHp());
        System.out.println("ミナトは眠って回復した！");
        h.attack(m);
        h.die();



    }
}