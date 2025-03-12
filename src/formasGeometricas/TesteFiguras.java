package formasGeometricas;

public class TesteFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(3.0);
        Esfera esfera = new Esfera(5.0);

        System.out.println("Área do círculo: " + String.format("%.2f", circulo.calcularArea()));
        System.out.println("Volume da esfera: " + String.format("%.2f", esfera.calcularVolume()));
    }
}
