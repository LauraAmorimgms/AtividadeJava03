import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int idade = 0, f1=0, f2=0, f3=0, f4=0, f5=0;

        for (int i = 1; i <= 8; i++) {
            System.out.print("Idade: ");
            idade = entrada.nextInt();

            if (idade <= 15){
                f1++;
            } else if (idade >= 16 && idade <= 30){
                f2++;
            } else if (idade >= 31 && idade <= 45){
                f3++;
            } else if (idade >= 46 && idade <=60){
                f4++;
            }
            else{
                f5++;
            }

        }

        System.out.println("");

        System.out.println("Quantidade de pessoas por faixa etária: ");
        System.out.println("1° faixa etária: "+ f1);
        System.out.println("2° faixa etária: "+ f2);
        System.out.println("3° faixa etária: "+ f3);
        System.out.println("4° faixa etária: "+ f4);
        System.out.println("5° faixa etária: "+ f5);

        double porcefx1 = f1/0.8, porcefx5 = f5/0.8;

        System.out.println("");

        System.out.println("A porcentagem de pessoas na primeira faixa etária: " + porcefx1 + "%");
        System.out.println("A porcentagem de pessoas na última faixa etária: " + porcefx5 + "%");


    }
}
