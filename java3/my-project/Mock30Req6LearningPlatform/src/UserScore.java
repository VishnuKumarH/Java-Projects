import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserScore {
	private Double completionPercentage;
	private User user;
	private Course course;
	
	
	
	public Double getCompletionPercentage() {
		return completionPercentage;
	}
	public void setCompletionPercentage(Double completionPercentage) {
		this.completionPercentage = completionPercentage;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public UserScore() {
		
	}
	public UserScore(Double completionPercentage, User user, Course course) {
		super();
		this.completionPercentage = completionPercentage;
		this.user = user;
		this.course = course;
	}
	
	static Map <String ,UserScore>getTopPerformer(List<UserScore>scoreList){
		
		Map<String ,UserScore> topers = new TreeMap<>();
		for(UserScore score : scoreList) {
			Course clist = score.getCourse();
			String courseName = clist.getName();
			if(!topers.containsKey(courseName) || score.getCompletionPercentage()>topers.get(courseName).getCompletionPercentage()) {
				topers.put(courseName, score);
			}
			
			
		}
		
		return topers;
		
	}

}
