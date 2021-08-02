import java.util.Calendar;
import java.util.GregorianCalendar;

public class Relogio{

  public int getPonteiroHora(long hora, long minuto){
    if(hora==12)
      hora=0;
    if (minuto == 60) 
        minuto = 0;
        
		return (int)(0.01 * (hora*60 + minuto));
  }

  public int getPonteiroMinuto(long minuto){
		if (minuto == 60) 
      minuto = 0;
		return (int)minuto*6;
	}

	public long retornaAnguloRelogio(GregorianCalendar horario){

		int ponteiroHora = getPonteiroHora(horario.getTime().getHours(),horario.getTime().getMinutes());

		int ponteiroMinuto = getPonteiroMinuto(horario.getTime().getMinutes());
		
    int angulo = Math.abs(ponteiroHora - ponteiroMinuto);
 
    angulo = Math.min(360-angulo, angulo);
		return angulo;
	} 

}

