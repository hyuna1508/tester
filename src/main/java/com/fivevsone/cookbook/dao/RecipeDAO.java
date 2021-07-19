package com.fivevsone.cookbook.dao;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fivevsone.cookbook.inter.RecipeInterface;
import com.fivevsone.cookbook.vo.RecipeVO;

@Repository
public class RecipeDAO implements RecipeInterface {
	@Autowired
	SqlSession session;

	@Override
	public void insertRecipe(RecipeVO vo) {
		session.insert("recipeNS.insertRecipe", vo);
	}

	@Override
	public void updateRecipe(RecipeVO vo) {
		session.update("recipeNS.updateRecipe",vo);
	}

	@Override
	public void deleteRecipe(RecipeVO vo) {
		session.delete("recipeNS.deleteRecipe", vo);
	}

	@Override
	public List<RecipeVO> selectAllRecipe() {
		return session.selectList("recipeNS.selectAllRecipe");
	}

	@Override
	public RecipeVO selectOneRecipe(RecipeVO vo) {
		return session.selectOne("recipeNS.selectOneRecipe", vo);
	}

	@Override
	public int updateRecipeCnt(int cnt) {
		return session.update("recipeNS.updateRecipeCnt", cnt);
	}
}
