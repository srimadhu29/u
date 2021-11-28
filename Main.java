package bcas.results;

public class Main {

    public static void main(String[] args) {

    Results student1 = new Results();

    student1.studentName = "Jhon";
    student1.studentPersonal();
    student1.streetNo = "161/3A";
    student1.city = "colombo";
    student1.country = "Sri Lanka";
    student1.studentAddress();

    Results student2 = new Results();

    student2.studentName = "Peter";
    student2.studentPersonal();
    student2.streetNo = "50";
    student2.city = "colombo15";
    student2.country = "Sri Lanka";
    student2.studentAddress();


    }
}
