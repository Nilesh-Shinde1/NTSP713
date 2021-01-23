package org.rose.service;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.rose.doc.Identities;
import org.rose.doc.Person;
import org.rose.doc.Schools;
import org.rose.dto.PersonDTO;
import org.rose.repo.IPersonRepo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("personService")
public class PersonServiceImpl implements IPersonService {

	@Autowired
	private IPersonRepo repo;
	
	@Override
	public String savePersonInfo(PersonDTO dto) {
		Person doc = new Person();
		BeanUtils.copyProperties(dto, doc);
		
		//copy IdentitiesDTO to Identities
		Set<Identities> identitiesDocSet = new HashSet();
		dto.getIdentities().forEach(idDTO->{
			Identities idDoc = new Identities();
			BeanUtils.copyProperties(idDTO, idDoc);
			identitiesDocSet.add(idDoc);
		});
		

		//copy SchoolsDTO to Schools
		Map<String,Schools> schoolsDocMap = new HashMap<>();
		dto.getSchools().forEach((standard, schoolDTO) -> {
			Schools schoolDoc = new Schools();
			BeanUtils.copyProperties(schoolDTO, schoolDoc);
			schoolsDocMap.put(standard, schoolDoc);
		});
		
		doc.setIdentities(identitiesDocSet);
		doc.setSchools(schoolsDocMap);
		
		repo.save(doc);
		return "Person with id "+doc.getPid()+" is saved..!";
	}

}
