package teste;
import java.util.*;


public class teste {

	public static void main(String[] args) {
		
		/**Crie um dicionario e relacione os estados e suas popula��es**/
		Map<String, Integer> estados = new HashMap<String, Integer>() {{
			put("PE", 9616621); 
			put("AD", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(estados.toString());
		
		/**Substitua a popula��o do estado do RN por 3.534.165**/
		estados.put("RN", 3534165);
		System.out.println(estados);
		
		/**Confira se o estado PB est� no dicionario, caso n�o adicione: 
		PB - 4.039.277**/
		if(estados.containsKey("PB")){
			System.out.println("AQUI");
		}else {
			estados.put("PB", 4039277);
		}

		System.out.println(estados);
		
		/**Exiba a popula��o de PE**/
		System.out.println("popula��o de PE: " + estados.get("PE"));
		
		/** Exiba todos os estado e suas popula��es na ordem que foi
		 * informado
		 */
		
		Map<String,Integer> estados1 = new LinkedHashMap<String, Integer>() {{
			put("PE", 9616621); 
			put("AD", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		
		}};
		System.out.println("Estados na ordem que foram informados: " + estados);
	
		/** Exiba os estado e suas popula��es em ordem alfab�tica **/
		
		Map<String,Integer>estados3 = new TreeMap<>(estados);
		System.out.println("Estados em ordem alfabetica: " + estados3);
		
		/** Exiba os estado com a menor popula��o e sua quantidade; **/
		
		Collection<Integer> estadoss = estados.values();
		String estadoMenorPopulacao = "";
		String estadoMaiorPopulacao = "";
		for(Map.Entry<String,Integer> entry : estados.entrySet()) {
			if(entry.getValue().equals(Collections.min(estadoss))) estadoMenorPopulacao = entry.getKey();
			if(entry.getValue().equals(Collections.max(estadoss))) estadoMaiorPopulacao = entry.getKey();
		}
		System.out.println("Estado com o menor numero de popula��o: " + estadoMenorPopulacao + "," + Collections.min(estadoss) );
		
		/** Exiba o estado coma   maior popula�oies e sua quantidade **/
		System.out.println("Estado com maior numero de popula��o: " + estadoMaiorPopulacao+ "," + Collections.max(estadoss));
		
		/** Exiba  a soma da popula��o desses estado **/
		int soma = 0;
		for(Map.Entry<String, Integer> entry : estados.entrySet()) {
			soma += entry.getValue();
		}
		System.out.println("Soma da popula��o dos estados: " + soma);
		
		/** Exiba a amedia da popula�o menor que 4.000.00**/
		int media = soma/estados.size();
		System.out.println("Media da popula��o: " + media);
		
		/**Apague o dicionario de estados **/
		estados.clear();
		System.out.println("Conteudo no Map: " + estados);
	
		 
	}
}
	