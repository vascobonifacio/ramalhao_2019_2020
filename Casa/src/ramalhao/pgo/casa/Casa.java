package ramalhao.pgo.casa;

public class Casa {

	private String cor;
	private int assoalhadas;
	private Porta porta;
	private Telhado telhado;
	private Janela janela1;
	private Janela janela2;

	public Casa(String cor, int assoalhadas, Telhado telhado, Porta porta, Janela janela1, Janela janela2) 
	{
		this.cor = cor;
		this.assoalhadas = assoalhadas;
		this.telhado = telhado;
		this.porta = porta;
		this.janela1 = janela1;
		this.janela2 = janela2;
	}
	
	public boolean temJanelasAzuis() {
		//alterar aqui
		return false;
	}
	
	public boolean temPortaAberta() {
		//alterar aqui
		return false;
	}

	public String getCor() 
	{
		return cor;
	}

	public void setCor(String cor) 
	{
		this.cor = cor;
	}

	public int getAssoalhadas() 
	{
		return assoalhadas;
	}

	public void setAssoalhadas(int assoalhadas) 
	{
		this.assoalhadas = assoalhadas;
	}
	
	public static void main(String[] args) 
	{
		Telhado t1 = new Telhado("vermelho",100);
		Porta p1 = new Porta("azul",false);
		Janela j1 = new Janela("verde",false);
		Janela j2 = new Janela("verde",false);
		
		Casa c1 = new Casa("branca",4,t1,p1,j1,j2);
		
		System.out.println(c1.temJanelasAzuis());
		System.out.println(c1.temPortaAberta());

	}

}
