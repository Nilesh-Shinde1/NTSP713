package org.rose.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmpDTO implements Serializable {
	private String name;
	private String desg;
	private Double sal;
	
}
