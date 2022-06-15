package com.crud.contactos.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.crud.contactos.web.entidades.Contacto;
import com.crud.contactos.web.repositorio.ContactoRepositorio;

@SpringBootApplication
public class CrudContactosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CrudContactosApplication.class, args);
	}

	@Autowired
	private ContactoRepositorio repositorio;

	@Override
	public void run(String... args) throws Exception {
		Contacto contactoUno = new Contacto("Jhon Doe", "jhondoe@gmail.com", "+569 93476931");
		repositorio.save(contactoUno);
		Contacto contactoDos = new Contacto("Jane Deere", "janedeere@gmail.com", "+569 56682279");
		repositorio.save(contactoDos);
	}

}
