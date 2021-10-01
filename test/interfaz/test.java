package interfaz;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

import dominio.Celiacos;
import dominio.Diabeticos;
import dominio.Hospital;

public class test {


	@Test
	public void queSePuedaAgregarElPaciente() {
		Hospital cruzCeleste = new Hospital("CruzCeleste");
		
		Diabeticos paciente1 = new Diabeticos("Carlos", 123, 1);
		Celiacos pacientes2 = new Celiacos("Lucas", 123);
		
		assertTrue(cruzCeleste.agregarPaciente(pacientes2));
	}
	
	@Test
	public void queNoComaLoQueNoPuedaComer() {
		Hospital cruzCeleste = new Hospital("CruzCeleste");
		
		Diabeticos paciente1 = new Diabeticos("Carlos", 123, 1);
		
		assertTrue(paciente1.puedeComer(cruzCeleste.getMilanesa()));
	}

}
