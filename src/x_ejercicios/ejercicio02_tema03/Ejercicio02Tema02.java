package x_ejercicios.ejercicio02_tema03;

import java.util.Scanner;

public class Ejercicio02Tema02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dime un número para calcular el 21% de IVA: ");
        int numero = scanner.nextInt();
        System.out.println("El total es: " + sumaIva(numero));
    }

    public static double sumaIva(double iva) {
        double numero = iva;
        iva *= 0.21;
        iva += numero;
        return iva;
    }
}
