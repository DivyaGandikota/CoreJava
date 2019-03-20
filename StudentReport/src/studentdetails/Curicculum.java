package studentdetails;

import java.util.ArrayList;

public class Curicculum {

	private ArrayList<String> subjectnamelist= new ArrayList<String>();
	private String facultyname;
	private int maxmarks;
	
	public ArrayList<String> getSubjectNameList(){
		return this.subjectnamelist;
	}
	public void addSubjectNameList(String subjectnamelist) {
		this.subjectnamelist.add(subjectnamelist);
	}
	public void setSubjectNameList(ArrayList<String> subjectnamelist) {
		this.subjectnamelist=subjectnamelist;
	}
	public String getFacultyname() {
		return this.facultyname;
	}
	public void setFacultyname(String facultyname) {
		this.facultyname = facultyname;
	}
	public int getMaxmarks() {
		return this.maxmarks;
	}
	public void setMaxmarks(int maxmarks) {
		this.maxmarks = maxmarks;
	}
	
}
