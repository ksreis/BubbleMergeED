package View;
import java.util.Arrays;
import EdKreis.Operacao.MergeSort;
import EdKreis.Operacoes.BubbleSort;
import Controller.Calc;

public class Principal {
	
    public static void main(String[] args) {
        int[] array = {5, 2, 8, 4, 1, 3, 9, 6, 7};
        System.out.println("Array desordenado: " + Arrays.toString(array));

        Calc calc = new Calc();
        calc.operacao(array);
    }
}