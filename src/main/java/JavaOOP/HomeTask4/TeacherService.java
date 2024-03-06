package JavaOOP.HomeTask4;

import java.util.Collections;
import java.util.List;

public class TeacherService {
    public void getSortedTeacherList(List<Teacher> teacherList) {
        Collections.sort(teacherList);
    }

    public void getSortedTeacherListByFIO(List<Teacher> teacherList) {
        teacherList.sort(new UserComparator<>());
    }

}