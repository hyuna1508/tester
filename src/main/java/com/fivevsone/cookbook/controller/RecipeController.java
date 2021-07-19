package com.fivevsone.cookbook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fivevsone.cookbook.dao.RecipeService;
import com.fivevsone.cookbook.vo.RecipeVO;

@Controller
@RequestMapping("/recipe/")
public class RecipeController {
	
	@Autowired
	RecipeService recipeService;
	
	@RequestMapping("/insertRecipe")
	public String insertRecipe(RecipeVO vo) {
		System.out.println("=================");
//		recipeService.insertRecipe(vo);
		return "recipeinsertpage";
		
	}
	
	@RequestMapping("/updateRecipe.do")
	public String updateRecipe(RecipeVO vo) {
		recipeService.updateRecipe(vo);
		return "redirect:getRecipeList.do";
		
	}
	
	@RequestMapping("/deleteRecipe.do")
	public String deleteRecipe(RecipeVO vo) {
		recipeService.insertRecipe(vo);
		return "redirect:getRecipeList.do";
		
	}
	
	@RequestMapping("/getRecipe.do")
	public String selectOneRecipe(RecipeVO vo, Model model) {
		model.addAttribute("recipe", recipeService.selectOneRecipe(vo) );
		return "getRecipe";
		
	}
	
	@RequestMapping("/getRecipeList.do")
	public String selectAllRecipe(RecipeVO vo, Model model) {
		model.addAttribute("recipeList", recipeService.selectAllRecipe());
		return "getRecipeList";
		
	}
	
	
	
}
