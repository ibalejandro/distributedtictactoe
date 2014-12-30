/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import logic.TriquiGame;

/**
 *
 * @author Santiago
 */
public class DataManager {
    
    private static Map<String, Boolean> players = new HashMap<>();
    private static Map<String, TriquiGame> games = new HashMap<>();
    
    public static boolean insertPlayer(String player) {
        if (!players.containsKey(player)) {
            players.put(player, false);
            return true;
        }
        return false;
    }
    
    public static void removePlayer(String player) {
        players.remove(player);
    }
    
    public static void createGame(String player) {
        TriquiGame newGame = new TriquiGame(player);
        newGame.clearBoard();
        games.put(player, newGame);
        setPlayerStatus(player, true);
    }
    
    public static void setPlayerStatus(String player, boolean status) {
        players.put(player, status);
    }
    
    //TODO Para el método de abandonar juego se deben coger los dos (o uno)
    //jugadores que habían en el juego y reinsertarlos al set de players
    
    public static Map<String, Boolean> getPlayers() {
        return players;
    }
    
    public static Map<String, TriquiGame> getRooms() {
        return games;
    }
    
    public static TriquiGame getSpecificGame(String creator){
        return games.get(creator);
    }
    
    public static void insertGame(String creator, TriquiGame game) {
       games.put(creator, game);
    }
    
    public static void removeGame(String creator) {
       games.remove(creator);
    }
}
