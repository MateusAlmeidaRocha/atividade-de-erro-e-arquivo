import java.io.*;
import java.util.*;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int resultado;
    System.out.print("Digite o primeiro número: ");
    int num1 = scanner.nextInt();
    System.out.print("Digite o segundo número: ");
    int num2 = scanner.nextInt();
    String n;
    System.out.print("Escreva o tipo de operação você quer fazer(soma, subtração, multiplicação, divisão:");
    n = scanner.next();
    if (n.equals("soma")){
      resultado = num1 + num2;
      System.out.print("O resultado é:" + resultado);
    }else if(n.equals("subtração")){
      resultado = num1 - num2;
      System.out.print("O resultado é:" + resultado);
    }else if(n.equals("multiplicação")){
      resultado = num1 * num2;
      System.out.print("O resultado é:" + resultado);
    }else if(n.equals("divisão")){
    try{
      resultado = num1 / num2;
      System.out.print("O resultado é:" + resultado);
    }
    catch(ArithmeticException e1){
      File arquivo = new File("/erros/erros.txt");
      FileWriter fw = new FileWriter(arquivo);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(e1.getMessage());
      bw.close();
      fw.close();
    }
    }
  }
    
}