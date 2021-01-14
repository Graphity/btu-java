package ge.edu.btu.chat.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class ServerThread extends Thread {
    private final Socket client;

    public ServerThread(Socket client) {
        this.client = client;
    }

    public void run() {
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(client.getInputStream());
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(client.getOutputStream());
            while (!client.isClosed()) {
                String question = (String) objectInputStream.readObject();
                switch (question) {
                    case "გამარჯობა":
                        objectOutputStream.writeObject("მოგესალმებით, რით შემიძლია დაგეხმაროთ ?");
                        break;
                    case "მაჩვენე კურსი":
                        objectOutputStream.writeObject("2.97");
                        break;
                    case "მაჩვენე ფილიალები":
                        objectOutputStream.writeObject("[ი.ჭავჭავაძის გამზ., ვაჟა-ფშაველას გამზ., გურამიშვილის გამზ.]");
                        break;
                    case "ნახვამდის":
                        objectOutputStream.writeObject("გმადლობთ რომ დაგვიკავშირდით, ნახვამდის !");
                        objectInputStream.close();
                        objectOutputStream.close();
                        client.close();
                        System.out.println("კლიენტთან კავშირი დასრულდა.");
                        break;
                    default:
                        objectOutputStream.writeObject("სამწუხაროდ ამ კითხვაზე პასუხი არ მაქვს.");
                        break;
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
