package com.example.webdev.restobackend.servicesImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.webdev.restobackend.models.chefM;
import com.example.webdev.restobackend.repositories.ChefRepository;
import com.example.webdev.restobackend.services.ChefService;
@Service
public class ChefServiceImpl implements ChefService {
	@Autowired
	public ChefRepository chefRepo;
	@Override
	public List<chefM> getAllChefs() {
		return chefRepo.findAll();

	}

	@Override
	public chefM addChef(chefM m) {
		// TODO Auto-generated method stub
		return chefRepo.save(m);	}

	@Override
	public chefM editChef(chefM m) {
		// TODO Auto-generated method stub
		return chefRepo.save(m);	}

	@Override
	public void deleteChefById(Integer id) {
		chefRepo.deleteById(id);		
	}

	@Override
	public chefM getChefById(Integer id) {
		// TODO Auto-generated method stub
		Optional<chefM>m =chefRepo.findById(id);
		return m.isPresent() ? m.get():null;	}

}
