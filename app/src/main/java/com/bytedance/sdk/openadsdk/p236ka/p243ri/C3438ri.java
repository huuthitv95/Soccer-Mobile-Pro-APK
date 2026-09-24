package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.C2729uq;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.ihz.p232ri.p233lr.C3369ri;
import com.bytedance.sdk.openadsdk.p236ka.C3399di;
import com.bytedance.sdk.openadsdk.p236ka.C3430ri;
import com.bytedance.sdk.openadsdk.utils.C3566dw;
import com.bytedance.sdk.openadsdk.utils.C3570fr;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.igq;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3438ri {

    /* JADX INFO: renamed from: di */
    private static volatile C3438ri f12466di;

    /* JADX INFO: renamed from: fi */
    private final String f12467fi;

    /* JADX INFO: renamed from: ik */
    private Context f12468ik;

    /* JADX INFO: renamed from: ka */
    private final boolean f12469ka = m15687ik();

    /* JADX INFO: renamed from: lr */
    private int f12470lr;

    /* JADX INFO: renamed from: ri */
    private long f12471ri;

    private C3438ri() {
        Context contextM14642ri = C3299nr.m14642ri();
        if (contextM14642ri != null) {
            this.f12468ik = contextM14642ri.getApplicationContext();
        }
        this.f12467fi = m15686fi();
    }

    /* JADX INFO: renamed from: di */
    private String m15685di() {
        StringBuilder sb = new StringBuilder();
        try {
            if (igq.m16506fi()) {
                sb.append("MIUI-");
            } else if (igq.m16512lr()) {
                sb.append("FLYME-");
            } else {
                String strBgr = igq.bgr();
                if (igq.m16517ri(strBgr)) {
                    sb.append("EMUI-");
                }
                if (!TextUtils.isEmpty(strBgr)) {
                    sb.append(strBgr);
                    sb.append("-");
                }
            }
            sb.append(Build.VERSION.INCREMENTAL);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: fi */
    private String m15686fi() {
        if (DeviceUtils.m16325ik(this.f12468ik)) {
            return "tv";
        }
        return DeviceUtils.m16332lr(this.f12468ik) ? "android_pad" : "android";
    }

    /* JADX INFO: renamed from: ik */
    private boolean m15687ik() {
        try {
            return new File("/system/bin/su").exists() || new File("/system/xbin/su").exists();
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: ka */
    private int m15688ka() {
        int rawOffset = TimeZone.getDefault().getRawOffset() / Constants.ONE_HOUR;
        if (rawOffset < -12) {
            rawOffset = -12;
        }
        if (rawOffset > 12) {
            return 12;
        }
        return rawOffset;
    }

    /* JADX INFO: renamed from: ri */
    public static C3438ri m15689ri() {
        if (f12466di == null) {
            synchronized (C3438ri.class) {
                if (f12466di == null) {
                    f12466di = new C3438ri();
                }
            }
        }
        return f12466di;
    }

    /* JADX INFO: renamed from: ri */
    private String m15690ri(int i) {
        if (i == 120) {
            return "ldpi";
        }
        if (i == 160) {
            return "mdpi";
        }
        if (i == 240) {
            return "hdpi";
        }
        if (i == 320) {
            return "xhdpi";
        }
        if (i != 480) {
            return i != 640 ? "mdpi" : "xxxhdpi";
        }
        return "xxhdpi";
    }

    /* JADX INFO: renamed from: ri */
    private String m15691ri(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager == null ? "" : telephonyManager.getSimOperator();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: ri */
    private void m15692ri(C3430ri c3430ri) {
        if (c3430ri == null) {
            return;
        }
        try {
            String strOptString = c3430ri.mo15406ik().optJSONObject("params").optString("log_extra", "");
            long jM14344ri = wjv.m14344ri(strOptString);
            int iM14335ka = wjv.m14335ka(strOptString);
            if (jM14344ri == 0) {
                jM14344ri = this.f12471ri;
            }
            this.f12471ri = jM14344ri;
            if (iM14335ka == 0) {
                iM14335ka = this.f12470lr;
            }
            this.f12470lr = iM14335ka;
        } catch (Exception e) {
            C2707ac.m10197ik("AdLogParamsGenerate", "getInfoFromLogExtra exception", e.getMessage());
        }
    }

    /* JADX INFO: renamed from: ik */
    public List<C3430ri> m15693ik(List<C3430ri> list) {
        ArrayList arrayList = new ArrayList();
        for (C3430ri c3430ri : list) {
            try {
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObjectMo15406ik = c3430ri.mo15406ik();
                jSONObject.putOpt(NotificationCompat.CATEGORY_EVENT, jSONObjectMo15406ik.optString("label"));
                long jOptLong = jSONObjectMo15406ik.optLong("event_ts", System.currentTimeMillis());
                jSONObject.putOpt("local_time_ms", Long.valueOf(jOptLong));
                jSONObject.putOpt("datetime", C3399di.f12125ik.format(new Date(jOptLong)));
                JSONObject jSONObject2 = new JSONObject();
                Iterator<String> itKeys = jSONObjectMo15406ik.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (!TextUtils.equals(next, "label")) {
                        jSONObject2.putOpt(next, jSONObjectMo15406ik.opt(next));
                    }
                }
                jSONObject.putOpt("params", jSONObject2);
                arrayList.add(new C3399di(c3430ri.f12406ri, jSONObject));
            } catch (Exception e) {
                C2707ac.m10196ik("AdLogParamsGenerate", e.getMessage());
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    public List<String> m15694lr(List<C3430ri> list) {
        JSONArray jSONArrayOptJSONArray = (list.isEmpty() || list.get(0) == null || list.get(0).mo15406ik() == null) ? null : list.get(0).mo15406ik().optJSONArray("app_log_url_back");
        ArrayList arrayList = new ArrayList();
        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
            for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                String strM16436di = C3571ig.m16436di(jSONArrayOptJSONArray.optString(i));
                if (!TextUtils.isEmpty(strM16436di)) {
                    arrayList.add(strM16436di);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: lr */
    public JSONObject m15695lr() {
        Context contextM14642ri;
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f12468ik == null && (contextM14642ri = C3299nr.m14642ri()) != null) {
                this.f12468ik = contextM14642ri.getApplicationContext();
            }
            jSONObject.put(C11540L6.f24966d0, C3571ig.m16449ka());
            jSONObject.put("ad_sdk_version", BuildConfig.VERSION_NAME);
            jSONObject.put("app_version", C3571ig.m16461mj());
            jSONObject.put("sim_op", m15691ri(this.f12468ik));
            jSONObject.put("root", this.f12469ka ? 1 : 0);
            jSONObject.put("timezone", m15688ka());
            jSONObject.put("access", C3570fr.m16421ri(this.f12468ik));
            jSONObject.put(C11540L6.f24911F, C11744X3.f26142d);
            jSONObject.put("os_version", Build.VERSION.RELEASE);
            jSONObject.put("os_api", Build.VERSION.SDK_INT);
            jSONObject.put("device_type", this.f12467fi);
            jSONObject.put("device_model", Build.MODEL);
            jSONObject.put("device_brand", Build.BRAND);
            jSONObject.put("device_manufacturer", Build.MANUFACTURER);
            jSONObject.put("language", Locale.getDefault().getLanguage());
            jSONObject.put("resolution", C3583qd.m16578fi(this.f12468ik) + "x" + C3583qd.m16580ik(this.f12468ik));
            jSONObject.put("display_density", m15690ri(C3583qd.m16600qt(this.f12468ik)));
            jSONObject.put("density_dpi", C3583qd.m16600qt(this.f12468ik));
            jSONObject.put(C12460ra.f31825b, "1371");
            jSONObject.put("device_id", C3089aw.m12377ri(this.f12468ik));
            jSONObject.put("rom", m15685di());
            jSONObject.put("cpu_abi", Build.CPU_ABI);
            jSONObject.put("ut", this.f12470lr);
            jSONObject.put("uid", this.f12471ri);
            jSONObject.put("google_aid", C3369ri.m15224ri().m15229lr());
            jSONObject.put("locale_language", DeviceUtils.m16328ka());
            jSONObject.put("screen_bright", Math.ceil(DeviceUtils.m16320fi() * 10.0f) / 10.0d);
            jSONObject.put("is_screen_off", !DeviceUtils.m16331lr() ? 1 : 0);
            C3322sf c3322sfM14639ka = C3299nr.m14639ka();
            Context context = this.f12468ik;
            if (context != null) {
                jSONObject.put("force_language", C2729uq.m10311ri(context, "tt_choose_language"));
            }
            if (c3322sfM14639ka.igq("mnc")) {
                jSONObject.put("mnc", C3566dw.m16383ik());
            }
            if (c3322sfM14639ka.igq("mcc")) {
                jSONObject.put("mcc", C3566dw.m16385lr());
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public String m15696ri(List<C3430ri> list) {
        return C3571ig.m16440fi((list.size() <= 0 || list.get(0) == null || list.get(0).mo15406ik() == null) ? "" : list.get(0).mo15406ik().optString("app_log_url"));
    }

    /* JADX INFO: renamed from: ri */
    public JSONObject m15697ri(List<C3430ri> list, long j, JSONObject jSONObject) {
        JSONObject jSONObject2 = new JSONObject();
        try {
            m15692ri(list.get(0));
            jSONObject2.put("header", jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator<C3430ri> it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next().m15632ka());
            }
            jSONObject2.put("event_v3", jSONArray);
            jSONObject2.put("magic_tag", "ss_app_log");
            jSONObject2.put("_gen_time", j);
            jSONObject2.put("local_time", j / 1000);
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }
}
