/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

public class ProfessorHorista extends Professor{

    private double SalarioBasePH;
    private int HorasAula;
    
    public double getSalarioBasePH(){
    return this.SalarioBasePH;
    }
    
    public int getHorasAula(){
    return this.HorasAula;
    }
    
    public void setSalarioBasePH(double b){
    this.SalarioBasePH = b;
    }
    
    public void setHorasAula(int h){
    this.HorasAula = h;
    }
    
    public double SalarioPH(double s){
    s = this.getHorasAula() * this.getSalarioBasePH();
    return s;
    }
    
    public ProfessorHorista(String n, int i, int m, int h,double b){
        super(n, i, m);
        this.setHorasAula(h);
        this.setSalarioBasePH(b);
    }
    
    public void Mostrar(){
        System.out.println("Nome: " + this.getNomeP());
        System.out.println("Idade: " + this.getIdadeP());
        System.out.println("Matricula: " + this.getMatriculaP());
        System.out.println("Salário: " + this.getSalarioBasePH());
        System.out.println("Horas p/ Aula: " + this.getHorasAula());
        System.out.println("Salário: " + this.SalarioPH(SalarioBasePH));
    }
}