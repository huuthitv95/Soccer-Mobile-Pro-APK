package com.mbridge.msdk.interstitial.controller;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.work.WorkRequest;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.C13092c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.interstitial.adapter.C13248a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.out.InterstitialListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.setting.C13638j;
import com.mbridge.msdk.setting.C13640l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a */
/* JADX INFO: compiled from: InterstitialController.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13250a {

    /* JADX INFO: renamed from: o */
    public static String f36496o;

    /* JADX INFO: renamed from: p */
    public static Map<String, Integer> f36497p = new HashMap();

    /* JADX INFO: renamed from: q */
    public static Map<String, Integer> f36498q = new HashMap();

    /* JADX INFO: renamed from: r */
    public static Map<String, d> f36499r = new HashMap();

    /* JADX INFO: renamed from: b */
    private Context f36501b;

    /* JADX INFO: renamed from: c */
    private String f36502c;

    /* JADX INFO: renamed from: d */
    private String f36503d;

    /* JADX INFO: renamed from: e */
    private String f36504e;

    /* JADX INFO: renamed from: f */
    private MBridgeIds f36505f;

    /* JADX INFO: renamed from: g */
    private Handler f36506g;

    /* JADX INFO: renamed from: h */
    private C13640l f36507h;

    /* JADX INFO: renamed from: i */
    private InterstitialListener f36508i;

    /* JADX INFO: renamed from: a */
    private String f36500a = "InterstitialController";

    /* JADX INFO: renamed from: j */
    public boolean f36509j = false;

    /* JADX INFO: renamed from: k */
    private String f36510k = "";

    /* JADX INFO: renamed from: l */
    private String f36511l = "";

    /* JADX INFO: renamed from: m */
    private String f36512m = "";

    /* JADX INFO: renamed from: n */
    private boolean f36513n = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$a */
    /* JADX INFO: compiled from: InterstitialController.java */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                if (C13250a.this.f36508i != null) {
                    C13250a.this.f36508i.onInterstitialLoadSuccess(C13250a.this.f36505f);
                    return;
                }
                return;
            }
            String str = "";
            if (i == 2) {
                if (C13250a.this.f36508i != null) {
                    Object obj = message.obj;
                    if (obj != null && (obj instanceof String)) {
                        str = (String) obj;
                    }
                    C13250a.this.f36508i.onInterstitialLoadFail(C13250a.this.f36505f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i == 3) {
                C13250a c13250a = C13250a.this;
                c13250a.f36509j = true;
                if (c13250a.f36508i != null) {
                    C13250a.this.f36508i.onInterstitialShowSuccess(C13250a.this.f36505f);
                    return;
                }
                return;
            }
            if (i == 4) {
                if (C13250a.this.f36508i != null) {
                    Object obj2 = message.obj;
                    if (obj2 != null && (obj2 instanceof String)) {
                        str = (String) obj2;
                    }
                    C13250a.this.f36508i.onInterstitialShowFail(C13250a.this.f36505f, TextUtils.isEmpty(str) ? "can't show because unknow error" : str);
                    return;
                }
                return;
            }
            if (i == 6) {
                if (C13250a.this.f36508i != null) {
                    C13250a.this.f36508i.onInterstitialAdClick(C13250a.this.f36505f);
                }
            } else {
                if (i != 7) {
                    return;
                }
                C13250a c13250a2 = C13250a.this;
                c13250a2.f36509j = false;
                if (c13250a2.f36508i != null) {
                    C13250a.this.f36508i.onInterstitialClosed(C13250a.this.f36505f);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$b */
    /* JADX INFO: compiled from: InterstitialController.java */
    public class b {

        /* JADX INFO: renamed from: a */
        private C13248a f36515a;

        /* JADX INFO: renamed from: b */
        private c f36516b;

        public b(C13248a c13248a, c cVar) {
            this.f36515a = c13248a;
            this.f36516b = cVar;
        }

        /* JADX INFO: renamed from: a */
        public void m38071a(boolean z, String str) {
            try {
                C13248a c13248a = this.f36515a;
                if (c13248a != null) {
                    c13248a.m38027a((b) null);
                    this.f36515a = null;
                }
                if (this.f36516b != null) {
                    if (C13250a.this.f36506g != null) {
                        C13250a.this.f36506g.removeCallbacks(this.f36516b);
                    }
                    if (z) {
                        if (C13250a.this.f36508i != null) {
                            C13250a.this.m38054c(str);
                        }
                    } else if (C13250a.this.f36508i != null) {
                        C13250a.this.m38049b(str);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m38072b(boolean z, String str) {
            try {
                C13250a.this.f36510k = str;
                try {
                    ArrayList arrayList = new ArrayList();
                    C13248a c13248a = this.f36515a;
                    if (c13248a != null && c13248a.m38028d() != null) {
                        arrayList.add(this.f36515a.m38028d());
                    }
                    C13250a.this.f36511l = C13092c.m37122b(arrayList);
                } catch (Exception e) {
                    C13219q0.m37816b(C13250a.this.f36500a, e.getMessage());
                }
                if (this.f36516b != null) {
                    if (C13250a.this.f36506g != null) {
                        C13250a.this.f36506g.removeCallbacks(this.f36516b);
                    }
                    if (z) {
                        C13250a.this.m38050b(false);
                    } else if (C13250a.this.f36508i != null) {
                        C13250a.this.m38061h();
                    }
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$c */
    /* JADX INFO: compiled from: InterstitialController.java */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        private C13248a f36518a;

        public c(C13248a c13248a) {
            this.f36518a = c13248a;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13248a c13248a = this.f36518a;
                if (c13248a != null) {
                    if (c13248a.m38029f()) {
                        C13250a.this.m38054c("load timeout");
                    } else if (C13250a.this.f36508i != null) {
                        C13250a.this.m38049b("load timeout");
                    }
                    this.f36518a.m38027a((b) null);
                    this.f36518a = null;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public C13250a() {
        try {
            m38052c();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m38061h() {
        Handler handler = this.f36506g;
        if (handler != null) {
            handler.sendEmptyMessage(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m38062i() {
        Handler handler = this.f36506g;
        if (handler != null) {
            handler.sendEmptyMessage(3);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m38069g() {
        try {
            new C13638j().m39744a(this.f36501b, (String) null, (String) null, this.f36502c);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: j */
    public void m38070j() {
        try {
            if (this.f36501b == null) {
                m38054c("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f36502c)) {
                m38054c("unitid is null");
            } else if (!this.f36513n) {
                m38054c("init error");
            } else {
                m38059e();
                m38050b(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m38054c("can't show because unknow error");
        }
    }

    /* JADX INFO: renamed from: e */
    private void m38059e() {
        try {
            m38069g();
            C13640l c13640lM39720e = C13636h.m39706b().m39720e(C13008c.m36588n().m36533b(), this.f36502c);
            this.f36507h = c13640lM39720e;
            if (c13640lM39720e == null) {
                this.f36507h = C13640l.m39752h(this.f36502c);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m38068f() {
        try {
            if (this.f36501b == null) {
                m38049b("context is null");
                return;
            }
            if (TextUtils.isEmpty(this.f36502c)) {
                m38049b("unitid is null");
            } else {
                if (!this.f36513n) {
                    m38049b("init error");
                    return;
                }
                m38059e();
                m38057d();
                m38065a(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            m38049b("can't show because unknow error");
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.interstitial.controller.a$d */
    /* JADX INFO: compiled from: InterstitialController.java */
    public class d {
        public d() {
        }

        /* JADX INFO: renamed from: a */
        public void m38074a(String str) {
            try {
                C13250a.this.m38054c(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: b */
        public void m38075b() {
            try {
                if (C13250a.this.f36506g != null) {
                    C13250a.this.f36506g.sendEmptyMessage(7);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: c */
        public void m38076c() {
            try {
                C13250a.this.m38062i();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        /* JADX INFO: renamed from: a */
        public void m38073a() {
            try {
                if (C13250a.this.f36506g != null) {
                    C13250a.this.f36506g.sendEmptyMessage(6);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private void m38052c() {
        try {
            this.f36506g = new a(Looper.getMainLooper());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: d */
    private void m38057d() {
        try {
            C13640l c13640l = this.f36507h;
            if (c13640l != null) {
                int iM39635e = c13640l.m39635e();
                int iM39678y = this.f36507h.m39678y();
                if (iM39635e <= 0) {
                    iM39635e = 1;
                }
                if (iM39678y <= 0) {
                    iM39678y = 1;
                }
                int i = iM39678y * iM39635e;
                if (f36498q == null || TextUtils.isEmpty(this.f36502c)) {
                    return;
                }
                f36498q.put(this.f36502c, Integer.valueOf(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public String m38067b() {
        if (this.f36509j) {
            return this.f36512m;
        }
        return this.f36510k;
    }

    /* JADX INFO: renamed from: a */
    public static void m38046a(String str, int i) {
        try {
            if (f36497p == null || TextUtils.isEmpty(str)) {
                return;
            }
            f36497p.put(str, Integer.valueOf(i));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38050b(boolean z) {
        try {
            CampaignEx campaignExM38028d = new C13248a(this.f36501b, this.f36502c, this.f36503d, this.f36504e, true).m38028d();
            if (campaignExM38028d != null) {
                m38043a(campaignExM38028d);
            } else if (z) {
                m38065a(true);
            } else {
                m38054c("no ads available can show");
            }
        } catch (Exception e) {
            e.printStackTrace();
            if (this.f36508i != null) {
                m38054c("can't show because unknow error");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m38041a(String str) {
        Map<String, Integer> map;
        Integer num;
        try {
            if (TextUtils.isEmpty(str) || (map = f36497p) == null || !map.containsKey(str) || (num = f36497p.get(str)) == null) {
                return 0;
            }
            return num.intValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m38064a(InterstitialListener interstitialListener) {
        this.f36508i = interstitialListener;
    }

    /* JADX INFO: renamed from: a */
    public boolean m38066a(Context context, Map<String, Object> map) {
        try {
            this.f36513n = false;
            if (map != null && context != null && map.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && (map.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String)) {
                if (map.containsKey(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) && (map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY) instanceof String)) {
                    this.f36504e = (String) map.get(MBridgeConstans.PROPERTIES_API_REUQEST_CATEGORY);
                }
                this.f36502c = (String) map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
                this.f36501b = context;
                if (map.containsKey(MBridgeConstans.PLACEMENT_ID) && map.get(MBridgeConstans.PLACEMENT_ID) != null) {
                    this.f36503d = (String) map.get(MBridgeConstans.PLACEMENT_ID);
                }
                this.f36505f = new MBridgeIds(this.f36503d, this.f36502c);
                this.f36513n = true;
                return this.f36513n;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            this.f36513n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m38049b(String str) {
        try {
            if (this.f36506g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 2;
                this.f36506g.sendMessage(messageObtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public String m38063a() {
        return this.f36511l;
    }

    /* JADX INFO: renamed from: a */
    public void m38065a(boolean z) {
        boolean z2;
        try {
            z2 = z;
            try {
                C13248a c13248a = new C13248a(this.f36501b, this.f36502c, this.f36503d, this.f36504e, z2);
                c cVar = new c(c13248a);
                c13248a.m38027a(new b(c13248a, cVar));
                Handler handler = this.f36506g;
                if (handler != null) {
                    handler.postDelayed(cVar, WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
                }
                c13248a.m38030j();
            } catch (Exception e) {
                e = e;
                e.printStackTrace();
                if (z2) {
                    return;
                }
                m38049b("can't show because unknow error");
            }
        } catch (Exception e2) {
            e = e2;
            z2 = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m38054c(String str) {
        try {
            if (this.f36506g != null) {
                Message messageObtain = Message.obtain();
                messageObtain.obj = str;
                messageObtain.what = 4;
                this.f36506g.sendMessage(messageObtain);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m38043a(CampaignEx campaignEx) {
        d dVar = new d();
        if (f36499r != null && !TextUtils.isEmpty(this.f36502c)) {
            f36499r.put(this.f36502c, dVar);
        }
        Intent intent = new Intent(this.f36501b, (Class<?>) MBInterstitialActivity.class);
        intent.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
        intent.addFlags(268435456);
        if (!TextUtils.isEmpty(this.f36502c)) {
            intent.putExtra("unitId", this.f36502c);
        }
        if (campaignEx != null) {
            this.f36512m = campaignEx.getRequestId();
            intent.putExtra("campaign", campaignEx);
        }
        Context context = this.f36501b;
        if (context != null) {
            context.startActivity(intent);
        }
    }
}
