package Controller;
import java.util.Arrays;

import EdKreis.Operacao.MergeSort;
import EdKreis.Operacoes.BubbleSort;

public class Calc {
	public Calc() {
		super();
	}
	
	public void operacao(int[] array) {
		BubbleSort bubble = new BubbleSort();
		MergeSort merge = new MergeSort();
		
		int[] arrayBubble = Arrays.copyOf(array, array.length);
		bubble.bubbleSort(arrayBubble);
		System.out.println("Array ordenado pelo Bubble Sort: " + Arrays.toString(arrayBubble));

		int[] arrayMerge = Arrays.copyOf(array, array.length);
		merge.mergeSort(arrayMerge, 0, arrayMerge.length-1);
		System.out.println("Array ordenado pelo Merge Sort: " + Arrays.toString(arrayMerge));		
	}

}
  