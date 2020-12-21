package Ge.edu.btu.server;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import org.apache.log4j.Logger;

public class Server {
    final static Logger logger=Logger.getLogger(Server.class);

    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(5000);
        logger.info("სერვერი ჩაირთო !!!");
        Socket socket = serverSocket.accept();
        logger.info("კავშირი დამყარებულია !");
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        String message = (String) objectInputStream.readObject();
        logger.info("მიმდინარეობს მონაცემების წაკითხვა ...");
        logger.info(message);
        logger.info("კავშირის დასასრული !!!");
        objectInputStream.close();
    }
}
