package it.polito.tdp.libretto.model;

import java.util.ArrayList;
import java.util.List;

public class Libretto {

	private List<Voto> voti = new ArrayList<>();
		
		public boolean add(Voto v){
			if(this.isConflitto(v)|| this.isDuplicato(v)) {
				return false; 
			}
			else {
				this.voti.add(v); 
				return true; 
			}
			
		}

		@Override
		public String toString() {
		String s= "";
		for(Voto v : this.voti) {
			s= s+v.toString()+"\n";
		}
		return s; 
		}
		
		public Libretto estraiVotiUguali(int voto) {
			Libretto nuovo = new Libretto(); 
			for(Voto v: this.voti) {
				if(v.getVoto()==voto) {
					nuovo.add(v);
				}
			}
			return nuovo; 
		}

		public Voto cercaNomeCorso(String nomeCorso) {
			
			/*for(Voto v : this.voti) {
				if(nomeCorso.equals(v.getCorso())) {
					return v; 
				}
			}

			return null;*/
			
			int pos = this.voti.lastIndexOf(new Voto(nomeCorso, 0, null));
			
			if(pos != -1) {
				return this.voti.get(pos);
			}
			else {
				return null; 
			}
		}
		
		public boolean isDuplicato(Voto v) {
			
			Voto esiste = this.cercaNomeCorso(v.getCorso()); 
			
			if(esiste == null) {
				return false; 
			}
			return (esiste.getVoto() == v.getVoto()); 
			
		}
		public boolean isConflitto(Voto v) {
			
			Voto esiste = this.cercaNomeCorso(v.getCorso());
			if(esiste == null) {
				return false; 
			}
			
			return (esiste.getVoto() != v.getVoto()); 
			
			
			
		}
		
		
		
	} 
	
	
	

