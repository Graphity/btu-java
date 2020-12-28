import org.apache.log4j.Logger;

import java.io.File;
import java.util.Scanner;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) {
        File dir = new File("./");
        Scanner scanner = new Scanner(System.in);
        System.out.println("შემოიტანე საძიებო სიტყვა: ");
        String word = scanner.nextLine();
        logger.info("შემოტანილი სიტყვა : " + word);
        word = word.toLowerCase();

        for (File i : dir.listFiles()) {
            if (i.isDirectory()) {
                for (File j : i.listFiles()) {
                    if (j.getName().toLowerCase().startsWith(word)) {
                        logger.info("მოიძებნა " + i.getName() + "/" + j.getName());
                    }
                }
            }
            else if (i.isFile()) {
                if (i.getName().toLowerCase().startsWith(word)) {
                    logger.info("მოიძებნა " + i.getName());
                }
            }
        }
    }
}
