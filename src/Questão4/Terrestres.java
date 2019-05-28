/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão4;


public class Terrestres extends Transportes{
   private int Rodas;
    
    public int getRodas(){
    return this.Rodas;
    }
    
    public void setRodas(int r){
    this.Rodas = r;
    }
    
    public Terrestres(double c, int r){
    super(c);
    this.setRodas(r);
    }
}  
