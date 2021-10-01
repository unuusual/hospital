package dominio;

public class Diabeticos extends Paciente {
	private Integer tipoDiabetes;
	private String[] ingredientesProhibidosDiabetico = {"Azucar", "Miel"};
	
	
	public Diabeticos(String nombre, Integer dni, Integer tipoDiabetes) {
		super(nombre, dni);
		setTipoDiabetes(tipoDiabetes);
		
	}
	

	
	public void setTipoDiabetes(Integer tipoDiabetes) {
		
		if (tipoDiabetes == 1) {
			setTipoEnfermedad(TipoEnfermedad.DIABETICO_TIPO_1);
		}
		if (tipoDiabetes == 2) {
			setTipoEnfermedad(TipoEnfermedad.DIABETICO_TIPO_2);
		}
		
		
	}

	@Override
	public Boolean puedeComer(String[] comida){
		Boolean puedeComer = true;
		for (int i = 0; i < comida.length; i++) {
			for (int j = 0; j < ingredientesProhibidosDiabetico.length; j++) {
				if (ingredientesProhibidosDiabetico[j] != null && comida[i] != null) {
					if (getTipoEnfermedad().equals(TipoEnfermedad.DIABETICO_TIPO_1) && comida[i] == ingredientesProhibidosDiabetico[j]) {
						puedeComer = false;
						break;
					}
				}
			}
			
		}
		return puedeComer;
	}

}
