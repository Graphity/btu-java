package company;

import java.io.File;
import java.util.Scanner;

class FileCounterThread extends Thread {
    @Override
    public void run() {
        while (true) {
            File dir = new File("/home/graphity/Downloads/Resursebi/BTU_DOCUMENT");
            int files = dir.listFiles().length;
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(files);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        FileCounterThread fileCounterThread = new FileCounterThread();
        fileCounterThread.start();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("შემოიტანე საძიებო სიტყვა : ");
            String word = scan.nextLine();
            File dir = new File("/home/graphity/Downloads/Resursebi/BTU_DOCUMENT");
            File[] files = dir.listFiles();

            for (File file : files) {
                if (file.getName().contains(word)) {
                    System.out.println("მოიძებნა " + file.getName());
                }
            }
        }
    }
}



