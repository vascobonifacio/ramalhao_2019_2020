package ramalhao.pgo.casa;

public class Porta {
	
	private String cor;
	private boolean aberta;
	
	public Porta(String cor, boolean aberta) 
	{
		this.cor = cor;
		this.aberta = aberta;
	}
	
	public String getCor() 
	{
		return cor;
	}
	
	public void setCor(String cor) 
	{
		this.cor = cor;
	}
	
	public boolean isAberta()
	{
		return aberta;
	}
	
	public void setAberta(boolean aberta) 
	{
		this.aberta = aberta;
	}
}
