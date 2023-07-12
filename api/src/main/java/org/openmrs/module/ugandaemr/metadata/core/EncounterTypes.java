package org.openmrs.module.ugandaemr.metadata.core;

import org.openmrs.module.metadatadeploy.descriptor.EncounterTypeDescriptor;

/**
 * Created by lubwamasamuel on 18/10/16.
 */
public class EncounterTypes {
    public static EncounterTypeDescriptor PNC_ENCOUNTER_TYPE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "PNC - Encounter";
        }

        @Override
        public String description() {
            return "An encounter when a patient gets PNC services";
        }

        public String uuid() {
            return "fa6f3ff5-b784-43fb-ab35-a08ab7dbf074";
        }
    };

    public static EncounterTypeDescriptor OPD_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "OPD Encounter";
        }

        @Override
        public String description() {
            return "Outpatient Clinical Ecnounter";
        }

        public String uuid() {
            return "ee4780f5-b5eb-423b-932f-00b5879df5ab";
        }
    };

    public static EncounterTypeDescriptor SMC_FOLLOWUP = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "SMC Follow up Encounter";
        }

        @Override
        public String description() {
            return "SMS Follow up Encounter";
        }

        public String uuid() {
            return "d0f9e0b7-f336-43bd-bf50-0a7243857fa6";
        }
    };

    public static EncounterTypeDescriptor TB_SUMMARY_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "TB Summary (Enrollment)";
        }

        @Override
        public String description() {
            return "An encounter for the initial visit to the TB clinic";
        }

        public String uuid() {
            return "334bf97e-28e2-4a27-8727-a5ce31c7cd66";
        }
    };

    public static EncounterTypeDescriptor TB_FOLLOWUP_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "TB Encounter (Followup)";
        }

        @Override
        public String description() {
            return "An encounter for a return visit to the TB clinic";
        }

        public String uuid() {
            return "455bad1f-5e97-4ee9-9558-ff1df8808732";
        }
    };


    public static EncounterTypeDescriptor DR_TB_SUMMARY_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "DR TB Summary (Enrollment)";
        }

        @Override
        public String description() {
            return "An encounter for the initial visit to the Drug Resistance TB Program";
        }

        public String uuid() {
            return "0271ee3d-f274-49d1-b376-c842f075413f";
        }
    };

    public static EncounterTypeDescriptor DR_TB_FOLLOWUP_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "DR TB Encounter (Followup)";
        }

        @Override
        public String description() {
            return "An encounter for a return visit to the Drug Resistance TB Program";
        }

        public String uuid() {
            return "41f8609d-e13b-4dff-8379-47ac5876512e";
        }
    };


    public static EncounterTypeDescriptor VIRAL_LOAD_NON_SUPPRESSED  = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Viral Load Non Suppressed Encounter";
        }

        @Override
        public String description() {
            return "Viral Load Non Suppressed Follow up";
        }

        public String uuid() {
            return "38cb2232-30fc-4b1f-8df1-47c795771ee9";
        }
    };

    public static EncounterTypeDescriptor APPOINTMENT_FOLLOW_UP = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Appointment Follow-up ";
        }

        @Override
        public String description() {
            return "Followup actions for patients especially after missing a facility visit";
        }

        public String uuid() {
            return "dc551efc-024d-4c40-aeb8-2147c4033778";
        }
    };

    public static EncounterTypeDescriptor TRIAGE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Triage";
        }

        @Override
        public String description() {
            return "This is a form to capture information on triage. It include Vitals, global security indicators etc....";
        }

        public String uuid() {
            return "0f1ec66d-61db-4575-8248-94e10a88178f";
        }
    };

    public static EncounterTypeDescriptor MEDICATION_DISPENSE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Medication Dispense";
        }

        @Override
        public String description() {
            return "This encounter type is for dispensing of medication at facility";
        }

        public String uuid() {
            return "22902411-19c1-4a02-b19a-bf1a9c24fd51";
        }
    };

    public static EncounterTypeDescriptor MISSED_APPOINTMENT_TRACKING = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Missed Appointment Tracking";
        }

        @Override
        public String description() {
            return "This encounter type is for tracking followup for missed appointments";
        }

        public String uuid() {
            return "791faefd-36b8-482f-ab78-20c297b03851";
        }
    };

    public static EncounterTypeDescriptor TRANSFER_IN = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Transfer In";
        }

        @Override
        public String description() {
            return "Transfer in encounter";
        }

        public String uuid() {
            return "3e8354f7-31b3-4862-a52e-ff41a1ee60af";
        }
    };

    public static EncounterTypeDescriptor TRANSFER_OUT = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Transfer Out";
        }

        @Override
        public String description() {
            return "Transfer out encounter";
        }

        public String uuid() {
            return "e305d98a-d6a2-45ba-ba2a-682b497ce27c";
        }
    };

    public static EncounterTypeDescriptor ART_REGIMEN_CHANGE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "ART Regimen Change";
        }

        @Override
        public String description() {
            return "ART Regimen Switch or Change Encounter";
        }

        public String uuid() {
            return "c11774c1-3b4a-4bdb-a847-6060895e006d";
        }
    };

    public static EncounterTypeDescriptor COVID19_ENROLLMENT = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Case Investigation";
        }

        @Override
        public String description() {
            return "Covid19 Case Investigation Encounter";
        }

        public String uuid() {
            return "422ee220-9e83-451d-9b25-79a688a0413a";
        }
    };

    public static EncounterTypeDescriptor COVID19_FOLLOWUP = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Clinical Management";
        }

        @Override
        public String description() {
            return "Covid19 Clinical Management Encounter";
        }

        public String uuid() {
            return "cd9a2698-206f-44f3-a888-f824544413b4";
        }
    };
    public static EncounterTypeDescriptor COVID19_DISCHARGE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Discharge";
        }

        @Override
        public String description() {
            return "Covid19 Discharge Encounter";
        }

        public String uuid() {
            return "482e4b17-fb9c-4937-a1cf-9052d3e3be68";
        }
    };
    public static EncounterTypeDescriptor COVID19_POSTMORTEM = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Postmortem";            
        }

        @Override
        public String description() {
            return "Covid19 Postmortem Encounter";
        }

        public String uuid() {
            return "7f7f59dc-defe-11eb-ba80-0242ac130004";
        }
    };
    public static EncounterTypeDescriptor COVID19_REFERRAL = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Referral";
        }

        @Override
        public String description() {
            return "Covid19 Referral Encounter";
        }

        public String uuid() {
            return "afcdfcd8-defe-11eb-ba80-0242ac130004";
        }
    };
    public static EncounterTypeDescriptor EMERGENCY_ART_SERVICE = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Emergency ART Service Encounter";
        }

        @Override
        public String description() {
            return "Emergency ART Service Encounter";
        }

        public String uuid() {
            return "d18bd8f2-dfcd-11eb-ba80-0242ac130004";
        }
    };

    public static EncounterTypeDescriptor COVID19_VACCINATION_TRACKING = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Covid19 Vaccination Tracking Encounter";
        }

        @Override
        public String description() {
            return "Covid19 vaccination tracking for clients active on ART";
        }

        public String uuid() {
            return "c392cf0e-5024-4f47-9ed9-e10e307e942f";
        }
    };

    public static EncounterTypeDescriptor CACX_SCREENING_LOG = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "CaCx Screening Eligibility Log Encounter";
        }

        @Override
        public String description() {
            return "CaCx Screening Eligibility Log Encounter";
        }

        public String uuid() {
            return "91725548-2d90-4b28-be6d-0509ba37bb0f";
        }
    };

    public static EncounterTypeDescriptor CACX_TREATMENT_REGISTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "CaCx Treatment Encounter";
        }

        @Override
        public String description() {
            return "CaCx Treatment Encounter";
        }

        public String uuid() {
            return "6d647bd4-33d6-4d04-a04a-595d2159b456";
        }
    };

    public static EncounterTypeDescriptor SMS_ENROLLMENT = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "SMS Enrollment Encounter";
        }

        @Override
        public String description() {
            return "SMS Enrollment Encounter";
        }

        public String uuid() {
            return "05fa932f-4203-43c9-8985-60f2bea8a773";
        }
    };

    public static EncounterTypeDescriptor LAB_REQUEST_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Lab Request Encounter";
        }

        @Override
        public String description() {
            return "Lab Request Encounter";
        }

        public String uuid() {
            return "cbf01392-ca29-11e9-a32f-2a2ae2dbcce4";
        }
    };
    public static EncounterTypeDescriptor INTER_FACILITY_LINKAGE_ENCOUNTER = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Facility Linkage Encounter";
        }

        @Override
        public String description() {
            return "Facility Linkage Encounter";
        }

        public String uuid() {
            return "786c576b-b70f-4235-93ea-fbce1a3f38c4";
        }
    };

    public static EncounterTypeDescriptor MOBILITY_SCREENING = new EncounterTypeDescriptor() {
        @Override
        public String name() {
            return "Mobility Screening  Encounter";
        }

        @Override
        public String description() {
            return "Mobility Screening Encounter";
        }

        public String uuid() {
            return "b57e1835-4ee2-47fa-9569-c700c39c169a";
        }
    };
}
