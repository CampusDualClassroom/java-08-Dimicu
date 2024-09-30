package com.campusdual.classroom;

public class Exercise08 {

    public static void main(String[] args) {
    whileLoop(15);
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int n2) {
        int n1 = 0;

        while (n1< n2){

            System.out.println(n1+" < "+n2+". El proximo ciclo valdra: " + (n1+1));
            n1++;
        }
    }
}