import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.println("Digite o horário desejado (hh:mm)");

    System.out.print("Digite as horas (hh):");
    int hora = s.nextInt();

    System.out.print("Digite os minutos (mm):");
    int minuto = s.nextInt();
    
    if (hora <0 || minuto < 0 || hora >12 || minuto > 60) {
      System.out.println("O formato de horas deve ser de 12 horas");
      return ;
    }

    Relogio relogio = new Relogio(); 
		GregorianCalendar g = new GregorianCalendar(2021, 07, 26, hora, minuto);
		long angulo = relogio.retornaAnguloRelogio(g);
  
  System.out.println("O ângulo formado entre os ponteiros de horas e minutos do relógio é: " + angulo);
    
  }
  
  
}