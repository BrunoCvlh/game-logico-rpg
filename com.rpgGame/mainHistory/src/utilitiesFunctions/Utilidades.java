package utilitiesFunctions;

public class Utilidades {

     public void CleanConsole(){
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}