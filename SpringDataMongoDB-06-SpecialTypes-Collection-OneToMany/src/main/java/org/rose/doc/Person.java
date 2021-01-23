package org.rose.doc;

import java.util.Map;
import java.util.Set;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	@Id
	private Integer pid;
	private String name;
	private String education;
	private Set<Identities> identities;
	private Map<String,Schools> schools;
}
