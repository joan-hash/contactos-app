package com.crud.contactos.web.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.crud.contactos.web.entidades.Contacto;
import com.crud.contactos.web.servicios.ContactoServicio;

@Controller
public class ContactoControlador {
	@Autowired
	private ContactoServicio servicio;

	@GetMapping("/")
	public String listarContactos(Model modelo) {
		modelo.addAttribute("contactos", servicio.listarTodosLosContactos());
		return "contactos";
	}

	@GetMapping("/contacto/agregar")
	public String mostrarFormularioAgregarContacto(Model modelo) {
		Contacto contacto = new Contacto();
		modelo.addAttribute("contacto", contacto);
		return "agregar-contacto";
	}

	@PostMapping("/agregar-contacto")
	public String agregarContacto(@ModelAttribute("contacto") Contacto contacto) {
		servicio.agregarContacto(contacto);
		return "redirect:/";
	}

	@GetMapping("/contacto/editar/{id}")
	public String mostrarFormularioEditarContacto(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("contacto", servicio.obtenerContactoPorId(id));
		return "editar-contacto";
	}

	@PostMapping("/editar-contacto/{id}")
	public String actualizarContacto(@PathVariable Long id, @ModelAttribute("contacto") Contacto contacto, Model modelo) {
		Contacto contactoExistente = servicio.obtenerContactoPorId(id);
		contactoExistente.setId(id);
		contactoExistente.setNombre(contacto.getNombre());
		contactoExistente.setCorreo(contacto.getCorreo());
		contactoExistente.setFono(contacto.getFono());
		servicio.actualizarContacto(contactoExistente);
		return "redirect:/";
	}

	@GetMapping("/eliminar-contacto/{id}")
	public String eliminarContacto(@PathVariable Long id) {
		servicio.eliminarContacto(id);
		return "redirect:/";
	}
}
