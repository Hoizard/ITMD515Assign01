package socket;

import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
        ServerSocket socket=new ServerSocket(9999);
        int Clientsnum=0;
		System.out.println("***The server is started, waiting for the client's connection ***");
       
        while (true) {
            Socket client = socket.accept();
            
           
            ThreadServer ts=new ThreadServer(client);
            new Thread(ts).start();
            Clientsnum++;
			System.out.println("Count of clients:"+Clientsnum);
        }
        
    }
}