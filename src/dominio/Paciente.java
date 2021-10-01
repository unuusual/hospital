package dominio;

public abstract class Paciente {
	private String nombre;
	private Integer dni;
	private TipoEnfermedad tipoEnfermedad;
	
	public Paciente(String nombre, Integer dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public abstract Boolean puedeComer(String[] comida);
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public TipoEnfermedad getTipoEnfermedad() {
		return tipoEnfermedad;
	}

	public void setTipoEnfermedad(TipoEnfermedad tipoEnfermedad) {
		this.tipoEnfermedad = tipoEnfermedad;
	}

	
	
	
	
}
