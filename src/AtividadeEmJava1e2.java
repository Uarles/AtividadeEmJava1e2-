import java.util.Scanner;

public class AtividadeEmJava1e2 {

        public static void main(String[] args) {

            System.out.println("Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa em dias.Leve em consideração o ano com 365 dias e o mês com 30.\n");

            int anos, meses, dias;
            int idadeEmDias;
            Scanner leitor = new Scanner (System.in);

            System.out.println("Digite a idade em anos:");
            anos = leitor.nextInt();
            System.out.println("Digite a idade em meses:");
            meses = leitor.nextInt();
            System.out.println("Digite a idade em dias:");
            dias = leitor.nextInt();

            idadeEmDias = anos * 365 + meses * 30 + dias;
            System.out.println("idade em dias:" + idadeEmDias);

            System.out.println("2- Fazer um programa que imprima a média aritmética dos números 8,9 e 7. A média dos números 4, 5 e 6. A soma  das duas médias. A média das médias.\n");

            int[] nums1 = new int[3];
            nums1[0] = 8;
            nums1[1] = 9;
            nums1[2] = 7;

            int media = 0;

            for (int i = 0; i < nums1.length; i++) {
                media += nums1[i];
            }

            float valor1 = media / nums1.length;

            System.out.println("A média é:" + valor1);

            int[] nums2 = new int[3];
            nums2[0] = 4;
            nums2[1] = 5;
            nums2[2] = 6;

            int media1 = 0;

            for (int i = 0; i < nums2.length; i++) {
                media1 += nums2[i];
            }

            float valor2 = media1 / nums2.length;

            System.out.println("Essa outra média é:" + valor2);

            float MediaDasMedias = valor1 + valor2;

            System.out.println("O valor total das médias são:" + MediaDasMedias);

        }

    }
