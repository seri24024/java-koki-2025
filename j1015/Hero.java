package j1015;

public class Hero {
    //属性：プロパティ：フィールド：メンバ変数
    String name;    //勇者の名前保存用
    int hp;         //勇者の体力保存用

    //操作：メンバメソッド
    public void sleep() {
        //自分自身のhpフィールドを100に(回復)する
        this.hp = 100;

        //「~は、眠って回復した！」と画面に表示
        System.out.println(this.name + "は、眠って回復した！ ");

    };

    public void attack() {


    };


    public void sit(int sec) {

    };

    public void slip() {

    };

    public void run() {

    };
}
