package org.openmrs.module.ugandaemr.tasks;

import org.openmrs.Visit;
import org.openmrs.api.VisitService;
import org.openmrs.api.context.Context;
import org.openmrs.module.patientqueueing.api.PatientQueueingService;
import org.openmrs.module.patientqueueing.model.PatientQueue;
import org.openmrs.module.ugandaemr.api.UgandaEMRService;
import org.openmrs.scheduler.tasks.AbstractTask;
import org.openmrs.util.OpenmrsUtil;

import java.util.Date;
import java.util.List;

public class StopActiveFacilityVisitTask extends AbstractTask {
    @Override
    public void execute() {
        VisitService visitService = Context.getVisitService();
        PatientQueueingService patientQueueingService=Context.getService(PatientQueueingService.class);
        List<Visit> visitList = visitService.getAllVisits();
        List<PatientQueue> incompleteQueues = Context.getService(PatientQueueingService.class).getPatientQueueList(null,null,OpenmrsUtil.firstSecondOfDay(new Date()),null,null,null,PatientQueue.Status.PENDING);
        incompleteQueues = Context.getService(PatientQueueingService.class).getPatientQueueList(null,null,OpenmrsUtil.firstSecondOfDay(new Date()),null,null,null,PatientQueue.Status.PICKED);
        for (Visit visit : visitList) {
            if (visit.getStopDatetime() == null && visit.getVisitType().getUuid().equals("7b0f5697-27e3-40c4-8bae-f4049abfb4ed") && visit.getStartDatetime().before(OpenmrsUtil.firstSecondOfDay(new Date()))) {
                visitService.endVisit(visit, OpenmrsUtil.getLastMomentOfDay(visit.getStartDatetime()));
            }
        }

        for (PatientQueue patientQueue:incompleteQueues){
            patientQueueingService.completePatientQueue(patientQueue);
        }
    }
}
