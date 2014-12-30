/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;
import java.util.Map;
import storage.DataManager;

/**
 *
 * @author Santiago
 */
public class GameManager {
    
    private static final int WAITING_FOR_OPPONENT = 0;
    private static GameManager instance = null;
    
    private GameManager() {
        
    }
    
    public static GameManager getInstance() {
        if (instance == null) instance = new GameManager();
        return instance;
    }
    
    public void createRoom(String seudoname) {
        DataManager.createGame(seudoname);
    }
    
    public String joinRoom(String roomCreator, String joiner) {
        TriquiGame gameToJoin = DataManager.getSpecificGame(roomCreator);
        if (gameToJoin == null) {
            System.err.println("Nulito el gameToJoin");
        }
        else {
            if (gameToJoin.getPlayer1() != null && gameToJoin.getPlayer2()== null) {
                gameToJoin.setPlayer2(joiner);
                DataManager.setPlayerStatus(joiner, true);
                DataManager.insertGame(roomCreator, gameToJoin);
                return gameToJoin.getPlayer1();
            }
        }
        return null;
    }
    
    public void leaveRoom(String creator, String playerWantingToLeave) {
        TriquiGame gameToLeave = DataManager.getSpecificGame(creator);
        if(gameToLeave.getPlayer2() == null) {
            DataManager.removeGame(creator);
            DataManager.setPlayerStatus(creator, false);
        }
        else if(gameToLeave.getPlayer1().equals(playerWantingToLeave)) {
            String newCreator = gameToLeave.getPlayer2();
            gameToLeave.setPlayer1(newCreator);
            gameToLeave.setPlayer2(null);
            gameToLeave.clearBoard();
            DataManager.removeGame(creator);
            DataManager.insertGame(newCreator, gameToLeave);
            DataManager.setPlayerStatus(creator, false);
        }
        else { //El oponente es quien desea abandonar la partida.
            gameToLeave.setPlayer2(null);
            gameToLeave.clearBoard();
            DataManager.insertGame(creator, gameToLeave);
            DataManager.setPlayerStatus(playerWantingToLeave, false);
        }
    }
    
    public ArrayList<String> getPlayers() {
        Map<String, Boolean> playersSet = DataManager.getPlayers();
        ArrayList<String> players = new ArrayList<>();
        for (Map.Entry<String, Boolean> player : playersSet.entrySet()) {
            if (!player.getValue()) { //Si el jugador no está en una sala
                players.add(player.getKey());
            }
        }
        return players;
    }
    
    public ArrayList<String> getRooms() {
         Map<String, TriquiGame> playersSet = DataManager.getRooms();
         ArrayList<String> games = new ArrayList<>();
         for (TriquiGame game : playersSet.values()) {
             String roomName = game.getPlayer1();
             if (game.getPlayer2() != null) 
                 roomName += (" vs. " + game.getPlayer2());
             else roomName += " waiting for opponent...";
             games.add(roomName);
         }
         return games;
    }
    
    public ArrayList<String> getRoomParticipants(String roomCreator) {
        TriquiGame triquiGame = DataManager.getSpecificGame(roomCreator);
        ArrayList<String> participants = new ArrayList<>(2);
        if (triquiGame != null) {
            participants.add(triquiGame.getPlayer1());
            participants.add(triquiGame.getPlayer2());
        }
        return participants;
    }
    
    public int [][] getGameBoard(String roomCreator) {
        TriquiGame triquiGame = DataManager.getSpecificGame(roomCreator);
        if (triquiGame != null) {
            int [][] board = triquiGame.getBoard();
            if (board != null) return board;
        }
        return null;
    }
    
    public int getPlayerInTurn(String roomCreator) {
        TriquiGame triquiGame = DataManager.getSpecificGame(roomCreator);
        if (triquiGame != null) {
            if (triquiGame.getPlayer1() != null &&
                triquiGame.getPlayer2() == null) {
                return WAITING_FOR_OPPONENT;
            }
            else return triquiGame.getTurn();
        }
        return -1;
    }
    
    public boolean play(String creator, boolean userPlayed, int posI, int posJ){
        TriquiGame triquiGame = DataManager.getSpecificGame(creator);
        if (triquiGame != null) {
            return triquiGame.play(userPlayed, posI, posJ);
        }
        return false;
    }
    
    public void playAgain(String creator) {
        TriquiGame triquiGame = DataManager.getSpecificGame(creator);
        if (triquiGame != null) {
            triquiGame.clearBoard();
        }
    }
}
