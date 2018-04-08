package es.unileon.prg1.date;


public class Date {
	
private int day;
	
private int month;
	
private int year;
	
	
// Constructor mal programado: Permite crear fechas no validas
	public Date(int day, int month, int year){
		
this.day = day;
		
this.month = month;
		
this.year = year;
	}
	
	
public int getYear(){
		
return this.year;
	}

	
boolean isSameYear(Date another){
		
if ( this.year == another.getYear() ){
			
return true;
		}
		
return false;
	}
	
	
public String toString(){
	
return this.day + "/" + this.month + "/" + this.year;
	}





	
	public Date() {
		day=1;
		month=1;
		year=1;
	}
	public int isSameYear(int year) {
		if(this.year==year)
		return 1;
		else
		return 0;
	}
	public int isSameMonth(int month) {	
		if(this.month==month)
		return 1;
		else
		return 0;
	}
	public int isSameDay(int day) {
		if(this.day==day)
		return 1;
		else
		return 0;
	}
	public int isSame(int year, int month, int day) {
		if((this.year==year)&&(this.month==month)&&(this.day==day))
		return 1;
		else
		return 0;
	}
	public boolean isSameYear2(int year) {
		return(this.year==year);
	}
	public boolean isSameMonth2(int month) {
		return(this.month==month);
	}
	public boolean isSameDay2(int day) {
		return(this.day==day);
	}
	public void NameMonth(int month) {
		switch(month) {
			case 1:System.out.println("January");
			break;
			case 2:System.out.println("February");
			break;
			case 3:System.out.println("March");
			break;
			case 4:System.out.println("April");
			break;
			case 5:System.out.println("May");
			break;
			case 6:System.out.println("June");
			break;
			case 7:System.out.println("July");
			break;
			case 8:System.out.println("August");
			break;
			case 9:System.out.println("September");
			break;
			case 10:System.out.println("October");
			break;
			case 11:System.out.println("November");
			break;
			case 12:System.out.println("December");
			break;
		
		default:System.out.println("Exit");
		
		}
		
	}
	public boolean CheckDay(int month, int day) {
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
			if((day<1)||(day>31)) {
				return false;
			}
				else {
					return true;
		
		}
		}
		if((month==4)||(month==6)||(month==9)||(month==11)){
			if((day<1)||(day>30)) {
				return false;
			}
				else {
					return true;
		
		}
		}
		if(month==2){
			if((day<1)||(day>28)) {
				return false;
			}
				else {
					return true;
		
		}
		}
		return true;
	}
	public void NameSeason(int day, int month) {
        if (((day>=21)&&(month>=3))&&((day<21)&&(month<=6)))
        System.out.println("Spring");
        if (((day>=21)&&(month>=6))&&((day<23)&&(month<=9)))
        System.out.println("Summer");
        if (((day>=23)&&(month>=9))&&((day<21)&&(month<=12)))
        System.out.println("Autumn");
        if (((day>=21)&&(month>=12))&&((day<21)&&(month<=3)))
        System.out.println("Winter");
    }
	
	
	public void MonthLeft(int month) {
		int left;
		left=12-month;
		System.out.println("quedan:"+ left);
	}
	
	
	public void create(int day, int month, int year) {
		
	do {
		day=(int)Math.random()*31+1;
		month=(int)Math.random()*12+1;
		year=(int)Math.random()*2018+1;
	}
	   while 	(CheckDay(day,month)==false);
	System.out.println("la fecha es"+ day + month);
	}
	
	public void DayLeft(int day, int month) {
		
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)){
			 
				for(int i=day+1;i<=31;i++)
				{
					System.out.println(i +" del "+month );
				}
				}
				
		if((month==4)||(month==6)||(month==9)||(month==11)){
			for(int i=day+1;i<=30;i++) {
				System.out.println(i +" del "+month );
			}
		}
		
		if(month==2){
			
				for(int i=day+1;i<=29;i++) {
					System.out.println(i +" del "+month );
				}
			}
	}
	
	public void SameMonth(int month) {
		if((month==1)||(month==3)||(month==5)||(month==7)||(month==8)||(month==10)||(month==12)) {
			System.out.println("los meses son: Enero, Marzo, Mayo, Julio, Agosto, Octubre y Diciembre");
	}
		if((month==4)||(month==6)||(month==9)||(month==11)){
			System.out.println(" los meses son: Marzo, Abril, Junio, Septiembre, Noviembre");
		}
		if(month==2){
			System.out.println("el mes es: Febrero");
		}
	
	}
	
	public void CountDays(int day, int month) {
		int dias;
	
		switch(month) {
		case 1: 
			dias=day;
			System.out.println("quedan:" + dias);
		break;
		case 2:
			dias=day+31;
			System.out.println("quedan:" + dias);
		break;
		case 3:
			dias=day + 31 + 28;
			System.out.println("quedan:" + dias);
		break;
		case 4:
			dias=day + 31 + 28 + 31;
			System.out.println("quedan:" + dias);
		break;
		case 5:
			dias= day + 31 + 28 + 31 + 30; 
			System.out.println("quedan:" + dias);
		break;
		case 6:
			dias=day +31+28+31+30+31;
			System.out.println("quedan:" + dias);
		break;
		case 7:
			dias=day +31+28+31+30+31+30;
			System.out.println("quedan:" + dias);
		break;
		case 8:
			dias=day +31+28+31+30+31+30+31;
			System.out.println("quedan:" + dias);
		break;
		case 9:
			dias=day +31+28+31+30+31+30+31+31;
			System.out.println("quedan:" + dias);
		break;
		case 10:
			dias=day +31+28+31+30+31+30+31+31+30;
			System.out.println("quedan:" + dias);
		break;
		case 11:
			dias=day +31+28+31+30+31+30+31+31+30+31;
			System.out.println("quedan:" + dias);
		break;
		case 12:
			dias=day +31+28+31+30+31+30+31+31+30+31+30;
			System.out.println("quedan:" + dias);
		break;
	
	}
	
	}
		@SuppressWarnings("unused")
