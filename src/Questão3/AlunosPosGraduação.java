/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

public class AlunosPosGraduação extends Alunos{
 
 private String DisciplinaPG;
    
    public String getDisciplinaPosGraduacao() {
    return this.DisciplinaPG;
    }

    public void setDisciplinaPosGraduacao(String p) {
    this.DisciplinaPG = p;
    }
    
    private AlunosPosGraduação(int m, String n, int i, String p){
    super(m, n, i);
    this.setDisciplinaPosGraduacao(p);
    }   
}
