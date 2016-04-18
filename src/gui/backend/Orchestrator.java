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

import gui.action.Action;

/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface Orchestrator {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#name
     */

    /**
     * Gets property value for the name property.<p>
     *
     * @return a value for the name property.
     */
    String getName();

    /**
     * Checks if the class has a name property value.<p>
     *
     * @return true if there is a name property value.
     */
    boolean hasName();

    /**
     * Adds a name property value.<p>
     *
     * @param newName the name property value to be added
     */
    void setName(String newName);

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#actsOnError
     */
     
    /**
     * Gets value for the actsOnError property.<p>
     * 
     * @return a values for the actsOnError property.
     */
    Action getActsOnError();

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
    void setActsOnError(Action newActsOnError);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#actsOnWarning
     */
     
    /**
     * Gets property value for the actsOnWarning property.<p>
     * 
     * @return a value for the actsOnWarning property.
     */
    Action getActsOnWarning();

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
    void setActsOnWarning(Action newActsOnWarning);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#processes
     */
     
    /**
     * Gets value for the processes property.<p>
     * 
     * @return a value for the processes property.
     */
    DataSet getProcessedDataSet();

    /**
     * Checks if the class has a processes property value.<p>
     * 
     * @return true if there is a processes property value.
     */
    boolean doesProcessDataSet();

    /**
     * Adds a processes property value.<p>
     * 
     * @param newProcesses the processes property value to be added
     */
    void setDataSetToProcess(DataSet newProcesses);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#runs
     */
     
    /**
     * Gets value for the runs property.<p>
     * 
     * @return a value for the runs property.
     */
    Application getRunApplication();

    /**
     * Checks if the class has a runs property value.<p>
     * 
     * @return true if there is a runs property value.
     */
    boolean runsApplication();

    /**
     * Adds a runs property value.<p>
     * 
     * @param newRuns the runs property value to be added
     */
    void setApplicationToRun(Application newRuns);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsError
     */
     
    /**
     * Gets property value for the monitorsError property.<p>
     * 
     * @return a value for the monitorsError property.
     */
    boolean monitorsError();


    /**
     * Adds a monitorsError property value.<p>
     * 
     * @param newMonitorsError the monitorsError property value to be added
     */
    void setMonitorsError(Boolean newMonitorsError);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsInfo
     */
     
    /**
     * Gets value for the monitorsInfo property.<p>
     * 
     * @return a value for the monitorsInfo property.
     */
    boolean monitorsInfo();

    /**
     * Adds a monitorsInfo property value.<p>
     * 
     * @param newMonitorsInfo the monitorsInfo property value to be added
     */
    void setMonitorsInfo(Boolean newMonitorsInfo);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#monitorsWarning
     */
     
    /**
     * Gets property value for the monitorsWarning property.<p>
     * 
     * @return a value for the monitorsWarning property.
     */
    boolean monitorsWarning();


    /**
     * Adds a monitorsWarning property value.<p>
     * 
     * @param newMonitorsWarning the monitorsWarning property value to be added
     */
    void setMonitorsWarning(Boolean newMonitorsWarning);


    void delete();

}
