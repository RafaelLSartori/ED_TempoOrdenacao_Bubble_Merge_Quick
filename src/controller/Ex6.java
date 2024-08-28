package controller;
import br.edu.fateczl.bubble.BubbleSort;
import br.edu.fateczl.quicksort.Ordenacao_QuickSort;
import br.edu.fateczl.sort.Ordenacao;

public class Ex6 {
	public Ex6() {
		super();
	}
	
	public void sort(int[] vet) {
		BubbleSort bubble = new BubbleSort();
		Ordenacao merge = new Ordenacao();
		Ordenacao_QuickSort quick = new Ordenacao_QuickSort();
		
		int inicio = 0;
		int tamanho = vet.length - 1;
		
		//BubbleSort
		double tempoInicial = System.nanoTime();
		bubble.bubbleSort(vet);
		double tempoFinal = System.nanoTime();
        double tempoTotal = tempoFinal - tempoInicial;
        tempoTotal = tempoTotal / Math.pow(10,9);		
        System.out.println("Tempo gasto com o BubbleSort " + tamanho + " posições: " + tempoTotal + "s");
        System.out.println(" ");
        System.out.println("-----------------------");
        
        //MergeSort
        double tempoInicial1 = System.nanoTime();
		merge.mergeSort(vet, inicio, tamanho);
		double tempoFinal1 = System.nanoTime();
        double tempoTotal1 = tempoFinal1 - tempoInicial1;
        tempoTotal1 = tempoTotal1 / Math.pow(10,9);		
        System.out.println("Tempo gasto com o MergeSort " + tamanho + " posições: " + tempoTotal1 + "s");
        System.out.println(" ");
        System.out.println("-----------------------");
        
        //QuickSort
        double tempoInicial2 = System.nanoTime();
		quick.quickSort(vet, inicio, tamanho);
		double tempoFinal2 = System.nanoTime();
        double tempoTotal2 = tempoFinal2 - tempoInicial2;
        tempoTotal2 = tempoTotal2 / Math.pow(10,9);		
        System.out.println("Tempo gasto com o QuickSort " + tamanho + " posições: " + tempoTotal2 + "s");        
        System.out.println(" ");
        System.out.println("-----------------------");
              		
	}
}
