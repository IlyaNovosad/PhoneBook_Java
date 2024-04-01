package JavaOOP.Sem4.Task1;

import java.util.List;

public interface UserView<T extends User>{
    void sendToConsole (List<T> users);
}
