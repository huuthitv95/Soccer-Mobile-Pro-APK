package com.fyber.inneractive.sdk.network;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.ignite.C8252l;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.EnumC9134a1;
import com.fyber.inneractive.sdk.util.HandlerC9143d1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C11341A5;
import com.ironsource.C12288ke;
import java.util.Calendar;
import java.util.HashMap;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.v */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8426v implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8432y f18741a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f18742b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f18743c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ String f18744d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f18745e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f18746f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f18747g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C8428w f18748h;

    public RunnableC8426v(C8428w c8428w, C8432y c8432y, String str, String str2, String str3, String str4, Integer num, String str5) {
        this.f18748h = c8428w;
        this.f18741a = c8432y;
        this.f18742b = str;
        this.f18743c = str2;
        this.f18744d = str3;
        this.f18745e = str4;
        this.f18746f = num;
        this.f18747g = str5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String strM20784a;
        HashMap map;
        AbstractC9087e abstractC9087e;
        C8428w c8428w = this.f18748h;
        EnumC8415t enumC8415t = c8428w.f18754b;
        if (enumC8415t != null) {
            this.f18741a.m20810a(Integer.valueOf(enumC8415t.val), NotificationCompat.CATEGORY_ERROR);
            this.f18748h.f18754b.getClass();
            strM20784a = EnumC8411r1.ERROR_TABLE.m20784a();
            IAlog.m21945a("Event dispatcher - dispatching error: %s", this.f18748h.f18754b);
            IAlog.m21948d("%s %s", "DISPATCHED_SDK_ERROR", Integer.valueOf(this.f18748h.f18754b.val));
        } else {
            EnumC8424u enumC8424u = c8428w.f18755c;
            if (enumC8424u != null) {
                this.f18741a.m20810a(Integer.valueOf(enumC8424u.val), NotificationCompat.CATEGORY_EVENT);
                this.f18748h.f18755c.getClass();
                strM20784a = EnumC8411r1.EVENT_TABLE.m20784a();
                IAlog.m21945a("Event dispatcher - dispatching event: %s", this.f18748h.f18755c);
                IAlog.m21948d("%s %s", "DISPATCHED_SDK_EVENT", Integer.valueOf(this.f18748h.f18755c.val));
            } else {
                strM20784a = null;
            }
        }
        C8432y c8432y = this.f18741a;
        StringBuilder sb = new StringBuilder();
        sb.append(strM20784a);
        C8428w c8428w2 = this.f18748h;
        EnumC8415t enumC8415t2 = c8428w2.f18754b;
        sb.append(enumC8415t2 != null ? String.valueOf(enumC8415t2.val) : String.valueOf(c8428w2.f18755c.val));
        c8432y.m20810a(sb.toString(), C11341A5.f23805R);
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        this.f18741a.m20810a(Long.valueOf(calendar.getTimeInMillis()), "date_created");
        if (!IAConfigManager.m20377c()) {
            this.f18741a.m20810a(this.f18742b, "contentid");
            this.f18741a.m20810a(this.f18743c, "fairbidv");
            if (!TextUtils.isEmpty(this.f18744d)) {
                this.f18741a.m20810a(this.f18744d, "placement_type");
            }
            if (!TextUtils.isEmpty(this.f18745e)) {
                this.f18741a.m20810a(this.f18745e, "spot_id");
            }
            if (!InneractiveAdManager.isCurrentUserAChild()) {
                String strM21973i = AbstractC9162k.m21973i();
                if (!TextUtils.isEmpty(strM21973i)) {
                    this.f18741a.m20810a(strM21973i, "ciso");
                }
            }
            this.f18741a.m20810a(this.f18746f, "ad_type");
            if (this.f18748h.f18759g && !TextUtils.isEmpty(this.f18747g)) {
                this.f18741a.f18766c = this.f18747g;
            }
            this.f18741a.m20810a(EnumC9134a1.m21954a().m21955b(), C11341A5.f23826q);
            try {
                this.f18741a.m20810a(C8428w.f18752h.format(calendar.getTime()), "day");
            } catch (Throwable unused) {
            }
            this.f18741a.m20810a(Integer.valueOf(calendar.get(11)), "hour");
            JSONArray jSONArray = this.f18748h.f18756d;
            if (jSONArray != null && jSONArray.length() > 0) {
                this.f18741a.m20810a(this.f18748h.f18756d, C12288ke.f30747d);
            }
            AbstractC9087e abstractC9087e2 = this.f18748h.f18757e;
            if (abstractC9087e2 != null && abstractC9087e2.f21291A) {
                this.f18741a.m20810a("1", "sdk_bidding");
            }
            if (InneractiveAdManager.isCurrentUserAChild()) {
                this.f18741a.m20810a("1", "child_mode");
            }
            IAConfigManager iAConfigManager = IAConfigManager.f17654M;
            this.f18741a.m20810a(iAConfigManager.f17660D.m20650n() && (abstractC9087e = this.f18748h.f18757e) != null && abstractC9087e.f21295E != EnumC8253m.NONE ? "1" : "0", "ignite");
            C8432y c8432y2 = this.f18741a;
            C8252l c8252l = iAConfigManager.f17660D.f18422p;
            c8432y2.m20810a(c8252l != null ? c8252l.f17294a.mo20286d() : null, "ignitep");
            C8432y c8432y3 = this.f18741a;
            C8252l c8252l2 = iAConfigManager.f17660D.f18422p;
            c8432y3.m20810a(c8252l2 != null ? c8252l2.f17294a.mo20291i() : null, "ignitev");
            JSONArray jSONArrayM20435b = iAConfigManager.f17667K.m20435b();
            if (jSONArrayM20435b != null && jSONArrayM20435b.length() > 0) {
                this.f18741a.m20810a(jSONArrayM20435b, "s_experiments");
            }
            JSONArray jSONArray2 = this.f18748h.f18758f;
            if (jSONArray2 != null && jSONArray2.length() > 0) {
                for (int i = 0; i < jSONArray2.length(); i++) {
                    if (jSONArray2.optJSONObject(i).length() >= 1) {
                        this.f18741a.m20810a(this.f18748h.f18758f, "extra");
                        break;
                    }
                }
            }
            AbstractC9087e abstractC9087e3 = this.f18748h.f18757e;
            if (abstractC9087e3 != null && abstractC9087e3.f21299I) {
                this.f18741a.m20810a("1", "dynamic_controls");
            }
        }
        C8432y c8432y4 = this.f18741a;
        c8432y4.getClass();
        if (TextUtils.isEmpty(c8432y4.f18764a) || (map = c8432y4.f18765b) == null || map.size() == 0) {
            return;
        }
        C8373f c8373f = IAConfigManager.f17654M.f17662F;
        c8373f.getClass();
        JSONObject jSONObject = new JSONObject();
        HashMap map2 = c8432y4.f18765b;
        for (String str : map2.keySet()) {
            Object obj = map2.get(str);
            if (obj != null) {
                try {
                    jSONObject.put(str, obj);
                } catch (JSONException unused2) {
                }
            }
        }
        String strSubstring = c8432y4.f18766c;
        if (strSubstring != null) {
            int length = strSubstring.length();
            if (length > 51200) {
                int iIndexOf = strSubstring.indexOf("iawrapper");
                if (iIndexOf == -1) {
                    iIndexOf = 0;
                }
                strSubstring = strSubstring.substring(iIndexOf, 51199);
                IAlog.m21945a("Sdk event dispatcher: message size %d is too long! trimming message to %d Characters", Integer.valueOf(length), 51200);
            }
            try {
                jSONObject.put("ad", strSubstring);
            } catch (JSONException e) {
                IAlog.m21944a("Failed inserting ad body to json", e, new Object[0]);
            }
        }
        if (IAlog.f21426a == 1) {
            try {
                IAlog.m21948d("%s, Event: %s", "SDK_EVENT", jSONObject.toString());
            } catch (Throwable unused3) {
            }
        }
        c8373f.f18642a.offer(jSONObject);
        if (c8373f.f18642a.size() > 30) {
            HandlerC9143d1 handlerC9143d1 = c8373f.f18645d;
            if (handlerC9143d1 != null && handlerC9143d1.hasMessages(12312329)) {
                c8373f.f18645d.removeMessages(12312329);
            }
            HandlerC9143d1 handlerC9143d2 = c8373f.f18645d;
            if (handlerC9143d2 != null) {
                handlerC9143d2.post(new RunnableC8362c(c8373f, 12312329, 0L));
            }
        }
    }
}
