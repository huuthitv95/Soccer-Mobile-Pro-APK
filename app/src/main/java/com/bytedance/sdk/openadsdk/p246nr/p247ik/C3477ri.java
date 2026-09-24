package com.bytedance.sdk.openadsdk.p246nr.p247ik;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.sdk.component.utils.ihz;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.ik.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3477ri {

    /* JADX INFO: renamed from: ri */
    private final SharedPreferences f12575ri;

    public C3477ri(Context context) {
        if (ihz.m10229ri(context)) {
            this.f12575ri = context.getSharedPreferences("pag_monitor_record", 0);
            return;
        }
        this.f12575ri = context.getSharedPreferences("pag_monitor_record_" + ihz.m10225ik(context), 0);
    }

    /* JADX INFO: renamed from: ri */
    public long m15765ri() {
        return this.f12575ri.getLong("last_upload_time", 0L);
    }

    /* JADX INFO: renamed from: ri */
    public void m15766ri(long j) {
        SharedPreferences.Editor editorEdit = this.f12575ri.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
