/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Scanner;

/**
 *
 * @author 1895718
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Bonjour");
        // Demander la saisie du nom de l'utilisateur
        System.out.println("Veuillez SVP saisir votre nom");
        Scanner readln = new Scanner(System.in);
        String nom = readln.next();
        // Affichage du nom de l'utilisateur
        System.out.println(nom);
    }
    
}
