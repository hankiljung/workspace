package study;

import java.util.Arrays;
import java.util.Map;

public class Student implements StudentUtil{
	private String name;
	private int korScore;
	private int mathScore;
	private int engScore;

	public Student(String name, int korScore, int mathScore, int engScore) {
		this.name = name;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	@Override
	public int getTotalScore(Student a) {
		return  a.getKorScore()+a.getMathScore()+a.getEngScore();
	}

	@Override
	public Student getHighScoreStutdent(Student a, Student b) {
				return getTotalScore(a)>getTotalScore(b)? a:b;
	}

	@Override
	public String getGradeByStudentName(Student[] stuArr, Student a) {
		String grade = "학생이 없습니다." ;
		for(int i = 0 ; i <stuArr.length; i++){
			if(stuArr[i].getName().equals(a.getName())){
				double stuTotal = getTotalScore(a)/3;
				grade = getGrade(stuTotal);
				break;
			}
		}
		return grade;
  }

	public String getGrade(double stuTotal){
		return stuTotal >= 90 ? "A" :
			         	 stuTotal >= 80 ? "B" :
					     	 stuTotal >= 70 ? "C" :		"D";
	}

	@Override
	public int[] getTotalScoresToArray(Student[] stuArr) {
		return Arrays.stream(stuArr).mapToInt(this::getTotalScore).toArray();
	}
}

