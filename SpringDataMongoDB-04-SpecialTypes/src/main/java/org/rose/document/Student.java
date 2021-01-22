package org.rose.document;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
	@Id
	private int id;
	private String name;
	private Integer marks[];
	private List<String> subjects;
	private Set<Long> mobileNos;
	private Map<Integer,String> rollNoAndDivision;
	private Properties batchesInfo;
	
}
