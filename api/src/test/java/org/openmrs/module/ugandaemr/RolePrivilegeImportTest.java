package org.openmrs.module.ugandaemr;


import org.junit.jupiter.api.Test;
import org.openmrs.api.UserService;
import org.openmrs.api.context.Context;
import org.openmrs.module.dataexchange.DataImporter;
import org.openmrs.test.jupiter.BaseContextSensitiveTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RolePrivilegeImportTest extends BaseContextSensitiveTest {


    protected static final String ROLE_PRIVILLEGE_DATASET_XML = "metadata/Role_Privilege.xml";

    @Test
    public void shouldImportWithOutAnyError() {
        UserService userService= Context.getUserService();
        DataImporter dataImporter = Context.getRegisteredComponent("dataImporter", DataImporter.class);
        dataImporter.importData(ROLE_PRIVILLEGE_DATASET_XML);
        assertNotNull(userService.getPrivilege("App: ugandaemrpoc.findPatient"));
        assertNotNull(userService.getRole("Data Clerk"));
        assertTrue(userService.getRole("Data Clerk").getPrivileges().contains(userService.getPrivilege("App: ugandaemrpoc.findPatient")));
    }
}
