/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

public class Alunos {
    
    private int MatriculaA;
    private String NomeA;
    private int IdadeA;
    
    public int getMatriculaAluno(){
    return this.MatriculaA;
    }
    
    public String getNomeAluno(){
    return this.NomeA;
    }
    
    public int getIdadeAluno(){
    return this.IdadeA;
    }
    
    public void setMatriculaAluno(int m){
    this.MatriculaA = m;
    }
    
    public void setNomeAluno(String n){
    this.NomeA = n;
    }
    
    public void setIdadeAluno(int i){
        this.IdadeA = i;
    }
    
    public Alunos(int m, String n, int i){
        this.setMatriculaAluno(m);
        this.setNomeAluno(n);
        this.setIdadeAluno(i);
    }

}
