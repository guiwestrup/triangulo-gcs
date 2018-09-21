
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Triangulo {


    private double a;
    private double b;
    private double c;
    private double hipotenusa;



    private List<String> propriedades;



    public Triangulo(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;

        // assim que inicializado, ja é feito o primeiro calculo
        calcularValores();

    }

    // ---------------- Getters e Setters ---------------- //
    public double geta() {
        return a;
    }

    // a cada alteração das variaveis, o programa calcula o valor da hipotenusa
    // e as propriedades
    public void seta(double a) {
        this.a = a;
        calcularValores();
    }

    public double getb() {
        return b;
    }

    public void setb(double b) {
        this.b = b;
        calcularValores();
    }

    public double getc() {
        return c;
    }

    public void setc(double c) {
        this.c = c;
        calcularValores();
    }

    public double getHipotenusa() {
        return hipotenusa;
    }

    public List<String> getPropriedades() {
        return propriedades;
    }

    private void calcularValores() {
        calculateHipotenusa();
        calculatePropriedades();
    }

    private void calculateHipotenusa() {
        hipotenusa = a;

        if (hipotenusa < b) {

            hipotenusa = b;
        }

        if (hipotenusa < c) {

            hipotenusa = c;
        }
    }

    // calcula as propriedades do triangulo
    private void calculatePropriedades() {
        propriedades = new ArrayList();

        if ((a + b + c - hipotenusa) > hipotenusa) {

            propriedades.add("Válido");
            if (a == b || b == c || c == a) {

                if (a == b && b == c) {

                    propriedades.add("Equilátero");

                } else {

                    propriedades.add("Isósceles");

                }
            }

            if (a != b && b != c && c != a) {

                propriedades.add("Escaleno");

            }

            if (((a * a + b * b + c * c) - hipotenusa * hipotenusa) == hipotenusa * hipotenusa) {

                propriedades.add("Retângulo");

            }

        } else {

            propriedades.add("Inválido");

        }
    }


}
