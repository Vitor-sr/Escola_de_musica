/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ucb.estudo.poo;

/**
 *
 * @author vitor.hreis
 */
public  abstract class InstrumentosMusicais {
       protected String nome ;
       protected String material;
       
       public InstrumentosMusicais(String nome, String material){
           this.nome = nome;
           this.material = material;
        }
       
       public abstract void tocar();
       
       public void afinar(){
           System.out.println("Afinando "+ getNome());
       };
       public void mostrarInformacoes(){
           System.out.println("O nome do instrumento e "+getNome());
           System.out.println("O material do instrumento e "+getMaterial());
       };

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the material
     */
    public String getMaterial() {
        return material;
    }
}