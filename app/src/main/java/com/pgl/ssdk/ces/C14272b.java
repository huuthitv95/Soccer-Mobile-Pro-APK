package com.pgl.ssdk.ces;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.pgl.ssdk.AbstractC14255am;
import com.pgl.ssdk.C14242a5;
import com.pgl.ssdk.C14243aa;
import com.pgl.ssdk.C14244ab;
import com.pgl.ssdk.C14245ac;
import com.pgl.ssdk.C14246ad;
import com.pgl.ssdk.C14247ae;
import com.pgl.ssdk.C14248af;
import com.pgl.ssdk.C14249ag;
import com.pgl.ssdk.C14250ah;
import com.pgl.ssdk.C14251ai;
import com.pgl.ssdk.C14252aj;
import com.pgl.ssdk.C14253ak;
import com.pgl.ssdk.C14254al;
import com.pgl.ssdk.C14256an;
import com.pgl.ssdk.C14260ar;
import com.pgl.ssdk.C14265aw;
import com.pgl.ssdk.C14266ax;
import com.pgl.ssdk.C14267ay;
import com.pgl.ssdk.C14268az;
import com.pgl.ssdk.C14276f;
import com.pgl.ssdk.C14291u;
import com.pgl.ssdk.C14292v;
import com.pgl.ssdk.C14293w;
import com.pgl.ssdk.C14294x;
import com.pgl.ssdk.C14295y;
import com.pgl.ssdk.C14296z;
import com.pgl.ssdk.RunnableC14257ao;
import com.pgl.ssdk.ces.out.PglSSConfig;
import com.pgl.ssdk.ces.out.PglSSManager;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.pgl.ssdk.ces.b */
/* JADX INFO: loaded from: classes7.dex */
public class C14272b {

    /* JADX INFO: renamed from: a */
    private static volatile C14272b f41285a = null;

    /* JADX INFO: renamed from: b */
    private static boolean f41286b = false;

    /* JADX INFO: renamed from: c */
    private static Map<String, Object> f41287c = null;

    /* JADX INFO: renamed from: d */
    private static int f41288d = 1;

    /* JADX INFO: renamed from: e */
    private static C14265aw.a f41289e;

    /* JADX INFO: renamed from: g */
    public Context f41291g;

    /* JADX INFO: renamed from: h */
    private String f41292h;

    /* JADX INFO: renamed from: i */
    private int f41293i;

    /* JADX INFO: renamed from: j */
    private String f41294j;

    /* JADX INFO: renamed from: m */
    private String f41297m;

    /* JADX INFO: renamed from: f */
    public boolean f41290f = false;

    /* JADX INFO: renamed from: k */
    private String f41295k = null;

    /* JADX INFO: renamed from: l */
    private String f41296l = null;

    /* JADX INFO: renamed from: n */
    private boolean f41298n = false;

    /* JADX INFO: renamed from: o */
    public int f41299o = 1;

    /* JADX INFO: renamed from: p */
    public int f41300p = 0;

    /* JADX INFO: renamed from: q */
    public boolean f41301q = true;

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$a */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C14276f.m43070c();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.pgl.ssdk.ces.b$b */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f41303a;

