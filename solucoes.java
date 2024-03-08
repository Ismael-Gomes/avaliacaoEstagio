import java.util.Scanner;
public class solucoes{
    public static void main(String agrs[]){
    //1º) Solução da Questão 1:
        /*int i = 13;
        int soma = 0;
        int k = 0;
            do{
                k = k+i;
                soma = soma + k;
            }while(k < i);
        System.out.println(soma);*/

    //2º) Solução da Questão 2:
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se está na sequência de Fibonacci: ");
        int numeroEscolhido = scanner.nextInt();
            if (sequenciaFibonacci(numeroEscolhido)) {
                System.out.println("O número " + numeroEscolhido + " está na sequência de Fibonacci.");
            } else {
                System.out.println("O número " + numeroEscolhido + " não está na sequência de Fibonacci.");
            }
        scanner.close();*/

    //3º) Solução da Questão 3:
        //a): 9. Pois o valor aumenta a cada duas unidades.
        //b): 128. Pois é a multiplicação do numero anterior por 2.
        //c): 47.Pois a sequência segue um padrão de soma com numeros impares, ou seja, 1, 3, 5, 7, 9, 11...
        //d):     
    }

    //Função da questão 2:
    /*public static boolean sequenciaFibonacci(int numeroEscolhido) {
        int numeroAnterior = 0;
        int numeroAtual = 1;
        int proximo;    
        while (numeroAtual < numeroEscolhido) {
            proximo = numeroAnterior + numeroAtual;
            numeroAnterior = numeroAtual;
            numeroAtual = proximo;
        }
        
        return numeroAtual == numeroEscolhido;
    }*/
}