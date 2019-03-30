package com.data_structure;

import java.util.Arrays;

public class QueueDemoTest {
	public static void main(String[] args) throws StackOverFlowExe, StackUnderFlowExe {
		QueueDemo qd = new QueueDemo();
		qd.createQueue();
		try {
			qd.pushElement("One");
			qd.pushElement("Two");
			qd.popElement();
			qd.pushElement("Three");
			qd.pushElement("Four");
			qd.pushElement("Five");
			qd.popElement();
			qd.popElement();
		} catch (StackUnderFlowExe ue) {
			System.out.println(ue);
		} catch (StackOverFlowExe oe) {
			System.out.println(oe);
		}
		System.out.println("\nQueue Elements: " + Arrays.toString(qd.queue));
	}
}