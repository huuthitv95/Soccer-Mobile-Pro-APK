package com.fyber.inneractive.sdk.flow.storepromo.model;

import com.fyber.inneractive.sdk.util.C9153h;
import java.text.DecimalFormat;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.storepromo.model.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8211d {

    /* JADX INFO: renamed from: a */
    public final String f18304a;

    /* JADX INFO: renamed from: b */
    public final String f18305b;

    /* JADX INFO: renamed from: c */
    public final String f18306c;

    public C8211d(String str, String str2, String str3) {
        String str4;
        this.f18306c = "";
        this.f18304a = str;
        this.f18305b = str2;
        C9153h c9153h = new C9153h(str3);
        Long l = c9153h.f21453a;
        if (l == null) {
            str4 = "N/A";
        } else {
            double dLongValue = l.longValue() / 1024.0d;
            double d = dLongValue / 1024.0d;
            double d2 = d / 1024.0d;
            DecimalFormat decimalFormat = new DecimalFormat("#.##");
            String str5 = decimalFormat.format(c9153h.f21453a) + " bytes";
            if (d > 850.0d) {
                str4 = decimalFormat.format(d2) + " GB";
            } else if (dLongValue > 850.0d) {
                str4 = decimalFormat.format(d) + " MB";
            } else if (c9153h.f21453a.longValue() > 850) {
                str4 = decimalFormat.format(dLongValue) + " kB";
            } else {
                str4 = str5;
            }
        }
        this.f18306c = str4;
    }
}
