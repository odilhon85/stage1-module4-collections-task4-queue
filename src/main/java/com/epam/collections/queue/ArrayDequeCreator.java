package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
//        Two players have two Queue<Integer> of cards with the same even sizes(>=2). They want to combine all the cards together into an ArrayDeque<Integer> according to the following rule.
//
//        First, both take turns adding two cards to the ArrayDeque<Integer>. Then, with each move, the player:
//
//        takes the top card from the ArrayDeque<Integer> and adds this card to the end of his Queue<Integer>
//        then puts two cards from the beginning of his Queue<Integer> into the ArrayDeque<Integer>.
//        The moves go until the both players' Queue<Integer> of cards are not empty.
//
//        Implement the program which gets two Queue<Integer> and creates ArrayDeque<Integer> in accordance with the rules of the game.
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        deque.add(firstQueue.remove());
        deque.add(firstQueue.remove());
        deque.add(secondQueue.remove());
        deque.add(secondQueue.remove());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add(deque.removeLast());
            deque.add(firstQueue.remove());
            deque.add(firstQueue.remove());

            secondQueue.add(deque.removeLast());
            deque.add(secondQueue.remove());
            deque.add(secondQueue.remove());
        }

        return deque;
    }
}
