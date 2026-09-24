package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import android.text.TextUtils;
import android.widget.TextView;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.C2491di;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.utils.C2729uq;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.sf */
/* JADX INFO: loaded from: classes3.dex */
public class C2440sf {

    /* JADX INFO: renamed from: lr */
    private static String f6584lr;

    /* JADX INFO: renamed from: ri */
    private static final Set<String> f6585ri = Collections.unmodifiableSet(new HashSet(Arrays.asList("dislike", "close", "close-fill", "webview-close")));

    /* JADX INFO: renamed from: lr */
    public static double m8413lr(String str) {
        try {
            return Double.parseDouble(new JSONObject(str).optString("fontSize"));
        } catch (Throwable unused) {
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m8414lr() {
        return !TextUtils.isEmpty(f6584lr);
    }

    /* JADX INFO: renamed from: lr */
    public static int[] m8415lr(String str, float f, boolean z) {
        try {
            TextView textView = new TextView(C2490ka.m8811ri());
            textView.setTextSize(f);
            textView.setText(str);
            textView.setIncludeFontPadding(false);
            if (z) {
                textView.setSingleLine();
            }
            textView.measure(-2, -2);
            return new int[]{textView.getMeasuredWidth() + 2, textView.getMeasuredHeight() + 2};
        } catch (Exception unused) {
            return new int[]{0, 0};
        }
    }

    /* JADX INFO: renamed from: ri */
    private static C2436lr.ik m8416ri(C2436lr.ik ikVar, String str, String str2, String str3) {
        if (str.contains("union")) {
            ikVar.f6575ri = 0.0f;
            ikVar.f6574lr = 0.0f;
            return ikVar;
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = m8421ri(str);
        }
        if (!TextUtils.isEmpty(str3)) {
            return m8417ri(str3, str2);
        }
        ikVar.f6575ri = 0.0f;
        ikVar.f6574lr = 0.0f;
        return ikVar;
    }

    /* JADX INFO: renamed from: ri */
    public static C2436lr.ik m8417ri(String str, String str2) {
        return m8419ri(str, str2, false);
    }

    /* JADX WARN: Code duplicated, block: B:224:0x0454  */
    /* JADX WARN: Code duplicated, block: B:227:0x0462 A[Catch: Exception -> 0x0473, JSONException -> 0x0477, TryCatch #0 {JSONException -> 0x0477, blocks: (B:183:0x03a4, B:185:0x03d4, B:187:0x03d9, B:189:0x03e1, B:197:0x03f6, B:199:0x03fd, B:201:0x0409, B:203:0x0411, B:206:0x0418, B:210:0x0422, B:216:0x0436, B:218:0x043e, B:220:0x0444, B:222:0x044c, B:234:0x0473, B:225:0x0456, B:227:0x0462, B:232:0x046c, B:212:0x042b), top: B:276:0x03a4 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x0468 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:231:0x046b  */
    /* JADX INFO: renamed from: ri */
    public static C2436lr.ik m8418ri(String str, String str2, String str3, boolean z, boolean z2, int i, C2475mj c2475mj, double d, int i2, double d2, String str4, C2500aw c2500aw) {
        int i3;
        int i4;
        float f;
        float f2;
        C2436lr.ik ikVarM8419ri;
        int i5;
        C2470di c2470diM8592fi;
        String strOptString = str;
        int i6 = i;
        String strM8884ka = c2500aw.m8884ka();
        int iXha = c2500aw.xha();
        if (C2490ka.m8810lr() && i2 != 4 && (TextUtils.equals(str2, "text_star") || TextUtils.equals(str2, "score-count") || TextUtils.equals(str2, "score-count-type-1") || TextUtils.equals(str2, "score-count-type-2"))) {
            return new C2436lr.ik(0.0f, 0.0f);
        }
        C2436lr.ik ikVar = new C2436lr.ik();
        if (strOptString.startsWith("<svg") || f6585ri.contains(str2)) {
            try {
                if ("close".equals(str2) || (C2490ka.m8810lr() && "close-fill".equals(str2))) {
                    float fOptDouble = (float) new JSONObject(str3).optDouble("fontSize");
                    ikVar.f6575ri = fOptDouble;
                    ikVar.f6574lr = fOptDouble;
                    return ikVar;
                }
            } catch (Exception unused) {
            }
            ikVar.f6575ri = 10.0f;
            ikVar.f6574lr = 10.0f;
            return ikVar;
        }
        if (!"logo".equals(str2)) {
            if ("development-name".equals(str2)) {
                strOptString = C2729uq.m10311ri(C2490ka.m8811ri(), "tt_text_privacy_development") + strOptString;
            }
            if ("app-version".equals(str2)) {
                strOptString = C2729uq.m10311ri(C2490ka.m8811ri(), "tt_text_privacy_app_version") + strOptString;
            }
            if ("score-count".equals(str2)) {
                try {
                    i3 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused2) {
                    i3 = 0;
                }
                if (C2490ka.m8810lr() && i3 < 0) {
                    return new C2436lr.ik(0.0f, 0.0f);
                }
                return m8417ri("(" + String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_comment_num"), Integer.valueOf(i3)) + ")", str3);
            }
            if ("score-count-type-2".equals(str2)) {
                try {
                    i4 = Integer.parseInt(strOptString);
                } catch (NumberFormatException unused3) {
                    i4 = 0;
                }
                if (C2490ka.m8810lr() && i4 < 0) {
                    return new C2436lr.ik(0.0f, 0.0f);
                }
                return m8417ri("(" + String.format(new DecimalFormat("###,###,###").format(i4), Integer.valueOf(i4)) + ")", str3);
            }
            if ("feedback-dislike".equals(str2) && C2490ka.m8810lr()) {
                C2436lr.ik ikVar2 = new C2436lr.ik();
                float fM8413lr = (float) m8413lr(str3);
                ikVar2.f6575ri = fM8413lr;
                ikVar2.f6574lr = fM8413lr;
                return ikVar2;
            }
            if ("skip-with-time-countdown".equals(str2) || TextUtils.equals("skip-with-countdowns-video-countdown", str2)) {
                if (!c2500aw.m8889ri() || !C2491di.m8812lr(strM8884ka)) {
                    return d < 10.0d ? m8417ri("0S", str3) : m8417ri("00S", str3);
                }
                if (((int) (d + 0.5d)) - iXha < 10) {
                    return C2490ka.m8810lr() ? m8417ri("0s", str3) : m8417ri(String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_full_skip"), "0"), str3);
                }
                return C2490ka.m8810lr() ? m8417ri("00s", str3) : m8417ri(String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_full_skip"), "00"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-btn", str2)) {
                return m8417ri("| " + C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_screen_skip_tx"), str3);
            }
            if (TextUtils.equals("skip-with-countdowns-skip-countdown", str2)) {
                return m8417ri("| ".concat(String.valueOf(String.format(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_full_skip_count_down"), "00"))), str3);
            }
            if ("skip-with-time-skip-btn".equals(str2)) {
                C2436lr.ik ikVarM8417ri = m8417ri("| " + C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_screen_skip_tx"), str3);
                if (C2490ka.m8810lr()) {
                    try {
                        ikVarM8417ri.f6574lr = (float) ((((double) ikVarM8417ri.f6574lr) * new JSONObject(str3).optDouble("lineHeight")) / 1.2d);
                    } catch (Throwable unused4) {
                    }
                    ikVarM8417ri.f6575ri = ikVarM8417ri.f6574lr;
                }
                return ikVarM8417ri;
            }
            if ("skip".equals(str2)) {
                return m8417ri(C2729uq.m10311ri(C2490ka.m8811ri(), "tt_reward_screen_skip_tx"), str3);
            }
            if ("timedown".equals(str2)) {
                return m8417ri(IdManager.DEFAULT_VERSION_NAME, str3);
            }
            if ("text_star".equals(str2)) {
                return (!C2490ka.m8810lr() || (d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d2 <= 5.0d)) ? m8417ri(IdManager.DEFAULT_VERSION_NAME, str3) : new C2436lr.ik(0.0f, 0.0f);
            }
            if (TextUtils.equals("privacy-detail", str2)) {
                return m8417ri("Permission list | Privacy policy", str3);
            }
            if ("arrowButton".equals(str2)) {
                return m8417ri("Download", str3);
            }
            if ("text".equals(str2) && C2490ka.m8810lr() && TextUtils.isEmpty(strOptString) && (c2470diM8592fi = c2475mj.m8627qt().m8592fi()) != null) {
                strOptString = c2470diM8592fi.saa() != null ? c2475mj.m8627qt().m8592fi().saa().optString(xha.m8829ik(C2490ka.m8811ri())) : "";
            }
            if ("fillButton".equals(str2) || "text".equals(str2) || "button".equals(str2) || "downloadWithIcon".equals(str2) || "downloadButton".equals(str2) || "laceButton".equals(str2) || "cardButton".equals(str2) || "colourMixtureButton".equals(str2) || "arrowButton".equals(str2) || (("source".equals(str2) && !(C2490ka.m8810lr() && "open_ad".equals(strM8884ka))) || TextUtils.equals("app-version", str2) || TextUtils.equals("development-name", str2))) {
                return m8417ri(strOptString, str3);
            }
            try {
                JSONObject jSONObject = new JSONObject(str3);
                int length = strOptString.length();
                float fOptDouble2 = (float) jSONObject.optDouble("fontSize");
                float fOptDouble3 = (float) jSONObject.optDouble("letterSpacing");
                float fOptDouble4 = (float) jSONObject.optDouble("lineHeight");
                float fOptDouble5 = (float) jSONObject.optDouble("maxWidth");
                float f3 = (length * (fOptDouble2 + fOptDouble3)) - fOptDouble3;
                if ("muted".equals(str2)) {
                    ikVar.f6575ri = fOptDouble2;
                    ikVar.f6574lr = fOptDouble2;
                    return ikVar;
                }
                if ("star".equals(str2)) {
                    if (C2490ka.m8810lr() && (d2 < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || d2 > 5.0d || i2 != 4)) {
                        return new C2436lr.ik(0.0f, 0.0f);
                    }
                    C2436lr.ik ikVarM8417ri2 = m8417ri("str", str3);
                    ikVarM8417ri2.f6575ri = fOptDouble2 * 5.0f;
                    return ikVarM8417ri2;
                }
                if ("icon".equals(str2)) {
                    ikVar.f6575ri = fOptDouble2;
                    ikVar.f6574lr = fOptDouble2;
                    return ikVar;
                }
                if (z) {
                    int i7 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2 && i7 >= i6) {
                        i7 = i6;
                    }
                    f = (float) (((double) (fOptDouble4 * fOptDouble2 * i7)) * 1.2d);
                } else {
                    f = (float) (((double) (fOptDouble4 * fOptDouble2)) * 1.2d);
                    if (f3 <= fOptDouble5) {
                        f2 = f3;
                    }
                    if ("title".equals(str2) || (C2490ka.m8810lr() && "open_ad".equals(strM8884ka) && "source".equals(str2))) {
                        try {
                            ikVarM8419ri = m8419ri(strOptString.replace('\n', ' '), str3, false);
                            if (z) {
                                i5 = ((int) (f3 / fOptDouble5)) + 1;
                                if (z2 || i5 < i6) {
                                    i6 = i5;
                                }
                                ikVarM8419ri.f6574lr *= i6;
                            }
                            return ikVarM8419ri;
                        } catch (Exception unused5) {
                        }
                    }
                    ikVar.f6575ri = f2;
                    ikVar.f6574lr = f;
                }
                f2 = fOptDouble5;
                if ("title".equals(str2)) {
                    ikVarM8419ri = m8419ri(strOptString.replace('\n', ' '), str3, false);
                    if (z) {
                        i5 = ((int) (f3 / fOptDouble5)) + 1;
                        if (z2) {
                            i6 = i5;
                        } else {
                            i6 = i5;
                        }
                        ikVarM8419ri.f6574lr *= i6;
                    }
                    return ikVarM8419ri;
                }
                ikVarM8419ri = m8419ri(strOptString.replace('\n', ' '), str3, false);
                if (z) {
                    i5 = ((int) (f3 / fOptDouble5)) + 1;
                    if (z2) {
                        i6 = i5;
                    } else {
                        i6 = i5;
                    }
                    ikVarM8419ri.f6574lr *= i6;
                }
                return ikVarM8419ri;
            } catch (JSONException unused6) {
            }
        } else {
            if (!C2490ka.m8810lr() && ((!TextUtils.isEmpty(strOptString) && strOptString.contains("adx:")) || m8414lr())) {
                return m8414lr() ? m8416ri(ikVar, strOptString, str3, f6584lr) : m8416ri(ikVar, strOptString, str3, "");
            }
            ikVar.f6575ri = "union".equals(strOptString) ? 14.0f : 20.0f;
            ikVar.f6574lr = 10.0f;
            if (C2490ka.m8810lr()) {
                String strIgq = c2500aw.igq();
                if ("union".equals(strOptString) && TextUtils.isEmpty(strIgq)) {
                    ikVar.f6575ri = 0.0f;
                }
                String str5 = str2 + strOptString;
                float fM8413lr2 = (float) m8413lr(str3);
                if (str5.contains("logoad")) {
                    String strM8894zf = c2500aw.m8894zf();
                    if (!TextUtils.isEmpty(strM8894zf)) {
                        return m8417ri(strM8894zf, str3);
                    }
                    ikVar.f6575ri = 0.0f;
                }
                ikVar.f6574lr = fM8413lr2;
                return ikVar;
            }
        }
        return ikVar;
    }

    /* JADX INFO: renamed from: ri */
    public static C2436lr.ik m8419ri(String str, String str2, boolean z) {
        C2436lr.ik ikVar = new C2436lr.ik();
        try {
            JSONObject jSONObject = new JSONObject(str2);
            int[] iArrM8422ri = m8422ri(str, (float) m8413lr(str2), z);
            ikVar.f6575ri = iArrM8422ri[0];
            ikVar.f6574lr = iArrM8422ri[1];
            if (jSONObject.optDouble("lineHeight", 1.0d) == FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                ikVar.f6574lr = 0.0f;
            }
        } catch (Exception unused) {
        }
        return ikVar;
    }

    /* JADX INFO: renamed from: ri */
    public static String m8420ri() {
        return f6584lr;
    }

    /* JADX INFO: renamed from: ri */
    public static String m8421ri(String str) {
        String[] strArrSplit;
        return (TextUtils.isEmpty(str) || (strArrSplit = str.split("adx:")) == null || strArrSplit.length < 2) ? "" : strArrSplit[1];
    }

    /* JADX INFO: renamed from: ri */
    public static int[] m8422ri(String str, float f, boolean z) {
        int[] iArrM8415lr = m8415lr(str, f, z);
        return new int[]{xha.m8832lr(C2490ka.m8811ri(), iArrM8415lr[0]), xha.m8832lr(C2490ka.m8811ri(), iArrM8415lr[1])};
    }
}
