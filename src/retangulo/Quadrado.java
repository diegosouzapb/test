package retangulo;

/*
 *  the derived class Quadrado can't be replaced by its
 *  base class Retangulo because the relationship "Is-A" refers to
 *  behavior rather than composition
 */
public class Quadrado extends Retangulo {
    public void setAltura(int altura) {
        setLado(altura);
    }
    public void setComprimento(int comprimento) {
        setLado(comprimento);
    }
    private void setLado(int lado) {
        this.altura = lado;
        this.comprimento = lado;
    }
}