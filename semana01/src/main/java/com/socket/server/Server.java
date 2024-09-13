package com.socket.server;


import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    private final int PORT = 13;

    public Server() {
        Socket clientSocket = null;
        try (ServerSocket serverSocket = new ServerSocket(PORT)) {
            System.out.println("1 > Server started on port " + PORT);
            while (true) {
                System.out.println("2 > A la espera de un cliente");
                clientSocket = serverSocket.accept();
                System.out.println("3 > New client connected: " + clientSocket.getInetAddress().getHostAddress());

                Thread.sleep(1000); 
                
               
                System.out.println("3 > Finaliza atencion de cliente");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
    public static void main(String[] args) {
        new Server();
    }

}