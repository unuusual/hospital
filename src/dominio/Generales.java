package dominio;

public class Generales extends Paciente {

	public Generales(String nombre, Integer dni) {
		super(nombre, dni);
		setTipoEnfermedad(TipoEnfermedad.GENERALES);
	}

	@Override
	public Boolean puedeComer(String[] comida) {
		// TODO Auto-generated method stub
		return null;
	}

}
