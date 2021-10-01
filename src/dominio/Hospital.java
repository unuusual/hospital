package dominio;

public class Hospital {
	private String nombre;
	private Paciente[] pacientes;
	private String[] Milanesa = {"Avena", "Sal", "Carne"};
	private String[] Flan = {"Leche", "Azucar"};
	private String[] Sushi = {"pescadoCrudo", "Condimentos"};
	private String[] Ensalada = {"Verdura", "Sal"};

	
	
	public Hospital(String nombre) {
		this.nombre = nombre;
		this.pacientes = new Paciente[100];
	}
	
	public Boolean agregarPaciente(Paciente paciente) {
		Boolean seAgrego = false;
		for (int i = 0; i < pacientes.length; i++) {
			if (this.pacientes[i] == null) {
				this.pacientes[i] = paciente;
				seAgrego = true;
				break;
			}
		}
		return seAgrego;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Paciente[] getPacientes() {
		return pacientes;
	}

	public void setPacientes(Paciente[] pacientes) {
		this.pacientes = pacientes;
	}

	public String[] getMilanesa() {
		return Milanesa;
	}

	public void setMilanesa(String[] milanesa) {
		Milanesa = milanesa;
	}

	public String[] getFlan() {
		return Flan;
	}

	public void setFlan(String[] flan) {
		Flan = flan;
	}

	public String[] getSushi() {
		return Sushi;
	}

	public void setSushi(String[] sushi) {
		Sushi = sushi;
	}

	public String[] getEnsalada() {
		return Ensalada;
	}

	public void setEnsalada(String[] ensalada) {
		Ensalada = ensalada;
	}
	
	
	

}
