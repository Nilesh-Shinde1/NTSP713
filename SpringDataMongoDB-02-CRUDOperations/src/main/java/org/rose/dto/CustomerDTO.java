package org.rose.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDTO implements Serializable {
	@Id
	private String id;
	private Integer cno;
	private String cname;
	private String cadd;
	private Long mobNo;
}
