package org.ccci.obiee.client.init;

import com.infosolve.openmdm.webservices.provider.impl.DataManagementWSImpl;
import com.infosolve.openmdm.webservices.provider.impl.DataManagementWSImplService;
import com.infosolve.openmdm.webservices.provider.impl.RealTimeObjectActionDTO;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ServiceFactoryTest
{
    
    ServiceFactory factory;
    
    @BeforeMethod
    public void setup()
    {
        factory = new ServiceFactory();
    }
    
    @Test
    public void testDataManagementWSImplServiceCreation()
    {
        DataManagementWSImpl port =
            factory.buildService(DataManagementWSImplService.class).getDataManagementWSImplPort();


        RealTimeObjectActionDTO object = port.findObject("234");

        System.out.println(object);

    }
}
