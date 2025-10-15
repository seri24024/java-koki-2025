package j1015;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero();  //勇者が生まれる
        hero.name = "たろ";      //勇者の名前を設定する
        hero.hp = 100;           //勇者のHPを設定する

        hero.sleep();

        Matango matango = new Matango();
        matango.hp = 50;
        System.out.println("マタンゴのHPは" + matango.hp);

    }
}
