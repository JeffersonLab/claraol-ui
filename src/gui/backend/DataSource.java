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

public interface DataSource  {

    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasIdentity
     */
     
    /**
     * Gets value for the hasIdentity property.<p>
     * 
     * @return a value for the hasIdentity property.
     */
    Identity getIdentity();

    /**
     * Checks if the class has a hasIdentity property value.<p>
     * 
     * @return true if there is a hasIdentity property value.
     */
    boolean hasHasIdentity();

    /**
     * Adds a hasIdentity property value.<p>
     * 
     * @param newHasIdentity the hasIdentity property value to be added
     */
    void setHasIdentity(Identity newHasIdentity);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasType
     */
     
    /**
     * Gets value for the hasType property.<p>
     * 
     * @return a value for the hasType property.
     */
    String getType();

    /**
     * Checks if the class has a hasType property value.<p>
     * 
     * @return true if there is a hasType property value.
     */
    boolean hasType();

    /**
     * Adds a hasType property value.<p>
     * 
     * @param newHasType the hasType property value to be added
     */
    void setType(String newHasType);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#hasValue
     */
     
    /**
     * Gets property value for the hasValue property.<p>
     * 
     * @return a value for the hasValue property.
     */
    String getValue();

    /**
     * Checks if the class has a hasValue property value.<p>
     * 
     * @return true if there is a hasValue property value.
     */
    boolean hasValue();

    /**
     * Adds a hasValue property value.<p>
     * 
     * @param newHasValue the hasValue property value to be added
     */
    void setValue(String newHasValue);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#isDirectory
     */
     
    /**
     * Gets property value for the isDirectory property.<p>
     * 
     * @return a of value for the isDirectory property.
     */
    boolean isDirectory();


    /**
     * Adds a isDirectory property value.<p>
     * 
     * @param newIsDirectory the isDirectory property value to be added
     */
    void setIsDirectory(Boolean newIsDirectory);


    /* ***************************************************
     * Property http://claraweb.jlab.org/ontology/2015/11/ClaraOL#isFile
     */
     
    /**
     * Gets property value for the isFile property.<p>
     * 
     * @return a value for the isFile property.
     */
    boolean  isFile();

    /**
     * Adds a isFile property value.<p>
     * 
     * @param newIsFile the isFile property value to be added
     */
    void setIsFile(Boolean newIsFile);

    void delete();

}
