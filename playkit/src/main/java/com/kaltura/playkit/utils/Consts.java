/*
 * ============================================================================
 * Copyright (C) 2017 Kaltura Inc.
 *
 * Licensed under the AGPLv3 license, unless a different license for a
 * particular library is specified in the applicable library path.
 *
 * You may obtain a copy of the License at
 * https://www.gnu.org/licenses/agpl-3.0.html
 * ============================================================================
 */

package com.kaltura.playkit.utils;

/**
 * Created by anton.afanasiev on 04/12/2016.
 */

public class Consts {

    public static final String KALTURA = "Kaltura";

    /**
     * Special constant representing an unset or unknown time or duration. Suitable for use in any
     * time base.
     */
    public static final long TIME_UNSET = Long.MIN_VALUE + 1;

    /**
     * Represents an unset or unknown position.
     */
    public static final int POSITION_UNSET = -1;

    /**
     * Represents an unset or unknown volume.
     */
    public static final float VOLUME_UNKNOWN = -1;

    /**
     * Identifier of the Video track type.
     */
    public static final int TRACK_TYPE_VIDEO = 0;
    /**
     * Identifier of the Audio track type.
     */
    public static final int TRACK_TYPE_AUDIO = 1;
    /**
     * Identifier for the Text track type.
     */
    public static final int TRACK_TYPE_TEXT = 2;
    /**
     * Identifier for the unknown track type.
     */
    public static final int TRACK_TYPE_UNKNOWN = -1;
    /**
     * Identifier for the no value.
     */
    public static final long NO_VALUE = -1;

    public static final int DEFAULT_PLAYHEAD_UPDATE_MILI = 100;

    /**
     * Flag that indicates, that this specified track will be
     * selected by the player as default track.
     */
    public static final int DEFAULT_TRACK_SELECTION_FLAG_HLS = 5;
    public static final int DEFAULT_TRACK_SELECTION_FLAG_DASH = 1;

    /**
     * Flag that indicates, that this specified track will not
     * be selected by the player as default track.
     */
    public static final int TRACK_UNSELECTED_FLAG = 0;

    public static final double PERCENT_FACTOR = 100.0;

    public static final long MILLISECONDS_MULTIPLIER = 1000L;

    public static final float MILLISECONDS_MULTIPLIER_FLOAT = 1000F;

    public static final int DEFAULT_ANALYTICS_TIMER_INTERVAL_LOW = 10000;

    public static final int DEFAULT_ANALYTICS_TIMER_INTERVAL_LOW_SEC = 10;

    public static final int DEFAULT_ANALYTICS_TIMER_INTERVAL_HIGH = 30000;

    public static final int DEFAULT_ANALYTICS_TIMER_INTERVAL_HIGH_SEC = 30;

    public static final long DISTANCE_FROM_LIVE_THRESHOLD = 120000; //2 Min;

    public static final float DEFAULT_PLAYBACK_RATE_SPEED = 1.0f;

    public static final float PLAYBACK_SPEED_RATE_UNKNOWN = -1.0f;

    public static final float DEFAULT_VOLUME = 1.0f;

    public static final float DEFAULT_PITCH_RATE = 1.0f;

    // Can't start playing offline if only this number of seconds is remaining in license duration.
    // NOTE this value is private as ExoPlayer DefaultDrmSession.MAX_LICENSE_DURATION_TO_RENEW, changing it here
    // won't change the actual behavior in ExoPlayer. It's only provided as reference.
    // 60 is the number of seconds set in ExoPlayer 2.10.3.
    public static final int MIN_OFFLINE_LICENSE_DURATION_TO_PLAY = 60;
}
