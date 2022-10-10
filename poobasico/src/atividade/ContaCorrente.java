package atividade;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthOptionPaneUI;
public class ContaCorrente {

	public String nome_titular;
	public long cpf;
	public long conta;
	public Double saldo;
	
	public void MostrarDados() {
		
		System.out.println("Titular"+nome_titular);
		System.out.println("Cpf: "+cpf);
		System.out.println("conta: "+conta);
		System.out.println("Saldo: "+saldo);
	
	}
	public void depositar(Double valorDeposito) {
		saldo = saldo + valorDeposito;
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
		ContaCorrente c = new ContaCorrente();
		
		c.nome_titular = "Henry Janke";
		c.cpf = 23412312;
		c.conta = 1120042004;
		c.saldo = 1000.0;
	
		c.MostrarDados();
		c.depositar(null);
		c.sacar(null);
		
		c.MostrarDados();
	
	}
}