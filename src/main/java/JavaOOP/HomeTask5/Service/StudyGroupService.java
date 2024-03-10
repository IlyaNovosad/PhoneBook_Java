package JavaOOP.HomeTask5.Service;



import JavaOOP.HomeTask5.Model.Student;
import JavaOOP.HomeTask5.Model.StudyGroup;
import JavaOOP.HomeTask5.Model.Teacher;
import lombok.Getter;

import java.util.List;

@Getter
public class StudyGroupService {
    private StudyGroup studyGroup;
    public void createStudyGroup(Teacher teacher, List<Student> students){
        this.studyGroup = new StudyGroup(teacher, students);

    }

}