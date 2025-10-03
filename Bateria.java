/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author vitor.hreis
 */
public class Bateria extends InstrumentosMusicais {
     protected int numeroDePecas;
    
    public Bateria(String nome, String material, int numeroDePecas){
        super(nome, material);
        this.numeroDePecas = numeroDePecas;
    }
    @Override
    public void tocar() {
        System.out.println("fazendo barulho no "+ nome + " com  "+numeroDePecas+" pecas");
        System.out.println("Tocando BAteria: BoM! tiss");
        
    }
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando pecas");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Numero de pecas:  "+ numeroDePecas);
    }

    public int GetNumeroDePecas() {
        return numeroDePecas;
    }
}
