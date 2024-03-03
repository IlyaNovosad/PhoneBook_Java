package JavaOOP.HomeTask3;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Setter
@Getter
public class StreamService {
    private Stream stream;

    public StreamService(Stream stream) {
        this.stream = stream;
    }


    public List<StudentGroup> getSortedStream() {
        List<StudentGroup> groupList = new ArrayList<>(stream.getGroupList());
        StreamComparator comparator = new StreamComparator();
        Collections.sort(groupList, comparator);
        return groupList;
    }

    public List<StudentGroup> getSortedStreamBySize() {
        List<StudentGroup> studentGroups = new ArrayList<>(stream.getGroupList());
        studentGroups.sort(new StreamComparator());
        return studentGroups;
    }

}