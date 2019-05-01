package studentdetails;

import java.util.ArrayList;

public class Semester {
	
	private ArrayList<String> facultynamelist= new ArrayList<String>();
	private CurriculumSem curriculumsem;
	private ArrayList<String> subjectcode;  //array list
	
	public ArrayList<String> getFacultyNameList(){
		return this.facultynamelist;
	}
	
	public void setFacultyNameList(ArrayList<String> facultynamelist) {
		this.facultynamelist=facultynamelist;
	}
	
	public void addFacultyNameList(String facultynamelist) {
		this.facultynamelist.add(facultynamelist);
	}
	
	public CurriculumSem getCurriculumSem() {
		return this.curriculumsem;
	}
	public void setCurriculuSem(CurriculumSem curriculumsem) {
		this.curriculumsem=curriculumsem;
	}

	public ArrayList<String> getSubjectcode() {
		return subjectcode;
	}

	public void setSubjectcode(ArrayList<String> subjectcode) {
		this.subjectcode = subjectcode;
	}
	public void addSubjectcode(String subjectcode) {
		this.subjectcode.add(subjectcode);
	}
	

}
