

public class Ej5Areas {

    public static void main(String[] args) {
        
    }

    
    public interface Poligono {
    
        double calculaAreas();
    }
    // Implementación de la clase Triangulo que implementa la interfaz Poligono
    class Triangulo implements Poligono {
    double base;
    double altura;

    Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaAreas() {
        return (base*altura)/2;
    }
    }

    class Rectangulo implements Poligono {
        double base;
        double altura;
       
        Rectangulo(double base, double altura) {
            this.base = base;
            this.altura = altura;
        }

        public double calculaAreas() {
            return (base*altura);
        }
    }

    class Cuadrado implements Poligono {
        double lado;
       
        Cuadrado(double lado) {
            this.lado = lado;
        }

        public double calculaAreas() {
            return (lado*lado);
        }
    }

}
