package com.apm.insight.p011b;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.work.WorkRequest;
import com.adjust.sdk.Constants;
import com.apm.insight.C1373a;
import com.apm.insight.C1375b;
import com.apm.insight.C1386c;
import com.apm.insight.C1390e;
import com.apm.insight.CrashType;
import com.apm.insight.ICrashCallback;
import com.apm.insight.Npth;
import com.apm.insight.entity.C1395a;
import com.apm.insight.entity.C1396b;
import com.apm.insight.entity.C1398d;
import com.apm.insight.entity.Header;
import com.apm.insight.nativecrash.C1441a;
import com.apm.insight.nativecrash.C1442b;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p010a.C1374a;
import com.apm.insight.p012c.C1387a;
import com.apm.insight.p021k.C1417d;
import com.apm.insight.p022l.C1425a;
import com.apm.insight.p022l.C1426b;
import com.apm.insight.p022l.C1427c;
import com.apm.insight.p022l.C1428d;
import com.apm.insight.p022l.C1430f;
import com.apm.insight.p022l.C1434j;
import com.apm.insight.p022l.C1437m;
import com.apm.insight.runtime.C1447a;
import com.apm.insight.runtime.C1466h;
import com.apm.insight.runtime.C1467i;
import com.apm.insight.runtime.C1468j;
import com.apm.insight.runtime.C1470l;
import com.apm.insight.runtime.C1472n;
import com.apm.insight.runtime.p023a.C1449b;
import com.apm.insight.runtime.p023a.C1453f;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.ironsource.C11744X3;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.UnityAdsConstants;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.b.b */
/* JADX INFO: compiled from: ANRManager.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1377b {

    /* JADX INFO: renamed from: z */
    private static volatile boolean f376z = true;

    /* JADX INFO: renamed from: a */
    private C1378c f381a;

    /* JADX INFO: renamed from: b */
    private final Context f382b;

    /* JADX INFO: renamed from: c */
    private volatile boolean f383c;

    /* JADX INFO: renamed from: g */
    private JSONObject f387g;

    /* JADX INFO: renamed from: h */
    private JSONObject f388h;

    /* JADX INFO: renamed from: m */
    private JSONArray f393m;

    /* JADX INFO: renamed from: n */
    private JSONObject f394n;

    /* JADX INFO: renamed from: q */
    private JSONArray f397q;

    /* JADX INFO: renamed from: r */
    private JSONArray f398r;

    /* JADX INFO: renamed from: s */
    private JSONObject f399s;

    /* JADX INFO: renamed from: t */
    private boolean f400t;

    /* JADX INFO: renamed from: v */
    private volatile boolean f402v;

    /* JADX INFO: renamed from: d */
    private long f384d = -1;

    /* JADX INFO: renamed from: e */
    private File f385e = null;

    /* JADX INFO: renamed from: f */
    private boolean f386f = true;

    /* JADX INFO: renamed from: i */
    private String f389i = "unknown";

    /* JADX INFO: renamed from: j */
    private String f390j = "unknown";

    /* JADX INFO: renamed from: k */
    private String f391k = "unknown";

    /* JADX INFO: renamed from: l */
    private String f392l = "npth_inner_default";

    /* JADX INFO: renamed from: o */
    private int f395o = 0;

    /* JADX INFO: renamed from: p */
    private long f396p = -1;

    /* JADX INFO: renamed from: u */
    private final Object f401u = new Object();

    /* JADX INFO: renamed from: w */
    private long f403w = -1;

    /* JADX INFO: renamed from: x */
    private long f404x = 0;

    /* JADX INFO: renamed from: y */
    private final Runnable f405y = new Runnable() { // from class: com.apm.insight.b.b.1
        @Override // java.lang.Runnable
        public final void run() {
            try {
                C1377b.this.m926g();
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
    };

    /* JADX INFO: renamed from: A */
    private int f377A = 0;

    /* JADX INFO: renamed from: B */
    private List<Pattern> f378B = null;

    /* JADX INFO: renamed from: C */
    private Pattern f379C = null;

    /* JADX INFO: renamed from: D */
    private File f380D = null;

    public C1377b(Context context) {
        this.f382b = context;
    }

    /* JADX INFO: renamed from: a */
    private static String m904a(float f) {
        if (f <= 0.0f) {
            return "0%";
        }
        if (f <= 0.1f) {
            return "0% - 10%";
        }
        if (f <= 0.3f) {
            return "10% - 30%";
        }
        if (f <= 0.6f) {
            return "30% - 60%";
        }
        return f <= 0.9f ? "60% - 90%" : "90% - 100%";
    }

    /* JADX INFO: renamed from: a */
    private static String m905a(float f, float f2) {
        if (f2 > 0.0f) {
            return m904a(f / f2);
        }
        return f > 0.0f ? "100%" : "0%";
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m906a(String str, JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM871b = C1373a.m871b(jSONArray);
        if (jSONArrayM871b.length() != jSONArray.length()) {
            this.f395o++;
        }
        try {
            jSONObject.put("thread_name", str);
            jSONObject.put("thread_stack", jSONArrayM871b);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:127:0x0249  */
    /* JADX WARN: Code duplicated, block: B:128:0x024d A[PHI: r27 r28
  0x024d: PHI (r27v3 java.lang.String[]) = (r27v2 java.lang.String[]), (r27v8 java.lang.String[]) binds: [B:126:0x0247, B:116:0x0217] A[DONT_GENERATE, DONT_INLINE]
  0x024d: PHI (r28v3 char) = (r28v2 char), (r28v10 char) binds: [B:126:0x0247, B:116:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:130:0x0257  */
    /* JADX WARN: Code duplicated, block: B:131:0x025b A[PHI: r27 r28
  0x025b: PHI (r27v4 java.lang.String[]) = (r27v3 java.lang.String[]), (r27v8 java.lang.String[]) binds: [B:129:0x0255, B:115:0x0214] A[DONT_GENERATE, DONT_INLINE]
  0x025b: PHI (r28v4 char) = (r28v3 char), (r28v11 char) binds: [B:129:0x0255, B:115:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:133:0x0263  */
    /* JADX WARN: Code duplicated, block: B:134:0x0265 A[PHI: r27 r28
  0x0265: PHI (r27v7 java.lang.String[]) = (r27v4 java.lang.String[]), (r27v8 java.lang.String[]) binds: [B:132:0x0261, B:113:0x0210] A[DONT_GENERATE, DONT_INLINE]
  0x0265: PHI (r28v7 char) = (r28v4 char), (r28v12 char) binds: [B:132:0x0261, B:113:0x0210] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:136:0x026d  */
    /* JADX WARN: Code duplicated, block: B:139:0x0275  */
    /* JADX WARN: Code duplicated, block: B:144:0x0298  */
    /* JADX WARN: Code duplicated, block: B:145:0x0299 A[Catch: all -> 0x02ac, TryCatch #1 {all -> 0x02ac, blocks: (B:142:0x0287, B:146:0x02a2, B:145:0x0299), top: B:226:0x0287 }] */
    /* JADX WARN: Code duplicated, block: B:150:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:153:0x02c4 A[LOOP:2: B:100:0x01f8->B:153:0x02c4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:154:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:182:0x036a  */
    /* JADX WARN: Code duplicated, block: B:186:0x037b  */
    /* JADX WARN: Code duplicated, block: B:188:0x038d  */
    /* JADX WARN: Code duplicated, block: B:191:0x0392 A[LOOP:4: B:189:0x038f->B:191:0x0392, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:200:0x03de A[PHI: r5 r22 r23 r24 r25
  0x03de: PHI (r5v6 java.lang.String) = (r5v5 java.lang.String), (r5v7 java.lang.String), (r5v13 java.lang.String), (r5v28 java.lang.String) binds: [B:198:0x03cf, B:195:0x03ae, B:155:0x02d0, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r22v3 char) = (r22v1 char), (r22v4 char), (r22v7 char), (r22v8 char) binds: [B:198:0x03cf, B:195:0x03ae, B:155:0x02d0, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r23v6 int) = (r23v2 int), (r23v7 int), (r23v11 int), (r23v12 int) binds: [B:198:0x03cf, B:195:0x03ae, B:155:0x02d0, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r24v8 java.util.HashMap) = (r24v4 java.util.HashMap), (r24v9 java.util.HashMap), (r24v14 java.util.HashMap), (r24v24 java.util.HashMap) binds: [B:198:0x03cf, B:195:0x03ae, B:155:0x02d0, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]
  0x03de: PHI (r25v8 java.util.HashMap) = (r25v4 java.util.HashMap), (r25v9 java.util.HashMap), (r25v14 java.util.HashMap), (r25v22 java.util.HashMap) binds: [B:198:0x03cf, B:195:0x03ae, B:155:0x02d0, B:15:0x0064] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:237:0x02d0 A[EDGE_INSN: B:237:0x02d0->B:155:0x02d0 BREAK  A[LOOP:2: B:100:0x01f8->B:153:0x02c4], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    private void m907a(String str, JSONObject jSONObject) throws JSONException {
        HashMap map;
        HashMap map2;
        float[] fArr;
        int i;
        char c;
        String str2;
        char c2;
        boolean z;
        String str3;
        String str4;
        String strTrim;
        String[] strArrSplit;
        int i2;
        String string;
        HashMap map3;
        String str5;
        int i3;
        int i4;
        String[] strArr;
        String str6;
        float fFloatValue;
        SystemClock.uptimeMillis();
        String[] strArrSplit2 = str.split("\n");
        int i5 = 0;
        Float fValueOf = Float.valueOf(-1.0f);
        float[] fArr2 = {-1.0f, -1.0f, -1.0f};
        HashMap map4 = new HashMap();
        HashMap map5 = new HashMap();
        HashMap map6 = new HashMap();
        HashMap map7 = new HashMap();
        HashMap map8 = new HashMap();
        int length = strArrSplit2.length;
        char c3 = 0;
        boolean z2 = false;
        String strTrim2 = "unknown";
        String str7 = strTrim2;
        while (true) {
            if (i5 >= length) {
                map = map5;
                map2 = map7;
                break;
            }
            String strTrim3 = strArrSplit2[i5];
            if (!TextUtils.isEmpty(strTrim3)) {
                fArr = fArr2;
                if (c3 == 0) {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    str2 = strTrim2;
                    String strTrim4 = strTrim3.trim();
                    if (strTrim4.startsWith("tag:")) {
                        strTrim2 = strTrim4.replace("tag:", "").trim();
                        c2 = 4;
                        c3 = 1;
                    } else {
                        strTrim2 = str2;
                        c3 = c;
                        c2 = 4;
                    }
                } else if (c3 == 1) {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    strTrim3 = strTrim3.trim();
                    String lowerCase = strTrim3.toLowerCase();
                    if (lowerCase.startsWith("shortmsg")) {
                        strTrim3.substring(strTrim3.indexOf(58));
                        z = false;
                    } else {
                        if (lowerCase.startsWith("reason:")) {
                            strTrim3.substring(strTrim3.indexOf(58));
                            z = true;
                        } else {
                            str2 = strTrim2;
                            if (lowerCase.contains("appfreeze")) {
                                str7 = "AppFreeze";
                                c3 = '\n';
                                strTrim2 = str2;
                            } else {
                                strTrim2 = str2;
                                c3 = c;
                            }
                        }
                        c2 = 4;
                    }
                    if (lowerCase.contains("input dispatch")) {
                        str4 = "Input dispatching timed out";
                    } else {
                        if (lowerCase.contains("broadcast of intent")) {
                            str4 = "Broadcast of Intent";
                        } else if (lowerCase.contains("executing service")) {
                            str3 = strTrim2;
                            if (AbstractJsonLexerKt.NULL.equalsIgnoreCase(str3)) {
                                strTrim2 = strTrim3.substring(strTrim3.indexOf("service ") + 8).trim();
                                str7 = "executing service";
                            } else {
                                str7 = "executing service";
                                strTrim2 = str3;
                            }
                        } else {
                            str3 = strTrim2;
                            if (lowerCase.contains("service.startforeground")) {
                                str7 = "not call Service.startForeground";
                                strTrim2 = str3;
                            } else {
                                strTrim2 = str3;
                                str7 = "unknown";
                            }
                        }
                        if (z) {
                            c2 = 4;
                            c3 = 2;
                        }
                        strTrim = strTrim3.trim();
                        if (strTrim.startsWith("Load:")) {
                            strArrSplit = strTrim.replace("Load:", "").trim().split(RemoteSettings.FORWARD_SLASH_STRING);
                            if (3 == strArrSplit.length) {
                                for (i2 = 0; i2 < strArrSplit.length; i2++) {
                                    fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                                }
                            }
                            c3 = 3;
                        } else {
                            c3 = c;
                        }
                        c2 = 4;
                    }
                    str7 = str4;
                    if (z) {
                        c2 = 4;
                        c3 = 2;
                    }
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split(RemoteSettings.FORWARD_SLASH_STRING);
                        if (3 == strArrSplit.length) {
                            while (i2 < strArrSplit.length) {
                                fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                            }
                        }
                        c3 = 3;
                    } else {
                        c3 = c;
                    }
                    c2 = 4;
                } else if (c3 != 2) {
                    if (c3 != 3) {
                        c = c3;
                        i = i5;
                        map = map5;
                        map2 = map7;
                        str2 = strTrim2;
                    } else {
                        String[] strArrSplit3 = strTrim3.split("\\s");
                        c = c3;
                        i = i5;
                        if (strArrSplit3.length < 2) {
                            map = map5;
                            map2 = map7;
                        } else {
                            if ("CPU".equalsIgnoreCase(strArrSplit3[0]) && "usage".equalsIgnoreCase(strArrSplit3[1])) {
                                if (strTrim3.contains("ago")) {
                                    z2 = true;
                                }
                                if (map4.isEmpty() && map5.isEmpty() && map6.isEmpty() && map8.isEmpty() && map7.isEmpty()) {
                                    map = map5;
                                    map2 = map7;
                                    c3 = c;
                                    c2 = 4;
                                }
                            } else if (map4.isEmpty() || map5.isEmpty() || map6.isEmpty() || map8.isEmpty() || map7.isEmpty()) {
                                if (map4.isEmpty() && strArrSplit3[1].equalsIgnoreCase("TOTAL:")) {
                                    string = "";
                                    map3 = map4;
                                } else if (strTrim3.contains(this.f382b.getPackageName())) {
                                    int i6 = 0;
                                    string = "";
                                    while (i6 < strArrSplit3.length) {
                                        int i7 = i6;
                                        if (strArrSplit3[i6].contains(this.f382b.getPackageName())) {
                                            StringBuilder sb = new StringBuilder();
                                            String str8 = strArrSplit3[i7];
                                            sb.append(str8.substring(str8.indexOf(47) + 1, strArrSplit3[i7].length() - 1));
                                            sb.append('_');
                                            string = sb.toString();
                                        }
                                        i6 = i7 + 1;
                                        this = this;
                                    }
                                    map3 = map6;
                                } else if (map5.isEmpty() && strTrim3.contains("system_server:")) {
                                    string = "";
                                    map3 = map5;
                                } else if (map8.isEmpty() && strTrim3.contains("kswapd")) {
                                    string = "";
                                    map3 = map8;
                                } else if (map7.isEmpty() && strTrim3.contains("dex2oat")) {
                                    string = "";
                                    map3 = map7;
                                } else {
                                    string = "";
                                    map3 = null;
                                }
                                if (map3 != null) {
                                    int i8 = 0;
                                    while (true) {
                                        String str9 = strArrSplit3[i8];
                                        int i9 = i8;
                                        str5 = "%";
                                        if (str9.contains("%")) {
                                            map = map5;
                                            i3 = i9;
                                            break;
                                        }
                                        i3 = i9 + 1;
                                        map = map5;
                                        if (i3 >= strArrSplit3.length) {
                                            break;
                                        }
                                        i8 = i3;
                                        map5 = map;
                                    }
                                    try {
                                        float fFloatValue2 = Float.valueOf(strArrSplit3[i3].replace("%", "")).floatValue();
                                        i4 = i3;
                                        try {
                                            String str10 = string + C11744X3.i.f26376l;
                                            if (map3 != map4) {
                                                fFloatValue2 /= C1428d.m1315d();
                                            }
                                            map3.put(str10, Float.valueOf(fFloatValue2));
                                        } catch (Throwable unused) {
                                            map3.put(string + C11744X3.i.f26376l, fValueOf);
                                        }
                                    } catch (Throwable unused2) {
                                        i4 = i3;
                                    }
                                    int i10 = i4 + 3;
                                    map2 = map7;
                                    char c4 = 0;
                                    while (i10 < strArrSplit3.length) {
                                        String str11 = "softirq";
                                        if (c4 == 0) {
                                            strArr = strArrSplit3;
                                            if ("user".equalsIgnoreCase(strArr[i10])) {
                                                str11 = "user";
                                                c4 = 1;
                                            }
                                            if (str11 != null) {
                                                fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                str6 = str5;
                                                String str12 = string + str11;
                                                if (map3 != map4) {
                                                    fFloatValue /= C1428d.m1315d();
                                                }
                                                map3.put(str12, Float.valueOf(fFloatValue));
                                            } else {
                                                str6 = str5;
                                            }
                                            if (c4 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i10 += 3;
                                                str5 = str6;
                                                strArrSplit3 = strArr;
                                            }
                                        } else {
                                            strArr = strArrSplit3;
                                            if (c4 != 1) {
                                                if (c4 == 2) {
                                                    c4 = c4;
                                                    if ("iowait".equalsIgnoreCase(strArr[i10])) {
                                                        str11 = "iowait";
                                                        c4 = 3;
                                                    } else if ("irq".equalsIgnoreCase(strArr[i10])) {
                                                        str11 = "irq";
                                                        c4 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str13 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= C1428d.m1315d();
                                                        }
                                                        map3.put(str13, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c4 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i10 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else if (c4 == 3) {
                                                    c4 = c4;
                                                    if ("irq".equalsIgnoreCase(strArr[i10])) {
                                                        str11 = "irq";
                                                        c4 = 4;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str14 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= C1428d.m1315d();
                                                        }
                                                        map3.put(str14, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c4 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i10 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else if (c4 == 4) {
                                                    c4 = c4;
                                                    if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 5;
                                                    } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                        c4 = 6;
                                                    }
                                                    if (str11 != null) {
                                                        fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                        str6 = str5;
                                                        String str15 = string + str11;
                                                        if (map3 != map4) {
                                                            fFloatValue /= C1428d.m1315d();
                                                        }
                                                        map3.put(str15, Float.valueOf(fFloatValue));
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c4 >= 6) {
                                                        break;
                                                        break;
                                                    } else {
                                                        i10 += 3;
                                                        str5 = str6;
                                                        strArrSplit3 = strArr;
                                                    }
                                                } else {
                                                    c4 = c4;
                                                    if (c4 == 5) {
                                                        if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                                            c4 = 6;
                                                        }
                                                    }
                                                    if (str11 != null) {
                                                        try {
                                                            fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                            str6 = str5;
                                                            try {
                                                                String str16 = string + str11;
                                                                if (map3 != map4) {
                                                                    fFloatValue /= C1428d.m1315d();
                                                                }
                                                                map3.put(str16, Float.valueOf(fFloatValue));
                                                            } catch (Throwable unused3) {
                                                                map3.put(string + str11, fValueOf);
                                                            }
                                                        } catch (Throwable unused4) {
                                                            str6 = str5;
                                                        }
                                                    } else {
                                                        str6 = str5;
                                                    }
                                                    if (c4 >= 6) {
                                                        break;
                                                    }
                                                    i10 += 3;
                                                    str5 = str6;
                                                    strArrSplit3 = strArr;
                                                }
                                            }
                                            c4 = c4;
                                            str11 = null;
                                            if (str11 != null) {
                                                fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                                str6 = str5;
                                                String str17 = string + str11;
                                                if (map3 != map4) {
                                                    fFloatValue /= C1428d.m1315d();
                                                }
                                                map3.put(str17, Float.valueOf(fFloatValue));
                                            } else {
                                                str6 = str5;
                                            }
                                            if (c4 >= 6) {
                                                break;
                                                break;
                                            } else {
                                                i10 += 3;
                                                str5 = str6;
                                                strArrSplit3 = strArr;
                                            }
                                        }
                                        if ("kernel".equalsIgnoreCase(strArr[i10])) {
                                            str11 = "kernel";
                                            c4 = 2;
                                        } else if ("iowait".equalsIgnoreCase(strArr[i10])) {
                                            str11 = "iowait";
                                            c4 = 3;
                                        } else if ("irq".equalsIgnoreCase(strArr[i10])) {
                                            str11 = "irq";
                                            c4 = 4;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                            c4 = 5;
                                        } else if ("softirq".equalsIgnoreCase(strArr[i10])) {
                                            c4 = 6;
                                        } else {
                                            c4 = c4;
                                            str11 = null;
                                        }
                                        if (str11 != null) {
                                            fFloatValue = Float.valueOf(strArr[i10 - 1].replace(str5, "")).floatValue();
                                            str6 = str5;
                                            String str18 = string + str11;
                                            if (map3 != map4) {
                                                fFloatValue /= C1428d.m1315d();
                                            }
                                            map3.put(str18, Float.valueOf(fFloatValue));
                                        } else {
                                            str6 = str5;
                                        }
                                        if (c4 >= 6) {
                                            break;
                                            break;
                                        } else {
                                            i10 += 3;
                                            str5 = str6;
                                            strArrSplit3 = strArr;
                                        }
                                    }
                                } else {
                                    map = map5;
                                    map2 = map7;
                                }
                            }
                            map = map5;
                            map2 = map7;
                            c2 = 4;
                            c3 = 4;
                        }
                        str2 = strTrim2;
                    }
                    strTrim2 = str2;
                    c3 = c;
                    c2 = 4;
                } else {
                    c = c3;
                    i = i5;
                    map = map5;
                    map2 = map7;
                    strTrim = strTrim3.trim();
                    if (strTrim.startsWith("Load:")) {
                        strArrSplit = strTrim.replace("Load:", "").trim().split(RemoteSettings.FORWARD_SLASH_STRING);
                        if (3 == strArrSplit.length) {
                            while (i2 < strArrSplit.length) {
                                fArr[i2] = Float.valueOf(strArrSplit[i2]).floatValue();
                            }
                        }
                        c3 = 3;
                    } else {
                        c3 = c;
                    }
                    c2 = 4;
                }
                if (c3 >= c2) {
                    break;
                }
            } else {
                fArr = fArr2;
                i = i5;
                map = map5;
                map2 = map7;
            }
            i5 = i + 1;
            strArrSplit2 = strArrSplit2;
            fArr2 = fArr;
            map7 = map2;
            map5 = map;
        }
        jSONObject.put("anr_tag", strTrim2);
        jSONObject.put("anr_has_ago", String.valueOf(z2));
        jSONObject.put("anr_reason", str7);
        m908a(map6, jSONObject, MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        m908a(map4, jSONObject, C11744X3.i.f26376l);
        if (map.isEmpty()) {
            jSONObject.put("npth_anr_systemserver_total", "not found");
        } else {
            jSONObject.put("npth_anr_systemserver_total", m913b(C1427c.AnonymousClass1.m1304a(map).floatValue()));
        }
        if (map8.isEmpty()) {
            jSONObject.put("npth_anr_kswapd_total", "not found");
        } else {
            jSONObject.put("npth_anr_kswapd_total", m913b(C1427c.AnonymousClass1.m1304a(map8).floatValue()));
        }
        if (map2.isEmpty()) {
            jSONObject.put("npth_anr_dex2oat_total", "not found");
        } else {
            jSONObject.put("npth_anr_dex2oat_total", m913b(C1427c.AnonymousClass1.m1304a(map2).floatValue()));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m908a(HashMap<String, Float> map, JSONObject jSONObject, String str) throws JSONException {
        String strConcat = "npth_anr_".concat(String.valueOf(str));
        if (map.isEmpty()) {
            jSONObject.put(strConcat + "_total", "not found");
            return;
        }
        float fFloatValue = 0.0f;
        float fFloatValue2 = 0.0f;
        float fFloatValue3 = 0.0f;
        float fFloatValue4 = 0.0f;
        float fFloatValue5 = 0.0f;
        for (Map.Entry<String, Float> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.endsWith("user")) {
                fFloatValue += entry.getValue().floatValue();
            } else if (key.endsWith("kernel")) {
                fFloatValue2 += entry.getValue().floatValue();
            } else if (key.endsWith("iowait")) {
                fFloatValue3 += entry.getValue().floatValue();
            } else if (key.endsWith("irq")) {
                fFloatValue4 += entry.getValue().floatValue();
            } else if (key.endsWith("softirq")) {
                fFloatValue5 += entry.getValue().floatValue();
            }
        }
        float f = fFloatValue + fFloatValue2 + fFloatValue3 + fFloatValue4 + fFloatValue5;
        jSONObject.put(strConcat + "_total", m913b(f));
        jSONObject.put(strConcat + "_kernel_user_ratio", m905a(fFloatValue2, f));
        jSONObject.put(strConcat + "_iowait_user_ratio", m905a(fFloatValue3, f));
    }

    /* JADX INFO: renamed from: a */
    private void m909a(JSONArray jSONArray) {
        int i;
        int[] iArrM916b;
        int[] iArrM916b2;
        if (jSONArray == null) {
            return;
        }
        this.f387g = null;
        this.f394n = null;
        this.f395o = 0;
        JSONArray jSONArray2 = new JSONArray();
        JSONArray jSONArray3 = new JSONArray();
        JSONArray jSONArray4 = new JSONArray();
        this.f389i = "unknown";
        this.f390j = "unknown";
        this.f391k = "unknown";
        int[] iArr = new int[3];
        iArr[0] = 0;
        iArr[1] = 0;
        int i2 = 2;
        iArr[2] = 0;
        JSONArray jSONArray5 = jSONArray4;
        String string = null;
        int i3 = 0;
        boolean z = false;
        while (i3 < jSONArray.length()) {
            String strOptString = jSONArray.optString(i3);
            int i4 = i2;
            if (TextUtils.isEmpty(strOptString)) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f387g == null && C11744X3.i.f26354Z.equals(string)) {
                        this.f387g = m917c(jSONArray5);
                    } else {
                        jSONArray2.put(m906a(string, jSONArray5));
                    }
                    try {
                        if (!C11744X3.i.f26354Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused) {
                    }
                    String str = string;
                    if (!m912a(str)) {
                        try {
                            iArrM916b2 = m916b(jSONArray5);
                        } catch (IllegalArgumentException e) {
                            C1386c.m990a();
                            C1468j.m1652a(e, "NPTH_CATCH");
                            iArrM916b2 = null;
                        } catch (Throwable unused2) {
                            iArrM916b2 = null;
                        }
                        if (iArrM916b2 != null) {
                            int i5 = iArrM916b2[0];
                            if (i5 > iArr[0]) {
                                iArr[0] = i5;
                                this.f389i = str;
                            }
                            int i6 = iArrM916b2[1];
                            if (i6 > iArr[1]) {
                                iArr[1] = i6;
                                this.f390j = str;
                            }
                            int i7 = iArrM916b2[i4];
                            if (i7 > iArr[i4]) {
                                iArr[i4] = i7;
                                this.f391k = str;
                            }
                        }
                    }
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                i = i4;
                string = null;
            } else if (!z) {
                i = i4;
                if (strOptString.startsWith("DALVIK THREADS") || strOptString.startsWith("suspend") || strOptString.startsWith("\"")) {
                    z = true;
                }
                jSONArray3.put(strOptString);
            } else if (!z) {
                i = i4;
            } else if (strOptString.contains(" prio=")) {
                if (jSONArray5.length() > 0 && !TextUtils.isEmpty(string)) {
                    if (this.f387g == null && C11744X3.i.f26354Z.equals(string)) {
                        this.f387g = m917c(jSONArray5);
                    } else {
                        jSONArray2.put(m906a(string, jSONArray5));
                    }
                    try {
                        if (!C11744X3.i.f26354Z.equals(string)) {
                            string = string.substring(0, string.indexOf(40)).trim();
                        }
                    } catch (Throwable unused3) {
                    }
                    String str2 = string;
                    if (!m912a(str2)) {
                        try {
                            iArrM916b = m916b(jSONArray5);
                        } catch (IllegalArgumentException e2) {
                            C1386c.m990a();
                            C1468j.m1652a(e2, "NPTH_CATCH");
                            iArrM916b = null;
                        } catch (Throwable unused4) {
                            iArrM916b = null;
                        }
                        if (iArrM916b != null) {
                            int i8 = iArrM916b[0];
                            if (i8 > iArr[0]) {
                                iArr[0] = i8;
                                this.f389i = str2;
                            }
                            int i9 = iArrM916b[1];
                            if (i9 > iArr[1]) {
                                iArr[1] = i9;
                                this.f390j = str2;
                            }
                            int i10 = iArrM916b[i4];
                            if (i10 > iArr[i4]) {
                                iArr[i4] = i10;
                                this.f391k = str2;
                            }
                        }
                    }
                }
                String strSubstring = strOptString.substring(1, strOptString.indexOf(34, 1));
                if (C11744X3.i.f26354Z.equals(strSubstring)) {
                    i = i4;
                    string = strSubstring;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(strSubstring);
                    sb.append("  (");
                    i = i4;
                    sb.append(strOptString.substring(strOptString.indexOf(34, i) + 1));
                    sb.append(" )");
                    string = sb.toString();
                }
                if (jSONArray5.length() > 0) {
                    jSONArray5 = new JSONArray();
                }
                jSONArray5.put(strOptString);
            } else {
                i = i4;
                if (TextUtils.isEmpty(string)) {
                    jSONArray3.put(strOptString);
                } else {
                    jSONArray5.put(strOptString);
                }
            }
            i3++;
            i2 = i;
        }
        if (jSONArray2.length() > 0) {
            this.f393m = jSONArray3;
            try {
                JSONObject jSONObject = new JSONObject();
                this.f394n = jSONObject;
                jSONObject.put("thread_all_count", jSONArray2.length());
                this.f394n.put("thread_stacks", jSONArray2);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m910a(long j) {
        if (this.f402v) {
            this.f402v = false;
            m914b(j);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m912a(String str) {
        if (this.f378B == null) {
            JSONArray jSONArrayM1534b = C1447a.m1534b();
            if (jSONArrayM1534b != null) {
                this.f378B = new LinkedList();
                this.f392l = jSONArrayM1534b.optString(0);
                for (int i = 1; i < jSONArrayM1534b.length(); i++) {
                    try {
                        this.f378B.add(Pattern.compile(jSONArrayM1534b.optString(i)));
                    } catch (Throwable unused) {
                    }
                }
            }
            if (this.f378B == null) {
                LinkedList linkedList = new LinkedList();
                this.f378B = linkedList;
                linkedList.add(Pattern.compile("^main$"));
                this.f378B.add(Pattern.compile("^default_npth_thread$"));
                this.f378B.add(Pattern.compile("^RenderThread$"));
                this.f378B.add(Pattern.compile("^Jit thread pool worker thread.*$"));
            }
        }
        Iterator<Pattern> it = this.f378B.iterator();
        while (it.hasNext()) {
            if (it.next().matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    private static String m913b(float f) {
        return m904a(f / 100.0f);
    }

    /* JADX INFO: renamed from: b */
    private void m914b(long j) {
        if (this.f404x != this.f403w) {
            try {
                this.f396p = System.currentTimeMillis();
                if (C1390e.m1049x()) {
                    this.f398r = C1381f.m946b().m967b();
                    this.f397q = C1385j.m988a(j);
                    this.f388h = C1381f.m946b().m965a(j).m969a();
                }
                JSONObject jSONObject = new JSONObject();
                this.f399s = jSONObject;
                C1425a.m1288a(this.f382b, jSONObject);
                this.f400t = m918h();
                this.f386f = !Npth.hasCrash();
            } catch (Throwable unused) {
            }
            try {
                this.f384d = this.f396p;
                String strM1376b = C1434j.m1376b();
                File file = new File(new File(C1434j.m1387f(this.f382b), strM1376b), "trace_" + C1425a.m1291b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file.getParentFile().mkdirs();
                C1430f.m1327a(file, C1426b.m1299a().format(new Date(System.currentTimeMillis())) + "\n", false);
                C1472n.m1708a("anr_trace", strM1376b);
                NativeImpl.m1473i(file.getAbsolutePath());
                try {
                    JSONArray jSONArrayM1325a = C1430f.m1325a(file.getAbsolutePath());
                    this.f393m = jSONArrayM1325a;
                    m909a(jSONArrayM1325a);
                } catch (IOException unused2) {
                } catch (Throwable th) {
                    C1386c.m990a();
                    C1468j.m1652a(th, "NPTH_CATCH");
                }
                if (this.f387g == null) {
                    this.f387g = C1379d.m938a();
                }
            } catch (Throwable th2) {
                C1386c.m990a();
                C1468j.m1652a(th2, "NPTH_CATCH");
            }
            C1373a.m878d();
        } else {
            try {
                this.f384d = this.f396p;
                String strM1376b2 = C1434j.m1376b();
                File file2 = new File(new File(C1434j.m1387f(this.f382b), strM1376b2), "trace" + C1425a.m1291b().replace(AbstractJsonLexerKt.COLON, '_') + ".txt");
                file2.getParentFile().mkdirs();
                C1430f.m1327a(file2, C1426b.m1299a().format(new Date(System.currentTimeMillis())) + "\n", false);
                C1472n.m1708a("anr_trace", strM1376b2);
                NativeImpl.m1473i(file2.getAbsolutePath());
                try {
                    JSONArray jSONArrayM1325a2 = C1430f.m1325a(file2.getAbsolutePath());
                    this.f393m = jSONArrayM1325a2;
                    m909a(jSONArrayM1325a2);
                } catch (IOException unused3) {
                } catch (Throwable th3) {
                    C1386c.m990a();
                    C1468j.m1652a(th3, "NPTH_CATCH");
                }
                if (this.f387g == null) {
                    this.f387g = C1379d.m938a();
                }
            } catch (Throwable th4) {
                C1386c.m990a();
                C1468j.m1652a(th4, "NPTH_CATCH");
            }
        }
        long j2 = this.f403w;
        this.f404x = j2;
        this.f403w = -1L;
        if (j2 == -1) {
            this.f404x = (-1) - 1;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m915b(String str, JSONArray jSONArray) {
        for (ICrashCallback iCrashCallback : C1470l.m1660a().m1623e()) {
            try {
                if (iCrashCallback instanceof C1375b) {
                    ((C1375b) iCrashCallback).m901a(CrashType.ANR, str, (Thread) null, jSONArray);
                } else {
                    iCrashCallback.onCrash(CrashType.ANR, str, null);
                }
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private int[] m916b(JSONArray jSONArray) throws IllegalArgumentException {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            int iIndexOf = (strOptString == null || strOptString.isEmpty()) ? -1 : strOptString.indexOf("utm=");
            if (iIndexOf > 0) {
                if (this.f379C == null) {
                    this.f379C = Pattern.compile("[^0-9]+");
                }
                String[] strArrSplit = this.f379C.split(strOptString.substring(iIndexOf));
                if (strArrSplit == null || strArrSplit.length < 2) {
                    return null;
                }
                try {
                    int iIntValue = Integer.decode(strArrSplit[1]).intValue();
                    int iIntValue2 = Integer.decode(strArrSplit[2]).intValue();
                    return new int[]{iIntValue, iIntValue2, iIntValue + iIntValue2};
                } catch (Throwable unused) {
                    throw new IllegalArgumentException("Err stack line: ".concat(String.valueOf(strOptString)));
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private JSONObject m917c(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArrayM871b = C1373a.m871b(jSONArray);
        if (jSONArrayM871b.length() != jSONArray.length()) {
            this.f395o++;
        }
        try {
            jSONObject.put("thread_number", 1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < jSONArrayM871b.length(); i++) {
                sb.append(jSONArrayM871b.getString(i));
                sb.append('\n');
            }
            jSONObject.put("mainStackFromTrace", sb.toString());
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m918h() {
        boolean zM1290a = C1425a.m1290a();
        boolean z = !zM1290a;
        if (zM1290a || C1449b.m1566d().m1593e() > 2000) {
            return z;
        }
        return false;
    }

    /* JADX INFO: renamed from: i */
    private File m919i() {
        if (this.f380D == null) {
            this.f380D = new File(this.f382b.getFilesDir(), "has_anr_signal_" + C1425a.m1291b().replaceAll(CertificateUtil.DELIMITER, "_"));
        }
        return this.f380D;
    }

    /* JADX INFO: renamed from: a */
    public final void m920a() {
        if (this.f383c) {
            return;
        }
        this.f381a = new C1378c(this);
        this.f384d = C1390e.m1035j();
        this.f383c = true;
    }

    /* JADX INFO: renamed from: b */
    public final void m921b() {
        if (this.f383c) {
            this.f383c = false;
            C1378c c1378c = this.f381a;
            if (c1378c != null) {
                c1378c.m935b();
            }
            this.f381a = null;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m922c() {
        C1378c c1378c = this.f381a;
        if (c1378c != null) {
            c1378c.m934a();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m923d() {
        synchronized (this.f401u) {
        }
        this.f405y.run();
    }

    /* JADX INFO: renamed from: e */
    public final void m924e() {
        if (NativeImpl.m1471h()) {
            try {
                C1430f.m1327a(m919i(), String.valueOf(this.f377A + 1), false);
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
        }
        this.f403w = SystemClock.uptimeMillis();
        this.f402v = true;
    }

    /* JADX INFO: renamed from: f */
    public final void m925f() {
        File fileM919i = m919i();
        try {
            int iIntValue = Integer.decode(C1430f.m1323a(fileM919i.getAbsolutePath(), "\n")).intValue();
            this.f377A = iIntValue;
            if (iIntValue >= 2) {
                NativeImpl.m1453a(false);
            } else {
                NativeImpl.m1453a(true);
            }
        } catch (IOException unused) {
            NativeImpl.m1453a(true);
        } catch (Throwable unused2) {
            C1430f.m1334a(fileM919i);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /* JADX INFO: renamed from: g */
    final boolean m926g() {
        int i;
        String str;
        String str2;
        boolean z;
        JSONArray jSONArrayM967b;
        boolean z2;
        JSONArray jSONArrayM988a;
        JSONObject jSONObject;
        JSONObject jSONObjectM969a;
        String str3;
        String str4;
        JSONArray jSONArray;
        final long j;
        JSONObject jSONObjectM938a;
        boolean z3;
        JSONObject jSONObject2;
        String str5;
        boolean zM1650b = C1467i.m1645a().m1650b();
        long jUptimeMillis = SystemClock.uptimeMillis();
        m910a(jUptimeMillis);
        String strM936a = C1379d.m936a(this.f382b);
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str6 = Constants.NORMAL;
        TextUtils.isEmpty(strM936a);
        if (TextUtils.isEmpty(strM936a)) {
            i = 1;
            str = "unknown";
            str2 = "unknown";
            z = false;
            jSONArrayM967b = null;
            z2 = false;
            jSONArrayM988a = null;
            jSONObject = null;
            jSONObjectM969a = null;
            str3 = Constants.NORMAL;
            str4 = "unknown";
            jSONArray = null;
            j = jCurrentTimeMillis;
            jSONObjectM938a = null;
        } else {
            synchronized (this.f401u) {
            }
            if (this.f387g == null || System.currentTimeMillis() - this.f384d > 20000) {
                if (this.f402v) {
                    this.f402v = false;
                    str6 = "trace_after";
                }
                m914b(jUptimeMillis);
            } else {
                str6 = "trace_last";
            }
            JSONObject jSONObject3 = this.f387g;
            String str7 = this.f389i;
            String str8 = this.f390j;
            String str9 = this.f391k;
            JSONArray jSONArray2 = this.f393m;
            JSONArray jSONArray3 = this.f398r;
            JSONArray jSONArray4 = this.f397q;
            i = 1;
            JSONObject jSONObject4 = this.f399s;
            JSONObject jSONObject5 = this.f388h;
            z = this.f400t;
            long j2 = this.f396p;
            this.f387g = null;
            this.f393m = null;
            this.f397q = null;
            this.f388h = null;
            this.f398r = null;
            this.f389i = "unknown";
            this.f390j = "unknown";
            this.f391k = "unknown";
            this.f395o = 0;
            str2 = str9;
            str4 = str7;
            jSONArray = jSONArray2;
            jSONObjectM969a = jSONObject5;
            jSONArrayM988a = jSONArray4;
            jSONArrayM967b = jSONArray3;
            str = str8;
            str3 = str6;
            j = j2;
            jSONObjectM938a = jSONObject3;
            jSONObject = jSONObject4;
            z2 = true;
        }
        if (TextUtils.isEmpty(strM936a)) {
            if (this.f387g == null || System.currentTimeMillis() - this.f384d <= 20000) {
                if (this.f387g == null || System.currentTimeMillis() - this.f384d <= 2000 || !NativeImpl.m1471h()) {
                    return false;
                }
                C1430f.m1334a(m919i());
                return false;
            }
            this.f387g = null;
            this.f393m = null;
            this.f397q = null;
            this.f388h = null;
            this.f398r = null;
            this.f389i = "unknown";
            this.f390j = "unknown";
            this.f391k = "unknown";
            this.f395o = 0;
            this.f385e = null;
            return false;
        }
        if (jSONObjectM938a == null) {
            if (jSONArrayM988a == null) {
                try {
                    jSONArrayM967b = C1381f.m946b().m967b();
                    jSONArrayM988a = C1385j.m988a(jUptimeMillis);
                    z3 = z;
                    try {
                        jSONObjectM969a = C1381f.m946b().m965a(jUptimeMillis).m969a();
                        JSONObject jSONObject6 = new JSONObject();
                        try {
                            C1425a.m1288a(this.f382b, jSONObject6);
                            jSONObject = jSONObject6;
                        } catch (Throwable unused) {
                            jSONObject = jSONObject6;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable unused3) {
                    z3 = z;
                }
            } else {
                z3 = z;
            }
            jSONObjectM938a = C1379d.m938a();
        } else {
            z3 = z;
        }
        JSONObject jSONObject7 = jSONObject;
        JSONObject jSONObject8 = jSONObjectM969a;
        if (jSONObjectM938a == null || jSONObjectM938a.length() <= 0) {
            return z2;
        }
        boolean z4 = z2;
        try {
            jSONObjectM938a.put("pid", Process.myPid());
            jSONObjectM938a.put("package", this.f382b.getPackageName());
            jSONObjectM938a.put("is_remote_process", 0);
            jSONObjectM938a.put("is_new_stack", 10);
            C1395a c1395a = new C1395a(new JSONObject());
            JSONObject jSONObject9 = jSONObjectM938a;
            c1395a.m1095a("data", (Object) jSONObject9.toString());
            c1395a.m1095a("is_anr", Integer.valueOf(i));
            c1395a.m1095a("anrType", (Object) str3);
            if (C1390e.m1049x()) {
                c1395a.m1095a("history_message", (Object) jSONArrayM967b);
                c1395a.m1095a("current_message", jSONObject8);
                c1395a.m1095a("pending_messages", (Object) jSONArrayM988a);
            }
            c1395a.m1095a("anr_time", Long.valueOf(System.currentTimeMillis()));
            c1395a.m1095a("crash_time", Long.valueOf(j));
            C1387a.m993b();
            c1395a.m1103c(jSONObject7);
            c1395a.m1095a("anr_info", (Object) strM936a);
            if (jSONArray != null) {
                c1395a.m1095a("dump_trace", (Object) jSONArray);
            }
            JSONObject jSONObject10 = this.f394n;
            c1395a.m1095a("all_thread_stacks", (jSONObject10 == null || jSONObject10.length() == 0) ? C1437m.m1426b((String) null) : this.f394n);
            C1395a c1395aM1609a = C1453f.m1608a().m1609a(CrashType.ANR, c1395a);
            c1395aM1609a.m1095a("is_background", Boolean.valueOf(z3));
            c1395aM1609a.m1095a("logcat", (Object) C1466h.m1642a(C1390e.m1030f()));
            c1395aM1609a.m1095a("has_dump", (Object) "true");
            c1395aM1609a.m1095a("crash_uuid", (Object) C1390e.m1013a(j, CrashType.ANR, false, false));
            JSONObject jSONObjectOptJSONObject = c1395aM1609a.m1102c().optJSONObject("filters");
            C1398d.m1122b(c1395aM1609a.m1102c());
            if (jSONObjectOptJSONObject == null) {
                try {
                    jSONObject2 = new JSONObject();
                    try {
                        c1395aM1609a.m1095a("filters", jSONObject2);
                    } catch (Throwable unused4) {
                        jSONObjectOptJSONObject = jSONObject2;
                        jSONObject2 = jSONObjectOptJSONObject;
                    }
                } catch (Throwable unused5) {
                    jSONObject2 = jSONObjectOptJSONObject;
                }
            } else {
                jSONObject2 = jSONObjectOptJSONObject;
            }
            jSONObject2.put("anrType", str3);
            jSONObject2.put("max_utm_thread", str4);
            jSONObject2.put("max_stm_thread", str);
            jSONObject2.put("max_utm_stm_thread", str2);
            jSONObject2.put("max_utm_thread_version", this.f392l);
            long jM1035j = j - C1390e.m1035j();
            if (jM1035j < WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS) {
                str5 = "0 - 30s";
            } else if (jM1035j < 60000) {
                str5 = "30s - 1min";
            } else if (jM1035j < UnityAdsConstants.Timeout.INIT_TIMEOUT_MS) {
                str5 = "1min - 2min";
            } else if (jM1035j < 300000) {
                str5 = "2min - 5min";
            } else if (jM1035j < 600000) {
                str5 = "5min - 10min";
            } else if (jM1035j < 1800000) {
                str5 = "10min - 30min";
            } else {
                str5 = jM1035j < 3600000 ? "30min - 1h" : "1h - ";
            }
            jSONObject2.put("crash_length", str5);
            jSONObject2.put("disable_looper_monitor", String.valueOf(C1447a.m1537c()));
            jSONObject2.put("npth_force_apm_crash", String.valueOf(C1387a.m993b()));
            jSONObject2.put("sdk_version", "2008-20250701130429");
            jSONObject2.put("has_logcat", String.valueOf(c1395aM1609a.m1096a()));
            jSONObject2.put("memory_leak", String.valueOf(C1395a.m1083a(C1390e.m1030f())));
            jSONObject2.put("fd_leak", String.valueOf(C1395a.m1085b(C1390e.m1030f())));
            jSONObject2.put("threads_leak", String.valueOf(C1395a.m1086c(C1390e.m1030f())));
            jSONObject2.put("is_64_devices", String.valueOf(Header.m1063a()));
            jSONObject2.put("is_64_runtime", String.valueOf(NativeImpl.m1467f()));
            jSONObject2.put("is_x86_devices", String.valueOf(Header.m1066b()));
            jSONObject2.put("has_meminfo_file", String.valueOf(C1434j.m1383d(C1390e.m1030f()).exists()));
            jSONObject2.put("is_root", C1441a.m1482k() ? "true" : "false");
            jSONObject2.put("anr_normal_trace", String.valueOf(!this.f402v));
            jSONObject2.put("anr_no_run", String.valueOf(zM1650b));
            jSONObject2.put("crash_after_crash", Npth.hasCrash() ? "true" : "false");
            jSONObject2.put("from_file", String.valueOf(C1379d.m940b()));
            jSONObject2.put("has_dump", "true");
            jSONObject2.put("from_kill", "false");
            jSONObject2.put("last_resume_activity", C1449b.m1566d().m1596h());
            int i2 = this.f395o;
            if (i2 > 0) {
                jSONObject2.put("may_have_stack_overflow", String.valueOf(i2));
            }
            try {
                m907a(strM936a, jSONObject2);
            } catch (Throwable th) {
                C1386c.m990a();
                C1468j.m1652a(th, "NPTH_CATCH");
            }
            C1374a.m898a();
            CrashType crashType = CrashType.ANR;
            C1390e.m1028e();
            try {
                if (C1373a.m880e().length() > 1024) {
                    c1395aM1609a.m1091a("has_system_traces", "true");
                }
            } catch (Throwable unused6) {
            }
            try {
                JSONArray jSONArrayM1505a = C1442b.m1505a(C1434j.m1386e(C1390e.m1030f()), C1434j.m1389f(C1390e.m1030f()));
                jSONObject2.put("leak_threads_count", String.valueOf(jSONArrayM1505a.length()));
                if (jSONArrayM1505a.length() > 0) {
                    C1430f.m1329a(C1434j.m1392g(C1390e.m1030f()), jSONArrayM1505a);
                }
            } catch (Throwable unused7) {
            }
            String strOptString = jSONObject9.optString("mainStackFromTrace");
            JSONArray jSONArrayM1109a = C1396b.m1109a(strOptString);
            C1396b.m1113a(c1395aM1609a.m1102c(), jSONArrayM1109a, new C1396b.a() { // from class: com.apm.insight.b.b.2
                @Override // com.apm.insight.entity.C1396b.a
                /* JADX INFO: renamed from: a */
                public final void mo927a(JSONObject jSONObject11) {
                    C1417d.m1226a().m1228a(jSONObject11, j, C1377b.this.f386f);
                }
            });
            m915b(strOptString, jSONArrayM1109a);
            return z4;
        } catch (Throwable th2) {
            C1386c.m990a();
            C1468j.m1652a(th2, "NPTH_CATCH");
            return z4;
        }
    }
}
