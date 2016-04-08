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


/**
 * 
 * <p>
 * @version created on Sat Jan 30 17:43:59 EST 2016 by gurjyan
 */

public interface DataSet {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasInputSource
     */
     
    /**
     * Gets property value for the hasInputSource property.<p>
     * 
     * @return a value for the hasInputSource property.
     */
    DataSource getInputSource();

    /**
     * Checks if the class has a hasInputSource property value.<p>
     * 
     * @return true if there is a hasInputSource property value.
     */
    boolean hasInputSource();

    /**
     * Adds a hasInputSource property value.<p>
     * 
     * @param newHasInputSource the hasInputSource property value to be added
     */
    void setInputSource(DataSource newHasInputSource);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasOutputSource
     */
     
    /**
     * Gets all property values for the hasOutputSource property.<p>
     * 
     * @return a value for the hasOutputSource property.
     */
    DataSource getOutputSource();

    /**
     * Checks if the class has a hasOutputSource property value.<p>
     * 
     * @return true if there is a hasOutputSource property value.
     */
    boolean hasOutputSource();

    /**
     * Adds a hasOutputSource property value.<p>
     * 
     * @param newHasOutputSource the hasOutputSource property value to be added
     */
    void setOutputSource(DataSource newHasOutputSource);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#outputFilePrefix
     */
     
    /**
     * Gets all property values for the outputFilePrefix property.<p>
     * 
     * @return a value for the outputFilePrefix property.
     */
    String getOutputFilePrefix();

    /**
     * Checks if the class has a outputFilePrefix property value.<p>
     * 
     * @return true if there is a outputFilePrefix property value.
     */
    boolean hasOutputFilePrefix();

    /**
     * Adds a outputFilePrefix property value.<p>
     * 
     * @param newOutputFilePrefix the outputFilePrefix property value to be added
     */
    void setOutputFilePrefix(String newOutputFilePrefix);



    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#outputFileSuffix
     */
     
    /**
     * Gets all property values for the outputFileSuffix property.<p>
     * 
     * @return a value for the outputFileSuffix property.
     */
    String getOutputFileSuffix();

    /**
     * Checks if the class has a outputFileSuffix property value.<p>
     * 
     * @return true if there is a outputFileSuffix property value.
     */
    boolean hasOutputFileSuffix();

    /**
     * Adds a outputFileSuffix property value.<p>
     * 
     * @param newOutputFileSuffix the outputFileSuffix property value to be added
     */
    void setOutputFileSuffix(String newOutputFileSuffix);

    void delete();

}
