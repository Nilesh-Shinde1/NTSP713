package org.rose.wrapper;

import java.util.ArrayList;
import java.util.List;

import org.rose.dto.StudentDTO;

public class ArrayListWrapper {
	List<StudentDTO> listDTO = new ArrayList<StudentDTO>();

	public List<StudentDTO> getListDTO() {
		return listDTO;
	}

	public void setListDTO(List<StudentDTO> listDTO) {
		this.listDTO = listDTO;
	}
	
}
