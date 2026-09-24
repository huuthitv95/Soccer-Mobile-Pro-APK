package com.fyber.inneractive.sdk.config;

import androidx.exifinterface.media.ExifInterface;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.w0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC8049w0 {
    NO_CLICK("0"),
    CTA_BUTTON("1"),
    COMPANION("2"),
    VIDEO(ExifInterface.GPS_MEASUREMENT_3D),
    APP_INFO("4"),
    STORE_PROMO(CampaignEx.CLICKMODE_ON);

    String value;

    EnumC8049w0(String str) {
        this.value = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m20455a() {
        return this.value;
    }
}
