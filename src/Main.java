import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Tuition Sia = new Tuition();
        Sia.setName("Sia Tuition Centre");
        Head Patrick = new Head();
        Patrick.setName("Patrick","Sia","Jian Jie");
        Sia.setHeadmaster(Patrick);

        StudentBatch A2023 = new StudentBatch();

        for (int i=0;i<10;i++){
            Student student = new Student();
            student.setName("Student","NO",""+i);
            student.setAddress("1","Jalan Tebu","Sibu","96000","Sarawak");
            for (int z = 0 ; z <5 ; z++){
                student.setMarks((float)Math.random() * 100, z);
            }
            School tionghin = new School();
            tionghin.setAddress("1","Jalan Tiong Hin","Sibu","96000","Sarawak");
            tionghin.setName("SMK TIONG HIN");
            student.setSchool(tionghin);
            A2023.add(student);
        }
        Sia.setStudentBatch(A2023);
        for(int i = 0; i < 5 ; i++){
            Teacher teacher = new Teacher();
            teacher.setName("Teacher", "Number", "" + i);
            teacher.setAddress("1" , "Jalan Tebu" , "Sibu", "96000", "Sarawak");
            Random random = new Random();
            teacher.setNum(random.nextInt(20));
            teacher.setQuali("PHD");
            Sia.addTeam(teacher);
        }
        Sia.getPerformance();
    }
}