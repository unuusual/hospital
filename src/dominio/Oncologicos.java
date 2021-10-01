package dominio;

public class Oncologicos extends Paciente {

	public Oncologicos(String nombre, Integer dni) {
		super(nombre, dni);
		setTipoEnfermedad(TipoEnfermedad.ONCOLOGICO);
	}

	@Override
	public Boolean puedeComer(String[] comida) {
		// TODO Auto-generated method stub
		return null;
	}

}
