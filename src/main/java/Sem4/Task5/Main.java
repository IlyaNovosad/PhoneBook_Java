/*
Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file
system, convert it to the simplified canonical path.

In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory
up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any
other format of periods such as '...' are treated as file/directory names.

The canonical path should have the following format:

    The path starts with a single slash '/'.
    Any two directories are separated by a single slash '/'.
    The path does not end with a trailing '/'.
    The path only contains the directories on the path from the root directory to the target file or directory (i.e., no
    period '.' or double period '..')

Return the simplified canonical path.
*/

package Sem4.Task5;

import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("simplifyPath() = " + simplifyPath("/home/"));
        System.out.println("simplifyPath() = " + simplifyPath("/../"));
        System.out.println("simplifyPath() = " + simplifyPath("/home//foo/"));
    }

    public static String simplifyPath(String path) {
        Deque<String> list = new LinkedList<>();//todo : частный случай Stack, по сути является deprecated List.
        //todo : Deque Двусвязная очередь
        String[] arr = path.split("/");
        for (String elem : arr) {
            if (elem.isEmpty() || elem.equals(".")) {
                continue;
            } else if (elem.equals("..")) {
                if (!list.isEmpty()) { //todo : если лист не пустой удаляем
                    list.pollLast(); //todo : Unlink с указанием на конец
                }
            } else {
                list.add(elem);
            }
        }
        return "/" + String.join("/", list);
    }
}
