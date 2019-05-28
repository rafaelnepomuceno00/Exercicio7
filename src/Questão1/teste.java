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
public class teste {
    public static void main(String[] args) {
    
    Pessoa p1 = new Pessoa("AAAA", "asdas", "56456");
    Fornecedor f1 = new Fornecedor("dasd", " dasdasd ", "454545", 2000.00, 1200.00);
    Empregado e1 = new Empregado(" dasdas", "dasdasdiro", "34564151", "d1", 1200, 20);
        

    e1.Mostrar();
    p1.MostrarP();
    f1.Mostrar();
    }   
}
