package org.rose.vo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentVO implements Serializable{
	private String sno;
	private String sname;
	private String total;
	private String percentage;
	private String result;	
}
