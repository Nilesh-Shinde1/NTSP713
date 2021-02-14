package org.rose.bo;

import java.io.Serializable;

import lombok.Data;

@Data
public class StudentBO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Double per;
	private Double total;
	private String result;
	
}
