package com.ironsource.mediationsdk.adunit.adapter.utility;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11698U8;
import com.ironsource.C12317m4;
import com.ironsource.C12586wb;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AdInfo {
    private final C11698U8 impressionData;
    private final C12586wb loadArmData;

    public AdInfo(C11698U8 c11698u8, C12586wb c12586wb) {
        this.impressionData = c11698u8;
        this.loadArmData = c12586wb;
    }

    public final String getAb() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27597a() == null) ? "" : this.impressionData.m27597a();
    }

    public final String getAdNetwork() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27599c() == null) ? "" : this.impressionData.m27599c();
    }

    public final String getAuctionId() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27601e() == null) ? "" : this.impressionData.m27601e();
    }

    public final String getCountry() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27602f() == null) ? "" : this.impressionData.m27602f();
    }

    public final String getEncryptedCPM() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27604h() == null) ? "" : this.impressionData.m27604h();
    }

    public final String getInstanceId() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27605i() == null) ? "" : this.impressionData.m27605i();
    }

    public final String getInstanceName() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27606j() == null) ? "" : this.impressionData.m27606j();
    }

    public final String getPrecision() {
        C12586wb c12586wb = this.loadArmData;
        if (c12586wb != null) {
            return c12586wb.m34056c();
        }
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27610n() == null) ? "" : this.impressionData.m27610n();
    }

    public final double getRevenue() {
        C12586wb c12586wb = this.loadArmData;
        if (c12586wb != null) {
            return c12586wb.m34057d();
        }
        C11698U8 c11698u8 = this.impressionData;
        if (c11698u8 == null) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        c11698u8.m27611o();
        return this.impressionData.m27611o();
    }

    public final String getSegmentName() {
        C11698U8 c11698u8 = this.impressionData;
        return (c11698u8 == null || c11698u8.m27612p() == null) ? "" : this.impressionData.m27612p();
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("auctionId", getAuctionId());
            jSONObject.put("country", getCountry());
            jSONObject.put("ab", getAb());
            jSONObject.put("segmentName", getSegmentName());
            jSONObject.put("adNetwork", getAdNetwork());
            jSONObject.put("instanceName", getInstanceName());
            jSONObject.put("instanceId", getInstanceId());
            jSONObject.put("revenue", getRevenue());
            jSONObject.put("precision", getPrecision());
            jSONObject.put("encryptedCPM", getEncryptedCPM());
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error("error while parsing ad info " + e.getMessage());
        }
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "adInfoData.toString()");
        return string;
    }
}
