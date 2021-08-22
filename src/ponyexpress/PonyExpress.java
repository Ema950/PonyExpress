package ponyexpress;
/**
 * Clase principal donde se resulve lo planteado en R003
 * @author Emanuel Paiva
 * @version 22/08/2021 - A
 * @see 
 */
public class PonyExpress {
	private Caballo mensajero; 
	
	public PonyExpress(Caballo unCaballo) {
		this.mensajero= unCaballo;
	}
	
	public Caballo getMensajero() {
		return mensajero;
	}

	public void setMensajero(Caballo mensajero) {
		this.mensajero = mensajero;
	}
	/**
	 * Metodo que permite cambiar de caballo, se utiliza cuando un
	 * mensajero no puede recorrer una distancia 
	 */
	public void cambiarCaballo() {
		this.setMensajero(new Caballo());
	}
	/**
	 * Metodo que permite calcular la cantidad de caballos necesarios para 
	 * realizar un recorrido. 
	 * @param distancias en millas de una estación hasta la otra
	 * @returns la cantidad de caballos necesarios para enviar el correo desde un
	 * extremo hasta el otro del recorrido
	 */
	public int caballos (int [] distancias) {
		int retorno = 1;
		for (int i=0; i<distancias.length; i++) {
			if (this.getMensajero().puedeRecorrer(distancias[i])){
				this.getMensajero().recorrer(distancias[i]);
			}else {
				this.cambiarCaballo();
				this.getMensajero().recorrer(distancias[i]);
				retorno ++; 
			}
		} 
     return retorno;
		
	}

}
