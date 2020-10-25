package lista;

public class ElementoDE {

	private int posicao;
	
	private ElementoDE proximo, anterior;
	
	//Generica
	private Object valor;

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public ElementoDE getProximo() {
		return proximo;
	}

	public void setProximo(ElementoDE proximo) {
		this.proximo = proximo;
	}

	public Object getValor() {
		return valor;
	}

	public void setValor(Object valor) {
		this.valor = valor;
	}
	
	public void setAnterior(ElementoDE anterior) {
		this.anterior = anterior;
	}
	
	public ElementoDE getAnteriro() {
		return this.anterior;
	}
			
	
	public void imprimirDados() {
		System.out.print(valor.toString()+ "\t");
		 
	}
	
}

