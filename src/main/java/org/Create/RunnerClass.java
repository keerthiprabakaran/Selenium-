package org.Create;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class RunnerClass {
	
	@Test
	public void tc() {
		Result rc = JUnitCore.runClasses(B.class,SampleProj.class,A.class);
		System.out.println("Total test Case run count :" + rc.getRunCount() );
		System.out.println("Total test case run time:"  + rc.getRunTime());
		System.out.println("Total test case failed count :" + rc.getFailureCount());
		System.out.println("Ignored test case count :" + rc.getIgnoreCount());

		List<Failure> f = rc.getFailures();
		for (Failure fails : f) {
			System.out.println(fails);
			
		}

	}

}
