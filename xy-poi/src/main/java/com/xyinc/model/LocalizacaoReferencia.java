package com.xyinc.model;

import javax.validation.constraints.Positive;

public class LocalizacaoReferencia {

	@Positive
	private int x;
	
	@Positive
	private int y;
	
	@Positive
	private int dmax;

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

	public int getDmax() {
		return dmax;
	}

	public void setDmax(int dmax) {
		this.dmax = dmax;
	}
	
}
