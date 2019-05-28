/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão1;

/**
 *
 * @author rafae
 */
public class Empregado extends Pessoa{
    
    private String CodigoSetorE;
    private double SalarioBaseE;
    private double ImpostoE; 
 
    public String getCodigoSetor(){
    return this.CodigoSetorE;    
    }
    
    public double getSalarioBaseE(){
    return this.SalarioBaseE;    
    }
    
    public double getImpostosE(){
    return this.ImpostoE;    
    }
    
    public void setCodigoSetorE(String c){
    this.CodigoSetorE = c;
    }
    
    public void setSalarioBaseE(double b){
    this.SalarioBaseE = b;
    }
    
    public void setImpostoE(double i){
    this.ImpostoE = i;
    }  
    
    public double CalcularSalario(double s){
    s = this.getSalarioBaseE() - (this.getSalarioBaseE() / 100 * this.getImpostosE());
    return s;
    }
    
    public Empregado(String n, String e, String t,String c, double b, double i){
    super(n, e, t);
    this.setCodigoSetorE(c);
    this.setSalarioBaseE(b);
    this.setImpostoE(i);
    }
    public void Mostrar(){
    System.out.println("Nome: " + this.getNomeP());
    System.out.println("Endereço: " + this.getEndereçoP());
    System.out.println("Telefone: " + this.getTelefoneP());
    System.out.println("Código Setor: " + this.getCodigoSetor());
    System.out.println("Salário Base: " + this.getSalarioBaseE());
    System.out.println("Imposto: " + this.getImpostosE());
    System.out.println("Salário: " + this.CalcularSalario(ImpostoE));
    }
}
