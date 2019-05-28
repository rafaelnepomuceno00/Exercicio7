/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão4;

public class Transportes {
    private double Capacidade;
  
    public double getCapacidade(){
    return this.Capacidade;
    }
    
    public void setCapacidade(double c){
    this.Capacidade = c;
    }
    
    public Transportes(double c){
    this.setCapacidade(c);
    }
}
