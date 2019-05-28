/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

public class AlunosGraduação extends Alunos{
private String DisciplinaG;

    public String getDisciplinaGraduacao() {
    return this.DisciplinaG;
    }

    public void setDisciplinaGraduacao(String g) {
    this.DisciplinaG = g;
    }
    
    public AlunosGraduação(int m, String n, int i, String g){
    super(m, n,i);
    this.setDisciplinaGraduacao(g);
    }
}
