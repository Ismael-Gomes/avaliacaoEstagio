import java.util.Scanner;
public class solucoes{
    public static void main(String agrs[]){
    Scanner scanner = new Scanner(System.in);
    //1º) Solução da Questão 1:
        int i = 13;
        int soma = 0;
        int k = 0;
            do{
                k = k+i;
                soma = soma + k;
            }while(k < i);
        System.out.println("O resultado da questão 1 é: " + soma + "\n");

    //2º) Solução da Questão 2:
        System.out.println("Questão 2:");
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numeroEscolhido = scanner.nextInt();
            if (sequenciaFibonacci(numeroEscolhido)) {
                System.out.println("O número " + numeroEscolhido + " está na sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numeroEscolhido + " não está na sequência de Fibonacci.");
            }

    //3º) Solução da Questão 3:
        System.out.println("\nQuestão 3:");
        System.out.println("a): 9. Pois o valor aumenta a cada duas unidades.");
        System.out.println("\nb): 128. Pois é a multiplicação do numero anterior por 2.");
        System.out.println("\nc): 47.Pois a sequência segue um padrão de soma com numeros impares, ou seja, 1, 3, 5, 7, 9, 11...");
        System.out.println("\nd): 100. Pois ele está pegando os numeros pares e elevando ao quadrado, Ex: 2²=4, 4²=16, 6²=36...");
        System.out.println("\ne): 13. Pois ela segue a sequência de fibonacci.");
        System.out.println("\nf): 20. pois o numero cresce com a multiplicação de 0,5 em 0,5. Ex: 2X8=16, 2x8,5=17, 2x9=18, 2x9,5=19, 2x10=20.");

    //4º) Solução da Questão 4:
        System.out.println("\nQuestão 4:");
        System.out.println("Primeiro eu ligaria o interruptor numero 1 e deixaria ligado por volta de uns 10min. \n" +
                        "Em seguida, eu ligaria o interruptor de numero 2 e verificaria as salas.\n" + 
                        "Se a sala 1 estiver com a luz apagada e a lampada fria, então ele é controlado pelo 3º interruptor.\n" + 
                        "Se a sala 1 estiver com a luz apagada e a lampada quente, então ele é controlado pelo 1º interruptor.\n" + 
                        "Se a sala 1 estiver com a luz acesa, então é controlada pelo 2º interrupitor.\n" + 
                        "O teste seguiria a mesma logica para a sala 2, e depois de verificar as duas, logo poderia concluir\n" + 
                        "o interrupitor da 3ª sala.\n");
    //5º) Solução da questão 5:
        // Ler a string do usuário
        System.out.println("\nQuestão 5:");
        System.out.print("Digite um texto qualquer: ");
        String texto = scanner.next();

        // Inverter a String
        String textoInverso = textoInverso(texto);

        // Exibir a String invertida
        System.out.println("O texto inverso: " + textoInverso);

        scanner.close();
    }

    //Função da questão 2:
        public static boolean sequenciaFibonacci(int numeroEscolhido) {
            int numeroAnterior = 0;
            int numeroAtual = 1;
            int proximo;

            while (numeroAtual < numeroEscolhido) {
                proximo = numeroAnterior + numeroAtual;
                numeroAnterior = numeroAtual;
                numeroAtual = proximo;
            }
            
        return numeroAtual == numeroEscolhido;
        }

    //Função da questão 5:
        public static String textoInverso(String texto) {

        //Verificar se exite algo no texto
        if (texto == null || texto.isEmpty()) {
            return texto;
        }

        //Converter a string para um array de caracteres
        char[] charArray = texto.toCharArray();

        //Inverter os caracteres no array
        int i = 0;
        int j = charArray.length - 1;
            while (i < j) {
                //Trocar os caracteres nas posições i e j
                char charTemporario = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = charTemporario;
                //Avançar para o próximo par de caracteres
                i++;
                j--;
            }
        return new String(charArray);
        }
}