package com.mbridge.msdk.foundation.same.net.wrapper;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.wrapper.h */
/* JADX INFO: compiled from: HeaderBiddingRequest.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13129h extends C13124c {
    public C13129h(Context context) {
        super(context);
    }

    @Override // com.mbridge.msdk.foundation.same.net.wrapper.C13124c
    public void addExtraParams(String str, C13126e c13126e) {
        try {
            int iM37874a = C13229v0.m37874a();
            String strM37913c = C13229v0.m37913c();
            if (c13126e != null) {
                c13126e.m37245a("misk_spt", String.valueOf(iM37874a));
                if (!TextUtils.isEmpty(strM37913c)) {
                    c13126e.m37245a("misk_spt_det", strM37913c);
                }
            }
        } catch (Exception e) {
            C13219q0.m37813a("CampaignRequest", e.getMessage());
        } finally {
            super.addExtraParams(str, c13126e);
        }
    }
}
