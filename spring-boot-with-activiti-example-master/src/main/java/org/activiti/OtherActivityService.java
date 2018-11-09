package org.activiti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OtherActivityService {

	@Autowired
	ApplicantRepository repository;
	
	public void otroMetodo() {		
		repository.findAll().forEach(n -> System.out.println(n.getName()));
	}
}
