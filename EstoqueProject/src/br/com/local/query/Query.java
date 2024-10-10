package br.com.local.query;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.local.cadastro.Cadastro;
import br.com.local.connection.ConnectingProperty;

public class Query {
	public static void main(String[] Args) throws SQLException{


	Connection conn = null;
	Statement stmt = null;
	
	String url = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	
	try {
		conn = DriverManager.getConnection(url, ConnectingProperty.getProperties());
		stmt = conn.createStatement();
		
		if(conn!=null) {
			String sql = "INSERT INTO produtos VALUES"
					+ "('Teclado', 909090222, '10-10-2024', null, 'Redragon')";
			stmt.executeUpdate(sql);
			
			sql = "SELECT * FROM produtos";
			ResultSet rs = stmt.executeQuery(sql);
			System.out.println("Cadastro efetuado com sucesso!");
			
			List<Cadastro> cadastros = new ArrayList<>();
			while(rs.next()) {
				Cadastro cadastro = new Cadastro();
				cadastro.setNomeProduto(rs.getString("NOME_PRODUTO"));
				cadastro.setIdProduto(rs.getInt("ID_PRODUTO"));
				cadastro.setDataInsercao(rs.getString("DATA_INSERCAO"));
				cadastro.setDataValidade(rs.getString("DATA_VALIDADE"));
				cadastro.setFornecedorProduto(rs.getString("FORNECEDOR_PRODUTO"));
				cadastros.add(cadastro);
			}
			for (Cadastro cadastro : cadastros) {
				cadastro.ShowStock();
			}
			
		}
		System.out.println("Conectado no banco de dados");
	}
	
	catch(Exception e){
		e.printStackTrace();
	}
	finally {
		conn.close();
		stmt.close();
		}
}
}
