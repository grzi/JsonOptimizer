package com.jsono.internal;

public class Duplicate {
	private String value;
	private int iteration;
	private String compressedValue;

	@Override
	public String toString() {
		return "Duplicate value = " + (value == null ? "" : value) + ", iteration = " + iteration + ", compressed value = " + (compressedValue == null ? "" : compressedValue);
	}
}
