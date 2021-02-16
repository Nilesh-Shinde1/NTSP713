package org.rose.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name;
	private Double per;
	private Double total;
	private String result;
	
}
