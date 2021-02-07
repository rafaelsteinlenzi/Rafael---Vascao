package Sala;

public class labBiologia extends Laboratorio {

	private boolean temAnimal;


	public labBiologia(int capacidadeFisica, String identificacao, boolean temPesquisa, boolean temAnimal) {
		super(capacidadeFisica, identificacao, temPesquisa);
		this.temAnimal = temAnimal;
	}

	public boolean isTemAnimal() {
		return temAnimal;
	}

	public void setTemAnimal(boolean temAnimal) {
		this.temAnimal = temAnimal;
	}
	
	
	
}
