package com.chenmr.observer.Battle;

public class Client {

    public static void main(String[] args) {
        AllyControlCenter acc = new ConcreteAllyControlCenter("一群逗比");

        Observer player1, player2, player3, player4;

        player1 = new Player("第一个逗比");
        player2 = new Player("第二个逗比");
        player3 = new Player("第三个逗比");
        player4 = new Player("第四个逗比");
        acc.join(player1);
        acc.join(player2);
        acc.join(player3);
        acc.join(player4);

        player1.beAttacked(acc);

    }

}
