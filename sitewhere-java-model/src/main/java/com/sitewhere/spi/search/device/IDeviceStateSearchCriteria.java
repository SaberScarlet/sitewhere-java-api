/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.search.device;

import java.util.Date;
import java.util.List;

import com.sitewhere.spi.search.ISearchCriteria;

/**
 * Provides filter criteria for device state searches.
 */
public interface IDeviceStateSearchCriteria extends ISearchCriteria {

    /**
     * If set, will limit results to those with a last interaction date before this
     * value.
     * 
     * @return
     */
    public Date getLastInteractionDateBefore();

    /**
     * List of device types to be included in results.
     * 
     * @return
     */
    public List<String> getDeviceTypeTokens();

    /**
     * List of customers to be included in results.
     * 
     * @return
     */
    public List<String> getCustomerTokens();

    /**
     * List of areas to be included in results.
     * 
     * @return
     */
    public List<String> getAreaTokens();

    /**
     * List of assets to be included in results.
     * 
     * @return
     */
    public List<String> getAssetTokens();
}