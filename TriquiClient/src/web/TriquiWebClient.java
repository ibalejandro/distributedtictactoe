/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.java.dev.jaxb.array.IntArray;
import webservices.TriquiWebService;
import webservices.TriquiWebService_Service;

/**
 *
 * @author Santiago
 */
public class TriquiWebClient {
    
    private String urlTriqui = "http://localhost:8080/TriquiServer/TriquiWeb"
                             + "Service";
    private TriquiWebService triquiWS = null;
    private TriquiWebService_Service triquiWServ = null;
    private static TriquiWebClient instance = null;
    
    private TriquiWebClient() {
        try {
            triquiWServ = new TriquiWebService_Service(new URL(urlTriqui));
            
            triquiWS = triquiWServ.getTriquiWebServicePort();
        } catch (MalformedURLException ex) {
            Logger.getLogger(TriquiWebClient.class.getName()).log(Level.SEVERE,
                                                               null, ex);
        }
    }
    
    public static TriquiWebClient getInstance() {
        if (instance == null) instance = new TriquiWebClient();
        return instance;
    }
    
    public String wave(String name) {
        return triquiWS.hello(name);
    }
    
    public boolean login(String name) {
        return triquiWS.login(name);
    }
    
    public void logout(String name) {
        triquiWS.logout(name);
    }
    
    public void createRoom(String name) {
        triquiWS.createRoom(name);
    }
    
    public String joinRoom(String roomCreator, String joiner) {
        return triquiWS.joinRoom(roomCreator, joiner);
    }
    
    public void leaveRoom(String creator, String playerWantingToLeave) {
        triquiWS.leaveRoom(creator, playerWantingToLeave);
    }
    
    public List<String> getPlayers() {
        return triquiWS.getPlayers();
    }
    
    public List<String> getRooms() {
        return triquiWS.getRooms();
    }
    
    public List<String> getRoomParticipants(String roomCreator) {
        return triquiWS.getRoomParticipants(roomCreator);
    }
    
    public int [][] getGameBoard(String creator) {
        int [][] board = new int[3][3];
        List<IntArray> boardRetrieved = triquiWS.getGameBoard(creator);
        for (int i = 0; i < boardRetrieved.size(); i++) {
            List<Integer> row = boardRetrieved.get(i).getItem();
            for (int j = 0; j < row.size(); j++) {
                board[i][j] = row.get(j);
            }
        }
        return board;
    }
    
    public int getPlayerInTurn(String creator) {
        return triquiWS.getPlayerInTurn(creator);
    }
    
    public boolean play(String creator, boolean userPlayed, int posI, int posJ){
        return triquiWS.play(creator, userPlayed, posI, posJ);
    }
    
    public void playAgain(String creator) {
        triquiWS.playAgain(creator);
    }
}
