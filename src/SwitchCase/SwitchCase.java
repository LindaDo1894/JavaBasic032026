package SwitchCase;

public class SwitchCase {
    public static void main(String[] args) {
     double myDecimal = 5.20;
     float avgScore = 8.56f;

        System.out.println(myDecimal);
        System.out.println(avgScore);

      String browser = "Chrome";
        switch (browser) {
            case "Chrome":
                System.out.println("Open Chrome"); //WebDriver driver = new ChromeDriver();
                break;
                         //break means: roi voi case nao , chay xong roi exit luon.
            case "Edge":
                System.out.println("Open Edge"); //WebDriver driver = new EdgeDriver();
                break;
            case "FireFox":
                System.out.println("Open FireFox");
                break;
            default:
                System.out.println("Open Default browser: Chrome");
        }
    }
}
