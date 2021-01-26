package Ge.edu.btu.client;

import java.io.File;
import java.io.FileFilter;
import java.net.Socket;
import java.io.ObjectOutputStream;

class byteFilter implements FileFilter {
    @Override
    public boolean accept(File pathname) {
        return pathname.length() > 100;
    }
}

public class Client {
    public static void main(String[] args) throws Exception {
        File file = new File("/home/graphity/Downloads/Resursebi/cu");
        int counter = 0;
        for (File f : file.listFiles(new byteFilter())) {
            counter++;
        }

        Socket socket = new Socket("localhost", 5000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        objectOutputStream.writeObject(String.format("კლიენტმა მოძებნა %d - ფაილი რომელიც მეტია 100 byte - ზე", counter));
        objectOutputStream.close();
        socket.close();
    }
}
