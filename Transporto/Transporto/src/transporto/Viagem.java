/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transporto;

/**
 *
 * @author 15350106651
 */
public class Viagem {
    /*“Destino”, “valorKM”, “valorViagem” e “distancia”*/
    private String destino;
    private float valorKm;
    private float valorViagem;
    private float distancia;

    public Viagem(String destino, float valorKm, float distancia) {
        this.destino = destino;
        this.valorKm = valorKm;
        this.distancia = distancia;
    }

    public void calcularViagem() {
        valorViagem= distancia*valorKm;
    
}     

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public float getValorKm() {
        return valorKm;
    }

    public void setValorKm(float valorKm) {
        this.valorKm = valorKm;
    }

    public float getValorViagem() {
        return valorViagem;
    }

    public void setValorViagem(float valorViagem) {
        this.valorViagem = valorViagem;
    }

    public float getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }
    
    
    
    
    
}
