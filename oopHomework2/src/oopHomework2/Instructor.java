package oopHomework2;

public class Instructor extends User {

	private String[] educatorLessons;
	private String educatorLevel;

	public Instructor() {

	}

	public Instructor(String[] educatorLessons, String educatorLevel) {
		super();
		this.educatorLessons = educatorLessons;
		this.educatorLevel = educatorLevel;
	}

	public String[] getEducatorLessons() {
		return educatorLessons;
	}

	public void setEducatorLessons(String[] educatorLessons) {
		this.educatorLessons = educatorLessons;
	}

	public String getEducatorLevel() {
		return educatorLevel;
	}

	public void setEducatorLevel(String educatorLevel) {
		this.educatorLevel = educatorLevel;
	}

}
