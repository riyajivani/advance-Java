package com;

import jakarta.inject.Inject;
import jakarta.websocket.*;
import jakarta.websocket.server.PathParam;
import jakarta.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

@ServerEndpoint(value = "/connect/{user}")
public class ChatEndPointParams {
    private static final ConcurrentLinkedQueue<Session> peers = new ConcurrentLinkedQueue<>();
    @Inject
    private Logger logger;

    @OnOpen
    public void open(Session session) {
        peers.add(session);

    }

    @OnClose
    public void close(Session session, CloseReason closeReason) {
        //logger.log(Level.INFO, String.format("Session closed with reason %s", closeReason.getReasonPhrase()));
        peers.remove(session);
    }

    @OnMessage
    public void relayMessage(String message, Session session, @PathParam("user") String name) throws IOException {
        for (Session peer : peers) {
            if (!peer.equals(session)) {
                logger.log(Level.INFO, "User name is " + name);
                peer.getBasicRemote().sendText(name + " <br/> " + message);
            }
        }
    }

}
