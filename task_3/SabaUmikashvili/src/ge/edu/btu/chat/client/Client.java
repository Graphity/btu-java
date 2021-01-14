package ge.edu.btu.chat.client;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws Exception {
        System.out.println("მიმდინარეობს კავშირის დამყარება ...");
        Socket socket = new Socket("localhost", 5000);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
        ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
        Scanner scan = new Scanner(System.in);
        String question;
        do {
            System.out.println("დასვი კითხვა:");
            question = scan.nextLine();
            objectOutputStream.writeObject(question);
            String answer = (String) objectInputStream.readObject();
            System.out.println("პასუხი : " + answer);
        } while(!question.equals("ნახვამდის"));
        objectInputStream.close();
        objectOutputStream.close();
        socket.close();
        System.out.println("კავშირის დასასრული !!!");
    }
}
