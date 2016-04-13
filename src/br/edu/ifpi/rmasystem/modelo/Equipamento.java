package br.edu.ifpi.rmasystem.modelo;

public class Equipamento {
	
	private String descricao;
	private String marca;
	private String modelo;
	private String serial;
	private String dataNotaFiscal;
	private String cpfComprador;
	
	public Equipamento(String descricao, String marca, String modelo, String serial, String dataNotaFiscal,
			String cpfComprador) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
		this.dataNotaFiscal = dataNotaFiscal;
		this.cpfComprador = cpfComprador;
	}

	public Equipamento(String descricao, String marca, String modelo) {
		super();
		this.descricao = descricao;
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getSerial() {
		return serial;
	}
	
	public void setSerial(String serial) {
		this.serial = serial;
	}
	
	public String getDataNotaFiscal() {
		return dataNotaFiscal;
	}
	
	public void setDataNotaFiscal(String dataNotaFiscal) {
		this.dataNotaFiscal = dataNotaFiscal;
	}
	
	public String getCpfComprador() {
		return cpfComprador;
	}
	
	public void setCpfComprador(String cpfComprador) {
		this.cpfComprador = cpfComprador;
	}

}
