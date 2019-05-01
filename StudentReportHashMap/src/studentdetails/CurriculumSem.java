package studentdetails;

import java.util.ArrayList;
import java.util.HashMap;

public class CurriculumSem {

//	private ArrayList<String> subjectnamelistcurriculum= new ArrayList<String>();
//	private ArrayList<String> subjectcodelistcurriculum= new ArrayList<String>();
	private ArrayList<Integer> maxmarkslist=new ArrayList<Integer>();
	
	private ArrayList<HashMap<String,String>> subject=new ArrayList<HashMap<String,String>>();
	
	public ArrayList<HashMap<String, String>> getSubject() {
		return subject;
	}
	public void setSubject(ArrayList<HashMap<String, String>> subject) {
		this.subject = subject;
	}
	public void addSubject(HashMap<String, String> subject) {
		this.subject.add(subject);
	}
	
	/*public ArrayList<String> getSubjectNameListCurriculum() {
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
	}*/
	
	public ArrayList<Integer> getMaxMarksList(){
		return this.maxmarkslist;
	}
	public void setMaxMarksList(ArrayList<Integer> maxmarkslist) {
		this.maxmarkslist=maxmarkslist;
	}
	public void addMaxMarksList(Integer maxmarkslist) {
		this.maxmarkslist.add(maxmarkslist);
	}
	/*@Override
	public String toString() {
		return "CurriculumSem [subjectnamelistcurriculum=" + subjectnamelistcurriculum + ", subjectcodelistcurriculum="
				+ subjectcodelistcurriculum + ", maxmarkslist=" + maxmarkslist + "]";
	}
*/}
