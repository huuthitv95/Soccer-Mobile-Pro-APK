package com.mbridge.msdk.videocommon.entity;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.videocommon.entity.a */
/* JADX INFO: compiled from: AdParams.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14214a {

    /* JADX INFO: renamed from: a */
    private String f41073a;

    /* JADX INFO: renamed from: b */
    private String f41074b;

    public C14214a(String str, String str2) {
        this.f41073a = str;
        this.f41074b = str2;
    }

    /* JADX INFO: renamed from: a */
    public static C14214a m42615a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new C14214a(jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID), jSONObject.optString("placementId"));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
