package studentdetails;

import java.util.ArrayList;

public class CurriculumSem {

	private ArrayList<String> subjectnamelistcurriculum= new ArrayList<String>();
	private ArrayList<String> subjectcodelistcurriculum= new ArrayList<String>();
	private ArrayList<Integer> maxmarkslist=new ArrayList<Integer>();
	
	public ArrayList<String> getSubjectNameListCurriculum() {
		return subjectnamelistcurriculum;
	}
	public void setSubjectNameListCurriculum(ArrayList<String> subjectnamelistcurriculum){
		this.subjectnamelistcurriculum=subjectnamelistcurriculum;
	}
	public void addSubjectNameListCurriculum(String subjectnamelistcurriculum) {
		this.subjectnamelistcurriculum.add(subjectnamelistcurriculum);
	}
	
	public ArrayList<String> getSubjectCodeListCurriculum() {
		return subjectcodelistcurriculum;
	}
	public void setSubjectCodeListCurriculum(ArrayList<String> subjectcodelistcurriculum){
		this.subjectcodelistcurriculum=subjectcodelistcurriculum;
	}
	public void addSubjectCodeListCurriculum(String subjectcodelistcurriculum ) {
		this.subjectcodelistcurriculum.add(subjectcodelistcurriculum);
	}
	
	public ArrayList<Integer> getMaxMarksList(){
		return this.maxmarkslist;
	}
	public void setMaxMarksList(ArrayList<Integer> maxmarkslist) {
		this.maxmarkslist=maxmarkslist;
	}
	public void addMaxMarksList(Integer maxmarkslist) {
		this.maxmarkslist.add(maxmarkslist);
	}
	@Override
	public String toString() {
		return "CurriculumSem [subjectnamelistcurriculum=" + subjectnamelistcurriculum + ", subjectcodelistcurriculum="
				+ subjectcodelistcurriculum + ", maxmarkslist=" + maxmarkslist + "]";
	}
}
