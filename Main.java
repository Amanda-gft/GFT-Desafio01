public class Main
{
	public static void main (String[] args)
	{
		Veiculo v1 = new Veiculo();
		
		v1.setMarca("GM");
		v1.setModelo("Astra");
		v1.setCor("Preto");
		v1.setIsLigado(true);
		v1.setKm(91000);
		v1.setLitrosCombustivel(35);
		v1.setPlaca("XXX-0000");
		v1.setPreco(20000.00);
		v1.setVelocidade(60);
		
		System.out.println("Inicial marca: " + v1.getMarca());
		System.out.println("Inicial modelo: " + v1.getModelo());
		System.out.println("Inicial cor: " + v1.getCor());
		System.out.println("Inicial isLigado: " + v1.getIsLigado());
		System.out.println("Inicial km: " + v1.getKm());
		System.out.println("Inicial litrosCombustivel: " + v1.getLitrosCombustivel());
		System.out.println("Inicial placa: " + v1.getPlaca());
		System.out.println("Inicial preco: " + v1.getPreco());
		System.out.println("Inicial velocidade: " + v1.getVelocidade());

//		v1.Acelerar();
//		System.out.println("Final litrosCombustivel: " + v1.getLitrosCombustivel());
//		System.out.println("Final velocidade: " + v1.getVelocidade());
		
//		v1.Abastecer(70);
//		System.out.println("Final litrosCombustivel: " + v1.getLitrosCombustivel());
		
//		v1.Desligar();
//		System.out.println("Final isLigado: " + v1.getIsLigado());
		
//		v1.Frear();
//		System.out.println("Final velocidade: " + v1.getVelocidade());
		
//		v1.Ligar();
//		System.out.println("Final isLigado: " + v1.getIsLigado());

	}
	
}