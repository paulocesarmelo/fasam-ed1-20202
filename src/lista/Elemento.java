package lista;

public class Elemento {

	private int posicao;
	private Elemento proximo;
	
	//Generica
	private Object valor;

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public Elemento getProximo() {
		return proximo;
	}

	public void setProximo(Elemento proximo) {
		this.proximo = proximo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public void imprimirDados() {
		System.out.print(valor.toString()+ "\t");
		 
	}
	
}

