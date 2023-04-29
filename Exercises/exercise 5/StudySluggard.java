/**
 * Sluggard style
 */
public class StudySluggard {

    public StudySluggard(){}

    private static StudySluggard study = new StudySluggard();

    public synchronized static StudySluggard getStudyClass(){
        return study;
    }

    public void runStudy(String name, String gender){
        System.out.println("My name is: " + name + ", I am a " + gender + ",I'm learning");
    }

    public static void main(String[] args) {
        StudySluggard study = new StudySluggard();
        study.runStudy("YanHang Li", "girl");
    }
}
