/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author vitor.hreis
 */
public class Piano extends InstrumentosMusicais {
     protected int numeroDeTeclas;
    
    public Piano(String nome, String material, int numeroDeTeclas){
        super(nome, material);
        this.numeroDeTeclas = numeroDeTeclas;
    }
    @Override
    public void tocar() {
        System.out.println("bela melodia no "+ nome + " com  "+numeroDeTeclas+" teclas");
        System.out.println("Tocando Piano");
        
    }
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando piano");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Numero de teclas:  "+ numeroDeTeclas);
    }

    public int GetNumeroDeTeclas() {
        return numeroDeTeclas;
    }
}
