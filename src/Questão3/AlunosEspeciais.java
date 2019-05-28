/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questão3;

public class AlunosEspeciais extends Alunos{
    private String DisciplinaG;
    private String DisciplinaPG;
    
    public String getDisciplinaGraduacao() {
    return this.DisciplinaG;
    }
    
    public String getDisciplinaPosGraduacao() {
    return this.DisciplinaPG;
    }
    
    public void setDisciplinaGraduacao(String g) {
    this.DisciplinaG = g;
    }

    public void setDisciplinaPosGraduacao(String p) {
    this.DisciplinaPG = p;
    }
    
    public AlunosEspeciais(int m, String n, int i,String g, String p){
        super(m, n, i);
        this.setDisciplinaGraduacao(g);
        this.setDisciplinaPosGraduacao(p);
    }
}
