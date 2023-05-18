package com.database.rest.listener;

import java.util.Date;

import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

public class JobMonitoring  implements JobExecutionListener {
	 	 	private long start,end;
	 	 	@Override
	 	 	public void  beforeJob(JobExecution jobExecution) {
				start=System.currentTimeMillis();
				System.out.println("Job Start Time"+new Date());
			}
	 	 	
	 	 	@Override
	 	 	public void afterJob(JobExecution jobExecution) {
	 	 		end=System.currentTimeMillis();
	 	 		System.out.println("Job Compled time....."+new Date());
	 	 		System.out.println("Job Execution time..."+(end-start)+"ms");
	 	 		System.out.println("Job Completion time Status ::"+jobExecution.getStatus());
	 	 	}

}
