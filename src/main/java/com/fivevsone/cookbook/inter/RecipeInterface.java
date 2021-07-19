package com.fivevsone.cookbook.inter;

import java.util.List;

import com.fivevsone.cookbook.vo.RecipeVO;

public interface RecipeInterface {

	public void insertRecipe(RecipeVO vo);
	public void updateRecipe(RecipeVO vo);
	public void deleteRecipe(RecipeVO vo);
	public List<RecipeVO> selectAllRecipe(); 
	public RecipeVO selectOneRecipe(RecipeVO vo);
	public int updateRecipeCnt(int cnt);
}
