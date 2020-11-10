/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dasar;

public class game {
    public static void main(String[]args){
        player petani = new player();
        
        petani.name="petani code";
        petani.speed=75;
        petani.healthPoint=100;
        
        petani.run();
        if(petani.isDead()) {
            System.out.println("Game Over!");
        }    
    }
}
