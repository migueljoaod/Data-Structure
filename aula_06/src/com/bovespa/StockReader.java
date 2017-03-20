package com.bovespa;

import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.stream.Stream;

import com.sun.org.apache.xml.internal.serialize.LineSeparator;

public class StockReader {

	public static final DateTimeFormatter DATE_FORMATER = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	private int counter = 0;
	
	public Stock[] read(String pathName) throws Exception{
		Stream<String> lines = Files.lines(Paths.get(pathName));
		Stock[] stocks = new Stock[(int) lines.count()-2];
		
		lines = Files.lines(Paths.get(pathName));
		lines.forEach(line -> {
			if (line.startsWith("01")) {
				Stock stock = new Stock();
				stock.setCode(line.substring(12, 24).trim());
				stock.setDate(LocalDate.parse(line.substring(2, 10), DATE_FORMATER));
				stock.setOpenPrice(new BigDecimal(line.substring(56, 67).concat(".").concat(line.substring(67, 69))));
				stock.setClosePrice(new BigDecimal(line.substring(108, 119).concat(".").concat(line.substring(119, 121))));
				stock.setMaxPrice(new BigDecimal(line.substring(69, 80).concat(".").concat(line.substring(80, 82))));
				stock.setMinPrice(new BigDecimal(line.substring(82, 93).concat(".").concat(line.substring(93, 95))));
				stocks[counter++] = stock;

			}
		});
		lines.close();
		return stocks;
	}
}