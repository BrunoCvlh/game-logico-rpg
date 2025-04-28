package cavesModule;

public class caveClass {
    public static String caveName;
    public static int caveLevel;
    public static int caveArea;



    public void ClassTypeCave(int wayChoose) {
        switch (wayChoose) {
            case 1:
                caveClass.caveName = "Oiko's Cave";
                caveClass.caveLevel = 3;
                caveClass.caveArea = 30;
            case 2:
                caveClass.caveName = "Dyllan's Cave";
                caveClass.caveLevel = 5;
                caveClass.caveArea = 30;
            case 3:
                caveClass.caveName = "North Cave";
                caveClass.caveLevel = 3;
                caveClass.caveArea = 30;
            default:
                System.out.println("Escolha uma caverna");
        }
    }
}
