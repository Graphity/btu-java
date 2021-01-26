package ge.edu.btu;

import java.io.File;
import java.util.Objects;

public class FileCounter {
    public static void main(String[] args) {
        File dir = new File("./BTU_DOCUMENTS");
        int filesFound = 0;

        for (File file: Objects.requireNonNull(dir.listFiles())) {
            if (file.isFile() && file.getName().startsWith("btu")) {
                System.out.println(file.getName());
                filesFound++;
            }
        }
        System.out.println("მოძებნილი ფაილების რაოდენობა: " + filesFound);
    }
}
