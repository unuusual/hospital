package dominio;

public class Celiacos extends Paciente {

	public Celiacos(String nombre, Integer dni) {
		super(nombre, dni);
		setTipoEnfermedad(TipoEnfermedad.CELIACO);
	}

	@Override
	public Boolean puedeComer(String[] comida) {
		// TODO Auto-generated method stub
		return null;
	}

}
