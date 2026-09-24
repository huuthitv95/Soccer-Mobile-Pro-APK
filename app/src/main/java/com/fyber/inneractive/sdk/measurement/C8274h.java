package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.response.InterfaceC9091i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.measurement.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8274h implements InterfaceC9091i {

    /* JADX INFO: renamed from: a */
    public URL f18450a;

    /* JADX INFO: renamed from: b */
    public String f18451b;

    /* JADX INFO: renamed from: d */
    public String f18453d;

    /* JADX INFO: renamed from: e */
    public String f18454e;

    /* JADX INFO: renamed from: f */
    public String f18455f;

    /* JADX INFO: renamed from: c */
    public final HashMap f18452c = new HashMap();

    /* JADX INFO: renamed from: g */
    public boolean f18456g = false;

    /* JADX INFO: renamed from: a */
    public final String m20676a() {
        if (!this.f18456g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.f18451b)) {
            return "apiFramework = ";
        }
        if (this.f18451b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return "JavaScriptResource_url = " + (TextUtils.isEmpty(this.f18455f) ? "" : this.f18455f);
        }
        return "apiFramework = " + this.f18451b;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9091i
    /* JADX INFO: renamed from: a */
    public final List mo20518a(EnumC8315x enumC8315x) {
        HashMap map;
        if (enumC8315x == null || (map = this.f18452c) == null) {
            return null;
        }
        return (List) map.get(enumC8315x);
    }

    /* JADX INFO: renamed from: a */
    public final void m20677a(EnumC8315x enumC8315x, String str) {
        List arrayList = (List) this.f18452c.get(enumC8315x);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f18452c.put(enumC8315x, arrayList);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        arrayList.add(str);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m20678b() {
        if (!this.f18456g || this.f18450a == null) {
            return false;
        }
        String str = this.f18451b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.f18451b.equalsIgnoreCase(CampaignEx.KEY_OMID);
        }
        return true;
    }

    public final String toString() {
        return "Verification{mJavaScriptResource=" + this.f18450a + ", mTrackingEvents=" + this.f18452c + ", mVerificationParameters='" + this.f18453d + "', mVendor='" + this.f18454e + "'}";
    }
}
