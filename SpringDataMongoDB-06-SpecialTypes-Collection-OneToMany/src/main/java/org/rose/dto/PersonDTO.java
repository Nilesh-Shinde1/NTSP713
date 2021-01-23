package org.rose.dto;

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
public class PersonDTO {
	@Id
	private Integer pid;
	private String name;
	private String education;
	private Set<IdentitiesDTO> identities;
	private Map<String,SchoolsDTO> schools;
}
