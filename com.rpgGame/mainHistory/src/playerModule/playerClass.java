package playerModule;

public class playerClass {

    public static String name;
    public static String nameClass;
    public static int classe;
    public static int ataque;
    public static int vida;
    public static int mana;


    public void ClassAtributes(int classeEscolhida) {
        switch (classeEscolhida) {
            case 1:
                playerClass.nameClass = "Guerreiro";
                playerClass.ataque = 10;
                playerClass.vida = 30;
                playerClass.mana = 10;
            case 2:
                playerClass.nameClass = "Mago";
                playerClass.ataque = 10;
                playerClass.vida = 30;
                playerClass.mana = 10;
            case 3:
                playerClass.nameClass = "Humano Comum";
                playerClass.ataque = 10;
                playerClass.vida = 30;
                playerClass.mana = 10;
            default:
                System.out.println("Monstro não atribuído");
        }
    }
}
