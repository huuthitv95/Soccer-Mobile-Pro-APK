package com.mbridge.msdk.foundation.same.report.net;

import android.content.Context;
import com.mbridge.msdk.foundation.same.net.wrapper.C13124c;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.report.net.a */
/* JADX INFO: compiled from: ReportRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13160a extends C13124c {
    public C13160a(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.C13124c
    public void addExtraParams(String str, C13126e c13126e) {
        super.addExtraParams(str, c13126e);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.C13124c
    protected boolean canTrack() {
        return false;
    }
}
