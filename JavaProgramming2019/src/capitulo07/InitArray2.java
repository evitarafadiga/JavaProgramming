package capitulo07;

public class InitArray2 {

	public static void main(String[] args) {
		if (args.length != 3)
			System.out.printf("Erro: por favor insira novamente o comando completo, incluindo%n"+
		"um tamanho de vetor, valor inicial e incremento.%n");

		else {
			int arrayLength = Integer.parseInt(args[0]);
			int[] array = new int[arrayLength];
			
			int initialValue = Integer.parseInt(args[1]);
			int increment = Integer.parseInt(args[2]);
			
			for (int counter = 0; counter < array.length; counter++)
				array[counter] = initialValue + increment * counter;
			
			System.out.printf("%s%8s%n","Indice","Valor");
			
			for (int counter = 0; counter < array.length; counter++)
				System.out.printf("%5d%8d%n", counter, array[counter]);
			
		}
	}

}
