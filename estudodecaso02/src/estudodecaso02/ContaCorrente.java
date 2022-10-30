package estudodecaso02;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ContaCorrente extends Cliente{

	
	
	public String nome_titular;
	public String cpf;
	public long conta;
	public static Double saldo;

	public static void vendas() {

		System.out.println("!!!!!!!!!Possível a venda de apenas um produtos por vez devido a falta de estoque!!!!!!!!!!!!!!");
		System.out.println("Toalhas de rosto brancas[1]-R$5,00");
		System.out.println("vasilhame[2]-R$5,00");
		System.out.println("Pente de cabo e dente fino[3]-R$3,00");
		System.out.println("Pente de cabo reto[4]-R$7,00");
		System.out.println("Pente de dentes largos[5]-R$9,00");
		System.out.println("Espuma para barbear[6]-R$25,00");
		System.out.println("Loção[7]-R$30,00");
		System.out.println("bálsamo pós-barba[8]-R$40,00");
		System.out.println("Escova raquete[9]-R$13,00");
		System.out.println("Shampoo[10]-R$16,00");
		System.out.println("Condicionador[11]-R$24,00");
	}
	public void MostrarDados() {

		System.out.println("Titular"+nome_titular);
		System.out.println("Cpf: "+cpf);
		System.out.println("conta: "+conta);
		System.out.println("Saldo: "+saldo);

	}
	
	public void depositar(Double valorDeposito) {
		saldo = null;
		saldo = saldo + valorDeposito;
	}

	public static void comando () {
		System.out.println("Agendamentos[1] ");
		System.out.println("Produtos[2] ");
		System.out.println("Consulta[3]");
		System.out.println("OP: ");
	}
	public Double sacar(Double ValorSaque) {
		double retornoSaque = 0;
		double valorSaque = 0; 

		if(ValorSaque>saldo) {
			System.out.println("Saldo insuficiente!");
		}else {
			saldo = saldo - ValorSaque;
			retornoSaque = valorSaque;
		}

		return retornoSaque;
	}
	
	
	public static void main(String[] args) {
		try (Scanner leitura = new Scanner(System.in)) {
			Integer op = null;
			System.out.println("Login[1]");
			System.out.println("Sobre[2]");
			System.out.println("OP: ");
			op = leitura.nextInt();
			switch (op) {
			case 1: 
				Cliente cliente = new Cliente();
				System.out.println("Usuário: ");
				cliente.usuario = leitura.next();
				System.out.println("Senha: ");
				cliente.senha = leitura.nextDouble();
				System.out.println("Bem Vindo "+ cliente.usuario);
				Agendamento ag = new Agendamento();
				op = null;
				
				comando ();
				op = leitura.nextInt();
		
				int volta = 0;
					switch (op) {
					case 1: 
						
						System.out.println("Digite o dia que deseja agendar um corte: ");
						ag.agendamentos = leitura.next();
							if (volta == 0) {
								System.out.println("Deseja voltar[0/1]: ");
								volta = leitura.nextInt();
								comando ();
								op = leitura.nextInt();
						
						}else {
							System.out.println("!!!Muito obrigado por usar nosso algoritmo!!!");
						}
						break;
					case 2:
						
						vendas();
						ag.produtos = leitura.nextInt();
						System.out.println("Digite nome Titular e cpf para efetuar a venda;");
						ContaCorrente c = new ContaCorrente();
						System.out.println("Nome Titular: ");
						c.nome_titular = leitura.nextLine();
						System.out.println("Cpf: ");
						c.cpf = leitura.next();
						System.out.println("Número da conta: ");
						c.conta = leitura.nextLong();
						switch (ag.produtos) {
						case 1: {
							saldo = saldo - 5;
								
						}case 2: {
							saldo = saldo - 5;
							
						}case 3: {
							saldo = saldo - 3;
							
						}case 4: {
							saldo = saldo - 7;
							
						}case 5: {
							saldo = saldo - 9;
							
						}case 6: {
							saldo = saldo - 25;
							
						}case 7: {
							saldo = saldo - 30;
							
						}case 8: {
							saldo = saldo - 40;
							
						}case 9: {
							saldo = saldo - 13;
							
						}case 10: {
							saldo = saldo - 16;
							
						}case 11: {
							saldo = saldo - 24;
							
						}
						default:
							System.out.println("Erro");
					}

				
			ContaCorrente.saldo = (double) 2500;

				c.MostrarDados();
				c.depositar(null);
				c.sacar(null);

				c.MostrarDados();
				}
			}
		}
	}
}

