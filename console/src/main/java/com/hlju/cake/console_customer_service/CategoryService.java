package com.hlju.cake.console_customer_service;

import com.hlju.cake.entity.Category;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

@Service("categoryService")
public class CategoryService {

    @Resource
    private RestTemplate restTemplate;

    public List<Category> findAll(){
        return restTemplate.getForObject("http://service-provider/findAll",List.class);
    }

    public Category findById(Integer categoryid){ ;

        return restTemplate.getForObject("http://service-provider/findById?categoryid="+categoryid,Category.class);
    }

    public boolean save(Category category){
//        restTemplate.put("http://service-provider/save",category);
        restTemplate.getForObject("http://service-provider/save",Category.class);
        return true;
    }

    public boolean delete(Integer categoryid){
//        restTemplate.put("http://service-provider/delete",category);
        restTemplate.getForObject("http://service-provider/delete?categoryid="+categoryid,Integer.class);
        return true;
    }

    public Category update(Category category){
        return restTemplate.getForObject("http://service-provider/update",Category.class);
    }

}
