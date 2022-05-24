package Calculadora;

public class Divisao implements Calculo{
    @Override
    public double calcular(Double n1, Double n2) {
        if(n2 == 0){
            System.out.println("Não é possível dividir por 0");
            return 0;
        }
        else {
            return (n1/n2);
        }
    }
}
