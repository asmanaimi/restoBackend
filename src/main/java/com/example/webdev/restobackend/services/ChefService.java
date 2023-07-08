package com.example.webdev.restobackend.services;

import java.util.List;

import com.example.webdev.restobackend.models.chefM;

public interface ChefService {

	public List<chefM>	 getAllChefs();
	public chefM addChef(chefM m);	
	public chefM editChef(chefM m);
	public void  deleteChefById(Integer id);
	public chefM getChefById(Integer id);
}
