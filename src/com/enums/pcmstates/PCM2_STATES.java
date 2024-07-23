package com.enums.pcmstates;

public enum PCM2_STATES {

	Cancelled("Cancelled"), Rejected("Rejected"), Closed("Closed"), Active("Active"), Suspended("Suspended"),
	Inactive("Inactive"), Completed("Completed"), ReadyForPlanning("Ready for planning"), Proposed("Proposed"),
	Defined("Defined"), Started("Started"), Implemented("Implemented"), Draft("Draft"), Development("Development"),
	Released("Released"), OnHold("On Hold"), RecordingCompleted("Recording Completed"),
	RejectNewCPRequest("Reject New CP Request"), RejectCR("Reject CR"), AnalysisConsolidation("Analysis Consolidation"),
	ConceptIdeaComponent("Concept Idea - Component"), NewCPAllocation("New CP Allocation"),
	ReleaseforImplementation("Release for Implementation"), ReworkParentPCMCR("Rework Parent PCM CR"),
	CompleteBUImplementation("Complete BU Implementation"), DesignNotRequired("Design Not Required"),
	CreateENGCR("Create ENG CR"), CompleteZoneAlignment("Complete Zone Alignment"),
	ApproveNewCPRequest("Approve New CP Request"), CompleteBUFeasibility("Complete BU Feasibility"),
	BUImplementation("BU Implementation"), ImplementationNotRequired("Implementation Not Required"),
	ReleaseNotRequired("Release Not Required"), CRRecording("CR Recording"), PMApproval("PM Approval"),
	ReleasetoProduction("Release to Production"), DecisionBoard("Decision Board"), InDesignSAP("In Design - SAP"),
	ZoneAlignmentCompleted("Zone Alignment Completed"), ScrutinyCompleted("Scrutiny Completed"),
	CompleteConceptIdeaComponent("Complete Concept Idea - Component"), BUDesign("BUDesign"),
	ZoneAlignment("ZoneAlignment"), CompleteBUDesign("Complete BU Design"), Design("Design"),
	Feasibility("Feasibility"), BUFeasibility("BU Feasibility"), NewCPAllocationRequest("New CP Allocation Request"),
	PMApprovalCompleted("PM Approval Completed"), Reedit("Re-edit"), Planning("Planning"), KAOpening("KA Opening"),
	Loop1("Loop1 (Offered)"), Review("Review"), FeasibilityCompleted("Feasibility Completed"),
	PlanningProcess("Planning Process"), SpecificationProcess("Specification Process"),
	ImplementationProcess("Implementation Process"), ReworkRequired("Rework Required"),
	ImplementationCompleted("Implementation Completed"), SpecificationCompleted("Specification Completed"),
	Reviewed("Reviewed"), FinalFreeze("Final Freeze"), DesignCompleted("Design Completed"), Validation("Validation"),
	MoreInfo("More Info"), CompleteMoreInfo("Complete More Info"), InImplementation("In Implementation"),
	TechnicalFeasibilityQuestioned("Technical Feasibility Questioned"),
	ResolveFeasibilityQuestioning("Resolve Feasibility Questioning"), SCMVeto("SCM Veto"), Signed("Signed"),
	CostImpactAssessment("Cost Impact Assessment"), CTVeto("CT Veto"), ResolveCTVeto("Resolve CT Veto"),
	FeasibilityCosting("Feasibility Costing"), CompleteFeasibilityCosting("Complete Feasibility Costing"),
	FeasibilityCostingCompleted("Feasibility Costing Completed"), DesignReviewCosting("Design Review Costing"),
	DesignReviewCostingCompleted("Design Review Costing Completed"),
	CompleteDesignReviewCosting("Complete Design Review Costing"), NotApplicable("Not Applicable"),
	CompleteCostImpactAssessment("Complete Cost Impact Assessment"), ValidationCompleted("Validation Completed"),
	ValidationProcess("Validation Process"), BUValidation("BU Validation"),
	ValidationNotRequired("Validation Not Required"), Scrutiny("Scrutiny"), ConceptIdeaSystem("Concept Idea - System"),
	PDB("PDB"), DecisionBoardCompleted("Decision Board Completed"), PDBCompleted("PDB Completed"), Veto("Veto"),
	VetoResolved("Veto Resolved"), ConceptIdeaSystemCompleted("Concept Idea - System Completed"),
	AnalysisConsolidationCompleted("Analysis Consolidation Completed"), CreateF3ESTask("Create F3 ES Task"),
	Blocked("Blocked"), CreateEngCRforCP("Create Eng CR for CP"), ChangeBUIdentification("Change BU Identification"),
	CompleteChangeBUIdentification("Complete Change BU Identification"),
	PartialCompletionDependancy("Partial Completion - Dependancy"), ZoneNotAligned("Zone Not Aligned"), Open("Open"),
	InReview("In Review"), Obsolete("Obsolete"), InPreparation("In Preparation"),
	NoReviewRequired("No Review Required");

	
	// Parameterizes constructor
	private String state;

	PCM2_STATES(String state) {
		// TODO Auto-generated constructor stub

		this.state = state;
	}

	public String getStateName() {
		return this.state;
	}

}
