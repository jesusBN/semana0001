package com.socket.client;

import java.net.Socket;

public class Client {

    private final int PORT = 13;
    private final String IP = "localhost";

    public Client() {
        try {
            Socket clientSocket = new Socket(IP, PORT);
            System.out.println("1 > Client started");
            
            System.out.println("2 > Connecting to server...");
            Thread.sleep(1000);
            clientSocket.close();
            System.out.println("3 > Connected to server");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new Client();
    }
}