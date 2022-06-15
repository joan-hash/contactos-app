package com.crud.contactos.web.servicios;

import java.util.List;

import com.crud.contactos.web.entidades.Contacto;

public interface ContactoServicio {
	public List<Contacto> listarTodosLosContactos();
	public Contacto agregarContacto(Contacto contacto);
	public Contacto obtenerContactoPorId(Long id);
	public Contacto actualizarContacto(Contacto contacto);
	public void eliminarContacto(Long id);
}
