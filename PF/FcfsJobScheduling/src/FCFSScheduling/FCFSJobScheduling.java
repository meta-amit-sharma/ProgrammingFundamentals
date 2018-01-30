/*
 * Class name- FCFSJobScheduling
 * 

 */

package FCFSScheduling;

/**
 * The class finds the schedule using FCFS algorithm
 * @version 1.0
 * @author Amit Sharma
 */
public class FCFSJobScheduling {
	
	/**
	 * This method finds and returns the next job which is to be executed
	 */
	int findNextJob ( int arrival_time[], int job_size[], int totalJobs ){
		int min = Integer.MAX_VALUE;									//it is used for comparing with other values to find smallest value
		int job = 0;
		for ( int i = 0; i < totalJobs; i++) {
			if ( (arrival_time[i] < min) && (arrival_time[i] > 0) ) {
				min = arrival_time[i];
				job = i;
				
			}
		}
		return job;	
	}
	
	
	/**
	 * This method calculates the waiting time, completion time, starting time 
	 * on the basis of the arrival time and job size of the jobs provided as input
	 */
	int [][] FCFS(int arrival_time[], int job_size[]){
		
		int totalJobs = arrival_time.length;						//finds the total number of jobs				
		int result[][] = new int[totalJobs][5];						//Store the final result
		int currentTime = 1;										//Since the clock cycle starts with 1
		for (int i = 0; i < totalJobs; i++) {
		int job = findNextJob(arrival_time, job_size, totalJobs);	//finds the next job to be executed
		if ( currentTime < arrival_time[job] ) {					//if the next job is not yet arrived 
			currentTime = arrival_time[job];
		}
		int waitingTime = currentTime-arrival_time[job];
		result[job][0] = job+1;										//storing the job number
		result[job][1] = arrival_time[job];							//storing job arrival time
		result[job][2] = waitingTime;								//storing waiting time
		result[job][3] = currentTime;								//storing job starting time
		currentTime += job_size[job];								//incrementing current time to the job's completion time
		result[job][4] = currentTime-1;								//storing the job's completion time
		arrival_time[job] = 0;										//setting the current job's arrival to 0 to ignore it in later cases
		}
		
		/**
		 * The below code prints the result calculated above in the given format
		 */
		System.out.println( "Job\tJob Arrived at\tJob wait time\tJob Start at\tJob Finished at" );
		for (int i = 0; i < totalJobs; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(result[i][j]+"\t");
			}
			System.out.println();
		}
		return result;
		
	}
	
}

 
