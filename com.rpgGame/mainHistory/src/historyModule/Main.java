package historyModule;

import cavesModule.caveClass;
import monsterModule.monsterClass;
import playerModule.playerClass;
import java.util.concurrent.TimeUnit;
import utilitiesFunctions.Utilidades;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        playerClass player = new playerClass();
        monsterClass monster = new monsterClass();
        caveClass cave = new caveClass();
        Utilidades limpar = new Utilidades();

        System.out.println("Olá, jogador! Escolha seu nome para iniciar o jogo:\n");
        player.name = scan.nextLine();

        System.out.println("Escolha uma classe:\n1.Guerreiro\n2.Mago\n3.Humano Comum");
        player.classe = scan.nextInt();

        player.ClassAtributes(player.classe);
        int ataquePlayer = player.ataque;
        int vidaPlayer = player.vida;
        int manaPlayer = player.mana;
        String nameOfClass = player.nameClass;

        System.out.println("Olá " + player.name + "!\nSeus atributos atuais como "+nameOfClass+" são:");
        System.out.println("Vida :" + vidaPlayer + "\nAtaque :" + ataquePlayer + "\nMana :" + manaPlayer);

        limpar.CleanConsole();

        System.out.println("Escolha uma caverna para começar:\n1.Oiko's Cave\n2.Dyllan's Cave\n3.North Cave");
        int wayChoose = scan.nextInt();

        cave.ClassTypeCave(wayChoose);
        String caveName = cave.caveName;
        int caveArea = cave.caveArea;
        int caveLevel = cave.caveLevel;

        monster.TypeMonster(wayChoose);

        System.out.println("Você escolheu " +caveName+ ". Uma caverna de " +caveArea+ " metros de altura e do nível " +caveLevel+ ".");

        for(int i=0; i < 5; i++){
            System.out.println('-');
        }



    }
    }
