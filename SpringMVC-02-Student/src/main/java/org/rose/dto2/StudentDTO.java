package org.rose.dto2;

import lombok.Data;

@Data
public class StudentDTO {
	
	private int sno;
	private String sname;
	private int m1,m2,m3;
	private double total;
	private double avg;
	private String result;
}
