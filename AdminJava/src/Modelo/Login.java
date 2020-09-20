/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ArtemSupa
 */
public class Login {
    String L_Correo;
    String L_Password;

    public Login() {
    }

    public Login(String L_Correo, String L_Password) {
        this.L_Correo = L_Correo;
        this.L_Password = L_Password;
    }

    public String getL_Correo() {
        return L_Correo;
    }

    public void setL_Correo(String L_Correo) {
        this.L_Correo = L_Correo;
    }

    public String getL_Password() {
        return L_Password;
    }

    public void setL_Password(String L_Password) {
        this.L_Password = L_Password;
    }
    
    
}
