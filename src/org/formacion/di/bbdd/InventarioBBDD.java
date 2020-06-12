package org.formacion.di.bbdd;

import org.formacion.di.negocio.API;

public class InventarioBBDD implements API {


	// Metodo de consulta a la base de datos
	
	public int numeroProductos(String tienda, String producto) {
		return BBDD.stocs.get(tienda).get(producto);
	}

	@Override
    public boolean necesitaStock (String tienda, String producto) {
		int cantidadActual = this.numeroProductos(tienda, producto);
		
		return  cantidadActual < producto.length() * 100;
	}
}
