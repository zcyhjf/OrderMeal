package com.hlju.cake.dao;

import com.hlju.cake.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository("categoryRepository")
public interface CategoryRepository extends JpaRepository<Category, Integer>{
	Category findByCtype(Integer ctype);
	Category findByCategoryid(Integer categoryid);
	@Transactional
	int deleteByCategoryid(Integer categoryid);





}
