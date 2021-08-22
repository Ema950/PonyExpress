package ponyexpress;
/**
 * Esta clase crea objetos del tipo Caballo, implementados en 
 * PonyExpress como mensajeros.
 * @author Emanuel Paiva
 * @version 22/08/2021 - A
 * @see 
 */
public class Caballo {
	private int distanciaRecorrida;
	
	public Caballo () {
		this.distanciaRecorrida = 0;
	}
	
	public int getDistanciaRecorrida() {
		return distanciaRecorrida;
	}

	public void setDistanciaRecorrida(int distanciaRecorrida) {
		this.distanciaRecorrida = distanciaRecorrida;
	}
	 /**
     * Método que indica si un caballo puede recorrer una determinada distancia. 
     * @param distancia a recorrer
     * @return true si puede recorrer la distancia 
     */
	public boolean puedeRecorrer(int distancia){
		return this.getDistanciaRecorrida() + distancia <= 100;
	}
	/**
	 * Método que implementa la acción de recorrer una distancia determinada,
	 * modifica el atributo distanciaRecorrida, sumando la distancia a recorrer
	 * @param distancia a recorrer
	 */
	public void recorrer (int distancia) {
		this.setDistanciaRecorrida(this.getDistanciaRecorrida()+distancia);; 
	}

}
