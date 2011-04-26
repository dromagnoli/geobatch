/*
 *  GeoBatch - Open Source geospatial batch processing system
 *  http://geobatch.codehaus.org/
 *  Copyright (C) 2007-2008-2009 GeoSolutions S.A.S.
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

package it.geosolutions.geobatch.geoserver.shapefile;

import it.geosolutions.filesystemmonitor.monitor.FileSystemEvent;
import it.geosolutions.geobatch.catalog.impl.BaseService;
import it.geosolutions.geobatch.flow.event.action.ActionService;
import it.geosolutions.geobatch.geoserver.GeoServerActionConfiguration;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Comments here ...
 * 
 * @author AlFa
 * 
 * @version $ ShapeFileGeoServerGeneratorService.java $ Revision: x.x $ 19/feb/07 16:16:13
 */
public class ShapeFileGeneratorService extends BaseService implements
        ActionService<FileSystemEvent, GeoServerActionConfiguration> {

    private final static Logger LOGGER = LoggerFactory.getLogger(ShapeFileGeneratorService.class
            .toString());

    public ShapeFileGeneratorService(String id, String name, String description) {
        super(id, name, description);
    }
    
<<<<<<< HEAD
    public ShapeFileConfigurator createAction(final ShapeFileConfiguration configuration) {
=======
    public ShapeFileAction createAction(final GeoServerActionConfiguration configuration) {
>>>>>>> 15f5136... Fixed Octave test and some internal function. Added new geoservermanager dependency
        try {
            return new ShapeFileConfigurator(configuration);
        } catch (IOException e) {
            if (LOGGER.isWarnEnabled())
                LOGGER.warn(e.getLocalizedMessage(), e);
            return null;
        }
    }

    public boolean canCreateAction(final GeoServerActionConfiguration configuration) {
        return true;
    }

}
