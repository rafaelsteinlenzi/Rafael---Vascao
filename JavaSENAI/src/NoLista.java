


public class NoLista<T> extends ListaComEncadeamento{

	private T info;
	private NoLista prox;
	
	
	public NoLista() {
		NoLista(null,null);
	}


	private void NoLista(Object object, Object object2) {
		// TODO Auto-generated method stub
		
	}


	public NoLista(T info, NoLista prox) {
		
		this.info = info;
		this.prox = prox;
	}

	

	public T getInfo() {
		return info;
	}


	public void setInfo(T info) {
		this.info = info;
	}


	public NoLista getProx() {
		return prox;
	}


	public void setProx(NoLista prox) {
		this.prox = prox;
	}



	


	
	
	
	
}
