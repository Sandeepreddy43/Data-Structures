package com.data_structure;

import java.util.Arrays;

public class StackDemoTest {

	public static void main(String[] args) throws StackOverFlowExe, StackUnderFlowExe {
		StackDemo sd = new StackDemo();
		sd.createStack();
		try {
			sd.pushElement("One");
			sd.pushElement("Two");
			sd.pushElement("Three");
			sd.pushElement("Four");
			sd.pushElement("Five");
			sd.popElement();
			sd.popElement();
			sd.popElement();
			sd.popElement();
			sd.popElement();
			sd.pushElement("Six");
			sd.popElement();
//			sd.popElement();
			sd.pushElement("Seven");
			sd.popElement();
			sd.pushElement("Eight");
		} catch (StackOverFlowExe oe) {
			System.out.println(oe);
		} catch (StackUnderFlowExe ue) {
			System.out.println(ue);
		}
		System.out.println("\nStack Elements: " + Arrays.toString(sd.stack));
	}
}