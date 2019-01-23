
package boletin17;

public class Aves implements IPodeCaminar, IPodeVoar {
    public void caminar(){
        System.out.println("As aves poden camiñar");
    }
    public void voar(){
        System.out.println("As aves poden voar");
    }
}