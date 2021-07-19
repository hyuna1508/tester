package com.fivevsone.cookbook.vo;

import java.util.Date;

public class RecipeVO{
	
	
	private int recipeCode;
	private String recipeTitle;
	private int memCode;
	private String recipeInfo;
	private Date writeTime;
	private int recipeState;
	
	private int natCode;
	private String natName;
	private int sitCode;
	private String sitName;
	private int typeCode;
	private String typeName;
	private int ageCode;
	private String ageName;
	private int tastyCode;
	private String tastyName;
	
	private int amount;
	private int cookTime;
	private int difficult;
	private String material;
	private String cookStep;
	private String cookTip;
	private int recipeCnt;
	private int recipeStar;
	public RecipeVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getRecipeCode() {
		return recipeCode;
	}
	public void setRecipeCode(int recipeCode) {
		this.recipeCode = recipeCode;
	}
	public String getRecipeTitle() {
		return recipeTitle;
	}
	public void setRecipeTitle(String recipeTitle) {
		this.recipeTitle = recipeTitle;
	}
	public int getMemCode() {
		return memCode;
	}
	public void setMemCode(int i) {
		this.memCode = i;
	}
	public String getRecipeInfo() {
		return recipeInfo;
	}
	public void setRecipeInfo(String recipeInfo) {
		this.recipeInfo = recipeInfo;
	}
	public Date getWriteTime() {
		return writeTime;
	}
	public void setWriteTime(Date writeTime) {
		this.writeTime = writeTime;
	}
	public int getRecipeState() {
		return recipeState;
	}
	public void setRecipeState(int recipeState) {
		this.recipeState = recipeState;
	}
	public int getNatCode() {
		return natCode;
	}
	public void setNatCode(int natCode) {
		this.natCode = natCode;
	}
	public String getNatName() {
		return natName;
	}
	public void setNatName(String natName) {
		this.natName = natName;
	}
	public int getSitCode() {
		return sitCode;
	}
	public void setSitCode(int sitCode) {
		this.sitCode = sitCode;
	}
	public String getSitName() {
		return sitName;
	}
	public void setSitName(String sitName) {
		this.sitName = sitName;
	}
	public int getTypeCode() {
		return typeCode;
	}
	public void setTypeCode(int typeCode) {
		this.typeCode = typeCode;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public int getAgeCode() {
		return ageCode;
	}
	public void setAgeCode(int ageCode) {
		this.ageCode = ageCode;
	}
	public String getAgeName() {
		return ageName;
	}
	public void setAgeName(String ageName) {
		this.ageName = ageName;
	}
	public int getTastyCode() {
		return tastyCode;
	}
	public void setTastyCode(int tastyCode) {
		this.tastyCode = tastyCode;
	}
	public String getTastyName() {
		return tastyName;
	}
	public void setTastyName(String tastyName) {
		this.tastyName = tastyName;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getCookTime() {
		return cookTime;
	}
	public void setCookTime(int cookTime) {
		this.cookTime = cookTime;
	}
	public int getDifficult() {
		return difficult;
	}
	public void setDifficult(int difficult) {
		this.difficult = difficult;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getCookStep() {
		return cookStep;
	}
	public void setCookStep(String cookStep) {
		this.cookStep = cookStep;
	}
	public String getCookTip() {
		return cookTip;
	}
	public void setCookTip(String cookTip) {
		this.cookTip = cookTip;
	}
	public int getRecipeCnt() {
		return recipeCnt;
	}
	public void setRecipeCnt(int recipeCnt) {
		this.recipeCnt = recipeCnt;
	}
	public int getRecipeStar() {
		return recipeStar;
	}
	public void setRecipeStar(int recipeStar) {
		this.recipeStar = recipeStar;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ageCode;
		result = prime * result + ((ageName == null) ? 0 : ageName.hashCode());
		result = prime * result + amount;
		result = prime * result + ((cookStep == null) ? 0 : cookStep.hashCode());
		result = prime * result + cookTime;
		result = prime * result + ((cookTip == null) ? 0 : cookTip.hashCode());
		result = prime * result + difficult;
		result = prime * result + ((material == null) ? 0 : material.hashCode());
		result = prime * result + memCode;
		result = prime * result + natCode;
		result = prime * result + ((natName == null) ? 0 : natName.hashCode());
		result = prime * result + recipeCnt;
		result = prime * result + recipeCode;
		result = prime * result + ((recipeInfo == null) ? 0 : recipeInfo.hashCode());
		result = prime * result + recipeStar;
		result = prime * result + recipeState;
		result = prime * result + ((recipeTitle == null) ? 0 : recipeTitle.hashCode());
		result = prime * result + sitCode;
		result = prime * result + ((sitName == null) ? 0 : sitName.hashCode());
		result = prime * result + tastyCode;
		result = prime * result + ((tastyName == null) ? 0 : tastyName.hashCode());
		result = prime * result + typeCode;
		result = prime * result + ((typeName == null) ? 0 : typeName.hashCode());
		result = prime * result + ((writeTime == null) ? 0 : writeTime.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		RecipeVO other = (RecipeVO) obj;
		if (ageCode != other.ageCode)
			return false;
		if (ageName == null) {
			if (other.ageName != null)
				return false;
		} else if (!ageName.equals(other.ageName))
			return false;
		if (amount != other.amount)
			return false;
		if (cookStep == null) {
			if (other.cookStep != null)
				return false;
		} else if (!cookStep.equals(other.cookStep))
			return false;
		if (cookTime != other.cookTime)
			return false;
		if (cookTip == null) {
			if (other.cookTip != null)
				return false;
		} else if (!cookTip.equals(other.cookTip))
			return false;
		if (difficult != other.difficult)
			return false;
		if (material == null) {
			if (other.material != null)
				return false;
		} else if (!material.equals(other.material))
			return false;
		if (memCode != other.memCode)
			return false;
		if (natCode != other.natCode)
			return false;
		if (natName == null) {
			if (other.natName != null)
				return false;
		} else if (!natName.equals(other.natName))
			return false;
		if (recipeCnt != other.recipeCnt)
			return false;
		if (recipeCode != other.recipeCode)
			return false;
		if (recipeInfo == null) {
			if (other.recipeInfo != null)
				return false;
		} else if (!recipeInfo.equals(other.recipeInfo))
			return false;
		if (recipeStar != other.recipeStar)
			return false;
		if (recipeState != other.recipeState)
			return false;
		if (recipeTitle == null) {
			if (other.recipeTitle != null)
				return false;
		} else if (!recipeTitle.equals(other.recipeTitle))
			return false;
		if (sitCode != other.sitCode)
			return false;
		if (sitName == null) {
			if (other.sitName != null)
				return false;
		} else if (!sitName.equals(other.sitName))
			return false;
		if (tastyCode != other.tastyCode)
			return false;
		if (tastyName == null) {
			if (other.tastyName != null)
				return false;
		} else if (!tastyName.equals(other.tastyName))
			return false;
		if (typeCode != other.typeCode)
			return false;
		if (typeName == null) {
			if (other.typeName != null)
				return false;
		} else if (!typeName.equals(other.typeName))
			return false;
		if (writeTime == null) {
			if (other.writeTime != null)
				return false;
		} else if (!writeTime.equals(other.writeTime))
			return false;
		return true;
	}
	public RecipeVO(int recipeCode, String recipeTitle, int memCode, String recipeInfo, Date writeTime,
			int recipeState, int natCode, String natName, int sitCode, String sitName, int typeCode, String typeName,
			int ageCode, String ageName, int tastyCode, String tastyName, int amount, int cookTime, int difficult,
			String material, String cookStep, String cookTip, int recipeCnt, int recipeStar) {
		super();
		this.recipeCode = recipeCode;
		this.recipeTitle = recipeTitle;
		this.memCode = memCode;
		this.recipeInfo = recipeInfo;
		this.writeTime = writeTime;
		this.recipeState = recipeState;
		this.natCode = natCode;
		this.natName = natName;
		this.sitCode = sitCode;
		this.sitName = sitName;
		this.typeCode = typeCode;
		this.typeName = typeName;
		this.ageCode = ageCode;
		this.ageName = ageName;
		this.tastyCode = tastyCode;
		this.tastyName = tastyName;
		this.amount = amount;
		this.cookTime = cookTime;
		this.difficult = difficult;
		this.material = material;
		this.cookStep = cookStep;
		this.cookTip = cookTip;
		this.recipeCnt = recipeCnt;
		this.recipeStar = recipeStar;
	}
	@Override
	public String toString() {
		return "RecipeVO [recipeCode=" + recipeCode + ", recipeTitle=" + recipeTitle + ", memCode=" + memCode
				+ ", recipeInfo=" + recipeInfo + ", writeTime=" + writeTime + ", recipeState=" + recipeState
				+ ", natCode=" + natCode + ", natName=" + natName + ", sitCode=" + sitCode + ", sitName=" + sitName
				+ ", typeCode=" + typeCode + ", typeName=" + typeName + ", ageCode=" + ageCode + ", ageName=" + ageName
				+ ", tastyCode=" + tastyCode + ", tastyName=" + tastyName + ", amount=" + amount + ", cookTime="
				+ cookTime + ", difficult=" + difficult + ", material=" + material + ", cookStep=" + cookStep
				+ ", cookTip=" + cookTip + ", recipeCnt=" + recipeCnt + ", recipeStar=" + recipeStar + "]";
	}

	
}
