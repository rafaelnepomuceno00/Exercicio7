/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

public class ProfessorIntegral extends Professor{
    private double SalarioPI;
    
    public double getSalarioProfessorIntegral(){
    return this.SalarioPI;
    }
    
    public void setSalarioProfessorIntegral(double s){
    this.SalarioPI = s;
    }
    public ProfessorIntegral(String n, int i, int m, double s ) {
    super(n, i, m);
    }
    public void Mostrar(){
    System.out.println("Nome: " + this.getNomeP());
    System.out.println("Idade: " + this.getIdadeP());
    System.out.println("Matricula: " + this.getMatriculaP());
    System.out.println("Salário: " + this.getSalarioProfessorIntegral());
    }
}
