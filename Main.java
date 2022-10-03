import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a nota do primeiro bimestre: ");
    int b1 = sc.nextInt();

    System.out.print("Digite a nota do segundo bimestre: ");
    int b2 = sc.nextInt();

    System.out.print("Digite a nota do terceiro bimestre: ");
    int b3 = sc.nextInt();

    System.out.print("Digite a nota do quarto bimestre: ");
    int b4 = sc.nextInt();

    int media = (b1+b2+b3+b4) / 4;
    System.out.println("A média das notas dos bimestres é: " + media);
    sc.close();
  }
}