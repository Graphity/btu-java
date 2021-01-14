package ge.edu.btu.chat.server;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        System.out.println("სერვერი ჩაირთო !");
        while (!serverSocket.isClosed()) {
            Socket socket = serverSocket.accept();
            ServerThread thread = new ServerThread(socket);
            thread.start();
            System.out.println("დაკავშირდა ახალი კლიენტი");
        }
    }
}
