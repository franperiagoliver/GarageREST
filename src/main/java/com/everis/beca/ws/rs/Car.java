package com.everis.beca.ws.rs;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Car implements Comparable<Car> {
	
	String matricula;
	String color;
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public int compareTo(Car otherCar) {
		return this.matricula.compareTo(otherCar.getMatricula());
	}
}
