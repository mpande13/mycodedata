
/* Note
 * 
 * Please replace eclipse cacerts file with yours into following location

C:\Users\pandem3\.p2\pool\plugins\org.eclipse.justj.openjdk.hotspot.jre.full.win32.x86_64_15.0.2.v20210201-0955\jre\lib\security

*/

package com.pcm2.main;

import java.io.IOException;

import com.completestate.control.RunConnectionSpecificToBUser;
import com.mks.api.response.APIException;
import com.pcm2.main.bean.RecordingCompleted;
import com.pcm2.main.connection.SourceConnection;

public class MainApplicationPCM2Recording {

	public static void main(String[] args) throws IOException, APIException {

				RunConnectionSpecificToBUser buConnection = new RunConnectionSpecificToBUser();
				RecordingCompleted recordComplete = new RecordingCompleted();

		// Creating Common Connection with default API user
				SourceConnection src = new SourceConnection();
				src = buConnection.getConnectionInstance();

		/*
		 * For Each command to run in sequence, using impersonation of user : For every
		 * specific BU Users
		 *
		 */

					// For CRD
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_CRD.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-CRD-1", "CRD");
			
					// For NIB-PM
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.NIBPM.name().toString());
			    	src.getCmdRunner();
					recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-NIBPM-1", "NIB-PM");
			
					// For NIBSMMarketing
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.NIBSMMarketing.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-NIBSMMarketing-1", "NIB-SM-Marketing");
			
					// For BU_EtE
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_EtE.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-EtE-1", "EtE");
			
					// For NIB-SM-Sales
			
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.NIBSMSales.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-NIBSMSales-1", "NIB-SM-Sales");
			
					// For BU_SCM
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_SCM.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-SCM-1", "SCM");
			
					// For BU_EIB
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_EIB.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-NIBSMSales", "EIB");
			
					// For MOD_Sales
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.MODSales.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-MOD_Sales-1", "MOD_Sales");
			
					// For BU_FF
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_FF.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-FF-1", "FF");
			
					// For BU_GS
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_GS.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-GS-1", "GS");
			
					// For BU_MDC
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_MDC.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-MDC-1", "MDC");
			
					// For BU_MOD
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.BU_MOD.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-MOD-1", "MOD");
			
					// For SC-Config
					//src.getCmdRunner().setDefaultImpersonationUser(PCM2_Users.Sconfig.name().toString());
					//recordComplete.createIssueForPCM2(src, "Yes", "Recording Completed-Test-SC-Config-1", "SC-Config");
			
					// Releasing the connection
					src.releaseConnection();
			
				}

}