        b(String str) {
            this.f41303a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!TextUtils.isEmpty(this.f41303a) && this.f41303a.equals(PglSSManager.REPORT_SCENE_ADSHOW)) {
                C14244ab.m42811b(C14272b.this.f41291g);
            }
            C14254al.m42962a(C14272b.this.f41291g).m42963a();
            C14243aa.m42805b(C14272b.this.f41291g);
        }
    }

    private C14272b(Context context, String str) {
        this.f41291g = context;
        this.f41292h = str;
    }

    /* JADX INFO: renamed from: a */
    public static C14272b m43034a(Context context, String str, int i, int i2, String str2) {
        if (f41285a == null) {
            synchronized (C14272b.class) {
                if (f41285a == null) {
                    if (context == null) {
                        context = C14244ab.m42806a().getApplicationContext();
                    }
                    if (context == null) {
                        f41288d = 4;
                        return null;
                    }
                    m43038a(i);
                    C14265aw.a aVarM43020b = C14265aw.m43020b(context, "nms");
                    if (aVarM43020b != null) {
                        f41288d = aVarM43020b.f41282a;
                        f41289e = aVarM43020b;
                        return null;
                    }
                    C14272b c14272b = new C14272b(context, str);
                    f41285a = c14272b;
                    c14272b.f41293i = i2;
                    f41285a.f41294j = str2;
                    f41285a.m43040b(context);
                    f41285a.m43045e(m43036a(context));
                    C14296z.m43154a(context);
                    f41288d = 0;
                }
            }
        }
        return f41285a;
    }

    /* JADX INFO: renamed from: a */
    public static String m43035a() {
        if (m43044e() != null) {
            return m43044e().f41292h;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private static String m43036a(Context context) {
        String strM43025a = C14266ax.m43025a(context, "iid");
        if (!TextUtils.isEmpty(strM43025a)) {
            return strM43025a;
        }
        String string = UUID.randomUUID().toString();
        C14266ax.m43029b(context, "iid", string);
        return string;
    }

    /* JADX INFO: renamed from: a */
    private String m43037a(Object obj) {
        Map<String, Object> map;
        if (!(obj instanceof String) || !"Start".equals((String) obj) || (map = f41287c) == null || map.isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        try {
            return new JSONObject(f41287c).toString();
        } catch (Exception unused) {
            return JsonUtils.EMPTY_JSON;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m43038a(int i) {
        C14256an.m42985a(i);
    }

    /* JADX INFO: renamed from: b */
    public static String m43039b() {
        if (m43044e() != null) {
            return m43044e().f41295k;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    private void m43040b(Context context) {
        if (context == null || f41286b) {
            return;
        }
        try {
            C14271a.meta(101, null, "1");
            C14271a.meta(102, null, this.f41292h);
            C14271a.meta(114, null, Integer.valueOf(this.f41293i));
            StringBuilder sb = new StringBuilder();
            sb.append(C14244ab.m42819h(context));
            C14271a.meta(105, null, sb.toString());
            C14271a.meta(152, null, C14244ab.m42820i(context));
            C14271a.meta(153, null, C14244ab.m42815d(context));
            C14271a.meta(106, null, C14244ab.m42817f(context));
            C14271a.meta(107, null, C14244ab.m42816e(context));
            C14271a.meta(108, null, C14244ab.m42813c(context));
            C14271a.meta(109, null, C14244ab.m42814d());
            C14271a.meta(110, null, C14244ab.m42812c());
            C14271a.meta(115, null, this.f41294j);
            f41286b = true;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: b */
    private void m43041b(String str) {
        byte b2;
        int iIntValue;
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObject.get(next);
                switch (next.hashCode()) {
                    case -417749689:
                        if (!next.equals("touch_trace_enabled")) {
                            b2 = -1;
                        } else {
                            b2 = 4;
                        }
                        break;
                    case -257777372:
                        if (!next.equals("init_prob")) {
                            b2 = -1;
                        } else {
                            b2 = 5;
                        }
                        break;
                    case -93508180:
                        if (!next.equals("autoctl_detect_enable")) {
                            b2 = -1;
                        } else {
                            b2 = 0;
                        }
                        break;
                    case 449342513:
                        if (!next.equals("craw_ratio")) {
                            b2 = -1;
                        } else {
                            b2 = 3;
                        }
                        break;
                    case 944591168:
                        if (!next.equals("report_ratio")) {
                            b2 = -1;
                        } else {
                            b2 = 1;
                        }
                        break;
                    case 1286849298:
                        if (!next.equals("app_switch")) {
                            b2 = -1;
                        } else {
                            b2 = 2;
                        }
                        break;
                    default:
                        b2 = -1;
                        break;
                }
                if (b2 != 0) {
                    if (b2 != 1) {
                        if (b2 != 2) {
                            if (b2 != 3) {
                                if (b2 != 4) {
                                    if (b2 == 5 && (obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue()) >= 0 && iIntValue <= 100) {
                                        this.f41300p = iIntValue;
                                    }
                                } else if (obj instanceof Boolean) {
                                    C14295y.f41362g = ((Boolean) obj).booleanValue();
                                }
                            } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                                C14276f.f41325b = ((Integer) obj).intValue();
                            }
                        } else if (obj instanceof Boolean) {
                            this.f41301q = ((Boolean) obj).booleanValue();
                        }
                    } else if ((obj instanceof Integer) && ((Integer) obj).intValue() > 0) {
                        this.f41299o = ((Integer) obj).intValue();
                    }
                } else if (obj instanceof Boolean) {
                    C14253ak.f41233b = ((Boolean) obj).booleanValue();
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    public static String m43042c() {
        C14272b c14272bM43044e = m43044e();
        if (c14272bM43044e == null || TextUtils.isEmpty(c14272bM43044e.f41296l)) {
            return null;
        }
        return c14272bM43044e.f41296l;
    }

    /* JADX INFO: renamed from: d */
    public static int m43043d() {
        return f41288d;
    }

    /* JADX INFO: renamed from: e */
    public static C14272b m43044e() {
        return f41285a;
    }

    /* JADX INFO: renamed from: e */
    private void m43045e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f41297m = str;
        C14271a.meta(104, null, str);
    }

    /* JADX INFO: renamed from: f */
    public static C14265aw.a m43046f() {
        return f41289e;
    }

    /* JADX INFO: renamed from: a */
    public Object m43047a(int i, Object obj) {
        if (i == 123) {
            return C14248af.m42936a(this.f41291g);
        }
        if (i == 121) {
            return C14246ad.m42924a();
        }
        if (i == 122) {
            return C14246ad.m42926b();
        }
        if (i == 126) {
            return C14246ad.m42927b(this.f41291g);
        }
        if (i == 128) {
            return C14246ad.m42929c(this.f41291g);
        }
        if (i == 120) {
            return C14245ac.m42923c();
        }
        if (i == 124) {
            return C14249ag.m42942c(this.f41291g);
        }
        if (i == 130) {
            return C14249ag.m42940a(this.f41291g);
        }
        if (i == 145) {
            return C14250ah.m42947c(this.f41291g);
        }
        if (i == 125) {
            return C14249ag.m42941b(this.f41291g);
        }
        if (i == 129) {
            return C14247ae.m42935f(this.f41291g);
        }
        if (i == 141) {
            return C14247ae.m42934e(this.f41291g);
        }
        if (i == 134) {
            return C14253ak.m42952a(this.f41291g).m42960b();
        }
        if (i == 140) {
            return C14254al.m42962a(this.f41291g).m42967e();
        }
        if (i == 144) {
            return C14254al.m42962a(this.f41291g).m42966d();
        }
        if (i == 133) {
            return m43037a(obj);
        }
        if (i == 135) {
            return C14292v.m43126e();
        }
        if (i == 201) {
            return C14246ad.m42925a(this.f41291g);
        }
        if (i == 202) {
            return C14246ad.m42928c();
        }
        if (i == 236) {
            return C14267ay.m43030a((String) obj);
        }
        if (i == 142) {
            return C14244ab.m42818g(this.f41291g);
        }
        if (i == 143) {
            return C14250ah.m42944a(this.f41291g);
        }
        if (i == 146) {
            try {
                return C14292v.m43123b();
            } catch (Throwable unused) {
                return null;
            }
        }
        if (i == 147) {
            return Boolean.valueOf(C14244ab.m42821j(this.f41291g));
        }
        if (i == 148) {
            return C14291u.m43116b(this.f41291g);
        }
        if (i == 149) {
            return C14293w.m43129a(this.f41291g);
        }
        if (i == 150) {
            return Integer.valueOf(C14294x.m43136a());
        }
        if (i == 151) {
            return C14293w.m43133c();
        }
        if (i == 161) {
            return Boolean.valueOf(C14292v.m43127f());
        }
        if (i == 163) {
            return C14252aj.m42951a();
        }
        if (i == 169) {
            return Boolean.valueOf(C14243aa.m42803a(this.f41291g));
        }
        if (i == 170) {
            return Integer.valueOf(C14295y.m43144b((String) obj));
        }
        if (i == 203) {
            return C14244ab.m42810b();
        }
        if (i == 205) {
            return Integer.valueOf(C14244ab.m42822k(this.f41291g));
        }
        if (i == 204) {
            return Integer.valueOf(C14247ae.m42930a(this.f41291g));
        }
        if (i == 206) {
            return C14250ah.m42945b(this.f41291g);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public Map<String, String> m43048a(String str, byte[] bArr) {
        HashMap map = new HashMap();
        if (str == null) {
            str = "";
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        String str2 = (String) C14271a.meta(224, this.f41291g, new Object[]{str, bArr});
        if (!TextUtils.isEmpty(str2)) {
            map.put("X-Armors", str2);
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public void m43049a(MotionEvent motionEvent) {
        C14295y.m43141a(motionEvent, this.f41291g);
    }

    /* JADX INFO: renamed from: a */
    public void m43050a(String str) {
        C14260ar.m42995b(new b(str));
    }

    /* JADX INFO: renamed from: a */
    public void m43051a(String str, String str2, String str3, String str4) {
        m43054c(str2);
        m43055d(str4);
        try {
            m43057h();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public void m43052a(String str, Map<String, Object> map) {
        try {
            C14260ar.m42993a(new RunnableC14257ao(this.f41291g, Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, new Object[]{str, map}), "Start".equals(str) ? 10000L : 0L);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: a */
    public synchronized void m43053a(Map<String, Object> map) {
        byte b2;
        if (map != null) {
            if (!map.isEmpty()) {
                try {
                    for (String str : map.keySet()) {
                        Object obj = map.get(str);
                        if (obj != null) {
                            switch (str.hashCode()) {
                                case -2021683300:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TRANSFER_HOST)) {
                                        b2 = 2;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case -1195280656:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_SEC_CONFIG_STR)) {
                                        b2 = 5;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 156851746:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_ALLOWED_FIELDS)) {
                                        b2 = 3;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 398905722:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_CHECKCLAZZ)) {
                                        b2 = 0;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 485444716:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_TARGET_IDC)) {
                                        b2 = 4;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                case 500804551:
                                    if (str.equals(PglSSConfig.CUSTOMINFO_KEY_IPV6)) {
                                        b2 = 1;
                                    } else {
                                        b2 = -1;
                                    }
                                    break;
                                default:
                                    b2 = -1;
                                    break;
                            }
                            if (b2 != 0) {
                                if (b2 != 1) {
                                    if (b2 != 2) {
                                        if (b2 != 3) {
                                            if (b2 != 4) {
                                                if (b2 == 5 && (obj instanceof String)) {
                                                    m43041b((String) obj);
                                                }
                                            } else if (obj instanceof String) {
                                                C14256an.m42989b((String) obj);
                                            }
                                        } else if (obj instanceof Set) {
                                            Set set = (Set) obj;
                                            C14271a.meta(165, null, Boolean.valueOf(set.contains("boot")));
                                            C14271a.meta(166, null, Boolean.valueOf(set.contains("mnc")));
                                            C14271a.meta(167, null, Boolean.valueOf(set.contains("mcc")));
                                        }
                                    } else if (obj instanceof String) {
                                        C14256an.m42986a((String) obj);
                                    }
                                } else if (obj instanceof String) {
                                    String str2 = (String) obj;
                                    if (!TextUtils.isEmpty(str2)) {
                                        AbstractC14255am.m42970a(str2);
                                    }
                                }
                            } else if (obj instanceof String) {
                                String strM42949a = C14251ai.m42949a((String) obj);
                                if (!TextUtils.isEmpty(strM42949a)) {
                                    C14271a.meta(159, null, strM42949a);
                                }
                            }
                        }
                    }
                    if (f41287c == null) {
                        f41287c = new HashMap();
                    }
                    f41287c.putAll(map);
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public synchronized void m43054c(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f41295k)) {
            this.f41295k = str;
            C14271a.meta(103, null, str);
            C14242a5.m42799b();
        }
    }

    /* JADX INFO: renamed from: d */
    public synchronized void m43055d(String str) {
        if (!TextUtils.isEmpty(str) && !str.equals(this.f41296l)) {
            C14271a.meta(111, null, str);
            this.f41296l = str;
            C14242a5.m42799b();
        }
    }

    /* JADX INFO: renamed from: g */
    public String m43056g() {
        return C14242a5.m42797a();
    }

    /* JADX INFO: renamed from: h */
    public void m43057h() {
        this.f41298n = true;
        C14242a5.m42798a(this.f41291g, this.f41292h);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (C14268az.m43032a(C14266ax.m43023a(this.f41291g, "pgl_init_report", 0L), jCurrentTimeMillis)) {
            int i = f41285a.f41300p;
            if ((i > 0 && i < 100 && Math.random() * 100.0d < i) || i == 100) {
                m43052a("Start", (Map<String, Object>) null);
            }
        } else {
            m43052a("Start", (Map<String, Object>) null);
            C14266ax.m43028b(this.f41291g, "pgl_init_report", jCurrentTimeMillis);
        }
        m43050a("Start");
        if (this.f41301q) {
            C14260ar.m42993a(new a(), 20000L);
        }
    }
}
