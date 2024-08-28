package view;

import controller.Ex6;

public class Main {
	public static void main(String[] args) {
		Ex6 m = new Ex6();
		
		int vet[] = new int[1500];
		
		for (int i = 0; i < 1500; i++) {
			vet[i] = (int) ((Math.random()* 100) + 1);
		}
		
		m.sort(vet);
	}
}
