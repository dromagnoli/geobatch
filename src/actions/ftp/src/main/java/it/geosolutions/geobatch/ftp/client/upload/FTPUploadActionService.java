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

package it.geosolutions.geobatch.ftp.client.upload;

import it.geosolutions.filesystemmonitor.monitor.FileSystemEvent;
import it.geosolutions.geobatch.catalog.impl.BaseService;
import it.geosolutions.geobatch.flow.event.action.ActionService;
import it.geosolutions.geobatch.ftp.client.configuration.FTPActionConfiguration;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class manage the upload service running the FTP upload action.
 * 
 * @author Tobia Di Pisa (tobia.dipisa@geo-solutions.it)
 * @author Ivano Picco
 */
public class FTPUploadActionService extends BaseService implements
        ActionService<FileSystemEvent, FTPActionConfiguration> {

    public FTPUploadActionService(String id, String name, String description) {
        super(id, name, description);
    }

    private final static Logger LOGGER = LoggerFactory.getLogger(FTPUploadActionService.class.toString());

    /**
     * The FTPUploadActionService default constructor.
     */
//    public FTPUploadActionService() {
//        super(true);
//    }

    /**
     * Method to verify if the action creation is available.
     * 
     * @param configuration
     *            The FTP action configuration.
     * @return boolean
     */
    public boolean canCreateAction(FTPActionConfiguration configuration) {
        return true;
    }

    /**
     * Method to create an upload action using the FTP action configuration.
     * 
     * @param configuration
     *            The FTP action configuration.
     * @return The FTPUploadAction
     */
    public FTPUploadAction createAction(FTPActionConfiguration configuration) {
        try {
            return new FTPUploadAction(configuration);
        } catch (IOException e) {
            if (LOGGER.isErrorEnabled())
                LOGGER.error(e.getLocalizedMessage(), e);
        }

        return null;
    }
}
