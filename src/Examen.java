public class Examen {
    public static void main(String[] args) {
        double p1 = 12.5;
        double u1 = 4;
        double t1 = p1 * u1;
        double d1 = t1 * 10 / 100;
        double f1 = t1 - d1;
        System.out.println("Pedido 1: " + f1 + " euros");
        double p2 = 8.0;
        double u2 = 5;
        double t2 = p2 * u2;
        double d2 = t2 * 10 / 100;
        double f2 = t2 - d2;
        System.out.println("Pedido 2: " + f2 + " euros");
        double plazo = (f1 + f2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (u1 + u2) / 2;
        System.out.println("Media de unidades por pedido: " + m);
    }
}

//en la seccion del primer pedido no habia nada que corregir ya que el resultado era el mismo que en el pdf del examen,
//en el pedido2 he corregido la operacion de "double t2 = pedido2 * u2;" la cual era una suma en lugar de una multiplicacion,
//en el pago de cada plazo faltaba poner la suma de f1 y f2 entre parentesis para que se hicieran antes que la division
// double plazo = (f1 + f2) / 3; y en los datos de unidades 1 y 2 los he cambiado de int a double pàra que pudieran da 4.5 en vez de 4.0

//