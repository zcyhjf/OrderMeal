package com.hlju.cake.console_provider_service;

import java.util.List;

import com.hlju.cake.dao.CategoryRepository;
import com.hlju.cake.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


@RestController
public class CategoryServiceImpI {


	@Resource
	private CategoryRepository categoryRepository;

	@RequestMapping("/findAll")
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@RequestMapping("/save")
	public void save(Category category) {
		categoryRepository.save(category);
	}

	@RequestMapping("/delete")
	public void delete(Integer categoryid) {
		categoryRepository.deleteByCategoryid(categoryid);
	}

	@RequestMapping("/update")
	public void update(Category category) {
		categoryRepository.save(category);
	}


	@RequestMapping("/findById")
	public Category findById(Integer categoryid) {
		return categoryRepository.findByCategoryid(categoryid);
	}

	public Category findByCtype(Integer ctype) {
		return categoryRepository.findByCtype(ctype);
	}

}
