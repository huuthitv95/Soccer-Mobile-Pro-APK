package com.mbridge.msdk.foundation.same.report;

import com.mbridge.msdk.tracker.AbstractC13880w;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.C13867v;
import com.mbridge.msdk.tracker.network.toolbox.C13856f;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.n */
/* JADX INFO: compiled from: StringReportResponseHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13159n extends AbstractC13880w {
    @Override // com.mbridge.msdk.tracker.AbstractC13880w
    /* JADX INFO: renamed from: a */
    protected C13867v<String> mo37516a(C13847q c13847q) {
        String str;
        try {
            str = new String(c13847q.f39515b, C13856f.m41266a(c13847q.f39516c));
        } catch (UnsupportedEncodingException unused) {
            str = new String(c13847q.f39515b);
        }
        return C13867v.m41335a(str, C13856f.m41264a(c13847q));
    }
}
