import org.apache.log4j.Logger;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {

    final static Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception {
        File dir = new File("./");
        Scanner scanner = new Scanner(System.in);
        System.out.println("შემოიტანე საძიებო სიტყვა: ");
        String word = scanner.nextLine();
        logger.info("შემოტანილი სიტყვა : " + word);

        String[] files = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.toLowerCase().contains(word.toLowerCase());
            }
        });

        for (String fileName : files) {
            logger.info("მოიძებნა " + fileName);
        }
    }
}
