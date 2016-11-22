package hr_18;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {

    Stack stack = new Stack();
    Queue<Character> queue = new LinkedList<Character>();


    void pushCharacter(char ch) {
        stack.push(new Character(ch));
    }

    char popCharacter() {
    return (char) stack.pop();

    }

    void enqueueCharacter(char ch){
        //queue.add(ch);
        queue.add(new Character(ch));

    }


    char dequeueCharacter() {
      return (char) queue.remove();
    }
}
