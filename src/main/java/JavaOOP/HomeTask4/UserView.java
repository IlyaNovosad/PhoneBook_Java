package JavaOOP.HomeTask4;

import java.util.List;

public interface UserView <T extends User>{
    void sendToConsole(List<T> users);
}
