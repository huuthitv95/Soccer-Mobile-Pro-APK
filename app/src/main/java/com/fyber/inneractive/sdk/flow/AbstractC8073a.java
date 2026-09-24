package com.fyber.inneractive.sdk.flow;

import android.util.Log;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8073a {
    /* JADX INFO: renamed from: a */
    public static void m20470a(InneractiveAdRequest inneractiveAdRequest, InneractiveInfrastructureError inneractiveInfrastructureError, AbstractC8236x abstractC8236x, AbstractC9087e abstractC9087e, JSONArray jSONArray) {
        String string;
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() == EnumC8125i.ADM_FETCH_FAILED || inneractiveInfrastructureError.getErrorCode().getMetricable() != InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS) {
            return;
        }
        if (abstractC8236x == null || abstractC8236x.mo20599b() || abstractC8236x.isVideoAd()) {
            EnumC8415t enumC8415t = EnumC8415t.IA_AD_LOAD_FAILED;
            if (inneractiveInfrastructureError.isErrorAlreadyReported(enumC8415t)) {
                return;
            }
            IAlog.m21945a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
            if (inneractiveInfrastructureError.getCause() != null) {
                string = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
            } else {
                StringBuilder sb = new StringBuilder();
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                for (int i = 7; i >= 0 && i < 13 && i < stackTrace.length; i++) {
                    sb.append(stackTrace[i].toString());
                    sb.append(",");
                }
                Log.d("stack trace:", sb.toString());
                string = sb.toString();
            }
            C8428w c8428w = new C8428w(abstractC9087e);
            c8428w.f18754b = enumC8415t;
            c8428w.f18753a = inneractiveAdRequest;
            c8428w.f18756d = jSONArray;
            JSONObject jSONObject = new JSONObject();
            String string2 = inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason().toString();
            try {
                jSONObject.put("message", string2);
            } catch (Exception unused) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "message", string2);
            }
            try {
                jSONObject.put("description", string);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "description", string);
            }
            String strDescription = inneractiveInfrastructureError.description();
            try {
                jSONObject.put("extra_description", strDescription);
            } catch (Exception unused3) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "extra_description", strDescription);
            }
            c8428w.f18758f.put(jSONObject);
            c8428w.m20808a((String) null);
            inneractiveInfrastructureError.addReportedError(enumC8415t);
        }
    }
}
