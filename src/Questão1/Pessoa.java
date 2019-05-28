/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author ifnmg
 */
public class Pessoa {
    private String nomeP;
    private String endereçoP;
    private String telefoneP;
    
    public String getNomeP(){
    return this.nomeP;    
    }
    public String setNomeP(String n){
    return this.nomeP = n;    
    }
    public String getEndereçoP(){
    return this.endereçoP;    
    }
    public void setEndereçoP(String e){
    this.endereçoP = e;
    }    
    public String getTelefoneP(){
    return this.telefoneP;    
    }
    public void setTelefoneP(String t){
    this.telefoneP = t;
    } 

    public Pessoa(String n,String e, String t){
    this.setNomeP(n);    
    this.setEndereçoP(e);
    this.setTelefoneP(t);
    }   

    public void MostrarP (){
        System.out.println("Nome: " +this.getNomeP());
        System.out.println("Endereço: " +this.getEndereçoP());
        System.out.println("Telefone: " +this.getTelefoneP());
    }
}