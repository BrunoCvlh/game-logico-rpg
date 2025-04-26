package historyModule;

import playerModule.playerClass;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        playerClass player = new playerClass();

        System.out.println("Olá, jogador! Escolha seu nome para iniciar o jogo:\n");
        player.name = scan.nextLine();

        System.out.println("Escolha uma classe:\n1.Guerreiro\n2.Mago\n3.Humano Comum");
        player.classe = scan.nextInt();

        player.ClassAtributes(player.classe);


        int ataquePlayer = player.ataque;
        int vidaPlayer = player.vida;
        int manaPlayer = player.mana;
        String nameOfClass = player.nameClass;


        System.out.println("Olá " + player.name + "!\nSeus atributos atuais como "+nameOfClass+"são:");
        System.out.println("Vida :" + vidaPlayer + "\nAtaque :" + ataquePlayer + "\nMana :" + manaPlayer);


    }
    }
