/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import web.TriquiWebClient;

/**
 *
 * @author Santiago
 */
public class SeudonameSelector {
    
    public static final int NEW_NICKNAME = 0;
    public static final int INVALID_NICKNAME = 1;
    public static final int USED_NICKNAME = 2;
    
    /* Retorna:
       -1 si es inválido el nombre.
       -2 si el nombre ya existe.
    */
    public static String selectSeudoname(JFrame frame, int option) {
        String message;
        int type;
        if (option == INVALID_NICKNAME) { //Invalid nickname
            message = "Your nickname is not valid, please try another";
            type = JOptionPane.ERROR_MESSAGE;
        }
        else if (option == USED_NICKNAME) {
            message = "This nickname already exists, please try another";
            type = JOptionPane.INFORMATION_MESSAGE;
        }
        else {
            message = "Select your nickname (No spaces)";
            type = JOptionPane.QUESTION_MESSAGE;
        }
        String seudoname = JOptionPane.showInputDialog(frame,
                                       message,
                                       "Welcome to Triqui",
                                       type);
        if (seudoname == null) return null;
        seudoname = seudoname.trim();
        if (seudoname.isEmpty()) return "-1";
        if (seudoname.contains(" ")) return "-1";
        TriquiWebClient triquiClient = TriquiWebClient.getInstance();
        return triquiClient.login(seudoname) ? seudoname : "-2";
    }           
}
