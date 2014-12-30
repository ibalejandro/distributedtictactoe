/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservices;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import logic.Authentication;
import logic.GameManager;

/**
 *
 * @author Santiago
 */
@WebService(serviceName = "TriquiWebService")
public class TriquiWebService {
    
    private final Authentication authLogic = new Authentication();
    private final GameManager gameManager = GameManager.getInstance();
    
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "seudoname") String seudoname) {
        return authLogic.verifySeudoName(seudoname);
    }
    
    @WebMethod(operationName = "logout")
    public void logout(@WebParam(name = "logout") String seudoname) {
        authLogic.logoutAndRemoveUser(seudoname);
    }
    
    @WebMethod(operationName = "createRoom")
    public void createRoom(@WebParam(name = "seudoname") String seudoname) {
        gameManager.createRoom(seudoname);
    }
    
    @WebMethod(operationName = "joinRoom")
    public String joinRoom(@WebParam(name = "creator") String creator,
                           @WebParam(name = "joiner") String joiner) {
        return gameManager.joinRoom(creator, joiner);
    }
    
    @WebMethod(operationName = "leaveRoom")
    public void leaveRoom(@WebParam(name = "creator") String creator,
        @WebParam(name = "playerWantingToLeave") String playerWantingToLeave) {
        gameManager.leaveRoom(creator, playerWantingToLeave);
    }
    
    @WebMethod(operationName = "getPlayers")
    public ArrayList<String> getPlayers() {
        return gameManager.getPlayers();
    }
    
    @WebMethod(operationName = "getRooms")
    public ArrayList<String> getRooms() {
        return gameManager.getRooms();
    }
    
    @WebMethod(operationName = "getRoomParticipants")
    public ArrayList<String> getRoomParticipants(@WebParam(name = "creator")
                                                 String creator) {
        return gameManager.getRoomParticipants(creator);
    }
    
    @WebMethod(operationName = "getGameBoard")
    public int [][] getGameBoard(@WebParam(name = "gameCreator")
                                                 String gameCreator) {
        return gameManager.getGameBoard(gameCreator);
    }
    
    @WebMethod(operationName = "getPlayerInTurn")
    public int getPlayerInTurn(@WebParam(name = "gameCreator")
            String gameCreator) {
        return gameManager.getPlayerInTurn(gameCreator);
    }
    
    @WebMethod(operationName = "play")
    public boolean play(@WebParam(name = "creator") String creator,
                        @WebParam(name = "userPlayed") boolean userPlayed,
                        @WebParam(name = "posI") int posI,
                        @WebParam(name = "posJ") int posJ) {
        return gameManager.play(creator, userPlayed, posI, posJ);
    }
    
    @WebMethod(operationName = "playAgain")
    public void playAgain(@WebParam(name = "gameCreator") String gameCreator) {
        gameManager.playAgain(gameCreator);
    }
}
