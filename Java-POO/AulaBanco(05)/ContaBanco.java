package aula05;

public class ContaBanco {
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("---------------------------------------");
		System.out.println("Número da conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: "+ this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Conta aberta? " + this.getStatus());
	}
	
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		if (t == "cc") {
			this.setSaldo(50);
		}else if (t == "cp") {
			saldo = 150;
		}
		System.out.println("Conta aberta com sucesso!");

	}
	public void fecharConta() {
		if (saldo > 0) {
			System.out.println("Essa conta ainda tem dinheiro, não pode ser fechada.");
		}else if (saldo < 0) {
			System.out.println("Essa conta está em dívida, não pode ser fechada.");
		}else {
			status = false;
			System.out.println("Conta fechada.");
		}
	}
	public void depositar(float v) {
		if (status == true) {
			setSaldo(getSaldo() + v);
			System.out.println("Depósito feito com sucesso!");
		}else {
			System.out.println("Não há conta para o depósito.");
		}
	}
	public void sacar(float v) {
		if (status == true) {
			if (saldo > v) {
				setSaldo(getSaldo() - v);
				System.out.println("Saque realizando com sucesso!");
			}else {
				System.out.println("Saldo insuiciente.");
			}
		}else {
			System.out.println("Não há conta para o saque.");
		}
	}
	public void boleto() {
		float v;
		if (tipo == "cc") {
			v = 12;
		}else if (tipo == "cp") {
			v = 20;
		}
		if (status == true) {
			if (saldo > v) {
				saldo -= v;
				System.out.println("Mensalidade paga com sucesso!");
			}else {
				System.out.println("Saldo insuficiente.");
			}
		}else {
			System.out.println("Não há cpntapara o pagamento.");
		}
	}
	public ContaBanco() {
		this.status = false;
		this.saldo = 0;
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int n) {
		this.numConta = n;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String d) {
		this.dono = d;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float s) {
		this.saldo = s;
	}
	public boolean getStatus() {
	    return status;
	}

	public void setStatus(boolean s) {
	    this.status = s;
	}

}
