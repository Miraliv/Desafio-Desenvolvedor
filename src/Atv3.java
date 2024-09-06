public class Atv3 {
    public static void main(String[] args) {


        double[] faturamentoDiario = {
                0, 1500, 2000, 0, 3500, 4500, 0, 5000, 0, 7000, 0, 0, 8000, 0, 1500,
                2500, 0, 3000, 0, 0, 4000, 0, 6000, 0, 5500, 0, 0, 4500, 0, 1000
        };


        double menorFaturamento = Double.MAX_VALUE;
        double maiorFaturamento = Double.MIN_VALUE;
        double somaFaturamento = 0;
        int diasComFaturamento = 0;

        // Calcula o menor, maior e a soma do faturamento (ignorando dias sem faturamento)
        for (double faturamento : faturamentoDiario) {
            if (faturamento > 0) {
                if (faturamento < menorFaturamento) {
                    menorFaturamento = faturamento;
                }
                if (faturamento > maiorFaturamento) {
                    maiorFaturamento = faturamento;
                }
                somaFaturamento += faturamento;
                diasComFaturamento++;
            }
        }

        // Calcula a média de faturamento
        double mediaFaturamento = somaFaturamento / diasComFaturamento;

        // Conta os dias em que o faturamento foi superior à média
        int diasAcimaDaMedia = 0;
        for (double faturamento : faturamentoDiario) {
            if (faturamento > mediaFaturamento) {
                diasAcimaDaMedia++;
            }
        }


        System.out.println("Menor Faturamento: " + menorFaturamento);
        System.out.println("Maior Faturamento: " + maiorFaturamento);
        System.out.println("Dias com Faturamento Acima da Média: " + diasAcimaDaMedia);
            }
        }

