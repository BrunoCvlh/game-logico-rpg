package monsterModule;

import playerModule.playerClass;

public class monsterClass {

    public static String typeMonster;
    public static int ataqueMonster;
    public static int vidaMonster;


    public void TypeMonster(int wayChoose) {
        switch (wayChoose) {
            case 1:
                monsterClass.typeMonster = "Goblin";
                monsterClass.ataqueMonster = 10;
                monsterClass.vidaMonster = 30;
            case 2:
                monsterClass.typeMonster = "Orc";
                monsterClass.ataqueMonster = 10;
                monsterClass.vidaMonster = 30;
            case 3:
                monsterClass.typeMonster = "Dragão";
                monsterClass.ataqueMonster = 10;
                monsterClass.vidaMonster = 30;
            default:
                System.out.println("Escolha uma classe");
        }
    }
}

