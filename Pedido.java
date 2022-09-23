
public class Pedido {
	int numero;
	Produto item;
	int quantidade;
	double valor;
	
	public Pedido(int numero,Produto item, int quantidade ){
		this.numero= numero;
		this.item= item;
		this.quantidade= quantidade;
		
	}
	void calculaPedido() {
		valor= quantidade * item.preco;
	}
	public String toString() {
		String informacao;
		
		informacao= "Número do pedido: "+numero+ "\n"+"Código do Produto: "+item.cod+"\n"+"Descrição:"+item.descricao+"\n"+"Preço do Produto: "+item.preco+"\n"+"Quantidade: "+ quantidade+"\n"+"Valor total do pedido: "+valor;
		
		return informacao;
		
	}

}
