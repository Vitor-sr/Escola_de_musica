/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ucb.estudo.poo;
/**
 *
 * @author vitor.hreis
 */
public class EscolaDeMusica {
    public static void main(String[] args) {
        InstrumentosMusicais[] banda = new InstrumentosMusicais[4];
        banda[0] = new Violao("Violao","Madeira",5);
        banda[1] = new Bateria("Bateria","Plastico",10);
        banda[2] = new Piano("Piano", "Marfim", 26);
        banda[3] = new Saxofone("Saxofone", "Metal","Agudo");
        EscolaDeMusica escola = new EscolaDeMusica();
        System.out.println("Iniciar Orquestra");
        escola.apresentar(banda);
        
    }
    public void apresentar(InstrumentosMusicais[] banda){
        
        System.out.println("====A ORQUESTRA VAI COMECAR!!!!!======");
        System.out.println("Afinando INstrumentos...");
        for (InstrumentosMusicais instrumento:banda){
            instrumento.afinar();
        }
        System.out.println("Tocando Instrumentos...");
        for (InstrumentosMusicais instrumento:banda){
            instrumento.tocar();
        }
        System.out.println("Mostrando Informacoes dos Instrumentos...");
        for (InstrumentosMusicais instrumento:banda){
            instrumento.mostrarInformacoes();
        }
        System.out.println("====FIM DA ORQUESTRA======");
    }
    public void contarInstrumentoPorTipo(InstrumentosMusicais[] instrumentos){
        int violoes = 0, pianos =0, baterias = 0, saxofones = 0, outros =0;
        for (InstrumentosMusicais instrumento:instrumentos){
            if(instrumento instanceof Violao ){
                violoes++;
            }else if (instrumento instanceof Piano ){
                pianos++;
            }else if (instrumento instanceof Bateria ){
                baterias++;
            }else if (instrumento instanceof Saxofone ){
                saxofones++;
            }else{
                outros++;
            }
        }
        System.out.println("Existem "+violoes+" Violoes e "+pianos+" Pianos e "+ baterias+" Baterias e "+ saxofones+"Saxofones e "+outros +"outros");
    }
}
