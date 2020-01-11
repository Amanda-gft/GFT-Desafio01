public class Veiculo
{
	
	//Atributos privados da classe
	private String Marca;
	private String Modelo;
	private String Placa;
	private String Cor;
	private float Km;
	private boolean IsLigado;
	private int LitrosCombustivel;
	private int Velocidade;
	private Double Preco;
	
	//Getters
	public String getMarca()
	{
		return this.Marca; 
	}
	
	public String getModelo()
	{
		return this.Modelo; 
	}
	
	public String getPlaca()
	{
		return this.Placa; 
	}
	
	public String getCor()
	{
		return this.Cor; 
	}
	
	public float getKm()
	{
		return this.Km; 
	}
	
	public boolean getIsLigado()
	{
		return this.IsLigado; 
	}
	
	public int getLitrosCombustivel()
	{
		return this.LitrosCombustivel; 
	}
	
	public int getVelocidade()
	{
		return this.Velocidade; 
	}
	
	public Double getPreco()
	{
		return this.Preco; 
	}
	
	//Setters
	public void setMarca(String marca)
	{
		this.Marca = marca; 
	}
	
	public void setModelo(String modelo)
	{
		this.Modelo = modelo; 
	}
	
	public void setPlaca(String placa)
	{
		this.Placa = placa; 
	}
	
	public void setCor(String cor)
	{
		this.Cor = cor; 
	}
	
	public void setKm(float km)
	{
		this.Km = km; 
	}
	
	public void setIsLigado(boolean isLigado)
	{
		this.IsLigado = isLigado; 
	}
	
	public void setLitrosCombustivel(int litrosCombustivel)
	{
		this.LitrosCombustivel = litrosCombustivel; 
	}
	
	public void setVelocidade(int velocidade)
	{
		this.Velocidade = velocidade; 
	}
	
	public void setPreco(Double preco)
	{
		this.Preco = preco; 
	}
	
//	• Acelerar(): Antes de acelerar, verificar se o carro está ligado, se estiver ligado acelera(20 km/h) e consome 1 L de gasolina, 
//	se estiver desligado informa o usuário que não é possível acelerar com o carro desligado;
	public void Acelerar()
	{
		if(getIsLigado() == true)
		{
			setVelocidade(getVelocidade() + 20);
			setLitrosCombustivel(getLitrosCombustivel() - 1);
		}
		else
		{
			System.out.println("Não é possível acelerar com o carro desligado");
		}
	}
	
//	• Abastecer(int qtdLitros): abastece o atributo litrosCombustivel do objeto, fazer verificações para o atributo litrosCombustivel 
//	não exceder 100L;
	public void Abastecer(int qtdLitros)
	{
		if(getLitrosCombustivel() + qtdLitros <= 100)
		{
			setLitrosCombustivel(getLitrosCombustivel() + qtdLitros);
		}
	}
	
//	• Frear(): verificar se o veículo está ligado ou não, caso ligado e com velocidade > 0, frear o veículo em diminuindo 10km/h de 
//	velocidade do carro.
	public void Frear()
	{
		if(getIsLigado() == true && getVelocidade() > 0)
		{
			setVelocidade(getVelocidade() - 10);
		}
	}
	
//	• Pintar(String cor): substitui a cor do veículo;
	public void Pintar(String cor)
	{
		setCor(cor);
	}
	
//	• Ligar(): Deve ligar o carro, verificando se ele já não se encontra ligado;
	public void Ligar()
	{
		if(getIsLigado() == false)
		{
			setIsLigado(true);
		}
	}
	
//	• Desligar(): Deve desligar o veículo, caso o veículo se encontra desligado, deverá fazer a validação;
	public void Desligar()
	{
		if(getIsLigado() == true)
		{
			setIsLigado(false);
		}
	}
		
}