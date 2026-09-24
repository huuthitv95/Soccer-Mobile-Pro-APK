package com.mbridge.msdk.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.facebook.appevents.UserDataStore;
import com.facebook.share.internal.ShareConstants;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.gadsme.nativeplugin.BuildConfig;
import com.ironsource.C11744X3;
import com.ironsource.C11794a2;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.utils.C12704a;
import com.mbridge.msdk.foundation.buffer.sharedperference.C12998a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.controller.C13009d;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.mbridge.msdk.foundation.entity.C13067a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13182a1;
import com.mbridge.msdk.foundation.tools.C13190d0;
import com.mbridge.msdk.foundation.tools.C13198g;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13207k0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.FastKV;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.setting.b */
/* JADX INFO: compiled from: BaseSetting.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13630b {

    /* JADX INFO: renamed from: h1 */
    public static int f37921h1 = 1500;

    /* JADX INFO: renamed from: E0 */
    private boolean f37931E0;

    /* JADX INFO: renamed from: F */
    private long f37932F;

    /* JADX INFO: renamed from: G0 */
    private JSONArray f37935G0;

    /* JADX INFO: renamed from: H */
    private ArrayList<Integer> f37936H;

    /* JADX INFO: renamed from: H0 */
    private JSONObject f37937H0;

    /* JADX INFO: renamed from: I */
    private C13632d f37938I;

    /* JADX INFO: renamed from: J */
    private b f37940J;

    /* JADX INFO: renamed from: J0 */
    private long f37941J0;

    /* JADX INFO: renamed from: O */
    private HashMap<String, String> f37950O;

    /* JADX INFO: renamed from: O0 */
    private long f37951O0;

    /* JADX INFO: renamed from: P */
    private String f37952P;

    /* JADX INFO: renamed from: P0 */
    private boolean f37953P0;

    /* JADX INFO: renamed from: U */
    private int f37962U;

    /* JADX INFO: renamed from: V0 */
    private String f37965V0;

    /* JADX INFO: renamed from: X */
    private String f37968X;

    /* JADX INFO: renamed from: Y */
    private Map<String, String> f37970Y;

    /* JADX INFO: renamed from: b1 */
    private int f37979b1;

    /* JADX INFO: renamed from: c1 */
    private int f37982c1;

    /* JADX INFO: renamed from: d1 */
    private int f37985d1;

    /* JADX INFO: renamed from: e1 */
    private String f37988e1;

    /* JADX INFO: renamed from: f1 */
    private int f37991f1;

    /* JADX INFO: renamed from: g1 */
    private String f37994g1;

    /* JADX INFO: renamed from: h0 */
    private int f37996h0;

    /* JADX INFO: renamed from: k0 */
    private String f38002k0;

    /* JADX INFO: renamed from: l */
    private int f38003l;

    /* JADX INFO: renamed from: l0 */
    private String f38004l0;

    /* JADX INFO: renamed from: n */
    private List<C13067a> f38007n;

    /* JADX INFO: renamed from: o0 */
    private int f38010o0;

    /* JADX INFO: renamed from: p */
    private long f38011p;

    /* JADX INFO: renamed from: p0 */
    private int f38012p0;

    /* JADX INFO: renamed from: q */
    private C13629a f38013q;

    /* JADX INFO: renamed from: q0 */
    private int f38014q0;

    /* JADX INFO: renamed from: r */
    private String f38015r;

    /* JADX INFO: renamed from: r0 */
    private int f38016r0;

    /* JADX INFO: renamed from: s */
    private Map<String, a> f38017s;

    /* JADX INFO: renamed from: s0 */
    private int f38018s0;

    /* JADX INFO: renamed from: t */
    private boolean f38019t;

    /* JADX INFO: renamed from: u */
    private int f38021u;

    /* JADX INFO: renamed from: v0 */
    private long f38024v0;

    /* JADX INFO: renamed from: w0 */
    private long f38026w0;

    /* JADX INFO: renamed from: a */
    private boolean f37974a = false;

    /* JADX INFO: renamed from: b */
    private JSONArray f37977b = new JSONArray();

    /* JADX INFO: renamed from: c */
    private JSONArray f37980c = new JSONArray();

    /* JADX INFO: renamed from: d */
    private String f37983d = "";

    /* JADX INFO: renamed from: e */
    private int f37986e = 0;

    /* JADX INFO: renamed from: f */
    private int f37989f = 0;

    /* JADX INFO: renamed from: g */
    private int f37992g = 2;

    /* JADX INFO: renamed from: h */
    private int f37995h = 0;

    /* JADX INFO: renamed from: i */
    private String f37997i = "";

    /* JADX INFO: renamed from: j */
    private String f37999j = "";

    /* JADX INFO: renamed from: k */
    private String f38001k = "";

    /* JADX INFO: renamed from: m */
    private int f38005m = 0;

    /* JADX INFO: renamed from: o */
    private int f38009o = 0;

    /* JADX INFO: renamed from: v */
    private int f38023v = 1;

    /* JADX INFO: renamed from: w */
    private boolean f38025w = false;

    /* JADX INFO: renamed from: x */
    private String f38027x = "";

    /* JADX INFO: renamed from: y */
    private String f38029y = "";

    /* JADX INFO: renamed from: z */
    private String f38031z = "";

    /* JADX INFO: renamed from: A */
    private String f37922A = "";

    /* JADX INFO: renamed from: B */
    private String f37924B = "";

    /* JADX INFO: renamed from: C */
    private int f37926C = 120;

    /* JADX INFO: renamed from: D */
    private String f37928D = C13121d.m37226h().f36032i;

    /* JADX INFO: renamed from: E */
    private String f37930E = C13121d.m37226h().f36036m;

    /* JADX INFO: renamed from: G */
    private int f37934G = f37921h1;

    /* JADX INFO: renamed from: K */
    private int f37942K = 0;

    /* JADX INFO: renamed from: L */
    private long f37944L = 86400;

    /* JADX INFO: renamed from: M */
    private int f37946M = 0;

    /* JADX INFO: renamed from: N */
    private int f37948N = 3;

    /* JADX INFO: renamed from: Q */
    private boolean f37954Q = true;

    /* JADX INFO: renamed from: R */
    private int f37956R = 0;

    /* JADX INFO: renamed from: S */
    private boolean f37958S = false;

    /* JADX INFO: renamed from: T */
    private boolean f37960T = false;

    /* JADX INFO: renamed from: V */
    private int f37964V = 0;

    /* JADX INFO: renamed from: W */
    private int f37966W = 0;

    /* JADX INFO: renamed from: Z */
    private String f37972Z = BuildConfig.VERSION_NAME;

    /* JADX INFO: renamed from: a0 */
    private int f37975a0 = 30;

    /* JADX INFO: renamed from: b0 */
    private int f37978b0 = 9377;

    /* JADX INFO: renamed from: c0 */
    private int f37981c0 = 0;

    /* JADX INFO: renamed from: d0 */
    private int f37984d0 = 5;

    /* JADX INFO: renamed from: e0 */
    private int f37987e0 = 1;

    /* JADX INFO: renamed from: f0 */
    private int f37990f0 = 8000;

    /* JADX INFO: renamed from: g0 */
    private String f37993g0 = "";

    /* JADX INFO: renamed from: i0 */
    private int f37998i0 = 10;

    /* JADX INFO: renamed from: j0 */
    private int f38000j0 = 120;

    /* JADX INFO: renamed from: m0 */
    private String f38006m0 = "";

    /* JADX INFO: renamed from: n0 */
    private String f38008n0 = "";

    /* JADX INFO: renamed from: t0 */
    private String f38020t0 = "";

    /* JADX INFO: renamed from: u0 */
    private String f38022u0 = "";

    /* JADX INFO: renamed from: x0 */
    private List<Integer> f38028x0 = new ArrayList();

    /* JADX INFO: renamed from: y0 */
    private int f38030y0 = 3;

    /* JADX INFO: renamed from: z0 */
    private int f38032z0 = 0;

    /* JADX INFO: renamed from: A0 */
    private int f37923A0 = 3;

    /* JADX INFO: renamed from: B0 */
    private int f37925B0 = 0;

    /* JADX INFO: renamed from: C0 */
    private int f37927C0 = 10;

    /* JADX INFO: renamed from: D0 */
    private int f37929D0 = 600;

    /* JADX INFO: renamed from: F0 */
    private int f37933F0 = 0;

    /* JADX INFO: renamed from: I0 */
    private String f37939I0 = "";

    /* JADX INFO: renamed from: K0 */
    private int f37943K0 = 8000;

    /* JADX INFO: renamed from: L0 */
    private int f37945L0 = 1;

    /* JADX INFO: renamed from: M0 */
    private long f37947M0 = 10;

    /* JADX INFO: renamed from: N0 */
    private int f37949N0 = 3;

    /* JADX INFO: renamed from: Q0 */
    private int f37955Q0 = 1;

    /* JADX INFO: renamed from: R0 */
    private int f37957R0 = 1;

    /* JADX INFO: renamed from: S0 */
    private int f37959S0 = 1;

    /* JADX INFO: renamed from: T0 */
    private int f37961T0 = 1;

    /* JADX INFO: renamed from: U0 */
    private String f37963U0 = "";

    /* JADX INFO: renamed from: W0 */
    private int f37967W0 = 1300;

    /* JADX INFO: renamed from: X0 */
    private int f37969X0 = 0;

    /* JADX INFO: renamed from: Y0 */
    private int f37971Y0 = 0;

    /* JADX INFO: renamed from: Z0 */
    private long f37973Z0 = 3600;

    /* JADX INFO: renamed from: a1 */
    private String f37976a1 = "";

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$a */
    /* JADX INFO: compiled from: BaseSetting.java */
    public static class a {

        /* JADX INFO: renamed from: a */
        private List<String> f38033a;

        /* JADX INFO: renamed from: b */
        private List<String> f38034b;

        /* JADX INFO: renamed from: c */
        private List<String> f38035c;

        /* JADX INFO: renamed from: d */
        private List<String> f38036d;

        /* JADX INFO: renamed from: a */
        public List<String> m39591a() {
            return this.f38033a;
        }

        /* JADX INFO: renamed from: a */
        public void m39592a(JSONObject jSONObject) {
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("x");
                if (jSONArrayOptJSONArray != null) {
                    this.f38035c = C13190d0.m37653a(jSONArrayOptJSONArray);
                }
                JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("y");
                if (jSONArrayOptJSONArray2 != null) {
                    this.f38036d = C13190d0.m37653a(jSONArrayOptJSONArray2);
                }
                JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("width");
                if (jSONArrayOptJSONArray3 != null) {
                    this.f38034b = C13190d0.m37653a(jSONArrayOptJSONArray3);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("height");
                if (jSONArrayOptJSONArray4 != null) {
                    this.f38033a = C13190d0.m37653a(jSONArrayOptJSONArray4);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }

        /* JADX INFO: renamed from: b */
        public List<String> m39593b() {
            return this.f38034b;
        }

        /* JADX INFO: renamed from: c */
        public List<String> m39594c() {
            return this.f38035c;
        }

        /* JADX INFO: renamed from: d */
        public List<String> m39595d() {
            return this.f38036d;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.setting.b$b */
    /* JADX INFO: compiled from: BaseSetting.java */
    public static class b {

        /* JADX INFO: renamed from: a */
        private String f38037a;

        /* JADX INFO: renamed from: b */
        private JSONArray f38038b;

        /* JADX INFO: renamed from: c */
        private String f38039c;

        /* JADX INFO: renamed from: d */
        private String f38040d;

        /* JADX INFO: renamed from: e */
        private String f38041e;

        /* JADX INFO: renamed from: f */
        private String f38042f;

        /* JADX INFO: renamed from: a */
        public static b m39596a(JSONObject jSONObject) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            b bVar = new b();
            Context contextM36542d = C13008c.m36588n().m36542d();
            bVar.f38042f = jSONObject.optString("title", contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_title", TypedValues.Custom.S_STRING)));
            bVar.f38037a = jSONObject.optString("cancel", contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_close_close", TypedValues.Custom.S_STRING)));
            bVar.f38040d = jSONObject.optString("submit", contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_close_submit", TypedValues.Custom.S_STRING)));
            bVar.f38041e = jSONObject.optString("submit_notice", contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_submit_notice", TypedValues.Custom.S_STRING)));
            bVar.f38039c = jSONObject.optString(ShareConstants.WEB_DIALOG_PARAM_PRIVACY, contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_privacy_des", TypedValues.Custom.S_STRING)));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("content");
            bVar.f38038b = jSONArrayOptJSONArray;
            if (jSONArrayOptJSONArray == null) {
                JSONArray jSONArray = new JSONArray();
                bVar.f38038b = jSONArray;
                jSONArray.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_not_play", TypedValues.Custom.S_STRING)));
                bVar.f38038b.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_sound_problems", TypedValues.Custom.S_STRING)));
                bVar.f38038b.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_misleading", TypedValues.Custom.S_STRING)));
                bVar.f38038b.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_fraud", TypedValues.Custom.S_STRING)));
                bVar.f38038b.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_por_violence", TypedValues.Custom.S_STRING)));
                bVar.f38038b.put(contextM36542d.getString(C13203i0.m37707a(contextM36542d, "mbridge_cm_feedback_dialog_content_other", TypedValues.Custom.S_STRING)));
            }
            return bVar;
        }

        /* JADX INFO: renamed from: a */
        public String m39597a() {
            return this.f38037a;
        }

        /* JADX INFO: renamed from: b */
        public JSONArray m39598b() {
            return this.f38038b;
        }

        /* JADX INFO: renamed from: c */
        public String m39599c() {
            return this.f38039c;
        }

        /* JADX INFO: renamed from: d */
        public String m39600d() {
            return this.f38040d;
        }

        /* JADX INFO: renamed from: e */
        public String m39601e() {
            return this.f38041e;
        }

        /* JADX INFO: renamed from: f */
        public String m39602f() {
            return this.f38042f;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m39382a(Context context, String str) {
        try {
            C13635g c13635gM39718d = C13636h.m39706b().m39718d(C13008c.m36588n().m36533b());
            if (c13635gM39718d != null && c13635gM39718d.m39410H() != null) {
                String host = Uri.parse(str).getHost();
                Iterator<Map.Entry<String, String>> it = c13635gM39718d.m39410H().entrySet().iterator();
                while (it.hasNext()) {
                    String key = it.next().getKey();
                    if (!TextUtils.isEmpty(host) && host.contains(key)) {
                        String str2 = c13635gM39718d.m39410H().get(key);
                        return TextUtils.isEmpty(str2) ? "" : str2.replace("{gaid}", C13198g.m37689d());
                    }
                }
                return "";
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, a> m39383a(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            HashMap map = new HashMap();
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                a aVar = new a();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    aVar.m39592a(jSONObjectOptJSONObject);
                }
                map.put(next, aVar);
            }
            return map;
        } catch (JSONException e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
            return null;
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                e2.printStackTrace();
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m39384a(JSONObject jSONObject) {
        FastKV fastKVBuild = null;
        if (C13009d.m36589a().m36605e()) {
            try {
                fastKVBuild = new FastKV.Builder(C13098e.m37149b(EnumC13096c.MBRIDGE_700_CONFIG), C13207k0.m37712a("H+tU+FeXHM==")).build();
            } catch (Exception unused) {
            }
        }
        if (fastKVBuild != null) {
            try {
                Context contextM36542d = C13008c.m36588n().m36542d();
                if (jSONObject == null || contextM36542d == null) {
                    return;
                }
                String strOptString = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
                if (!TextUtils.isEmpty(strOptString) && !TextUtils.equals(C13088a.f35856V, strOptString)) {
                    C13088a.f35856V = strOptString;
                    C12998a.m36460b().m36464a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                    try {
                        fastKVBuild.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                    } catch (Exception unused2) {
                    }
                }
                String strOptString2 = jSONObject.optString("c");
                if (TextUtils.isEmpty(strOptString2) || TextUtils.equals(C13088a.f35865g, strOptString2)) {
                    return;
                }
                C13088a.f35865g = strOptString2;
                C12998a.m36460b().m36464a("c", C13088a.f35865g);
                try {
                    fastKVBuild.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                    return;
                } catch (Exception unused3) {
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
                return;
            }
        }
        try {
            Context contextM36542d2 = C13008c.m36588n().m36542d();
            if (jSONObject == null || contextM36542d2 == null) {
                return;
            }
            String strOptString3 = jSONObject.optString(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B);
            if (!TextUtils.isEmpty(strOptString3) && !TextUtils.equals(C13088a.f35856V, strOptString3)) {
                C13088a.f35856V = strOptString3;
                C12998a.m36460b().m36464a(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, C13088a.f35856V);
                SharedPreferences sharedPreferences = contextM36542d2.getSharedPreferences(C13207k0.m37712a("H+tU+FeXHM=="), 0);
                if (sharedPreferences != null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putString(C13207k0.m37712a("H+tU+bfPhM=="), C13088a.f35856V);
                    editorEdit.apply();
                }
            }
            String strOptString4 = jSONObject.optString("c");
            if (TextUtils.isEmpty(strOptString4) || TextUtils.equals(C13088a.f35865g, strOptString4)) {
                return;
            }
            C13088a.f35865g = strOptString4;
            C12998a.m36460b().m36464a("c", C13088a.f35865g);
            SharedPreferences sharedPreferences2 = contextM36542d2.getSharedPreferences(C13207k0.m37712a("H+tU+FeXHM=="), 0);
            if (sharedPreferences2 != null) {
                SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                editorEdit2.putString(C13207k0.m37712a("H+tU+Fz8"), C13088a.f35865g);
                editorEdit2.apply();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:114:0x04ae  */
    /* JADX WARN: Code duplicated, block: B:115:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:118:0x04b9  */
    /* JADX WARN: Code duplicated, block: B:119:0x04bb  */
    /* JADX WARN: Code duplicated, block: B:127:0x0509 A[Catch: Exception -> 0x0571, TryCatch #6 {Exception -> 0x0571, blocks: (B:125:0x04e7, B:127:0x0509, B:128:0x050b, B:130:0x0510, B:131:0x0512, B:133:0x0517, B:134:0x0519, B:136:0x051e, B:137:0x0520, B:140:0x052c), top: B:220:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:130:0x0510 A[Catch: Exception -> 0x0571, TryCatch #6 {Exception -> 0x0571, blocks: (B:125:0x04e7, B:127:0x0509, B:128:0x050b, B:130:0x0510, B:131:0x0512, B:133:0x0517, B:134:0x0519, B:136:0x051e, B:137:0x0520, B:140:0x052c), top: B:220:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:133:0x0517 A[Catch: Exception -> 0x0571, TryCatch #6 {Exception -> 0x0571, blocks: (B:125:0x04e7, B:127:0x0509, B:128:0x050b, B:130:0x0510, B:131:0x0512, B:133:0x0517, B:134:0x0519, B:136:0x051e, B:137:0x0520, B:140:0x052c), top: B:220:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x051e A[Catch: Exception -> 0x0571, TryCatch #6 {Exception -> 0x0571, blocks: (B:125:0x04e7, B:127:0x0509, B:128:0x050b, B:130:0x0510, B:131:0x0512, B:133:0x0517, B:134:0x0519, B:136:0x051e, B:137:0x0520, B:140:0x052c), top: B:220:0x04e7 }] */
    /* JADX WARN: Code duplicated, block: B:139:0x052b  */
    /* JADX WARN: Code duplicated, block: B:147:0x0596  */
    /* JADX WARN: Code duplicated, block: B:148:0x0598  */
    /* JADX WARN: Code duplicated, block: B:162:0x05ca  */
    /* JADX WARN: Code duplicated, block: B:163:0x05cc  */
    /* JADX WARN: Code duplicated, block: B:173:0x05e8 A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:176:0x05ff A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:179:0x0610 A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:182:0x061d A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:185:0x062a A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:188:0x0637 A[Catch: Exception -> 0x0640, TRY_LEAVE, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:216:0x0364 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:243:0x0345 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x02ad A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x02b3 A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x02d0 A[Catch: Exception -> 0x0640, LOOP:5: B:49:0x02ca->B:51:0x02d0, LOOP_END, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0307  */
    /* JADX WARN: Code duplicated, block: B:64:0x0338 A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x033e A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x034e A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x037c A[Catch: Exception -> 0x03b2, TryCatch #4 {Exception -> 0x03b2, blocks: (B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae), top: B:216:0x0364, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x03ae A[Catch: Exception -> 0x03b2, TRY_LEAVE, TryCatch #4 {Exception -> 0x03b2, blocks: (B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae), top: B:216:0x0364, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x03d1 A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x03df A[Catch: Exception -> 0x0640, TryCatch #7 {Exception -> 0x0640, blocks: (B:12:0x0080, B:17:0x00df, B:40:0x019a, B:41:0x019d, B:43:0x02ad, B:53:0x02e9, B:57:0x0308, B:59:0x0326, B:61:0x032c, B:62:0x0332, B:64:0x0338, B:66:0x033e, B:67:0x0345, B:68:0x0348, B:70:0x034e, B:71:0x0358, B:89:0x03bc, B:91:0x03c4, B:94:0x03cb, B:96:0x03d1, B:97:0x03d9, B:99:0x03df, B:101:0x03eb, B:103:0x03f1, B:111:0x0482, B:124:0x04d0, B:142:0x057a, B:153:0x05a1, B:171:0x05dc, B:173:0x05e8, B:174:0x05f3, B:176:0x05ff, B:177:0x060a, B:179:0x0610, B:180:0x0617, B:182:0x061d, B:183:0x0624, B:185:0x062a, B:186:0x0631, B:188:0x0637, B:170:0x05d9, B:166:0x05d1, B:159:0x05bf, B:152:0x059e, B:123:0x04c7, B:88:0x03b3, B:44:0x02b3, B:46:0x02be, B:48:0x02c4, B:49:0x02ca, B:51:0x02d0, B:52:0x02e6, B:16:0x00da, B:167:0x05d4, B:73:0x0364, B:74:0x0376, B:76:0x037c, B:78:0x0388, B:80:0x0392, B:82:0x03a0, B:83:0x03a8, B:85:0x03ae, B:160:0x05c2, B:164:0x05cd, B:112:0x049e, B:116:0x04b1, B:120:0x04bc), top: B:222:0x0080, inners: #1, #4, #5, #11 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: b */
    public static C13635g m39385b(JSONObject jSONObject) {
        C13635g c13635g;
        C13635g c13635g2;
        long jOptLong;
        int i;
        long jOptLong2;
        JSONArray jSONArrayOptJSONArray;
        HashMap map;
        int i2;
        int iOptInt;
        JSONArray jSONArrayOptJSONArray2;
        String strOptString;
        Iterator<String> itKeys;
        HashMap<String, String> map2;
        String next;
        JSONArray jSONArrayOptJSONArray3;
        String strOptString2;
        String strOptString3;
        boolean z;
        boolean z2;
        int iOptInt2;
        int iOptInt3;
        int iOptInt4;
        int iOptInt5;
        int iOptInt6;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        Iterator<String> itKeys2;
        String next2;
        ArrayList<Integer> arrayList;
        int i5;
        int iOptInt7;
        ArrayList arrayList2;
        if (jSONObject == null) {
            return null;
        }
        try {
            C13635g c13635g3 = new C13635g();
            try {
                c13635g3.m39484c(jSONObject);
                c13635g3.m39503f(jSONObject.optString("cc"));
                c13635g3.m39561s(jSONObject.optString("mv_wildcard", "<mvpackage>mbridge</mvpackage>"));
                c13635g3.m39524j(jSONObject.optInt("cfc"));
                c13635g3.m39481c(jSONObject.optLong("getpf"));
                c13635g3.m39471b(jSONObject.optLong("current_time"));
                c13635g3.m39475b(jSONObject.optBoolean("cfb"));
                c13635g3.m39458a(jSONObject.optLong("awct"));
                if (jSONObject.optLong(CampaignEx.JSON_KEY_PLCT) == 0) {
                    jOptLong = 3600;
                } else {
                    try {
                        jOptLong = jSONObject.optLong(CampaignEx.JSON_KEY_PLCT);
                    } catch (Exception e) {
                        e = e;
                        c13635g2 = c13635g3;
                        c13635g = c13635g2;
                        e.printStackTrace();
                        return c13635g;
                    }
                }
                c13635g2 = c13635g3;
                try {
                    c13635g2.m39496e(jOptLong);
                    c13635g2.m39510g(jSONObject.optBoolean("rurl"));
                    c13635g2.m39520i(jSONObject.optLong("uct"));
                    c13635g2.m39516h(jSONObject.optBoolean("ujds"));
                    c13635g2.m39414I(jSONObject.optInt("n2"));
                    c13635g2.m39417J(jSONObject.optInt("n3"));
                    c13635g2.m39560s(jSONObject.optInt("is_startup_crashsystem", 1));
                    c13635g2.m39411H(jSONObject.optInt("pcrn"));
                    c13635g2.m39408G(jSONObject.optInt("pcon", 0));
                    c13635g2.m39502f(jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB) == r15 ? 7200L : jSONObject.optLong(CampaignEx.JSON_KEY_PLCTB));
                    c13635g2.m39411H(jSONObject.optInt("pcrn", 100));
                    c13635g2.m39405F(jSONObject.optInt("opent", 1));
                    c13635g2.m39508g(jSONObject.optLong("sfct", 1800L));
                    c13635g2.m39453Y(jSONObject.optInt("upgd", 1));
                    c13635g2.m39455Z(jSONObject.optInt("upsrl", 1));
                    c13635g2.m39451X(jSONObject.optInt("updevid", 1));
                    c13635g2.m39441S(jSONObject.optInt("sc", 0));
                    c13635g2.m39449W(jSONObject.optInt("up_tips", 1));
                    int i6 = -1;
                    c13635g2.m39564t(jSONObject.optInt("iseu", -1));
                    c13635g2.m39549p(jSONObject.optString("jm_unit"));
                    try {
                        JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("atf");
                        if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                            i = -1;
                            arrayList2 = null;
                        } else {
                            arrayList2 = new ArrayList();
                            int i7 = 0;
                            while (i7 < jSONArrayOptJSONArray4.length()) {
                                String strOptString4 = jSONArrayOptJSONArray4.optString(i7);
                                if (C13182a1.m37597b(strOptString4)) {
                                    i = i6;
                                    try {
                                        JSONObject jSONObject2 = new JSONObject(strOptString4);
                                        arrayList2.add(new C13067a(jSONObject2.optInt("adtype"), jSONObject2.optString("unitid")));
                                    } catch (Exception e2) {
                                        e = e2;
                                        e.printStackTrace();
                                        c13635g2.m39507g(jSONObject.optInt("adct", 259200));
                                        c13635g2.m39529k(jSONObject.optString("confirm_title", ""));
                                        c13635g2.m39521i(jSONObject.optString("confirm_description", ""));
                                        c13635g2.m39525j(jSONObject.optString("confirm_t", ""));
                                        c13635g2.m39515h(jSONObject.optString("confirm_c_rv", ""));
                                        c13635g2.m39509g(jSONObject.optString("confirm_c_play", ""));
                                        c13635g2.m39482c(jSONObject.optString("adchoice_icon", ""));
                                        c13635g2.m39491d(jSONObject.optString("adchoice_link", ""));
                                        c13635g2.m39497e(jSONObject.optString("adchoice_size", ""));
                                        c13635g2.m39577w(jSONObject.optString("platform_logo", ""));
                                        c13635g2.m39581x(jSONObject.optString("platform_name", ""));
                                        c13635g2.m39465a(m39383a(jSONObject.optString("cdnate_cfg", "")));
                                        c13635g2.m39519i(jSONObject.optInt("atrqt", 0));
                                        c13635g2.m39568u(jSONObject.optInt("iupdid", 0));
                                        c13635g2.m39399D(jSONObject.optInt("mcs", 120));
                                        c13635g2.m39472b(jSONObject.optString("ab_id", ""));
                                        c13635g2.m39589z(jSONObject.optString("rid", ""));
                                        c13635g2.m39553q(jSONObject.optString("log_rate", C11794a2.f26725f));
                                        c13635g2.m39573v(jSONObject.optString("omsdkjs_url", ""));
                                        c13635g2.m39569u(jSONObject.optString("omsdkjs_h5_url", ""));
                                        c13635g2.m39429N(jSONObject.optInt("rty_tk_clk", 0));
                                        c13635g2.m39435P(jSONObject.optInt("rty_tk_imp", 0));
                                        c13635g2.m39432O(jSONObject.optInt("rty_cnt", 3));
                                        c13635g2.m39439R(jSONObject.optInt("rty_to", 600));
                                        c13635g2.m39437Q(jSONObject.optInt("rty_inr", 10));
                                        c13635g2.m39541n(jSONObject.optString("dns"));
                                        c13635g2.m39573v(jSONObject.optString("omsdkjs_url", ""));
                                        c13635g2.m39569u(jSONObject.optString("omsdkjs_h5_url", ""));
                                        jOptLong2 = jSONObject.optLong("tcto");
                                        if (jOptLong2 == 0) {
                                            c13635g2.m39514h(10L);
                                        } else {
                                            c13635g2.m39514h(jOptLong2);
                                            jSONArrayOptJSONArray = jSONObject.optJSONArray("jt");
                                            if (jSONArrayOptJSONArray != null) {
                                                map = new HashMap();
                                                for (i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                                    JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i2);
                                                    map.put(jSONObjectOptJSONObject.optString(C11744X3.j.f26410D), jSONObjectOptJSONObject.optString("format"));
                                                }
                                                c13635g2.m39473b(map);
                                            }
                                        }
                                        c13635g2.m39557r(jSONObject.optString("mraid_js"));
                                        c13635g2.m39396C(jSONObject.optString("web_env_url"));
                                        iOptInt = jSONObject.optInt("alrbs", 0);
                                        if (iOptInt <= 2) {
                                            iOptInt = 0;
                                        } else {
                                            iOptInt = 0;
                                        }
                                        c13635g2.m39513h(iOptInt);
                                        c13635g2.m39498e(jSONObject.optBoolean("GDPR_area", false));
                                        c13635g2.m39536m(jSONObject.optInt(UserDataStore.CITY, 120));
                                        jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ercd");
                                        if (jSONArrayOptJSONArray2 != null) {
                                            arrayList = new ArrayList<>();
                                            for (i5 = 0; i5 < jSONArrayOptJSONArray2.length(); i5++) {
                                                iOptInt7 = jSONArrayOptJSONArray2.optInt(i5);
                                                if (iOptInt7 != 0) {
                                                    arrayList.add(Integer.valueOf(iOptInt7));
                                                }
                                            }
                                            if (arrayList.size() > 0) {
                                                arrayList.add(Integer.valueOf(i));
                                                c13635g2.m39462a(arrayList);
                                            }
                                        }
                                        strOptString = jSONObject.optString("hst");
                                        if (!TextUtils.isEmpty(strOptString)) {
                                            try {
                                                JSONObject jSONObject3 = new JSONObject(C13207k0.m37712a(strOptString));
                                                itKeys = jSONObject3.keys();
                                                map2 = new HashMap<>();
                                                while (itKeys.hasNext()) {
                                                    next = itKeys.next();
                                                    if (TextUtils.isEmpty(next)) {
                                                    }
                                                }
                                                if (map2.size() > 0) {
                                                    c13635g2.m39463a(map2);
                                                }
                                            } catch (Exception e3) {
                                                C13219q0.m37816b("SETTING", e3.getMessage());
                                            }
                                        }
                                        jSONArrayOptJSONArray3 = jSONObject.optJSONArray("refactor_switch");
                                        if (jSONArrayOptJSONArray3 != null) {
                                            for (i4 = 0; i4 < jSONArrayOptJSONArray3.length(); i4++) {
                                                JSONObject jSONObject4 = jSONArrayOptJSONArray3.getJSONObject(i4);
                                                itKeys2 = jSONObject4.keys();
                                                while (itKeys2.hasNext()) {
                                                    next2 = itKeys2.next();
                                                    if (TextUtils.isEmpty(next2)) {
                                                    }
                                                }
                                            }
                                        }
                                        int iOptInt8 = jSONObject.optInt("lqcnt", 30);
                                        int iOptInt9 = jSONObject.optInt("lqto", 5);
                                        int iOptInt10 = jSONObject.optInt("lqswt", 0);
                                        int iOptInt11 = jSONObject.optInt("lqtype", 1);
                                        c13635g2.m39584y(iOptInt9);
                                        c13635g2.m39572v(iOptInt8);
                                        c13635g2.m39580x(iOptInt10);
                                        c13635g2.m39588z(iOptInt11);
                                        c13635g2.m39466a(jSONObject.optJSONArray("lg_bl"));
                                        c13635g2.m39474b(jSONObject.optJSONArray("lg_wl"));
                                        c13635g2.m39478b0(jSONObject.optInt("lg_wl_rt"));
                                        c13635g2.m39443T(jSONObject.optInt("srml", 8000));
                                        c13635g2.m39387A(jSONObject.optInt("lrml", 8000));
                                        c13635g2.m39469a0(jSONObject.optInt("wgl_d_ms", 1300));
                                        c13635g2.m39540n(jSONObject.optInt("dp_ct", f37921h1));
                                        i3 = Integer.parseInt(C13207k0.m37712a(jSONObject.optString("lqpt")));
                                        if (i3 > 0) {
                                            c13635g2.m39576w(i3);
                                        }
                                        c13635g2.m39487c0(jSONObject.optInt("wvddt", 0));
                                        c13635g2.m39533l(jSONObject.optString("hst_st", ""));
                                        c13635g2.m39537m(jSONObject.optString("hst_st_t", ""));
                                        int iOptInt12 = jSONObject.optInt(CmcdData.Factory.STREAM_TYPE_LIVE, 3);
                                        if (jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (jSONObject.optInt(InneractiveMediationDefs.GENDER_MALE, 1) == 1) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        c13635g2.m39426M(iOptInt12);
                                        c13635g2.m39504f(z3);
                                        c13635g2.m39467a(z4);
                                        c13635g2.m39544o(jSONObject.optInt("fbk_swt", 0));
                                        c13635g2.m39460a(b.m39596a(jSONObject.optJSONObject("fbk")));
                                        iOptInt2 = jSONObject.optInt("ad_connection_timeout", C13088a.f35873o);
                                        iOptInt3 = jSONObject.optInt("ad_read_timeout", C13088a.f35875q);
                                        iOptInt4 = jSONObject.optInt("ad_write_timeout", C13088a.f35877s);
                                        iOptInt5 = jSONObject.optInt("ad_retry_count", C13088a.f35876r);
                                        if (iOptInt2 <= 0) {
                                            iOptInt2 = C13088a.f35873o;
                                        }
                                        c13635g2.m39480c(iOptInt2);
                                        if (iOptInt3 <= 0) {
                                            iOptInt3 = C13088a.f35875q;
                                        }
                                        c13635g2.m39489d(iOptInt3);
                                        if (iOptInt4 <= 0) {
                                            iOptInt4 = C13088a.f35877s;
                                        }
                                        c13635g2.m39501f(iOptInt4);
                                        if (iOptInt5 < 0) {
                                            iOptInt5 = C13088a.f35876r;
                                        }
                                        c13635g2.m39495e(iOptInt5);
                                        iOptInt6 = jSONObject.optInt("max_download_task_size", 10);
                                        if (iOptInt6 <= 0) {
                                            iOptInt6 = 10;
                                        }
                                        c13635g2.m39395C(iOptInt6);
                                        c13635g2.m39391B(jSONObject.optInt("max_bitmap_cache_size", 10));
                                        c13635g2.m39447V(jSONObject.optInt("t_t", 3));
                                        c13635g2.m39552q(jSONObject.optInt("h_t", 3));
                                        c13635g2.m39548p(jSONObject.optInt("gtp"));
                                        c13635g2.m39490d(jSONObject.optLong("i_i_t", 3600L));
                                        c13635g2.m39565t(jSONObject.optString(AbstractC13068b.JSON_KEY_C_I, ""));
                                        c13635g2.m39402E(jSONObject.optInt("n_c_u_p", 0));
                                        c13635g2.m39545o(jSONObject.optString("http_track_url", ""));
                                        c13635g2.m39445U(jSONObject.optInt("st_net", 1));
                                        c13635g2.m39392B(jSONObject.optString("vtag", ""));
                                        if (jSONObject.optInt("check_webview", 0) == 0) {
                                            z2 = false;
                                        } else {
                                            z2 = true;
                                        }
                                        c13635g2.m39485c(z2);
                                        c13635g2.m39388A(jSONObject.optString("swxid"));
                                        c13635g2.m39483c(jSONObject.optJSONArray("sdk_filters"));
                                        c13635g2.m39528k(jSONObject.optInt("ch_nv_im_cb", 1));
                                        if (jSONObject.optInt("do_us_fi_re", 1) != 0) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        c13635g2.m39492d(z);
                                        m39384a(jSONObject);
                                        strOptString2 = jSONObject.optString("bcp");
                                        if (!TextUtils.isEmpty(strOptString2)) {
                                            c13635g2.m39459a(C13629a.m39365a(C13207k0.m37712a(strOptString2)));
                                        }
                                        strOptString3 = jSONObject.optString("monitor");
                                        if (!TextUtils.isEmpty(strOptString3)) {
                                            c13635g2.m39461a(C13632d.m39682a(C13207k0.m37712a(strOptString3)));
                                        }
                                        if (jSONObject.has("new_pipeline_id")) {
                                            c13635g2.m39420K(jSONObject.optInt("new_pipeline_id"));
                                        }
                                        if (jSONObject.has("p_p_c_id")) {
                                            c13635g2.m39423L(jSONObject.optInt("p_p_c_id"));
                                        }
                                        if (jSONObject.has("p_p_c")) {
                                            c13635g2.m39585y(jSONObject.optString("p_p_c"));
                                        }
                                        if (jSONObject.has("c_m_l_id")) {
                                            c13635g2.m39532l(jSONObject.optInt("c_m_l_id"));
                                        }
                                        return c13635g2;
                                    }
                                } else {
                                    i = i6;
                                }
                                i7++;
                                i6 = i;
                            }
                            i = i6;
                        }
                        if (arrayList2 != null) {
                            c13635g2.m39464a((List<C13067a>) arrayList2);
                        }
                    } catch (Exception e4) {
                        e = e4;
                        i = i6;
                    }
                    c13635g2.m39507g(jSONObject.optInt("adct", 259200));
                    c13635g2.m39529k(jSONObject.optString("confirm_title", ""));
                    c13635g2.m39521i(jSONObject.optString("confirm_description", ""));
                    c13635g2.m39525j(jSONObject.optString("confirm_t", ""));
                    c13635g2.m39515h(jSONObject.optString("confirm_c_rv", ""));
                    c13635g2.m39509g(jSONObject.optString("confirm_c_play", ""));
                    c13635g2.m39482c(jSONObject.optString("adchoice_icon", ""));
                    c13635g2.m39491d(jSONObject.optString("adchoice_link", ""));
                    c13635g2.m39497e(jSONObject.optString("adchoice_size", ""));
                    c13635g2.m39577w(jSONObject.optString("platform_logo", ""));
                    c13635g2.m39581x(jSONObject.optString("platform_name", ""));
                    c13635g2.m39465a(m39383a(jSONObject.optString("cdnate_cfg", "")));
                    c13635g2.m39519i(jSONObject.optInt("atrqt", 0));
                    c13635g2.m39568u(jSONObject.optInt("iupdid", 0));
                    c13635g2.m39399D(jSONObject.optInt("mcs", 120));
                    c13635g2.m39472b(jSONObject.optString("ab_id", ""));
                    c13635g2.m39589z(jSONObject.optString("rid", ""));
                    c13635g2.m39553q(jSONObject.optString("log_rate", C11794a2.f26725f));
                    c13635g2.m39573v(jSONObject.optString("omsdkjs_url", ""));
                    c13635g2.m39569u(jSONObject.optString("omsdkjs_h5_url", ""));
                    c13635g2.m39429N(jSONObject.optInt("rty_tk_clk", 0));
                    c13635g2.m39435P(jSONObject.optInt("rty_tk_imp", 0));
                    c13635g2.m39432O(jSONObject.optInt("rty_cnt", 3));
                    c13635g2.m39439R(jSONObject.optInt("rty_to", 600));
                    c13635g2.m39437Q(jSONObject.optInt("rty_inr", 10));
                    c13635g2.m39541n(jSONObject.optString("dns"));
                    c13635g2.m39573v(jSONObject.optString("omsdkjs_url", ""));
                    c13635g2.m39569u(jSONObject.optString("omsdkjs_h5_url", ""));
                    jOptLong2 = jSONObject.optLong("tcto");
                    if (jOptLong2 == 0) {
                        c13635g2.m39514h(10L);
                    } else {
                        c13635g2.m39514h(jOptLong2);
                        jSONArrayOptJSONArray = jSONObject.optJSONArray("jt");
                        if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                            map = new HashMap();
                            while (i2 < jSONArrayOptJSONArray.length()) {
                                JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray.optJSONObject(i2);
                                map.put(jSONObjectOptJSONObject2.optString(C11744X3.j.f26410D), jSONObjectOptJSONObject2.optString("format"));
                            }
                            c13635g2.m39473b(map);
                        }
                    }
                    c13635g2.m39557r(jSONObject.optString("mraid_js"));
                    c13635g2.m39396C(jSONObject.optString("web_env_url"));
                    iOptInt = jSONObject.optInt("alrbs", 0);
                    if (iOptInt <= 2 || iOptInt < 0) {
                        iOptInt = 0;
                    }
                    c13635g2.m39513h(iOptInt);
                    c13635g2.m39498e(jSONObject.optBoolean("GDPR_area", false));
                    c13635g2.m39536m(jSONObject.optInt(UserDataStore.CITY, 120));
                    jSONArrayOptJSONArray2 = jSONObject.optJSONArray("ercd");
                    if (jSONArrayOptJSONArray2 != null && jSONArrayOptJSONArray2.length() > 0) {
                        arrayList = new ArrayList<>();
                        while (i5 < jSONArrayOptJSONArray2.length()) {
                            iOptInt7 = jSONArrayOptJSONArray2.optInt(i5);
                            if (iOptInt7 != 0) {
                                arrayList.add(Integer.valueOf(iOptInt7));
                            }
                        }
                        if (arrayList.size() > 0) {
                            arrayList.add(Integer.valueOf(i));
                            c13635g2.m39462a(arrayList);
                        }
                    }
                    strOptString = jSONObject.optString("hst");
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject5 = new JSONObject(C13207k0.m37712a(strOptString));
                        itKeys = jSONObject5.keys();
                        map2 = new HashMap<>();
                        while (itKeys.hasNext()) {
                            next = itKeys.next();
                            if (TextUtils.isEmpty(next) && !TextUtils.isEmpty(jSONObject5.optString(next)) && !TextUtils.isEmpty(C13207k0.m37712a(jSONObject5.optString(next)))) {
                                map2.put(next, jSONObject5.optString(next));
                            }
                        }
                        if (map2.size() > 0) {
                            c13635g2.m39463a(map2);
                        }
                    }
                    jSONArrayOptJSONArray3 = jSONObject.optJSONArray("refactor_switch");
                    if (jSONArrayOptJSONArray3 != null && jSONArrayOptJSONArray3.length() > 0) {
                        while (i4 < jSONArrayOptJSONArray3.length()) {
                            JSONObject jSONObject6 = jSONArrayOptJSONArray3.getJSONObject(i4);
                            itKeys2 = jSONObject6.keys();
                            while (itKeys2.hasNext()) {
                                next2 = itKeys2.next();
                                if (TextUtils.isEmpty(next2) && jSONObject6.getBoolean(next2)) {
                                    c13635g2.m39457a(Integer.parseInt(next2));
                                }
                            }
                        }
                    }
                    try {
                        int iOptInt13 = jSONObject.optInt("lqcnt", 30);
                        int iOptInt14 = jSONObject.optInt("lqto", 5);
                        int iOptInt15 = jSONObject.optInt("lqswt", 0);
                        int iOptInt16 = jSONObject.optInt("lqtype", 1);
                        c13635g2.m39584y(iOptInt14);
                        c13635g2.m39572v(iOptInt13);
                        c13635g2.m39580x(iOptInt15);
                        c13635g2.m39588z(iOptInt16);
                        c13635g2.m39466a(jSONObject.optJSONArray("lg_bl"));
                        c13635g2.m39474b(jSONObject.optJSONArray("lg_wl"));
                        c13635g2.m39478b0(jSONObject.optInt("lg_wl_rt"));
                        c13635g2.m39443T(jSONObject.optInt("srml", 8000));
                        c13635g2.m39387A(jSONObject.optInt("lrml", 8000));
                        c13635g2.m39469a0(jSONObject.optInt("wgl_d_ms", 1300));
                        c13635g2.m39540n(jSONObject.optInt("dp_ct", f37921h1));
                        i3 = Integer.parseInt(C13207k0.m37712a(jSONObject.optString("lqpt")));
                        if (i3 > 0 && i3 < 65535) {
                            c13635g2.m39576w(i3);
                        }
                    } catch (Exception unused) {
                    }
                    c13635g2.m39487c0(jSONObject.optInt("wvddt", 0));
                    c13635g2.m39533l(jSONObject.optString("hst_st", ""));
                    c13635g2.m39537m(jSONObject.optString("hst_st_t", ""));
                    try {
                        int iOptInt17 = jSONObject.optInt(CmcdData.Factory.STREAM_TYPE_LIVE, 3);
                        if (jSONObject.optInt(CampaignEx.JSON_KEY_AD_K, 0) == 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (jSONObject.optInt(InneractiveMediationDefs.GENDER_MALE, 1) == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        c13635g2.m39426M(iOptInt17);
                        c13635g2.m39504f(z3);
                        c13635g2.m39467a(z4);
                    } catch (Exception e5) {
                        C13219q0.m37816b("Setting", e5.getMessage());
                    }
                    c13635g2.m39544o(jSONObject.optInt("fbk_swt", 0));
                    c13635g2.m39460a(b.m39596a(jSONObject.optJSONObject("fbk")));
                    try {
                        iOptInt2 = jSONObject.optInt("ad_connection_timeout", C13088a.f35873o);
                        iOptInt3 = jSONObject.optInt("ad_read_timeout", C13088a.f35875q);
                        iOptInt4 = jSONObject.optInt("ad_write_timeout", C13088a.f35877s);
                        iOptInt5 = jSONObject.optInt("ad_retry_count", C13088a.f35876r);
                        if (iOptInt2 <= 0) {
                            iOptInt2 = C13088a.f35873o;
                        }
                        c13635g2.m39480c(iOptInt2);
                        if (iOptInt3 <= 0) {
                            iOptInt3 = C13088a.f35875q;
                        }
                        c13635g2.m39489d(iOptInt3);
                        if (iOptInt4 <= 0) {
                            iOptInt4 = C13088a.f35877s;
                        }
                        c13635g2.m39501f(iOptInt4);
                        if (iOptInt5 < 0) {
                            iOptInt5 = C13088a.f35876r;
                        }
                        c13635g2.m39495e(iOptInt5);
                        iOptInt6 = jSONObject.optInt("max_download_task_size", 10);
                        if (iOptInt6 <= 0) {
                            iOptInt6 = 10;
                        }
                        c13635g2.m39395C(iOptInt6);
                        c13635g2.m39391B(jSONObject.optInt("max_bitmap_cache_size", 10));
                        c13635g2.m39447V(jSONObject.optInt("t_t", 3));
                        c13635g2.m39552q(jSONObject.optInt("h_t", 3));
                        c13635g2.m39548p(jSONObject.optInt("gtp"));
                        c13635g2.m39490d(jSONObject.optLong("i_i_t", 3600L));
                        c13635g2.m39565t(jSONObject.optString(AbstractC13068b.JSON_KEY_C_I, ""));
                        c13635g2.m39402E(jSONObject.optInt("n_c_u_p", 0));
                    } catch (Exception unused2) {
                    }
                    try {
                        c13635g2.m39545o(jSONObject.optString("http_track_url", ""));
                    } catch (Exception unused3) {
                    }
                    c13635g2.m39445U(jSONObject.optInt("st_net", 1));
                    c13635g2.m39392B(jSONObject.optString("vtag", ""));
                    try {
                        if (jSONObject.optInt("check_webview", 0) == 0) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        c13635g2.m39485c(z2);
                    } catch (Exception unused4) {
                        c13635g2.m39485c(false);
                    }
                    c13635g2.m39388A(jSONObject.optString("swxid"));
                    c13635g2.m39483c(jSONObject.optJSONArray("sdk_filters"));
                    try {
                        c13635g2.m39528k(jSONObject.optInt("ch_nv_im_cb", 1));
                    } catch (Exception unused5) {
                        c13635g2.m39528k(1);
                    }
                    try {
                        if (jSONObject.optInt("do_us_fi_re", 1) != 0) {
                            z = true;
                        } else {
                            z = false;
                        }
                        c13635g2.m39492d(z);
                    } catch (Exception unused6) {
                        c13635g2.m39492d(true);
                    }
                    try {
                        m39384a(jSONObject);
                    } catch (Exception e6) {
                        e6.printStackTrace();
                    }
                    strOptString2 = jSONObject.optString("bcp");
                    if (!TextUtils.isEmpty(strOptString2)) {
                        c13635g2.m39459a(C13629a.m39365a(C13207k0.m37712a(strOptString2)));
                    }
                    strOptString3 = jSONObject.optString("monitor");
                    if (!TextUtils.isEmpty(strOptString3)) {
                        c13635g2.m39461a(C13632d.m39682a(C13207k0.m37712a(strOptString3)));
                    }
                    if (jSONObject.has("new_pipeline_id")) {
                        c13635g2.m39420K(jSONObject.optInt("new_pipeline_id"));
                    }
                    if (jSONObject.has("p_p_c_id")) {
                        c13635g2.m39423L(jSONObject.optInt("p_p_c_id"));
                    }
                    if (jSONObject.has("p_p_c")) {
                        c13635g2.m39585y(jSONObject.optString("p_p_c"));
                    }
                    if (jSONObject.has("c_m_l_id")) {
                        c13635g2.m39532l(jSONObject.optInt("c_m_l_id"));
                    }
                    return c13635g2;
                } catch (Exception e7) {
                    e = e7;
                    c13635g = c13635g2;
                    e.printStackTrace();
                    return c13635g;
                }
            } catch (Exception e8) {
                e = e8;
                c13635g2 = c13635g3;
            }
        } catch (Exception e9) {
            e = e9;
            c13635g = null;
        }
    }

    /* JADX INFO: renamed from: A */
    public b m39386A() {
        return this.f37940J;
    }

    /* JADX INFO: renamed from: A */
    public void m39387A(int i) {
        this.f37990f0 = i;
    }

    /* JADX INFO: renamed from: A */
    public void m39388A(String str) {
        if (TextUtils.isEmpty(this.f37993g0)) {
            return;
        }
        this.f37993g0 = str;
        if (TextUtils.isEmpty(C13008c.m36588n().m36551j())) {
            C13008c.m36588n().m36543d(this.f37993g0);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public String m39389A0() {
        return this.f37965V0;
    }

    /* JADX INFO: renamed from: B */
    public long m39390B() {
        return this.f37944L;
    }

    /* JADX INFO: renamed from: B */
    public void m39391B(int i) {
        if (i > 0) {
            this.f37998i0 = i;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m39392B(String str) {
        this.f37963U0 = str;
    }

    /* JADX INFO: renamed from: B0 */
    public int m39393B0() {
        return this.f37967W0;
    }

    /* JADX INFO: renamed from: C */
    public int m39394C() {
        return this.f37948N;
    }

    /* JADX INFO: renamed from: C */
    public void m39395C(int i) {
        this.f37996h0 = i;
    }

    /* JADX INFO: renamed from: C */
    public void m39396C(String str) {
        this.f37965V0 = str;
    }

    /* JADX INFO: renamed from: C0 */
    public int m39397C0() {
        return this.f37969X0;
    }

    /* JADX INFO: renamed from: D */
    public HashMap<String, String> m39398D() {
        return this.f37950O;
    }

    /* JADX INFO: renamed from: D */
    public void m39399D(int i) {
        this.f38000j0 = i;
    }

    /* JADX INFO: renamed from: D0 */
    public int m39400D0() {
        return this.f37971Y0;
    }

    /* JADX INFO: renamed from: E */
    public int m39401E() {
        return this.f37956R;
    }

    /* JADX INFO: renamed from: E */
    public void m39402E(int i) {
        this.f37979b1 = i;
    }

    /* JADX INFO: renamed from: E0 */
    public boolean m39403E0() {
        return this.f37954Q;
    }

    /* JADX INFO: renamed from: F */
    public int m39404F() {
        return this.f37962U;
    }

    /* JADX INFO: renamed from: F */
    public void m39405F(int i) {
        this.f38010o0 = i;
    }

    /* JADX INFO: renamed from: F0 */
    public boolean m39406F0() {
        return this.f38019t;
    }

    /* JADX INFO: renamed from: G */
    public int m39407G() {
        return this.f37964V;
    }

    /* JADX INFO: renamed from: G */
    public void m39408G(int i) {
        this.f38014q0 = i;
    }

    /* JADX INFO: renamed from: G0 */
    public boolean m39409G0() {
        return this.f38025w;
    }

    /* JADX INFO: renamed from: H */
    public Map<String, String> m39410H() {
        return this.f37970Y;
    }

    /* JADX INFO: renamed from: H */
    public void m39411H(int i) {
        this.f38012p0 = i;
    }

    /* JADX INFO: renamed from: H0 */
    public boolean m39412H0() {
        return this.f37958S;
    }

    /* JADX INFO: renamed from: I */
    public JSONArray m39413I() {
        return this.f37977b;
    }

    /* JADX INFO: renamed from: I */
    public void m39414I(int i) {
        this.f38016r0 = i;
    }

    /* JADX INFO: renamed from: I0 */
    public boolean m39415I0() {
        return this.f37974a;
    }

    /* JADX INFO: renamed from: J */
    public JSONArray m39416J() {
        return this.f37980c;
    }

    /* JADX INFO: renamed from: J */
    public void m39417J(int i) {
        this.f38018s0 = i;
    }

    /* JADX INFO: renamed from: J0 */
    public boolean m39418J0() {
        return (TextUtils.isEmpty(this.f37924B) || TextUtils.isEmpty(this.f38031z) || TextUtils.isEmpty(this.f37922A) || TextUtils.isEmpty(this.f38027x)) ? false : true;
    }

    /* JADX INFO: renamed from: K */
    public String m39419K() {
        return this.f37972Z;
    }

    /* JADX INFO: renamed from: K */
    public void m39420K(int i) {
        this.f37982c1 = i;
    }

    /* JADX INFO: renamed from: K0 */
    public boolean m39421K0() {
        return (TextUtils.isEmpty(this.f37924B) || TextUtils.isEmpty(this.f38031z) || TextUtils.isEmpty(this.f37922A) || TextUtils.isEmpty(this.f38029y)) ? false : true;
    }

    /* JADX INFO: renamed from: L */
    public int m39422L() {
        return this.f37987e0;
    }

    /* JADX INFO: renamed from: L */
    public void m39423L(int i) {
        this.f37985d1 = i;
    }

    /* JADX INFO: renamed from: L0 */
    public boolean m39424L0() {
        return this.f37960T;
    }

    /* JADX INFO: renamed from: M */
    public int m39425M() {
        return this.f37990f0;
    }

    /* JADX INFO: renamed from: M */
    public void m39426M(int i) {
        this.f38030y0 = i;
    }

    /* JADX INFO: renamed from: M0 */
    public boolean m39427M0() {
        return this.f37931E0;
    }

    /* JADX INFO: renamed from: N */
    public int m39428N() {
        return this.f37996h0;
    }

    /* JADX INFO: renamed from: N */
    public void m39429N(int i) {
        this.f38032z0 = i;
    }

    /* JADX INFO: renamed from: N0 */
    public boolean m39430N0() {
        return this.f37953P0;
    }

    /* JADX INFO: renamed from: O */
    public int m39431O() {
        return this.f38000j0;
    }

    /* JADX INFO: renamed from: O */
    public void m39432O(int i) {
        this.f37923A0 = i;
    }

    /* JADX INFO: renamed from: O0 */
    public void m39433O0() {
        String language = Locale.getDefault().getLanguage();
        if (!m39421K0()) {
            if (TextUtils.isEmpty(language) || !language.equals("zh")) {
                this.f37924B = "Confirm to close? ";
                this.f38031z = "You will not be rewarded after closing the window";
                this.f37922A = "Close it";
                this.f38029y = "Continue";
            } else {
                this.f37924B = "确认关闭？";
                this.f38031z = "关闭后您将不会获得任何奖励噢~ ";
                this.f37922A = "确认关闭";
                this.f38029y = "继续观看";
            }
        }
        if (m39418J0()) {
            return;
        }
        if (TextUtils.isEmpty(language) || !language.equals("zh")) {
            this.f37924B = "Confirm to close? ";
            this.f38031z = "You will not be rewarded after closing the window";
            this.f37922A = "Close it";
            this.f38027x = "Continue";
            return;
        }
        this.f37924B = "确认关闭？";
        this.f38031z = "关闭后您将不会获得任何奖励噢~ ";
        this.f37922A = "确认关闭";
        this.f38027x = "继续试玩";
    }

    /* JADX INFO: renamed from: P */
    public String m39434P() {
        return this.f38002k0;
    }

    /* JADX INFO: renamed from: P */
    public void m39435P(int i) {
        this.f37925B0 = i;
    }

    /* JADX INFO: renamed from: Q */
    public String m39436Q() {
        return this.f38004l0;
    }

    /* JADX INFO: renamed from: Q */
    public void m39437Q(int i) {
        this.f37927C0 = i;
    }

    /* JADX INFO: renamed from: R */
    public String m39438R() {
        return this.f37976a1;
    }

    /* JADX INFO: renamed from: R */
    public void m39439R(int i) {
        this.f37929D0 = i;
    }

    /* JADX INFO: renamed from: S */
    public long m39440S() {
        return this.f37973Z0;
    }

    /* JADX INFO: renamed from: S */
    public void m39441S(int i) {
        this.f37933F0 = i;
    }

    /* JADX INFO: renamed from: T */
    public int m39442T() {
        return this.f37979b1;
    }

    /* JADX INFO: renamed from: T */
    public void m39443T(int i) {
        this.f37943K0 = i;
    }

    /* JADX INFO: renamed from: U */
    public String m39444U() {
        return this.f38006m0;
    }

    /* JADX INFO: renamed from: U */
    public void m39445U(int i) {
        this.f37945L0 = i;
    }

    /* JADX INFO: renamed from: V */
    public String m39446V() {
        return this.f38008n0;
    }

    /* JADX INFO: renamed from: V */
    public void m39447V(int i) {
        this.f37949N0 = i;
    }

    /* JADX INFO: renamed from: W */
    public int m39448W() {
        return this.f38010o0;
    }

    /* JADX INFO: renamed from: W */
    public void m39449W(int i) {
        this.f37955Q0 = i;
    }

    /* JADX INFO: renamed from: X */
    public int m39450X() {
        return this.f38012p0;
    }

    /* JADX INFO: renamed from: X */
    public void m39451X(int i) {
        this.f37957R0 = i;
    }

    /* JADX INFO: renamed from: Y */
    public int m39452Y() {
        return this.f38016r0;
    }

    /* JADX INFO: renamed from: Y */
    public void m39453Y(int i) {
        this.f37959S0 = i;
    }

    /* JADX INFO: renamed from: Z */
    public int m39454Z() {
        return this.f38018s0;
    }

    /* JADX INFO: renamed from: Z */
    public void m39455Z(int i) {
        this.f37961T0 = i;
    }

    /* JADX INFO: renamed from: a */
    public String m39456a() {
        return this.f37983d;
    }

    /* JADX INFO: renamed from: a */
    public void m39457a(int i) {
        this.f38028x0.add(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: a */
    public void m39458a(long j) {
        this.f38011p = j;
    }

    /* JADX INFO: renamed from: a */
    public void m39459a(C13629a c13629a) {
        this.f38013q = c13629a;
    }

    /* JADX INFO: renamed from: a */
    public void m39460a(b bVar) {
        this.f37940J = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m39461a(C13632d c13632d) {
        this.f37938I = c13632d;
    }

    /* JADX INFO: renamed from: a */
    public void m39462a(ArrayList<Integer> arrayList) {
        this.f37936H = arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m39463a(HashMap<String, String> map) {
        this.f37950O = map;
    }

    /* JADX INFO: renamed from: a */
    public void m39464a(List<C13067a> list) {
        this.f38007n = list;
    }

    /* JADX INFO: renamed from: a */
    public void m39465a(Map<String, a> map) {
        this.f38017s = map;
    }

    /* JADX INFO: renamed from: a */
    public void m39466a(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000088");
        }
        this.f37977b = jSONArray;
    }

    /* JADX INFO: renamed from: a */
    public void m39467a(boolean z) {
        this.f37954Q = z;
    }

    /* JADX INFO: renamed from: a0 */
    public int m39468a0() {
        return this.f37982c1;
    }

    /* JADX INFO: renamed from: a0 */
    public void m39469a0(int i) {
        this.f37967W0 = i;
    }

    /* JADX INFO: renamed from: b */
    public String m39470b() {
        return this.f37997i;
    }

    /* JADX INFO: renamed from: b */
    public void m39471b(long j) {
        this.f37932F = j;
    }

    /* JADX INFO: renamed from: b */
    public void m39472b(String str) {
        this.f37983d = str;
    }

    /* JADX INFO: renamed from: b */
    public void m39473b(Map<String, String> map) {
        this.f37970Y = map;
    }

    /* JADX INFO: renamed from: b */
    public void m39474b(JSONArray jSONArray) {
        if (jSONArray == null) {
            jSONArray = new JSONArray();
            jSONArray.put("2000041");
            jSONArray.put("2000042");
            jSONArray.put("2000032");
            jSONArray.put("2000079");
        }
        this.f37980c = jSONArray;
    }

    /* JADX INFO: renamed from: b */
    public void m39475b(boolean z) {
        this.f38019t = z;
    }

    /* JADX INFO: renamed from: b */
    public boolean m39476b(int i) {
        return this.f38028x0.contains(Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: b0 */
    public long m39477b0() {
        return this.f38024v0;
    }

    /* JADX INFO: renamed from: b0 */
    public void m39478b0(int i) {
        this.f37969X0 = i;
    }

    /* JADX INFO: renamed from: c */
    public String m39479c() {
        return this.f37999j;
    }

    /* JADX INFO: renamed from: c */
    public void m39480c(int i) {
        this.f37986e = i;
    }

    /* JADX INFO: renamed from: c */
    public void m39481c(long j) {
        this.f37944L = j;
    }

    /* JADX INFO: renamed from: c */
    public void m39482c(String str) {
        this.f37997i = str;
    }

    /* JADX INFO: renamed from: c */
    public void m39483c(JSONArray jSONArray) {
        this.f37935G0 = jSONArray;
    }

    /* JADX INFO: renamed from: c */
    public void m39484c(JSONObject jSONObject) {
        this.f37937H0 = jSONObject;
    }

    /* JADX INFO: renamed from: c */
    public void m39485c(boolean z) {
        this.f38025w = z;
    }

    /* JADX INFO: renamed from: c0 */
    public long m39486c0() {
        if (this.f38026w0 <= 0) {
            this.f38026w0 = 7200L;
        }
        return this.f38026w0;
    }

    /* JADX INFO: renamed from: c0 */
    public void m39487c0(int i) {
        this.f37971Y0 = i;
    }

    /* JADX INFO: renamed from: d */
    public String m39488d() {
        return this.f38001k;
    }

    /* JADX INFO: renamed from: d */
    public void m39489d(int i) {
        this.f37989f = i;
    }

    /* JADX INFO: renamed from: d */
    public void m39490d(long j) {
        this.f37973Z0 = j;
    }

    /* JADX INFO: renamed from: d */
    public void m39491d(String str) {
        this.f37999j = str;
    }

    /* JADX INFO: renamed from: d */
    public void m39492d(boolean z) {
        this.f37958S = z;
    }

    /* JADX INFO: renamed from: d0 */
    public String m39493d0() {
        return this.f37988e1;
    }

    /* JADX INFO: renamed from: e */
    public int m39494e() {
        return this.f38003l;
    }

    /* JADX INFO: renamed from: e */
    public void m39495e(int i) {
        this.f37992g = i;
    }

    /* JADX INFO: renamed from: e */
    public void m39496e(long j) {
        this.f38024v0 = j;
    }

    /* JADX INFO: renamed from: e */
    public void m39497e(String str) {
        this.f38001k = str;
    }

    /* JADX INFO: renamed from: e */
    public void m39498e(boolean z) {
        this.f37974a = z;
    }

    /* JADX INFO: renamed from: e0 */
    public int m39499e0() {
        return this.f37985d1;
    }

    /* JADX INFO: renamed from: f */
    public int m39500f() {
        return this.f38005m;
    }

    /* JADX INFO: renamed from: f */
    public void m39501f(int i) {
        this.f37995h = i;
    }

    /* JADX INFO: renamed from: f */
    public void m39502f(long j) {
        this.f38026w0 = j;
    }

    /* JADX INFO: renamed from: f */
    public void m39503f(String str) {
        this.f38015r = str;
    }

    /* JADX INFO: renamed from: f */
    public void m39504f(boolean z) {
        this.f37960T = z;
    }

    /* JADX INFO: renamed from: f0 */
    public int m39505f0() {
        return this.f38030y0;
    }

    /* JADX INFO: renamed from: g */
    public List<C13067a> m39506g() {
        return this.f38007n;
    }

    /* JADX INFO: renamed from: g */
    public void m39507g(int i) {
        this.f38003l = i;
    }

    /* JADX INFO: renamed from: g */
    public void m39508g(long j) {
        this.f37941J0 = j;
    }

    /* JADX INFO: renamed from: g */
    public void m39509g(String str) {
        this.f38027x = str;
    }

    /* JADX INFO: renamed from: g */
    public void m39510g(boolean z) {
        this.f37931E0 = z;
    }

    /* JADX INFO: renamed from: g0 */
    public int m39511g0() {
        return this.f38032z0;
    }

    /* JADX INFO: renamed from: h */
    public int m39512h() {
        return this.f38009o;
    }

    /* JADX INFO: renamed from: h */
    public void m39513h(int i) {
        this.f38005m = i;
    }

    /* JADX INFO: renamed from: h */
    public void m39514h(long j) {
        this.f37947M0 = j;
    }

    /* JADX INFO: renamed from: h */
    public void m39515h(String str) {
        this.f38029y = str;
    }

    /* JADX INFO: renamed from: h */
    public void m39516h(boolean z) {
        this.f37953P0 = z;
    }

    /* JADX INFO: renamed from: h0 */
    public int m39517h0() {
        return this.f37923A0;
    }

    /* JADX INFO: renamed from: i */
    public long m39518i() {
        return this.f38011p;
    }

    /* JADX INFO: renamed from: i */
    public void m39519i(int i) {
        this.f38009o = i;
    }

    /* JADX INFO: renamed from: i */
    public void m39520i(long j) {
        this.f37951O0 = j;
    }

    /* JADX INFO: renamed from: i */
    public void m39521i(String str) {
        this.f38031z = str;
    }

    /* JADX INFO: renamed from: i0 */
    public int m39522i0() {
        return this.f37925B0;
    }

    /* JADX INFO: renamed from: j */
    public C13629a m39523j() {
        return this.f38013q;
    }

    /* JADX INFO: renamed from: j */
    public void m39524j(int i) {
        this.f38021u = i;
    }

    /* JADX INFO: renamed from: j */
    public void m39525j(String str) {
        this.f37922A = str;
    }

    /* JADX INFO: renamed from: j0 */
    public int m39526j0() {
        return this.f37927C0;
    }

    /* JADX INFO: renamed from: k */
    public String m39527k() {
        return this.f38015r;
    }

    /* JADX INFO: renamed from: k */
    public void m39528k(int i) {
        this.f38023v = i;
    }

    /* JADX INFO: renamed from: k */
    public void m39529k(String str) {
        this.f37924B = str;
    }

    /* JADX INFO: renamed from: k0 */
    public int m39530k0() {
        return this.f37929D0;
    }

    /* JADX INFO: renamed from: l */
    public Map<String, a> m39531l() {
        return this.f38017s;
    }

    /* JADX INFO: renamed from: l */
    public void m39532l(int i) {
        this.f37991f1 = i;
    }

    /* JADX INFO: renamed from: l */
    public void m39533l(String str) {
        this.f37928D = str;
    }

    /* JADX INFO: renamed from: l0 */
    public int m39534l0() {
        return this.f37933F0;
    }

    /* JADX INFO: renamed from: m */
    public int m39535m() {
        return this.f38021u;
    }

    /* JADX INFO: renamed from: m */
    public void m39536m(int i) {
        this.f37926C = i;
    }

    /* JADX INFO: renamed from: m */
    public void m39537m(String str) {
        this.f37930E = str;
    }

    /* JADX INFO: renamed from: m0 */
    public JSONArray m39538m0() {
        return this.f37935G0;
    }

    /* JADX INFO: renamed from: n */
    public int m39539n() {
        return this.f38023v;
    }

    /* JADX INFO: renamed from: n */
    public void m39540n(int i) {
        this.f37934G = i;
        C12704a.f33795d = i;
    }

    /* JADX INFO: renamed from: n */
    public void m39541n(String str) {
        this.f37994g1 = str;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        C13633e.m39694a().m39696b(C13207k0.m37712a(str));
    }

    /* JADX INFO: renamed from: n0 */
    public JSONObject m39542n0() {
        return this.f37937H0;
    }

    /* JADX INFO: renamed from: o */
    public int m39543o() {
        return this.f37991f1;
    }

    /* JADX INFO: renamed from: o */
    public void m39544o(int i) {
        this.f37942K = i;
    }

    /* JADX INFO: renamed from: o */
    public void m39545o(String str) {
        this.f37952P = str;
    }

    /* JADX INFO: renamed from: o0 */
    public String m39546o0() {
        return this.f37939I0;
    }

    /* JADX INFO: renamed from: p */
    public String m39547p() {
        return this.f38027x;
    }

    /* JADX INFO: renamed from: p */
    public void m39548p(int i) {
        this.f37946M = i;
        C13121d.m37226h().m37232d(i);
    }

    /* JADX INFO: renamed from: p */
    public void m39549p(String str) {
        this.f37968X = str;
    }

    /* JADX INFO: renamed from: p0 */
    public long m39550p0() {
        return this.f37941J0;
    }

    /* JADX INFO: renamed from: q */
    public String m39551q() {
        return this.f38029y;
    }

    /* JADX INFO: renamed from: q */
    public void m39552q(int i) {
        this.f37948N = i;
    }

    /* JADX INFO: renamed from: q */
    public void m39553q(String str) {
        this.f37972Z = str;
    }

    /* JADX INFO: renamed from: q0 */
    public int m39554q0() {
        return this.f37943K0;
    }

    /* JADX INFO: renamed from: r */
    public String m39555r() {
        return this.f38031z;
    }

    /* JADX INFO: renamed from: r */
    public void m39556r(int i) {
        this.f37956R = i;
    }

    /* JADX INFO: renamed from: r */
    public void m39557r(String str) {
        this.f38002k0 = str;
    }

    /* JADX INFO: renamed from: r0 */
    public int m39558r0() {
        return this.f37945L0;
    }

    /* JADX INFO: renamed from: s */
    public String m39559s() {
        return this.f37922A;
    }

    /* JADX INFO: renamed from: s */
    public void m39560s(int i) {
        this.f37962U = i;
    }

    /* JADX INFO: renamed from: s */
    public void m39561s(String str) {
        this.f38004l0 = str;
    }

    /* JADX INFO: renamed from: s0 */
    public long m39562s0() {
        return this.f37947M0 * 1000;
    }

    /* JADX INFO: renamed from: t */
    public String m39563t() {
        return this.f37924B;
    }

    /* JADX INFO: renamed from: t */
    public void m39564t(int i) {
        this.f37964V = i;
    }

    /* JADX INFO: renamed from: t */
    public void m39565t(String str) {
        this.f37976a1 = str;
    }

    /* JADX INFO: renamed from: t0 */
    public int m39566t0() {
        return this.f37949N0;
    }

    public String toString() {
        return " cfc=" + this.f38021u + " getpf=" + this.f37944L + " rurl=" + this.f37931E0;
    }

    /* JADX INFO: renamed from: u */
    public int m39567u() {
        return this.f37926C;
    }

    /* JADX INFO: renamed from: u */
    public void m39568u(int i) {
        this.f37966W = i;
    }

    /* JADX INFO: renamed from: u */
    public void m39569u(String str) {
        this.f38006m0 = str;
    }

    /* JADX INFO: renamed from: u0 */
    public long m39570u0() {
        return this.f37951O0;
    }

    /* JADX INFO: renamed from: v */
    public String m39571v() {
        return this.f37928D;
    }

    /* JADX INFO: renamed from: v */
    public void m39572v(int i) {
        this.f37975a0 = i;
    }

    /* JADX INFO: renamed from: v */
    public void m39573v(String str) {
        this.f38008n0 = str;
    }

    /* JADX INFO: renamed from: v0 */
    public int m39574v0() {
        return this.f37955Q0;
    }

    /* JADX INFO: renamed from: w */
    public String m39575w() {
        return this.f37930E;
    }

    /* JADX INFO: renamed from: w */
    public void m39576w(int i) {
        this.f37978b0 = i;
        C13121d.m37226h().m37230b(i);
        C13121d.m37226h().m37231c(i);
    }

    /* JADX INFO: renamed from: w */
    public void m39577w(String str) {
        this.f38020t0 = str;
    }

    /* JADX INFO: renamed from: w0 */
    public int m39578w0() {
        return this.f37957R0;
    }

    /* JADX INFO: renamed from: x */
    public long m39579x() {
        return this.f37932F;
    }

    /* JADX INFO: renamed from: x */
    public void m39580x(int i) {
        this.f37981c0 = i;
    }

    /* JADX INFO: renamed from: x */
    public void m39581x(String str) {
        this.f38022u0 = str;
    }

    /* JADX INFO: renamed from: x0 */
    public int m39582x0() {
        return this.f37959S0;
    }

    /* JADX INFO: renamed from: y */
    public ArrayList<Integer> m39583y() {
        return this.f37936H;
    }

    /* JADX INFO: renamed from: y */
    public void m39584y(int i) {
        this.f37984d0 = i;
    }

    /* JADX INFO: renamed from: y */
    public void m39585y(String str) {
        this.f37988e1 = str;
    }

    /* JADX INFO: renamed from: y0 */
    public int m39586y0() {
        return this.f37961T0;
    }

    /* JADX INFO: renamed from: z */
    public C13632d m39587z() {
        return this.f37938I;
    }

    /* JADX INFO: renamed from: z */
    public void m39588z(int i) {
        this.f37987e0 = i;
    }

    /* JADX INFO: renamed from: z */
    public void m39589z(String str) {
        this.f37939I0 = str;
    }

    /* JADX INFO: renamed from: z0 */
    public String m39590z0() {
        return this.f37963U0;
    }
}
