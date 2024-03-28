package com.projects.dscatalog.services;

import com.projects.dscatalog.entity.Category;
import com.projects.dscatalog.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
   private CategoryRepository categoryRepository;
   public List<Category> findAll(){
       return categoryRepository.findAll();

   }
}
