public class Examen {
    public static void main(String[] args) {
        double pedido1 = 12.5;
        double unidad1 = 4;
        double calcularDescuento1 = calcularDescuento(pedido1, unidad1);
        System.out.println("Pedido 1: " + calcularDescuento1 + " euros");
        double pedido2 = 8.0;
        double unidad2 = 5;
        double final2 = calcularDescuento(pedido2, unidad2);
        System.out.println("Pedido 2: " + final2 + " euros");
        double plazo = (calcularDescuento1 + final2) / 3;
        System.out.println("Pago de cada plazo (3 plazos): " + plazo + " euros");
        double m = (unidad1 + unidad2) / 2;
        System.out.println("Media de unidades por pedido: " + m);
    }

    private static double calcularDescuento(double pedido1, double unidad1) {
        double total1 = pedido1 * unidad1;
        double descuento1 = total1 * 10 / 100;
        double calcularDescuento1 = total1 - descuento1;
        return calcularDescuento1;
    }
}

//en la seccion del primer pedido no habia nada que corregir ya que el resultado era el mismo que en el pdf del examen,
//en el pedido2 he corregido la operacion de "double t2 = pedido2 * u2;" la cual era una suma en lugar de una multiplicacion,
//en el pago de cada plazo faltaba poner la suma de f1 y f2 entre parentesis para que se hicieran antes que la division
// double plazo = (f1 + f2) / 3; y en los datos de unidades 1 y 2 los he cambiado de int a double pàra que pudieran da 4.5 en vez de 4.0

//