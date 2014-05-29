package org.ccci.obiee.client.init;

import com.infosolve.openmdm.webservices.provider.impl.DataManagementWSImpl;
import com.infosolve.openmdm.webservices.provider.impl.DataManagementWSImplService;
import com.infosolve.openmdm.webservices.provider.impl.RealTimeObjectActionDTO;
import com.infosolvetech.rtmatch.pdi4.RuntimeMatchWS;
import com.infosolvetech.rtmatch.pdi4.RuntimeMatchWSService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import plugin.com.infosolvetech.ap.di.pdi4.AddressWS;
import plugin.com.infosolvetech.ap.di.pdi4.AddressWSService;
import plugin.org.pentaho.di.drools.jboss.pdi4.DroolsPluginWSService;

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
        factory.buildService(DataManagementWSImplService.class).getDataManagementWSImplPort();
    }

    @Test
    public void testRuntimeMatchWSServiceCreation()
    {
        factory.buildService(RuntimeMatchWSService.class).getRuntimeMatchWSPort();
    }

    @Test
    public void testAddressWSServiceCreation()
    {
        factory.buildService(AddressWSService.class).getAddressWSPort();
    }

    @Test
    public void testDroolsPluginWSServiceCreation()
    {
        factory.buildService(DroolsPluginWSService.class).getDroolsPluginWSPort();
    }

}
