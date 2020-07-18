public class GradeBook
{
	private String schoolNum;
	public void setNum(String number){
		schoolNum = number;
	}
	public String getNum(){
		return schoolNum;
	}
	public void displayMessageNum(){
		System.out.printf("Your number is:%s\n",getNum());
	}

	private Double chineseGrade;
	public void setChineseGrade(Double cgrade){
		if (cgrade<=0.0) chineseGrade=0.0;
		else if (cgrade>=100.0) chineseGrade=100.0;
		else chineseGrade = cgrade;
	}
	public Double getChineseGrade(){
		return chineseGrade;
	}
	public void displayMessageChinese(){
		System.out.printf("Your Chinese Grade is:%.0f\n",getChineseGrade());
	}

	private Double mathGrade;
	public void setMathGrade(Double mgrade){
		if (mgrade<=0.0) mathGrade=0.0;
		else if (mgrade>=100.0)mathGrade=100.0;
		else mathGrade = mgrade;
	}
	public Double getMathGrade(){
		return mathGrade;
	}
	public void displayMessageMath(){
		System.out.printf("Your Math Grade is:%.0f\n",getMathGrade());
	}

	private Double englishGrade;
	public void setEnglishGrade(Double egrade){
		if (egrade<=0.0) englishGrade=0.0;
		else if (egrade>=100.0) englishGrade=100.0;
		else englishGrade = egrade;
	}
	public Double getEnglishGrade(){
		return englishGrade;
	}
	public void displayMessageEnglish(){
		System.out.printf("Your English Grade is:%.0f\n",getEnglishGrade());
	}
	public Double total;
	public void displayMessageTotal(){
		total=chineseGrade+mathGrade+englishGrade;
		System.out.printf("Your Total Grade is:%.0f\n",total);
	}
	public Double average;
	public void displayMessageAverage(){
		average=(chineseGrade+mathGrade+englishGrade)/3;
		System.out.printf("Your Average Grade is:%.2f\n",average);
	}
}