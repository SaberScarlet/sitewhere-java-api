/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.spi.search.device;

import com.sitewhere.spi.search.ISearchCriteria;

/**
 * Criteria available for filtering device group search results.
 */
public interface IDeviceGroupSearchCriteria extends ISearchCriteria {

    /**
     * Limits search by a given role.
     * 
     * @return
     */
    public String getRole();
}
