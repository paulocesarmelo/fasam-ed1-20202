package tad;


// TAD = CLASS
public class Endereco {

	String rua, cep, setor, cidade, estado;
	int quadra, num, lote;
	
	
	void atualizarRua(String r) {
		rua = r;
	}
	
	void atualizarEndereco(String c) {
		cep = c;
	}
	
	boolean compararEndereco(Endereco novoEndereco) {
		
		// Obs.: Estamos comparando somente os dados inteiros
		if(quadra == novoEndereco.quadra && num == novoEndereco.num && lote == novoEndereco.lote) {
			return true;
		}
		
		return false;
	}
	
	void validarCEP() {
		
		//length é um método da classe String que devolve o tamanho do texto
		if(cep.length() == 8) {
			System.out.println("CEP valido!");
		}else {
			System.out.println("CEP inválido");
		}
		
	}
	
}
