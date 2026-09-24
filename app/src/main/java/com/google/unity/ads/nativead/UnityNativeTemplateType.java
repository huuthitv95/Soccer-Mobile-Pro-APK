package com.google.unity.ads.nativead;

import android.util.Log;
import com.google.unity.ads.C10825R;
import com.google.unity.ads.PluginUtils;

/* JADX INFO: loaded from: classes6.dex */
public enum UnityNativeTemplateType {
    SMALL(C10825R.layout.small_template_view_layout),
    MEDIUM(C10825R.layout.medium_template_view_layout);

    private final int resourceId;

    UnityNativeTemplateType(int resourceId) {
        this.resourceId = resourceId;
    }

    public int resourceId() {
        return this.resourceId;
    }

    public static UnityNativeTemplateType fromIntValue(int value) {
        if (value >= 0 && value < values().length) {
            return values()[value];
        }
        Log.w(PluginUtils.LOGTAG, "Invalid template type index: " + value);
        return MEDIUM;
    }
}
