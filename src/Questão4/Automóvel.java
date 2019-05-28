/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão4;

public class Automóvel extends Terrestres{
    
    private String Nome;
    private String Cor;
    private int Portas;
    private String Placa;
    
    public String getNome(){
    return this.Nome;
    }
    
    public String getCor(){
    return this.Cor;
    }
    
    public int getPortas(){
    return this.Portas;
    }
    
    public String getPlaca(){
    return this.Placa;
    }
    
    public void setNome(String n){
    this.Nome = n;
    }
    
    public void setCor(String cor){
    this.Cor = cor;
    }
    
    public void setPortas(int p){
    this.Portas = p;
    }
    
    public void setPlaca(String pla){
    this.Placa = pla;
    }
    
    public Automóvel(double c, int r, String n, String cor, int p, String pla){
        super(c, r);
        this.setNome(n);
        this.setCor(cor);
        this.setPortas(p);
        this.setPlaca(pla);
    }
}
