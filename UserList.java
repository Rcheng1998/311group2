
package sprint1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public final class UserList {
    List<User> users = new ArrayList<>();

    public UserList() throws FileNotFoundException {
        getUsers();
    }
    public User getUser(int index)
    {
        return users.get(index);
    }
    
    public void getUsers() throws FileNotFoundException
    {
        String[] temp;
        File file = new File("userlist.txt");
        Scanner sc = new Scanner(file);
        while(sc.hasNextLine())
        {
            temp = sc.nextLine().split(",",2);
            users.add(new User(temp[0],temp[1]));
        }
    }

    int size() {
        return users.size();
    }
}
