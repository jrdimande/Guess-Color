import java.util.Scanner;
import java.util.Random;

public class GuessColor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        String[] colors = {"red", "green", "blue"};

        int points, maxRounds, round, n;
        String color, player;

        points = 0;
        maxRounds = 10;
        round = 0;
        n = colors.length;

        while (round < maxRounds){
            System.out.println("Cores disponíveis: [red, green, blue]");
            color = colors[random.nextInt(n)];

            System.out.print("Qual cor o computador escolheu?: ");
            player = sc.nextLine().toLowerCase();

            if (color.equals(player)) {
                points++;
                System.out.println("Você ganhou +1PT! ---- Pontos: " + points);
            }else {
                points--;
                System.out.println("Você perdeu -1PT! ---- Pontos: "+ points);

            }

            round++;

        }

        // Final Result
        if (points > 0){
            System.out.printf("Você venceu com %d pontos", points);
        }else {
            System.out.printf("Você perdeu com %d pontos", points);
        }

    }
}
