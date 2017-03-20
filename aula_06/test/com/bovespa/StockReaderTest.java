package com.bovespa;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.Test;

public class StockReaderTest {
	
	@Test
	public void readTest() throws Exception{
		StockReader stockReader = new StockReader();
		Stock[] stocks = stockReader.read("C:\\eclipse\\COTAHIST_A2016.TXT");
		BigDecimal result = BigDecimal.ZERO;
		int counter = 0;
		for (Stock stock : stocks) {
			if (stock.getCode().equals("VALE5") && stock.getDate().getMonthValue() == 4 && stock.getDate().getYear() == 2016){
				result = result.add(stock.getClosePrice());
				counter++;
			}
		}
		System.out.println(result.divide(BigDecimal.valueOf(counter)));
	}
	
}
