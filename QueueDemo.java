package com.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class QueueDemo {
	int size, add;
	int curser = 0;
	String[] queue;
	String element;
	Scanner s = new Scanner(System.in);

	public void createQueue() {
		System.out.println("Enter Your 'Queue' size: ");
		size = s.nextInt();
		queue = new String[size];
		System.out.println("Queue Created * " + Arrays.toString(queue));
	}

	public void pushElement(String data) throws StackOverFlowExe {
		if (curser >= queue.length) {
			throw new StackOverFlowExe("Queue Over Flow");
		}
		queue[curser] = data;

		System.out.println("After Push of Element at index " + curser + " '" + data + "' Element in to Queue: "
				+ Arrays.toString(queue));
		curser++;
	}

	public String popElement() throws StackUnderFlowExe {
		int pos = 0;
		if (curser == 0) {
			throw new StackUnderFlowExe("Queue Under Flow");
		} else {
			String pop = queue[pos];
			for (pos = 0; pos < queue.length - 1; pos++) {
				queue[pos] = queue[pos + 1];
			}
			queue[queue.length - 1] = null;
			System.out.println(
					"After POP of Element at index '" + 0 + "' '" + pop + "' from Queue:" + Arrays.toString(queue));
			curser--;
			return pop;
		}
	}
}
