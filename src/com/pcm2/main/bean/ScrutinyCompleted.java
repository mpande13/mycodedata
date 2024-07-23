package com.pcm2.main.bean;

import com.admin.utility.UtilityAdmins;
import com.mks.api.Command;
import com.mks.api.Option;
import com.mks.api.response.APIException;
import com.mks.api.response.Response;
import com.pcm2.main.connection.Connection;

/**
 * @author Mandar Pande
 * @implNote This will create a new PCM2 Change Request
 * @see im createissue --type=Docs --field="Type=Docs"
 *      --field="Summary=Update release notes"
 *
 */
public class ScrutinyCompleted {

	// static String fieldOptionFirst = "field=";
	static String fieldOption = "--field=";
	static String typeDef = "--type=";

	public static void completeScrutiny(Connection connection, String categoryClear, String title, String requestingOrg)
			throws APIException {

		// String addTitle = fieldOption + "\"" + "Title=" + title + "\"";
		// String addCategoryClear = fieldOption + "\"" + "Is the Category for creating
		// this CR Clear?=" + categoryClear + "\"";
		// String addRequestingOrg = fieldOption + "\"" + "PCM2 BU IBPL=" +
		// requestingOrg + "\"";
		// String addIssueType = typeDef + "\"" + issueType + "\"";

		String addTitle = fieldOption + "Title=" + title;
		String addCategoryClear = fieldOption + "Is the Category for creating this CR Clear?=" + categoryClear;
		String addRequestingOrg = fieldOption + "PCM2 BU IBPL=" + requestingOrg;

		Command cmd = new Command(Command.IM, "createissue");
		cmd.addOption(new Option("type=PCM2 Change Request"));
		cmd.addOption(new Option(addTitle));
		cmd.addOption(new Option(addCategoryClear));
		cmd.addOption(new Option(addRequestingOrg));

		System.out.println(UtilityAdmins.printCommand(cmd));

		Response response = connection.getCmdRunner().execute(cmd);
		System.out.println(response.getExitCode());

	}

}
