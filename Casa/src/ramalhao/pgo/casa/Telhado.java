package ramalhao.pgo.casa;

public class Telhado {
	
	private String cor;
	private int numeroDeTelhas;
	
	public Telhado(String cor, int numeroDeTelhas) 
	{
		this.cor = cor;
		this.numeroDeTelhas = numeroDeTelhas;
	}

	public String getCor() 
	{
		return cor;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}

	public int getNumeroDeTelhas() 
	{
		return numeroDeTelhas;
	}

	public void setNumeroDeTelhas(int numeroDeTelhas) 
	{
		this.numeroDeTelhas = numeroDeTelhas;
	}
}
