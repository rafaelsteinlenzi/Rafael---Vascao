package Sala;

public class labQuimica extends Laboratorio {

	private int prodQuimicos;

	public labQuimica(int capacidadeFisica, String identificacao, boolean temPesquisa, int prodQuimicos) {
		super(capacidadeFisica, identificacao, temPesquisa);
		this.prodQuimicos = prodQuimicos;
	}

	public int getProdQuimicos() {
		return prodQuimicos;
	}

	public void setProdQuimicos(int prodQuimicos) {
		this.prodQuimicos = prodQuimicos;
	}
	
	
	
}
