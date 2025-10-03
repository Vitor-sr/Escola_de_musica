/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author vitor.hreis
 */
public class Saxofone extends InstrumentosMusicais {
     protected String tipo;
    
    public Saxofone(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }
    @Override
    public void tocar() {
        System.out.println("Tocando jazz suave no  "+ super.getNome()+ "  "+tipo);
        System.out.println("Tocando Saxofone");
        
    }
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando saxofone");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("tipo é de  "+ tipo);
    }

    public String GetTipo() {
        return tipo;
    }
}
