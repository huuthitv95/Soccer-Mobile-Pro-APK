package com.mbridge.msdk.video.signal.impl;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.tools.C13224t;
import com.mbridge.msdk.video.module.report.C14075b;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.l */
/* JADX INFO: compiled from: JSCommonDiff.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14192l extends C14184d {

    /* JADX INFO: renamed from: s */
    public boolean f40949s = true;

    /* JADX INFO: renamed from: q */
    private C12682a m42385q() {
        if (this.f40918l == null) {
            this.f40918l = new C12682a(C13008c.m36588n().m36542d(), this.f40916j);
        }
        return this.f40918l;
    }

    /* JADX INFO: renamed from: a */
    public void m42386a(CampaignEx campaignEx, Context context) {
        String queryParameter;
        try {
            queryParameter = Uri.parse(campaignEx.getNoticeUrl()).getQueryParameter(C13088a.f35871m);
        } catch (Throwable unused) {
        }
        this.f40919m.mo41603a((!TextUtils.isEmpty(queryParameter) ? Integer.parseInt(queryParameter) : 0) == 2);
        m42385q().m34636a(this.f40919m);
        m42385q().m34633a(campaignEx);
        C14075b.m42195a(C13008c.m36588n().m36542d(), campaignEx);
    }

    /* JADX INFO: renamed from: a */
    public void m42387a(JSONObject jSONObject) {
        try {
            jSONObject.put(C11744X3.i.f26328G, new C13224t(C13008c.m36588n().m36542d()).mo37664a());
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m42388b(JSONObject jSONObject) {
    }
}
