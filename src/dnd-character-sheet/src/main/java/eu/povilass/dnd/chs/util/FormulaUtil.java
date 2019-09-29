package eu.povilass.dnd.chs.util;

public class FormulaUtil {
	
	public static int getAbylityModifier(int score) {
		//if ability score is lower than 10 and is odd, subtract 1
		int modifier =  score < 10 && score % 2 != 0 ? ((score - 10) / 2 - 1) : ((score - 10) / 2);
		return modifier;
	}
}
