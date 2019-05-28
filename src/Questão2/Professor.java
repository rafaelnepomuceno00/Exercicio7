/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão2;

public class Professor {
    private String NomeP;
    private int IdadeP;
    private int MatriculaP;
    
    public String getNomeP(){
    return this.NomeP;
    }
    
    public int getIdadeP(){
    return this.IdadeP;
    }
    
    public int getMatriculaP(){
    return this.MatriculaP;
    }
    
    public void setNomeProfessor(String n){
    this.NomeP = n;
    }
    
    public void setIdadeProfessor(int i){
    this.IdadeP = i;
    }
    
    public void setMatriculaProfessor(int m){
    this.MatriculaP = m;
    }
    
    public Professor(String n, int i, int m){
    this.setNomeProfessor(n);
    this.setIdadeProfessor(i);
    this.setMatriculaProfessor(m);
    }
}    

