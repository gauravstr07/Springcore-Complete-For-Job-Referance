package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {

	@Value("#{ 20 + 11 }")
	private int x;

	@Value("#{ 7 + 26 }")
	private int y;

	@Value("#{ T(java.lang.Math).sqrt(35) }")
	private double z;

	@Value("#{ T(java.lang.Math).E }")
	private double e;

	@Value("#{ T(java.lang.Math).PI }")
	private double pi;

	@Value("#{ new java.lang.String('GAURAV SUTAR') }")
	private String name;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	public double getE() {
		return e;
	}

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	public void setE(double e) {
		this.e = e;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", pi=" + pi + ", name=" + name + "]";
	}

}
