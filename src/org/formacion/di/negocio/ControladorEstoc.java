package org.formacion.di.negocio;


public class ControladorEstoc {

	private APIStock api;

	public ControladorEstoc(API inventario) {
		this.api = new APIStock(inventario);
	}
	
	/**
	 * Nuestros sesudos estudios han descubierto que los clientes compran mas
	 * productos cuando el nombre de este producto es mas largo
	 * Por eso, el estoc no puede ser inferior a 100 * la longitud del nombre del producto
	 * p.e: necesitamos al menos 400 mesas (mesa : 4 letras) y
	 *    al menos 700 lamparas (lampara: 7 letras)
	 */
	public boolean necesitaReponer (String tienda, String producto) {
		return api.necesitaStock(tienda, producto);
	}
}
