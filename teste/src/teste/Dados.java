package teste;

import java.util.*;

public class Dados {

	public static void main(String[] args) {
		
		Random rand = new Random();
		

		Map<Integer,Integer>facesDados = new HashMap<Integer,Integer>(){{
		
			put(1,0);
			put(2,0);
			put(3,0);
			put(4,0);
			put(5,0);
			put(6,0);
			
		}};
	
		for(int x = 0; x < 100; x++) {
			Integer lado = rand.nextInt(6)+1;
			for(Map.Entry<Integer,Integer> entry : facesDados.entrySet()) {
				if(entry.getKey() == lado) {
					int vezes = facesDados.get(lado).intValue() + 1;				
					facesDados.put(lado, vezes);
					}
				}			
			}
		int soma = 0;
		for(Map.Entry<Integer,Integer> entry : facesDados.entrySet()) {
			System.out.println("Numero de vezes o lado " + entry.getKey() + ": " + entry.getValue());
			soma += entry.getValue();
		}
		System.out.println("SOMA: " + soma);
	}

}
