package br.com.diego.trijava;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Fusorario {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		LocalDate niver = LocalDate.parse("2021-07-20", DateTimeFormatter.ISO_LOCAL_DATE);
		System.out.println(niver.format(DateTimeFormatter.ISO_LOCAL_DATE));
		
		Integer dias = 0;
		
		if(niver.isBefore(hoje)) {
			while(niver.isBefore(hoje)) {
				niver = niver.plusDays(1);
				dias++;
			}			
		} else {
			while(hoje.isBefore(niver)) {
				hoje = hoje.plusDays(1);
				dias--;
			}
		}
		
		if (dias != -1 && dias != 0 && dias != 1) {
			System.out.println("Voce viveu " + dias + " dias");
		} else {
			System.out.println("Voce viveu " + dias + " dia");
		}
	}
}