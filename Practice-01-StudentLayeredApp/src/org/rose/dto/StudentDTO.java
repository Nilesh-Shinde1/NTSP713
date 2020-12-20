package org.rose.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentDTO implements Serializable {
	private int sno;
	private String sname;
	private float total;
	private float percentage;
	private String result;	
}
