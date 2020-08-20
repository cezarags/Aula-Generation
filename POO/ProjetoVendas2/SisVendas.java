package ProjetoVendas2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class SisVendas extends SisVendasLoja{

	final double teclado = 29.90; //código do produto: 1
	final double mouse = 20.00; //código do produto: 2
	final double webCam = 59.97; //código do produto: 3
	final double monitor = 320.90; //código do produto: 4
	private long cpf;
	private long ncompra; //número da compra
	
	Scanner sc1 = new Scanner(System.in);
	double vt,p;//vt = valor total, p = produto
	int qp;//qp = quantidade por produto
	char x;
	
	Collection <String> lista = new ArrayList<String>(); //lista é a lista final de produtos
	String cpfCont; //verificar quantidade de números com conversão
	
	public void login() 
	{
		 String user;
		 String senha;
		 boolean logado = false;
		 
		 do 
		 { 
			 //ProgressBar thread = new ProgressBar("Thread #1");
			 try 
			 {
				 Thread.sleep(15000);
			 } catch (InterruptedException e) 
			 {
				 // TODO Auto-generated catch block
				 e.printStackTrace();
			 }
			 System.out.println("Digite seu usuario do sistema:");
			 user = sc.nextLine();
			 System.out.println("Digite sua senha:");
			 senha = sc.nextLine();
		
			 if (!user.equalsIgnoreCase("vendedor") && !senha.equalsIgnoreCase("123")) 
			 {
				 // && senha == 123)
				 System.out.println("Usuario o senha invalidos! \n");
			 }else 
			 {
				logado=true;
				System.out.println("login Efetuado com sucesso");
			 }
		 }while(logado!=true);
	}
	Scanner sc = new Scanner(System.in);
	public boolean cpfNanota()
	{
		System.out.println("Deseja cpf na nota? (S/N)");
		x = sc.next().charAt(0);
		if(x == 's'||x =='S')
		{
			return true;
		}
		return false;
	}
	public long cpf()
	{
		if (cpfNanota() == true)
		{
			do 
			{
				System.out.println("Digite seu cpf sem pontos, apenas numeros!"); 
				cpf = sc.nextLong();
				cpfCont = Long.toString(cpf);
				
				if(cpfCont.length()!=11)
				{
					System.out.println("Cpf Invalido!");
				}
				else
				{
					System.out.println("Cpf Válido! Continue");
				}
			}while(cpfCont.length()!=11);
			return cpf;
		}
		else
		{
			return 00000000000;
		}
	}
	public double valor()
	{
		System.out.println("Para finalizar a compra entre com 0 ou número negativo");
		System.out.println("Entre com o código do produto:");
		p = sc.nextDouble();
		while (p > 0.0) 
		{
			System.out.println("Entre com quantidade desse produto:");
			qp = sc.nextInt(); //transformando qp em string para apresentar na lista
			String lqp = Integer.toString(qp);
			if(p == 1)
			{
				p = teclado * qp;
				lista.add("Produto: Teclado");
				lista.add("Quantidade: " +lqp);
				lista.add("Valor Unitário: 29.90");
			}
			else if(p == 2)
			{
				p = mouse * qp;
				lista.add("Produto: Mouse");
				lista.add("Quantidade: " +lqp);
				lista.add("Valor Unitário: 20.00");
			}
			else if(p == 3)
			{
				p = webCam * qp;
				lista.add("Produto: WebCam");
				lista.add("Quantidade: " +lqp);
				lista.add("Valor Unitário: 59.97");
			}
			else if(p == 4)
			{
				p = monitor * qp;
				lista.add("Produto: Monitor");
				lista.add("Quantidade: " +lqp);
				lista.add("Valor Unitário: 320.90");
			}
			vt = vt + p;
			System.out.println("Entre com o código do produto:");
			p = sc.nextInt();	
		}
		return vt;
	}
	public void getlista()
	{
		for(String nota: lista)
		{
			System.out.println(nota);
		}
	}
	public void compra()
	{
		System.out.printf("Total: %.2f \n",vt);
	}
	
	public SisVendas(String nomeLoja,long cnpjLoja, long ncompra)
	{
		super(nomeLoja, cnpjLoja);
		this.ncompra = ncompra;
	}
	public String getinfo()
	{
		String info = nomeLoja+"\t"+cnpjLoja+"\t"+ncompra+"\n";
		return info;
	}
	
	public String retornacpf() {
		
		if(cpfCont ==null) {
			
			cpfCont = "00000000000";
			
		}
		return cpfCont;
		
	}
	
	
	
	

	public String getCpfCont() {
		return cpfCont;
	}

	public void setCpfCont(String cpfCont) {
		this.cpfCont = cpfCont;
	}


}