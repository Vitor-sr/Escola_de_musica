/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author vitor.hreis
 */
public class Violao extends InstrumentosMusicais{
    protected int numeroDeCordas;
    
    public Violao(String nome, String material, int numeroDeCordas){
        super(nome, material);
        this.numeroDeCordas = numeroDeCordas;
    }
    @Override
    public void tocar() {
        System.out.println("tocando notas suavaes com o "+ nome+ "com "+getNumeroDeCordas()+" cordas");
        System.out.println("Tocando Violão");
        
    }
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Afinando violão");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("numero de cordas "+ getNumeroDeCordas());
    }

    /**
     * @return the numeroDeCordas
     */
    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }
}
