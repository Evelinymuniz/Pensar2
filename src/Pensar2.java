import java.util.Scanner;
    public class Pensar2 {
        public static int retargs(String[] args) {
            int quantidadeArgs = args.length;
            return quantidadeArgs;
        }
        public static int retornaLocalArgs(String[] args, int posicao) {
            int local = Integer.parseInt(args[posicao]);
            return local;
        }
        public static int somaValor(int valor1, int valor2) {
            return valor1 + valor2;
        }
         public static void ImprimirValor(int valorASerImprimido){
             System.out.println("O TOTAL DA SUA SOMA É:  " + valorASerImprimido);
         }

            public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int num1, num2, num3;
            int quantidadeArgs = retargs(args);
            if (quantidadeArgs == 0) {
                System.out.println("!!!VOCE PRECISA DIGITAR DOIS NUMEROS PARA REALIZAR A OPERAÇÃO!!!");
                System.out.print("DIGITE PRIMEIRO NUMERO: ");
                num2 = sc.nextInt();
                System.out.print("DIGITE SEGUNDO NUMERO: ");
                num3 = sc.nextInt();
                ImprimirValor(somaValor(num2,num3));

            } else if (quantidadeArgs == 1) {
                int local = retornaLocalArgs(args, 0);
                System.out.println("O VALOR ARGS QUE SERA SOMADO É : " + local);
                System.out.print("DIGITE UM NUMERO: ");
                num1 = sc.nextInt();
                ImprimirValor(somaValor(local,num1));

            } else if (quantidadeArgs == 2) {
                int local = retornaLocalArgs(args, 0);
                int local2 = retornaLocalArgs(args, 1);
                System.out.println("O PRIMEIRO VALOR ARGS É : " + local);
                System.out.println("O SEGUNDO VALOR ARGS É : " + local2);
                ImprimirValor(somaValor( retornaLocalArgs(args, 0), retornaLocalArgs(args, 1)));

            }else {
                System.out.println("QUANTIDADE INVALIDA");
            }
        }
    }





