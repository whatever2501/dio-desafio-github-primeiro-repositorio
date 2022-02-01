package teste;
import java.util.*;


public class teste {

	public static void main(String[] args) {
		
		/**Crie um dicionario e relacione os estados e suas populações**/
		Map<String, Integer> estados = new HashMap<String, Integer>() {{
			put("PE", 9616621); 
			put("AD", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		}};
		System.out.println(estados.toString());
		
		/**Substitua a população do estado do RN por 3.534.165**/
		estados.put("RN", 3534165);
		System.out.println(estados);
		
		/**Confira se o estado PB está no dicionario, caso não adicione: 
		PB - 4.039.277**/
		if(estados.containsKey("PB")){
			System.out.println("AQUI");
		}else {
			estados.put("PB", 4039277);
		}

		System.out.println(estados);
		
		/**Exiba a população de PE**/
		System.out.println("população de PE: " + estados.get("PE"));
		
		/** Exiba todos os estado e suas populações na ordem que foi
		 * informado
		 */
		
		Map<String,Integer> estados1 = new LinkedHashMap<String, Integer>() {{
			put("PE", 9616621); 
			put("AD", 3351543);
			put("CE", 9187103);
			put("RN", 3534265);
		
		}};
		System.out.println("Estados na ordem que foram informados: " + estados);
	
		/** Exiba os estado e suas populações em ordem alfabética **/
		
		Map<String,Integer>estados3 = new TreeMap<>(estados);
		System.out.println("Estados em ordem alfabetica: " + estados3);
		
		/** Exiba os estado com a menor população e sua quantidade; **/
		
		Collection<Integer> estadoss = estados.values();
		String estadoMenorPopulacao = "";
		String estadoMaiorPopulacao = "";
		for(Map.Entry<String,Integer> entry : estados.entrySet()) {
			if(entry.getValue().equals(Collections.min(estadoss))) estadoMenorPopulacao = entry.getKey();
			if(entry.getValue().equals(Collections.max(estadoss))) estadoMaiorPopulacao = entry.getKey();
		}
		System.out.println("Estado com o menor numero de população: " + estadoMenorPopulacao + "," + Collections.min(estadoss) );
		
		/** Exiba o estado coma   maior populaçoies e sua quantidade **/
		System.out.println("Estado com maior numero de população: " + estadoMaiorPopulacao+ "," + Collections.max(estadoss));
		
		/** Exiba  a soma da população desses estado **/
		int soma = 0;
		for(Map.Entry<String, Integer> entry : estados.entrySet()) {
			soma += entry.getValue();
		}
		System.out.println("Soma da população dos estados: " + soma);
		
		/** Exiba a amedia da populaão menor que 4.000.00**/
		int media = soma/estados.size();
		System.out.println("Media da população: " + media);
		
		/**Apague o dicionario de estados **/
		estados.clear();
		System.out.println("Conteudo no Map: " + estados);
	
		 
	}
}
	