
public class Hora {
	private int hora;
	private int minuto;
	private int segundo;

	
	
	public Hora(int hora, int minuto, int segundo) {
		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}



	public void setTime(int h, int m, int s) {
		this.hora = h;
		this.minuto = m;
		this.segundo = s;
	}

	public String exibirHoraUniversal() {
		return hora + ":" + minuto + ":" + segundo;
	}

	public String exibirHoraPadrao() {
		if ((hora>0) && (hora <12)) {
			return hora +":" + minuto +":" + segundo +" AM";
		}
		
		else if (hora == 0) {
			return "12:" + minuto + ":" + segundo + " AM";
		}
		else if (hora == 12) {
			return "12:" + minuto + ":" + segundo + " PM";
		}
		else {
			return ( (hora - 12) + ":" + minuto + ":" + segundo + " PM" );	
		}
			
		
	}
	
}
