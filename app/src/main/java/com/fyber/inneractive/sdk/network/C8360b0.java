package com.fyber.inneractive.sdk.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Calendar;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.b0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8360b0 {

    /* JADX INFO: renamed from: a */
    public SharedPreferences f18624a = null;

    /* JADX INFO: renamed from: a */
    public static void m20734a(Context context, String str, String str2, AbstractC8236x abstractC8236x) {
        int i;
        if (context == null || str == null || abstractC8236x.f18374b == null) {
            IAlog.m21945a("Invalid report request parameters!", new Object[0]);
            return;
        }
        C8360b0 c8360b0 = AbstractC8357a0.f18621a;
        if (c8360b0.f18624a == null) {
            c8360b0.f18624a = context.getSharedPreferences("AutoWebActionPrefs", 0);
        }
        IAlog.m21949e("IAautoWebActionReporter: reporting action: %s", str);
        IAlog.m21949e("IAautoWebActionReporter: url: %s", str2);
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        if (!iAConfigManager.f17677i.f17791c) {
            IAlog.m21945a("IAautoWebActionReporter: Report of Non user web actions disabled!", new Object[0]);
            return;
        }
        EnumC8415t enumC8415t = EnumC8415t.MRAID_AUTO_ACTION_DETECTED;
        InneractiveAdRequest inneractiveAdRequest = abstractC8236x.f18373a;
        AbstractC9087e abstractC9087e = abstractC8236x.f18374b;
        JSONArray jSONArrayM20435b = abstractC8236x.f18375c.m20435b();
        C8428w c8428w = new C8428w(abstractC9087e);
        c8428w.f18754b = enumC8415t;
        c8428w.f18753a = inneractiveAdRequest;
        c8428w.f18756d = jSONArrayM20435b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("action", str);
        } catch (Exception unused) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "action", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject.put("url", str2);
            } catch (Exception unused2) {
                IAlog.m21950f("Got exception adding param to json object: %s, %s", "url", str2);
            }
        }
        long j = c8360b0.f18624a.getLong("lastReportTS", 0L);
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Calendar calendar = Calendar.getInstance(timeZone);
        Calendar calendar2 = Calendar.getInstance(timeZone);
        calendar2.setTimeInMillis(j);
        if (j <= 0 || calendar.get(6) != calendar2.get(6)) {
            i = 0;
        } else {
            IAlog.m21949e("IAautoWebActionReporter: encountered same date", new Object[0]);
            i = c8360b0.f18624a.getInt("numReportsToday", 0);
        }
        int i2 = iAConfigManager.f17677i.f17792d;
        int i3 = i + 1;
        IAlog.m21949e("IAautoWebActionReporter: day counter: %d max: %d", Integer.valueOf(i3), Integer.valueOf(i2));
        if (i < i2) {
            IAlog.m21949e("IAautoWebActionReporter: adding ad data", new Object[0]);
            c8428w.f18759g = true;
        } else {
            IAlog.m21949e("IAautoWebActionReporter: not adding ad data", new Object[0]);
        }
        Integer numValueOf = Integer.valueOf(i3);
        try {
            jSONObject.put("daily_count", numValueOf);
        } catch (Exception unused3) {
            IAlog.m21950f("Got exception adding param to json object: %s, %s", "daily_count", numValueOf);
        }
        c8428w.f18758f.put(jSONObject);
        c8428w.m20808a((String) null);
        SharedPreferences.Editor editorEdit = c8360b0.f18624a.edit();
        editorEdit.putLong("lastReportTS", calendar.getTimeInMillis());
        editorEdit.putInt("numReportsToday", i3);
        editorEdit.apply();
    }
}
