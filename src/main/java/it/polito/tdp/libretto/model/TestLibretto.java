package it.polito.tdp.libretto.model;

import java.time.LocalDate;

public class TestLibretto {
	
	Libretto lib; 
	
	private void run() {	
	this.lib = new Libretto();
	
	Voto v1 = new Voto("Analisi II", 28, LocalDate.of(2018, 02, 18));
	Voto v2 = new Voto("Basi di Dati", 25, LocalDate.of(2019, 02, 22));
	Voto v3 = new Voto("Fisica II", 26, LocalDate.of(2019, 02, 26));
	Voto v4 = new Voto("Informatica", 23, LocalDate.of(2017, 06, 23));
	Voto v5 = new Voto("Programmazione a Oggetti", 22, LocalDate.of(2029, 01, 31));
	Voto v6 = new Voto("Algebra Lineare e Geometria", 23, LocalDate.of(2018, 02, 26));
	Voto v7 = new Voto("Analisi I", 18, LocalDate.of(2018, 01, 30));
	Voto v8 = new Voto("Statistica", 21, LocalDate.of(2019, 06, 21));
	Voto v9 = new Voto("Sistemi di Produzione", 22, LocalDate.of(2018, 9, 03));
	Voto v10 = new Voto("Sistemi Telematici", 19, LocalDate.of(2020, 01,27));
	
	lib.add(v1);
	lib.add(v2);
	lib.add(v3);
	lib.add(v4);
	lib.add(v5);
	lib.add(v6);
	lib.add(v7);
	lib.add(v8);
	lib.add(v9);
	lib.add(v10);
	
	if(lib.add(new Voto("Analisi II", 28, LocalDate.now()))==false) {
		System.out.println("Errore nell'inserimento di Analisi II"); 
	}
	
	System.out.println(this.lib); 
	System.out.println(this.lib.estraiVotiUguali(28));
	
	String nomeCorso = "Analisi II"; 
	Voto voto = lib.cercaNomeCorso(nomeCorso); 
	
	System.out.println("Il voto di "+nomeCorso+" è "+ voto.getVoto()+"\n"); 
	
	Voto votomancante = lib.cercaNomeCorso("Programmazione delle Merendine"); 
	
	System.out.println("Il voto di Programmazione delle Merendine è "+ votomancante+"\n"); 
	
	
	Voto inform2 = new Voto("Informatica", 24, LocalDate.now()); 
	Voto inform3 = new Voto("Informatica", 23, LocalDate.now()); 
	
	System.out.println("Informatica con 24 è duplicato: "+lib.isDuplicato(inform2)+ "/ conflitto: "+lib.isConflitto(inform2)); 
	
	System.out.println("Informatica con 23 è duplicato: "+lib.isDuplicato(inform3)+ "/ conflitto: "+lib.isConflitto(inform3)); 
	
	
	}
	
	public static void main(String[] args) {
		TestLibretto test = new TestLibretto(); 
		test.run(); 
	}

}
