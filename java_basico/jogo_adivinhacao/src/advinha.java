import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        // Cria um jogo de adivinhação
        Random aleRandom = new Random();
        Scanner scanner = new Scanner(System.in);
        int numAleatorio = aleRandom.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int numTentativas = 0; // Contador de tentativas
        int numChute = 0; // Variável para armazenar o chute do usuário
        System.out.println("Bem-vindo ao jogo de adivinhação!");
        System.out.println("Tente adivinhar o número entre 1 e 100.");
        // Loop para permitir várias tentativas
        while (numChute != numAleatorio){
            System.out.print("Digite seu palpite: ");
            numChute = scanner.nextInt(); // Lê o chute do usuário
            numTentativas++; // Incrementa o contador de tentativas
            // Verifica se o chute é maior ou menor que o número aleatório
            if (numChute > numAleatorio) {
                System.out.println("Seu palpite foi muito alto!");
            } else if (numChute < numAleatorio) {
                System.out.println("Seu palpite foi muito baixo!");
            } else {
                System.out.println("Parabéns! Você acertou em " + numTentativas + " tentativas.");
            }
        }
    }
}
