/*
    Given the head of a singly linked list, reverse the list, and return the reversed list.
*/

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

package Sem4.Task1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> integerList = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            integerList.add(scanner.nextInt());
        }
        scanner.close();
        System.out.println("integerList.peek() = " + integerList.peek());
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.pop() = " + integerList.pop());
        System.out.println("integerList = " + integerList);
        integerList.addLast(7);
        System.out.println("integerList = " + integerList);
        integerList.addFirst(8);
        System.out.println("integerList = " + integerList);
        integerList.set(3, 100);
        System.out.println("integerList = " + integerList);
        System.out.println("integerList.contains(3) = " + integerList.contains(3));
        System.out.println("integerList.indexOf(3) = " + integerList.indexOf(3));
        integerList.remove(4); //todo; deleting by index
        System.out.println("integerList = " + integerList);
        integerList.remove((Integer) 4); // todo: deleting object
        System.out.println("integerList = " + integerList);
    }
}
