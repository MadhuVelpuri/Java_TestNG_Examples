package com.practice;
/*package com.pratice;



import com.microsoft.tfs.core.TFSTeamProjectCollection;
import com.microsoft.tfs.core.clients.workitem.WorkItem;
import com.microsoft.tfs.core.clients.workitem.WorkItemClient;
import com.microsoft.tfs.core.clients.workitem.project.Project;
import com.microsoft.tfs.core.clients.workitem.query.WorkItemCollection;

public class RunWorkItemQuery
{

	*//**
	 * @param args
	 *//*
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		        TFSTeamProjectCollection tpc =
		            new TFSTeamProjectCollection("http://tfs2010:8080/tfs/DefaultCollection");

		        Project project = tpc.getWorkItemClient().getProjects().get("Tailspin Toys");
		        WorkItemClient workItemClient = project.getWorkItemClient();

		        // Define the WIQL query.
		        String wiqlQuery = "Select ID, Title from WorkItems where (State = 'Active') order by Title";

		        // Run the query and get the results.
		        WorkItemCollection workItems = workItemClient.query(wiqlQuery);
		        System.out.println("Found " + workItems.size() + " work items.");
		        System.out.println();

		        // Write out the heading.
		        System.out.println("ID\tTitle");

		        // Output the first 20 results of the query, allowing the TFS SDK to page
		        // in data as required
		        final int maxToPrint = 20;
		        for (int i = 0; i < workItems.size(); i++)
		        {
		            if (i >= maxToPrint)
		            {
		                System.out.println("[...]");
		                break;
		            }

		            WorkItem workItem = workItems.getWorkItem(i);
		            System.out.println(workItem.getID() + "\t" + workItem.getTitle());
		        }
	}
	
}
*/