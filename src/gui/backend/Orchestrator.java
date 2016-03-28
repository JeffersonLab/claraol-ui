/*
 *   Copyright (c) 2016.  Jefferson Lab (JLab). All rights reserved. Permission
 *   to use, copy, modify, and distribute  this software and its documentation for
 *   educational, research, and not-for-profit purposes, without fee and without a
 *   signed licensing agreement.
 *
 *   IN NO EVENT SHALL JLAB BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT, SPECIAL
 *   INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS, ARISING
 *   OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF JLAB HAS
 *   BEEN ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *   JLAB SPECIFICALLY DISCLAIMS ANY WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 *   THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 *   PURPOSE. THE CLARA SOFTWARE AND ACCOMPANYING DOCUMENTATION, IF ANY,
 *   PROVIDED HEREUNDER IS PROVIDED "AS IS". JLAB HAS NO OBLIGATION TO PROVIDE
 *   MAINTENANCE, SUPPORT, UPDATES, ENHANCEMENTS, OR MODIFICATIONS.
 *
 *   This software was developed under the United States Government license.
 *   For more information contact author at gurjyan@jlab.org
 *   Department of Experimental Nuclear Physics, Jefferson Lab.
 */

package gui.backend;

import java.util.Collection;

/**
 * 
 * <p>
 * @version generated on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Orchestrator {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#actsOnError
     */
     
    /**
     * Gets all property values for the actsOnError property.<p>
     * 
     * @return a collection of values for the actsOnError property.
     */
    Collection<? extends Action> getActsOnError();

    /**
     * Checks if the class has a actsOnError property value.<p>
     * 
     * @return true if there is a actsOnError property value.
     */
    boolean hasActsOnError();

    /**
     * Adds a actsOnError property value.<p>
     * 
     * @param newActsOnError the actsOnError property value to be added
     */
    void addActsOnError(Action newActsOnError);

    /**
     * Removes a actsOnError property value.<p>
     * 
     * @param oldActsOnError the actsOnError property value to be removed.
     */
    void removeActsOnError(Action oldActsOnError);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#actsOnWarning
     */
     
    /**
     * Gets all property values for the actsOnWarning property.<p>
     * 
     * @return a collection of values for the actsOnWarning property.
     */
    Collection<? extends Action> getActsOnWarning();

    /**
     * Checks if the class has a actsOnWarning property value.<p>
     * 
     * @return true if there is a actsOnWarning property value.
     */
    boolean hasActsOnWarning();

    /**
     * Adds a actsOnWarning property value.<p>
     * 
     * @param newActsOnWarning the actsOnWarning property value to be added
     */
    void addActsOnWarning(Action newActsOnWarning);

    /**
     * Removes a actsOnWarning property value.<p>
     * 
     * @param oldActsOnWarning the actsOnWarning property value to be removed.
     */
    void removeActsOnWarning(Action oldActsOnWarning);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#processes
     */
     
    /**
     * Gets all property values for the processes property.<p>
     * 
     * @return a collection of values for the processes property.
     */
    Collection<? extends DataSet> getProcesses();

    /**
     * Checks if the class has a processes property value.<p>
     * 
     * @return true if there is a processes property value.
     */
    boolean hasProcesses();

    /**
     * Adds a processes property value.<p>
     * 
     * @param newProcesses the processes property value to be added
     */
    void addProcesses(DataSet newProcesses);

    /**
     * Removes a processes property value.<p>
     * 
     * @param oldProcesses the processes property value to be removed.
     */
    void removeProcesses(DataSet oldProcesses);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#runs
     */
     
    /**
     * Gets all property values for the runs property.<p>
     * 
     * @return a collection of values for the runs property.
     */
    Collection<? extends Application> getRuns();

    /**
     * Checks if the class has a runs property value.<p>
     * 
     * @return true if there is a runs property value.
     */
    boolean hasRuns();

    /**
     * Adds a runs property value.<p>
     * 
     * @param newRuns the runs property value to be added
     */
    void addRuns(Application newRuns);

    /**
     * Removes a runs property value.<p>
     * 
     * @param oldRuns the runs property value to be removed.
     */
    void removeRuns(Application oldRuns);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsError
     */
     
    /**
     * Gets all property values for the monitorsError property.<p>
     * 
     * @return a collection of values for the monitorsError property.
     */
    Collection<? extends Boolean> getMonitorsError();

    /**
     * Checks if the class has a monitorsError property value.<p>
     * 
     * @return true if there is a monitorsError property value.
     */
    boolean hasMonitorsError();

    /**
     * Adds a monitorsError property value.<p>
     * 
     * @param newMonitorsError the monitorsError property value to be added
     */
    void addMonitorsError(Boolean newMonitorsError);

    /**
     * Removes a monitorsError property value.<p>
     * 
     * @param oldMonitorsError the monitorsError property value to be removed.
     */
    void removeMonitorsError(Boolean oldMonitorsError);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsInfo
     */
     
    /**
     * Gets all property values for the monitorsInfo property.<p>
     * 
     * @return a collection of values for the monitorsInfo property.
     */
    Collection<? extends Boolean> getMonitorsInfo();

    /**
     * Checks if the class has a monitorsInfo property value.<p>
     * 
     * @return true if there is a monitorsInfo property value.
     */
    boolean hasMonitorsInfo();

    /**
     * Adds a monitorsInfo property value.<p>
     * 
     * @param newMonitorsInfo the monitorsInfo property value to be added
     */
    void addMonitorsInfo(Boolean newMonitorsInfo);

    /**
     * Removes a monitorsInfo property value.<p>
     * 
     * @param oldMonitorsInfo the monitorsInfo property value to be removed.
     */
    void removeMonitorsInfo(Boolean oldMonitorsInfo);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsWarning
     */
     
    /**
     * Gets all property values for the monitorsWarning property.<p>
     * 
     * @return a collection of values for the monitorsWarning property.
     */
    Collection<? extends Boolean> getMonitorsWarning();

    /**
     * Checks if the class has a monitorsWarning property value.<p>
     * 
     * @return true if there is a monitorsWarning property value.
     */
    boolean hasMonitorsWarning();

    /**
     * Adds a monitorsWarning property value.<p>
     * 
     * @param newMonitorsWarning the monitorsWarning property value to be added
     */
    void addMonitorsWarning(Boolean newMonitorsWarning);

    /**
     * Removes a monitorsWarning property value.<p>
     * 
     * @param oldMonitorsWarning the monitorsWarning property value to be removed.
     */
    void removeMonitorsWarning(Boolean oldMonitorsWarning);


    void delete();

}
