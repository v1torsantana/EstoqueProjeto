package br.com.local.cadastro;

public class Cadastro {
	private String nomeProduto;
	private int idProduto;
	private String dataInsercao;
	private String dataValidade;
	private String fornecedorProduto;
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getIdProduto() {
		return idProduto;
	}
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	public String getDataInsercao() {
		return dataInsercao;
	}
	public void setDataInsercao(String dataInsercao) {
		this.dataInsercao = dataInsercao;
	}
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public String getFornecedorProduto() {
		return fornecedorProduto;
	}
	public void setFornecedorProduto(String fornecedorPrduto) {
		this.fornecedorProduto = fornecedorPrduto;
	}
	
	public void ShowStock() {
		System.out.println("Exibindo estoque");
		System.out.println("----------------");
		System.out.println("Produto: "+ getNomeProduto() + " ID: "+ getIdProduto() + " Data de inserção: "+getDataInsercao() + " Data de validade: "+ getDataValidade() + " Fornecedor: " + getFornecedorProduto());
	}
	
}
