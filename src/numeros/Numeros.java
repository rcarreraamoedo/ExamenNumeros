package numeros;

/**
 *
 * @author
 */
public class Numeros {

    /**
     * @param args the command line arguments arg[0] es el primer parámetro que
     * se le pasa cuando se ejecuta por linea de comandos
     */
    //Codificado por: sAfOrAs
    //LIstar los numeros según el numero de digitos indicado
    //Considero solo hasta numeros menores a 100000 (5 digitos), 
    //por el hecho de k buscar numeros primos a partir de 6 digitos, el proceso se hace muy lento.
    public static boolean prueba = false;

    public static void main(String arg[]) {
        int NumeroDenominador = 0;
        int numeroDominante = 0;
        NumeroDenominador = Integer.parseInt(arg[0]);
        if (NumeroDenominador <= 0) {
            System.out.println("Ingrese como parámetro, un numero de digitos correcto (mayor que 0): ");
        }
        for (int inicio = 1; inicio <= 99999; inicio++) {
            int divisor = inicio;
            int contador = 0;

            while (divisor != 0) {
                divisor = divisor / 10;
                contador++;
            }
            numeroDominante = contador;

            if (numeroDominante == NumeroDenominador) {
                if (inicio < 4) {
                    prueba = true;
                } else {
                    if (inicio % 2 == 0) {
                        prueba = false;
                    } else {
                        int contadorLectura = 0;
                        int incioLectura = 1;
                        int lectura = (inicio - 1) / 2;
                        if (lectura % 2 == 0) {
                            lectura--;
                        }
                        while (incioLectura <= lectura) {
                            if (inicio % incioLectura == 0) {
                                contadorLectura++;
                            }
                            incioLectura += 2;
                            if (contadorLectura == 2) {
                                incioLectura = lectura + 1;
                            }
                        }

                        if (contadorLectura == 1) {
                            prueba = true;
                        }
                    }
                }

                if (prueba == true) {
                    System.out.println(inicio);
                }
            }
        }
    }
}
