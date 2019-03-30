package com.data_structure;

import java.util.Arrays;
import java.util.Scanner;

public class StackDemo {
	int size, add;
	int curser = 0;
	String[] stack;
	String element;
	Scanner s = new Scanner(System.in);

	public void createStack() {
		System.out.println("Enter Your 'Stack' size: ");
		size = s.nextInt();
		stack = new String[size];
		System.out.println("Stack Created * " + Arrays.toString(stack));
	}

	public void pushElement(String data) throws StackOverFlowExe {
		if (curser >= stack.length) {
			throw new StackOverFlowExe("Stack Size Over Flow");
		}
		stack[curser] = data;

		System.out.println("After Push of Elementt at index " + curser + " '" + data + "' Element in to Stack: "
				+ Arrays.toString(stack));
		curser++;
	}

	public String popElement() throws StackUnderFlowExe {

		if (curser == 0) {
			throw new StackUnderFlowExe("Stack Under Flow");
		}
		String pop = stack[curser - 1];
		stack[curser - 1] = null;
		System.out.println(
				"After POP of Element at index " + (curser - 1) + " '" + pop + "' from Stack:" + Arrays.toString(stack));
		curser--;
		return pop;
	}
}