package JavaOOP.HomeTask3;
import lombok.Getter;
import lombok.Setter;

import java.util.Iterator;
import java.util.List;


@Setter
@Getter
public class Stream implements Iterable<StudentGroup> {

    private List<StudentGroup> groupList;


    public Stream(List<StudentGroup> groupList) {
        this.groupList = groupList;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new StreamIterator(this);
    }

    @Override
    public String toString() {
        return groupList.toString();
    }
}