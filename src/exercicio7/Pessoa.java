/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio7;

/**
 *
 * @author ifnmg
 */
public final class Pessoa {
    private String nomeP;
    private String endereçoP;
    private int telefoneP;
    
    public String getNomeP(){
    return this.nomeP;    
    }
    
    public String getEndereçoP(){
    return this.endereçoP;    
    }
    
    public int getTelefoneP(){
    return this.telefoneP;    
    }
 
    public void setNomeP(String n){
    this.nomeP = n;
    }
    
    public void setEndereçoP(String e){
    this.endereçoP = e;
    }
    public void setTelefoneP(int t){
    this.telefoneP = t;
    }
 
    public Pessoa(String n,String e, int t){
    this.setNomeP(n);
    this.setEndereçoP(e);
    this.setTelefoneP(t);
    }   

    public void MostrarP (){
        System.out.println("Nome: " +this.getNomeP());
        System.out.println("Endereçõ: " +this.getEndereçoP());
        System.out.println("Telefone: " +this.getTelefoneP());
    }
}