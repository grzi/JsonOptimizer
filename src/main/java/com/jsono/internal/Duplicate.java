package com.jsono.internal;

public class Duplicate {
	
	private String value;
	private int iteration;
	private String compressedValue;
	private String compressedValueDefinition;

	@Override
	public String toString() {
		return "Duplicate value = " + (value == null ? "" : value) + ", iteration = " + iteration + ", compressed value = " + (compressedValue == null ? "" : compressedValue);
	}
	
	public static Duplicate initDuplicate(String val){
		Duplicate d = new Duplicate();
		d.setValue(val);
		d.setIteration(1);
		return d;
	}
	
	public void addIteration(){
		this.iteration++;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public int getIteration() {
		return iteration;
	}

	public void setIteration(int iteration) {
		this.iteration = iteration;
	}

	public String getCompressedValue() {
		return compressedValue;
	}

	public void setCompressedValue(String compressedValue) {
		this.compressedValue = compressedValue;
	}

	public String getCompressedValueDefinition() {
		return compressedValueDefinition;
	}

	public void setCompressedValueDefinition(String compressedValueDefinition) {
		this.compressedValueDefinition = compressedValueDefinition;
	}
	
	
}
