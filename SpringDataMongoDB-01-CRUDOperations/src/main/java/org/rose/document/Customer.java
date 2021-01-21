package org.rose.document;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Document
@Data
public class Customer {
	private Integer cno;
	private String cname;
	private String cadd;
	private Long mobNo;
}