public void Attemps(int day, int month) {
	
		int cont=0;
		int daya;
		int montha;
		daya=0;
		montha=0;
	
	
		while((daya!=day)||(montha!=month)){
			while (CheckDay(day,month)==true){
				daya=(int)Math.random()*31+1;
				montha=(int)Math.random()*12+1;
				cont++;
			}
			cont++;
		}
		
		
		System.out.println("intentos:"+ cont);
	}
		
public void Attemps2(int day,int month) {
		int cont=0;
		int days=0;
		int months=0;	
		
		do {
			while (CheckDay(day,month)==true) {
				days=(int)Math.random()*31+1;
				months=(int)Math.random()*12+1;
				cont ++;
				
			}
			cont ++;
		}
	    while ((days!=day)||(months!=month));
		System.out.println("intentos:"+ cont);
	
		}
	
public void last(int day, int month,int firstday) {
	int dias=0;
	
	switch(month) {
	case 1: 
		dias=day;
		
	break;
	case 2:
		dias=day+31;
	
	break;
	case 3:
		dias=day + 31 + 28;
		
	break;
	case 4:
		dias=day + 31 + 28 + 31;
		
	break;
	case 5:
		dias= day + 31 + 28 + 31 + 30; 
		
	break;
	case 6:
		dias=day +31+28+31+30+31;
		
	break;
	case 7:
		dias=day +31+28+31+30+31+30;
		
	break;
	case 8:
		dias=day +31+28+31+30+31+30+31;
		
	break;
	case 9:
		dias=day +31+28+31+30+31+30+31+31;
	
	break;
	case 10:
		dias=day +31+28+31+30+31+30+31+31+30;
		
	break;
	case 11:
		dias=day +31+28+31+30+31+30+31+31+30+31;
		
	break;
	case 12:
		dias=day +31+28+31+30+31+30+31+31+30+31+30;
		
	break;

	}
	dias=dias%7;
	dias=(dias-firstday)%7;
	switch(dias)
	{
	
		
	case 0:
		System.out.println("lunes");
		break;
	case 1:
		System.out.println("martes");
		break;
	case 2:
		System.out.println("miercoles");
		break;
	case 3:
		System.out.println("jueves");
		break;
	case 4:
		System.out.println("viernes");
		break;
	case 5:
		System.out.println("sabado");
		break;
	case 6:
		System.out.println("domingo");
		break;
	
	}
	
	
	}
	
	
	
	
	

	
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
}
