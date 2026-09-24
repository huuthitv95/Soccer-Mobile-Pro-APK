package com.mbridge.msdk.mbnative.controller;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.C13080n;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13026n;
import com.mbridge.msdk.foundation.same.report.C13162o;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.mbnative.controller.e */
/* JADX INFO: compiled from: NativeVideoTrackingReport.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13335e {

    /* JADX INFO: renamed from: a */
    private static final String f37013a = "com.mbridge.msdk.mbnative.controller.e";

    /* JADX INFO: renamed from: a */
    public static void m38551a(Context context, String str) {
        if (context != null) {
            try {
                C13026n c13026nM36744a = C13026n.m36744a(C13017g.m36693a(context));
                if (TextUtils.isEmpty(str) || c13026nM36744a == null || c13026nM36744a.m36747d() <= 0) {
                    return;
                }
                List<C13080n> listM36746a = c13026nM36744a.m36746a("m_download_end");
                List<C13080n> listM36746a2 = c13026nM36744a.m36746a("2000021");
                List<C13080n> listM36746a3 = c13026nM36744a.m36746a("m_download_end");
                C13162o.m37526e(listM36746a2);
                C13162o.m37518a(listM36746a);
                C13162o.m37520b(listM36746a3);
            } catch (Exception e) {
                C13219q0.m37816b(f37013a, e.getMessage());
            }
        }
    }
}
