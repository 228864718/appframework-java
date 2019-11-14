/*
 * Copyright (c) 2019 Bytedance Inc.  All rights reserved.
 * Use of this source code is governed by a MIT style
 * license that can be found in the LICENSE file.
 */

package com.larksuite.appframework.sdk.core.auth;


/**
 * AppTicket should be persisted
 */
public interface AppTicketStorage {

    void updateAppTicket(String appShortName, String appId, String appTicket);

    String loadAppTicket(String appShortName, String appId);
}