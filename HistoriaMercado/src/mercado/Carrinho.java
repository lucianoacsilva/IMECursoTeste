package mercado;

public class Carrinho {

	public int desconto(int preco) {
		int precoFinal; 
		
		if (preco >= 100 && preco < 200) {
			precoFinal = (int) (0.9 * preco);
			return precoFinal;
		}
		
		else if (preco >= 200 && preco < 300) {
			precoFinal = (int) (0.8 * preco);
			return precoFinal;
		}
		
		else if (preco >= 300 && preco < 400) {
			precoFinal = (int) (0.75 * preco);
			return precoFinal;
		}
		
		else {
			precoFinal = (int) (0.7 * preco);
			return precoFinal;
		}
		
	}
}
