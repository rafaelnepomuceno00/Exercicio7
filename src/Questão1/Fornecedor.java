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
public class Fornecedor extends Pessoa{
    private double ValorDeCredito;
    private double ValorDaDivida;
 
    
    public double getValorDeCredito(){
    return this.ValorDeCredito;
    }
    
    public double getValorDaDivida(){
    return this.ValorDaDivida;
    }
    
    public void setValorDeCredito(double c){
    this.ValorDeCredito = c;
    }
    
    public void setValorDaDivida(double d){
    this.ValorDaDivida = d;
    }
    
    public double ObterSaldo(double s){
    s = this.getValorDeCredito()- this.getValorDaDivida();
    return s;
    }
     
    public Fornecedor(String n, String e, String t, double c, double d){
    super(n, e, t);
    this.setValorDeCredito(c);
    this.setValorDaDivida(d);
    }   

   public void Mostrar(){
   System.out.println("Nome: " + this.getNomeP());
   System.out.println("Endereço: " + this.getEndereçoP());
   System.out.println("Telefone: " + this.getTelefoneP());
   
   System.out.println("Valor De Crédito: " + this.getValorDeCredito());
   System.out.println("Valor Da Dívida: " + this.getValorDaDivida());
   System.out.println("Saldo: " + this.ObterSaldo(ValorDaDivida));
   }
}
