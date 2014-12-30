/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triqui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import views.TriquiPlayerLobby;
import web.TriquiWebClient;

/**
 *
 * @author Santiago
 */
public class TriquiPlayerGame {
    
    private final TriquiWebClient triquiClient;
    private final JFrame lobbyView;
    private String seudoname;
    private boolean insideRoom;
    
    public TriquiPlayerGame(JFrame lobbyView) {
        this.lobbyView = lobbyView;
        triquiClient = TriquiWebClient.getInstance();
        insideRoom = false;
    }
    
    public void logOut() {
        if (seudoname != null) {
            triquiClient.logout(seudoname);
        }
    }
    
    public void createRoom() {
        if (seudoname != null) triquiClient.createRoom(seudoname);
    }
    
    public String joinRoom(String roomName) {
        if (roomName == null) return null;
        String roomCreator = roomName.split(" ")[0];
        return triquiClient.joinRoom(roomCreator, seudoname);
    }
    
    public void leaveRoom(String creator, String playerWantingToLeave){
        triquiClient.leaveRoom(creator, playerWantingToLeave);
    }
    
    public ArrayList<String> getPlayers() {
        return (ArrayList<String>) triquiClient.getPlayers();
    }
    
    public ArrayList<String> getRooms() {
        return (ArrayList<String>) triquiClient.getRooms();
    }
    
    public void setSeudoname(String seudoname) {
        this.seudoname = seudoname;
    }
    
    public String getSeudoname() {
        return this.seudoname;
    }
    
    public JFrame getLobbyView() {
        return this.lobbyView;
    }

    public boolean isInsideRoom() {
        return insideRoom;
    }

    public void setInsideRoom(boolean insideRoom) {
        this.insideRoom = insideRoom;
    }
    
    public void showLobbyFrame(JFrame gameView) {
        TriquiPlayerLobby lobbyView = (TriquiPlayerLobby) getLobbyView();
        lobbyView.setVisible(true);
        lobbyView.setLocationRelativeTo(gameView);
        lobbyView.updateLoop();
    }
    
    public String [] getRoomParticipants(String roomCreator) {
        String [] participants = new String[2];
        List<String> participantsRetrieved = triquiClient
            .getRoomParticipants(roomCreator);
        if (participantsRetrieved.size() > 0)
            participants[0] = participantsRetrieved.get(0);
        else participants[0] = null;
        if (participantsRetrieved.size() > 1)
            participants[1] = participantsRetrieved.get(1);
        else participants[1] = null;
        return participants;
    }
    
    public int [][] getGameBoard(String creator) {
        return triquiClient.getGameBoard(creator);
    }
    
    public int getPlayerInTurn(String creator) {
        return triquiClient.getPlayerInTurn(creator);
    }
    
    public boolean play(String creator, boolean userPlayed, int posI, int posJ){
        return triquiClient.play(creator, userPlayed, posI, posJ);
    }
    
    public void playAgain(String creator) {
        triquiClient.playAgain(creator);
    }
}
