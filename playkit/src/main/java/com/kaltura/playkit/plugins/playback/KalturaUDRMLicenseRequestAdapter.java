/*
 * ============================================================================
 * Copyright (C) 2018 Kaltura Inc.
 *
 * Licensed under the AGPLv3 license, unless a different license for a
 * particular library is specified in the applicable library path.
 *
 * You may obtain a copy of the License at
 * https://www.gnu.org/licenses/agpl-3.0.html
 * ============================================================================
 */

package com.kaltura.playkit.plugins.playback;

import androidx.annotation.NonNull;

import com.kaltura.playkit.PKRequestParams;
import com.kaltura.playkit.Player;

public class KalturaUDRMLicenseRequestAdapter implements PKRequestParams.Adapter {

    private final String applicationName;

    public static void install(Player player, String applicationName) {
        KalturaUDRMLicenseRequestAdapter decorator = new KalturaUDRMLicenseRequestAdapter(applicationName);
        player.getSettings().setLicenseRequestAdapter(decorator);
    }

    private KalturaUDRMLicenseRequestAdapter(String applicationName) {
        this.applicationName = applicationName;
    }

    @NonNull
    @Override
    public PKRequestParams adapt(PKRequestParams requestParams) {
        requestParams.headers.put("Referrer", applicationName);
        return requestParams;
    }

    @Override
    public void updateParams(Player player) {
    }

    @Override
    public String getApplicationName() {
        return applicationName;
    }
}
