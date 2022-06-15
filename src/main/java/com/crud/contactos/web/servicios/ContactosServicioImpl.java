package com.crud.contactos.web.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.contactos.web.entidades.Contacto;
import com.crud.contactos.web.repositorio.ContactoRepositorio;

@Service
public class ContactosServicioImpl implements ContactoServicio {

	@Autowired
	private ContactoRepositorio repositorio;

	@Override
	public List<Contacto> listarTodosLosContactos() {
		return repositorio.findAll();
	}

	@Override
	public Contacto agregarContacto(Contacto contacto) {
		return repositorio.save(contacto);
	}

	@Override
	public Contacto obtenerContactoPorId(Long id) {
		return repositorio.findById(id).get();
	}

	@Override
	public Contacto actualizarContacto(Contacto contacto) {
		return repositorio.save(contacto);
	}

	@Override
	public void eliminarContacto(Long id) {
		repositorio.deleteById(id);
	}

}
