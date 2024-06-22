import java.net.Socket;
import java.io.DataOutputStream;
import java.io.IOException;

public class MeroClient {
    public static void main(String[] args) {
        System.out.println("Waiting for server");
         Socket socket = new Socket("localhost",9999);
         System.out.println("Connected with server");
         DataOutputStrem dos = new DataOutputStrem (socket.getOutputStream());
         dos.write(10);
         dos.flush();
         dos.close();
         socket.close();

    } catch(IOException e) {
        e.printStackTrace();
        
    }
    
    }
