package com.admin.utility;

import com.mks.api.Command;

public class UtilityAdmins {
	

	public static String printCommand(Command cmd) {
		String[] command = cmd.toStringArray();
		String thecmd = "";
		for (int i = 0; i < command.length; i++) {
			thecmd = thecmd + " " + command[i];
		}
		return thecmd;
	}


}
