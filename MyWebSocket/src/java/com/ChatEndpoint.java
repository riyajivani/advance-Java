package com;


import jakarta.websocket.OnMessage;
import jakarta.websocket.OnOpen;
import jakarta.websocket.OnClose;
import jakarta.websocket.Session;
import jakarta.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@ServerEndpoint("/chat")
public class ChatEndpoint {

    private static Set<Session> clients = Collections.synchronizedSet(new HashSet<>());

    @OnOpen
    public void onOpen(Session session) {
        clients.add(session);
        System.out.println("=======================================================open");
    }

    @OnClose
    public void onClose(Session session) {
        clients.remove(session);
        System.out.println("=======================================================Close");
    }

    @OnMessage
    public void onMessage(String message, Session session) {
        // Broadcast the message to all connected clients
        System.out.println("=======================================================reply");
        for (Session client : clients) {
            try {
                client.getBasicRemote().sendText(message);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
