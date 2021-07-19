package com.fivevsone.cookbook.dao;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fivevsone.cookbook.inter.RecipeInterface;
import com.fivevsone.cookbook.vo.RecipeVO;

@Service
public class RecipeService implements RecipeInterface {
	@Autowired
	RecipeDAO dao;

	@Override
	public void insertRecipe(RecipeVO vo) {
		dao.insertRecipe(vo);
	}

	@Override
	public void updateRecipe(RecipeVO vo) {
		dao.updateRecipe(vo);
	}

	@Override
	public void deleteRecipe(RecipeVO vo) {
		dao.deleteRecipe(vo);
	}

	@Override
	public List<RecipeVO> selectAllRecipe() {
		return dao.selectAllRecipe();
	}

	@Override
	public RecipeVO selectOneRecipe(RecipeVO vo) {
		return dao.selectOneRecipe(vo);
	}

	@Override
	public int updateRecipeCnt(int cnt) {
		return dao.updateRecipeCnt(cnt);
	}
}
