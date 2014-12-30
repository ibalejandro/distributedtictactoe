/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import storage.DataManager;

/**
 *
 * @author Santiago
 */
public class Authentication {
    
    public boolean verifySeudoName(String seudoname) {
        return DataManager.insertPlayer(seudoname);
    }
    
    public void logoutAndRemoveUser(String seudoname) {
        DataManager.removePlayer(seudoname);
    }
}
