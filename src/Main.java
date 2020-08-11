import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws AWTException {
        System.out.println("кофе-машина");
        //TODO: читать число из консоли
        System.out.println("укажите сумму:");
        Scanner in = new Scanner(System.in);
        int moneyAmount = in.nextInt();

        int[] drinkPrices = {150, 80, 20, 50};
        String[] drinkNames = {"капучино", "эспрессо", "воду", "молоко"};
        //TODO: реализовать оповещение в случае, если недостаточно средств
        boolean canBuyAnything = false;

        for (int i = 0; i < drinkNames.length; i++) {
            if (moneyAmount >= drinkPrices[i]) {
                System.out.println("Вы можете купить " + drinkNames[i]);
                canBuyAnything = true;
            }
        }
        if (canBuyAnything == false) {
            System.out.println("Недостаточно средств");
        };
        //TODO: 20200810_204507
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        Date now = new Date();
        System.out.println(dateFormat.format(now));

        //TODO: Получить скриншот экрана
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        Rectangle screenRect = new Rectangle(screenSize);
        Robot robot = new Robot();
        BufferedImage image = robot.createScreenCapture(screenRect);
        System.out.println(image.getWidth() + "x" + image.getHeight());
    }
}
