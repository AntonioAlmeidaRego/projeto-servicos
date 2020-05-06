package br.com.projetoservicos.util;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Conversor {
	
	
	public String convertDayOfTheWeekUsForBr(Date date) {
		if(date.getDay() == 0) {
			return "Domingo";
		}else if(date.getDay() == 1) {
			return "Segunda-Feira";
		}else if(date.getDay() == 2) {
			return "Terça-Feira";
		}else if(date.getDay() == 3) {
			return "Quarta-Feira";
		}else if(date.getDay() == 4) {
			return "Quinta-Feira";
		}else if(date.getDay() == 5) {
			return "Sexta-Feira";
		}else if(date.getDay() == 6) {
			return "Sábado";
		}
		return "";
	}
	
	public List<Long> convertArrayStringForListLong(String string){
		String array[] = string.split(",");
		List<Long> longs = new ArrayList<Long>();
		for(int i = 0; i < array.length; i++) {
			Long log = Long.parseLong(array[i]);
			longs.add(log);
		}
		
		return longs;
	}
	
	public String convertStringSpaceToString(String string) {
		String array[] = string.split("");
		String str = "";
		
		for(int i = 0; i < array.length;i++) {
			if(!array[i].equals(" ")) { 
				str += array[i];
			}
		} 
		return str;
	}
	
	public String convertStringSpaceURIToString(String string) {
		String array[] = string.split("");
		String str = "";
		
		for(int i = 0; i < array.length;i++) {
			if(!array[i].equals("%") && !array[i].equals("2") && !array[i].equals("0")) { 
				str += array[i];
			}
		}
		return str;
	}
	
	public String convertMonthUsForBr(Date date) {
		if(date.getMonth() == 0) {
			return "Janeiro";
		}else if(date.getMonth() == 1) {
			return "Fevereiro";
		}else if(date.getMonth() == 2) {
			return "Março";
		}else if(date.getMonth() == 3) {
			return "Abril";
		}else if(date.getMonth() == 4) {
			return "Maio";
		}else if(date.getMonth() == 5) {
			return "Junho";
		}else if(date.getMonth() == 6) {
			return "Julho";
		}else if(date.getMonth() == 7) {
			return "Agosto";
		}else if(date.getMonth() == 8) {
			return "Setembro";
		}else if(date.getMonth() == 9) {
			return "Outubro";
		}else if(date.getMonth() == 10) {
			return "Novembro";
		}else if(date.getMonth() == 11) {
			return "Dezembro";
		}
		return "";
	}
	
	public String convertDateUSForBr(String date) {
		String array [] = date.split("-");	
		return array[2]+"/"+array[1]+"/"+array[0]; 
	}
	
	public String convertDateStringBrForUS(String date) {
		String array [] = date.split("/");	
		return array[2]+"-"+array[1]+"-"+array[0]; 
	}
	
	public Date convertDateBrForUS(String date) {
		String array [] = date.split("/");	
		return new Date(Integer.parseInt(array[2]), Integer.parseInt(array[1]), Integer.parseInt(array[0]));
	}
	
	public String convertDateForHoraBr(Date date) {
		String hora = checkNumber(date.getHours()) + ":" + checkNumber(date.getMinutes()) + ":"+ checkNumber(date.getSeconds());
		return hora;
	}
	
	public String convertDateUSForBr(Date date) {
		final int mes = date.getMonth() + 1;
		final int data = date.getDate();
		String dataConvert = "";
		String mesConvert = "";
		
		dataConvert = checkNumber(data);
		mesConvert = checkNumber(mes);
		
		String anoConvert = String.valueOf(date.getYear()).substring(1, String.valueOf(date.getYear()).length());
		
		return dataConvert+"/"+mesConvert+"/"+"20"+anoConvert;
	}
	
	private String checkNumber(Integer number) {
		if(number > 9) {
			return number.toString();
		}
		return "0"+number;
	}
	
	private String convertYearUseForBr(Date date) {
		return "20"+ String.valueOf(date.getYear()).substring(1, String.valueOf(date.getYear()).length());
	}
	
}
