package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.C13073g;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13020j;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.y */
/* JADX INFO: compiled from: DomainSameTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13234y extends C13195f {
    /* JADX INFO: renamed from: a */
    public static void m37954a(Context context, CampaignEx campaignEx) {
        if (context == null) {
            return;
        }
        C13020j c13020jM36706a = C13020j.m36706a(C13017g.m36693a(context));
        if (campaignEx == null || c13020jM36706a == null || c13020jM36706a.m36707a(campaignEx.getId())) {
            return;
        }
        C13073g c13073g = new C13073g();
        c13073g.m36859a(campaignEx.getId());
        c13073g.m36861b(campaignEx.getFca());
        c13073g.m36863c(campaignEx.getFcb());
        c13073g.m36857a(0);
        c13073g.m36865d(0);
        c13073g.m36858a(System.currentTimeMillis());
        c13020jM36706a.m36708b(c13073g);
    }

    /* JADX INFO: renamed from: a */
    public static void m37955a(List<CampaignEx> list) {
    }
}
