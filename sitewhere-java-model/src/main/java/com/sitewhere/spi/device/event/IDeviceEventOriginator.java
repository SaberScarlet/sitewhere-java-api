/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.device.event;

import java.io.Serializable;
import java.util.UUID;

/**
 * Wrapper for device event originator information.
 */
public interface IDeviceEventOriginator extends Serializable {

    /**
     * Gets event id of originator.
     * 
     * @return
     */
    public UUID getEventId();
}