/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.geo-solutions.it/
 *  Copyright (C) 2007-2012 GeoSolutions S.A.S.
 *  http://www.geo-solutions.it
 *
 *  GPLv3 + Classpath exception
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.geosolutions.geobatch.testsuite;

import java.io.File;
import java.io.IOException;

import it.geosolutions.geobatch.flow.file.FileBasedFlowManagerService;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @author Simone Giannecchini, GeoSolutions
 *
 */
public class FileBasedFlowManagerTestCase
{

    private static final Logger LOGGER = LoggerFactory.getLogger(FileBasedFlowManagerTestCase.class.toString());


    private ClassPathXmlApplicationContext context;


    private boolean caughtEvent;

    /**
     * @throws java.lang.Exception
     */
    @Before
    public void setUp() throws Exception
    {
        this.context = new ClassPathXmlApplicationContext("applicationContext.xml");
    }

    /**
     * @throws java.lang.Exception
     */
    @After
    public void tearDown() throws Exception
    {
    }

    @Test
    public void testFSFlowManagerService() throws IOException, InterruptedException
    {
        // //
        //
        // get the FileBasedEventGeneratorService bean service from the context
        //
        // //
        Object o = context.getBean("fsFlowManagerService", FileBasedFlowManagerService.class);
        Assert.assertNotNull(o);
        Assert.assertTrue(o instanceof FileBasedFlowManagerService);

        final FileBasedFlowManagerService service = (FileBasedFlowManagerService) o;

        // //
        //
        // Create a fictitious EventGeneratorConfiguration configuration
        //
        // //
//        final FileBasedEventGeneratorConfiguration eventGeneratorConfiguration = new FileBasedEventGeneratorConfiguration();
//        eventGeneratorConfiguration.setId("id");
//        eventGeneratorConfiguration.setName("name");
//        eventGeneratorConfiguration.setDescription("description");
//        eventGeneratorConfiguration.setOsType(OsType.OS_UNDEFINED);
//        eventGeneratorConfiguration.setWorkingDirectory(TestData.file(this, ".").getAbsolutePath());
//
//        // //
//        //
//        // Create a fictitious EventGeneratorConfiguration configuration
//        //
//        // //
//        final FileBasedEventConsumerConfiguration eventConsumerConfiguration = new FileBasedEventConsumerConfiguration();
//        eventConsumerConfiguration.setId("fsEventConsumerConfiguration");
//        eventConsumerConfiguration.setName("fsEventConsumerConfiguration");
//        eventConsumerConfiguration.setDescription("fsEventConsumerConfiguration");
//        eventConsumerConfiguration.setWorkingDirectory(TestData.file(this, ".").getAbsolutePath());
//
//        final FileEventRule rule = new FileEventRule();
//        rule.setAcceptableNotifications(Arrays.asList(FileSystemEventType.FILE_ADDED));
//        rule.setActualOccurrencies(1);
//        rule.setId("tesRule");
//        rule.setOptional(false);
//        rule.setRegex(".*\\.txt");
//        eventConsumerConfiguration.setRules(Arrays.asList(rule));
        // eventConsumerConfiguration.setActions(Arrays.asList(new
        // BaseAction<FileSystemEvent>() {
        //
        //
        // public FileSystemEvent process(
        // FileSystemEvent event) {
        // FileBasedFlowManagerTestCase.this.LOGGER.info(event.toString());
        // return event;
        // }});

        // flow configuration
//        final FileBasedFlowConfiguration flowConfiguration = new FileBasedFlowConfiguration();
//        flowConfiguration.setId("id");
//        flowConfiguration.setName("name");
//        flowConfiguration.setDescription("description");
//        flowConfiguration.setWorkingDirectory(TestData.file(this, ".").getAbsolutePath());
//        flowConfiguration.setEventConsumerConfiguration(eventConsumerConfiguration);
//        flowConfiguration.setEventGeneratorConfiguration(eventGeneratorConfiguration);

        // //
        //
        // Check if we can create the needed EventGenerator and if so create it
        //
        // //
//        final boolean result = service.canCreateFlowManager(flowConfiguration);
//        Assert.assertTrue(result);
//
//        // create the event generator
//        final FileBasedFlowManager eg = service.createFlowManager(flowConfiguration);
//        Thread flowM = new Thread(eg);
//        flowM.start();

        Thread.sleep(10000);

        //
        //
        final File file = TestData.temp(this, "test");
        // if(file.exists()) {
        synchronized (this)
        {
            this.wait(5000);
        }
        // Assert.assertTrue("unable to create test",this.caughtEvent);
        // }
        // else
        // Assert.assertTrue("unable to create test",false);

    }

}
