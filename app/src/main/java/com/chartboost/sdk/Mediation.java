package com.chartboost.sdk;

import com.chartboost.sdk.impl.C3755fc;

/* JADX INFO: loaded from: classes3.dex */
public class Mediation {
    public final String adapterVersion;
    public final String libraryVersion;
    public final String mediationType;

    public Mediation(String str, String str2, String str3) {
        this.mediationType = m16756a(str);
        this.libraryVersion = str2;
        this.adapterVersion = str3;
    }

    /* JADX INFO: renamed from: a */
    public final String m16755a() {
        String str = this.libraryVersion;
        if (str == null || str.isEmpty()) {
            return this.mediationType;
        }
        return this.mediationType + " " + this.libraryVersion;
    }

    /* JADX INFO: renamed from: a */
    public final String m16756a(String str) {
        if (str == null) {
            return null;
        }
        String strReplace = str.replace(" ", "_");
        return strReplace.length() > 50 ? strReplace.substring(0, 50) : strReplace;
    }

    public C3755fc toMediationBodyFields() {
        if (this.mediationType == null) {
            return null;
        }
        String str = this.libraryVersion;
        if (str == null) {
            str = "";
        }
        String str2 = this.adapterVersion;
        return new C3755fc(m16755a(), str, str2 != null ? str2 : "", this.mediationType);
    }
}
