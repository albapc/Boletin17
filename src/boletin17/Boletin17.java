
package boletin17;

public class Boletin17 {

    public static void main(String[] args) {
        Avestruz av = new Avestruz();
        av.caminar();
        
        Aves av1 = new Aves();
        av1.caminar();
        av1.voar();
        
        Felino fel = new Felino();
        fel.caminar();
        fel.nadar();
        
        Gato gat = new Gato();
        gat.caminar();
        gat.nadar();
        
        Mamifero mam = new Mamifero();
        mam.caminar();
        
        Morcego mor = new Morcego();
        mor.caminar();
        mor.voar();
        
        Papagaio pap = new Papagaio();
        pap.caminar();
        pap.voar();
        
        Tigre tig = new Tigre();
        tig.caminar();
        tig.nadar();
    }
    
}
