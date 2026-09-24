package com.bytedance.sdk.openadsdk.core.p190aw;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashSet;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.aw.qt */
/* JADX INFO: loaded from: classes3.dex */
public class C3103qt {

    /* JADX INFO: renamed from: ik */
    private final String f9851ik;

    /* JADX INFO: renamed from: ka */
    private final String f9852ka;

    /* JADX INFO: renamed from: lr */
    private final URL f9853lr;

    /* JADX INFO: renamed from: ri */
    private final String f9854ri;

    private C3103qt(String str, String str2, String str3, String str4) throws MalformedURLException {
        this.f9854ri = str2;
        this.f9853lr = new URL(str);
        this.f9851ik = str3;
        this.f9852ka = str4;
    }

    /* JADX INFO: renamed from: ri */
    public static C3103qt m12523ri(String str, String str2, String str3, String str4) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new C3103qt(str, str2, str3, str4);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static C3103qt m12524ri(JSONObject jSONObject) {
        try {
            String strOptString = jSONObject.optString("apiFramework");
            String strOptString2 = jSONObject.optString("javascriptResourceUrl");
            if (CampaignEx.KEY_OMID.equalsIgnoreCase(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                return new C3103qt(strOptString2, jSONObject.optString("vendorKey"), jSONObject.optString("verificationParameters"), jSONObject.optString("verificationNotExecuted"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static HashSet<C3103qt> m12525ri(JSONArray jSONArray) {
        HashSet<C3103qt> hashSet = new HashSet<>();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    hashSet.add(m12524ri(jSONArray.getJSONObject(i)));
                } catch (Throwable unused) {
                }
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: ri */
    private boolean m12526ri(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3103qt)) {
            return false;
        }
        C3103qt c3103qt = (C3103qt) obj;
        if (m12526ri(this.f9854ri, c3103qt.f9854ri) && m12526ri(this.f9853lr, c3103qt.f9853lr) && m12526ri(this.f9851ik, c3103qt.f9851ik)) {
            return m12526ri(this.f9852ka, c3103qt.f9852ka);
        }
        return false;
    }

    public int hashCode() {
        String str = this.f9854ri;
        int iHashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f9853lr.hashCode()) * 31;
        String str2 = this.f9851ik;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f9852ka;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    /* JADX INFO: renamed from: ik */
    public URL m12527ik() {
        return this.f9853lr;
    }

    /* JADX INFO: renamed from: lr */
    public String m12528lr() {
        return this.f9851ik;
    }

    /* JADX INFO: renamed from: ri */
    public String m12529ri() {
        return this.f9854ri;
    }
}
