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
        String[] files = dir.list((dir1, name) -> name.toLowerCase().startsWith(word.toLowerCase()));
        assert files != null;

        for (String fileName : files) {
            logger.info("მოიძებნა " + fileName);
        }
    }
}
