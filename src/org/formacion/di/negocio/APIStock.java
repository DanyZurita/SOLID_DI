package org.formacion.di.negocio;

import org.formacion.di.bbdd.InventarioBBDD;

public class APIStock implements API{

    private final InventarioBBDD inventario;

    public APIStock(API inventario) {
		this.inventario = (InventarioBBDD) inventario;
	}

    @Override
    public boolean necesitaStock (String tienda, String producto) {
		return inventario.necesitaStock(tienda, producto);
	}
}