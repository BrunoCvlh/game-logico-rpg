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

        int ataque = player.ataque;
        int vida = player.vida;
        int mana = player.mana;
        String nameOfClass = player.nameClass;


        System.out.println("Olá " + player.name + "!\nSeus atributos atuais são:");
        System.out.println("Vida :" + player.vida + "\nAtaque :" + player.ataque + "\nMana :" + player.mana);


    }
    }
