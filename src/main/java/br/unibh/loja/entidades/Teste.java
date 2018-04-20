package br.unibh.loja.entidades;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import java.util.Date;
import java.math.BigDecimal;
import org.junit.Test;

public class Teste {
	@Test
	public void TesteCliente() {
		Date data = new Date();
		
		Cliente c1 = new Cliente(74565L, "Paulo Rodrigues", "biohazard", "123456", "Cliente", "300.100.700-80", "31-1111-1111", "resident@biohazard.com",
				data, data);
		
		Cliente c2 = new Cliente(74565L, "Paulo Rodrigues", "biohazard", "123456", "Cliente", "300.100.700-80", "31-1111-1111", "resident@biohazard.com",
				data, data);
		
		c1.toString();
		c2.toString();
		assertEquals(c1.equals(c2), true);
	}
	
	@Test
	public void TestCategoria() {
		Categoria cat1 = new Categoria(212L, "Teste categoria");
		Categoria cat2 = new Categoria(212L, "Teste categoria");
		
		cat1.toString();
		cat2.toString();
		
		assertEquals(cat1.equals(cat2), true);
	}
	
	@Test
	public void TesteProduto() {
		Categoria cat1 = new Categoria(212L,"Categoria 34");
		Produto prod1 = new Produto(2222L,"produto 44","produto de teste 1", cat1, new BigDecimal(10.99),"fabrica 2");
		Produto prod2 = new Produto(2222L,"produto 44","produto de teste 1", cat1, new BigDecimal(10.99),"fabrica 2");		
	}
}
