package com.mbridge.msdk.click.retry;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.ironsource.C11744X3;
import com.mbridge.msdk.click.C12682a;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13144f;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a */
/* JADX INFO: compiled from: RetryReportControl.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12701a {

    /* JADX INFO: renamed from: e */
    public static String f33758e = "mtg_retry_report=1";

    /* JADX INFO: renamed from: f */
    public static int f33759f = 10000;

    /* JADX INFO: renamed from: g */
    public static int f33760g = 3;

    /* JADX INFO: renamed from: h */
    public static int f33761h = 50;

    /* JADX INFO: renamed from: i */
    public static int f33762i = 600000;

    /* JADX INFO: renamed from: j */
    private static int f33763j = 0;

    /* JADX INFO: renamed from: k */
    private static int f33764k = 0;

    /* JADX INFO: renamed from: l */
    public static int f33765l = 0;

    /* JADX INFO: renamed from: m */
    public static int f33766m = 1;

    /* JADX INFO: renamed from: n */
    public static int f33767n = 2;

    /* JADX INFO: renamed from: o */
    public static int f33768o = 3;

    /* JADX INFO: renamed from: p */
    public static int f33769p = 4;

    /* JADX INFO: renamed from: q */
    public static int f33770q = 5;

    /* JADX INFO: renamed from: a */
    private ConcurrentHashMap<String, C12702b> f33771a;

    /* JADX INFO: renamed from: b */
    private C12703c f33772b;

    /* JADX INFO: renamed from: c */
    private BroadcastReceiver f33773c;

    /* JADX INFO: renamed from: d */
    private final Handler f33774d;

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$a */
    /* JADX INFO: compiled from: RetryReportControl.java */
    class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.net.conn.CONNECTIVITY_CHANGE".equals(intent.getAction())) {
                C12701a.this.f33774d.sendEmptyMessage(2);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$b */
    /* JADX INFO: compiled from: RetryReportControl.java */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static C12701a f33776a = new C12701a(null);
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.click.retry.a$c */
    /* JADX INFO: compiled from: RetryReportControl.java */
    private static class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    return;
                }
                C12701a.m34779b().m34781c();
            } else {
                Object obj = message.obj;
                if (obj instanceof String) {
                    C12701a.m34779b().m34775a((String) obj, C12702b.f33777k);
                }
            }
        }
    }

    private C12701a() {
        this.f33771a = new ConcurrentHashMap<>();
        this.f33772b = new C12703c(f33761h);
        this.f33774d = new c(Looper.getMainLooper());
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        f33760g = c13635gM39714b.m39517h0();
        f33759f = c13635gM39714b.m39526j0() * 1000;
        f33762i = c13635gM39714b.m39530k0() * 1000;
        f33763j = c13635gM39714b.m39511g0();
        f33764k = c13635gM39714b.m39522i0();
        m34769a();
    }

    /* synthetic */ C12701a(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    private void m34769a() {
        try {
            if (this.f33773c == null) {
                this.f33773c = new a();
                Context contextM36542d = C13008c.m36588n().m36542d();
                if (contextM36542d != null) {
                    contextM36542d.registerReceiver(this.f33773c, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m34770a(Context context, String str, String str2, String str3, String str4, int i) {
        C13144f.m37354a().m37355a(context, str, str2, str3, str4, i);
    }

    /* JADX INFO: renamed from: a */
    private void m34773a(C12702b c12702b) {
        String str;
        String requestIdNotice;
        try {
            CampaignEx campaignExM34785a = c12702b.m34785a();
            if (campaignExM34785a != null) {
                String requestId = campaignExM34785a.getRequestId();
                requestIdNotice = campaignExM34785a.getRequestIdNotice();
                str = requestId;
            } else {
                str = "";
                requestIdNotice = str;
            }
            m34770a(C13008c.m36588n().m36542d(), c12702b.m34790b().toString(), c12702b.m34798g(), str, requestIdNotice, c12702b.m34799h());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34774a(String str) {
        Message messageObtainMessage = this.f33774d.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.obj = str;
        this.f33774d.sendMessageDelayed(messageObtainMessage, f33759f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m34775a(String str, int i) {
        String str2;
        C12703c c12703c = this.f33772b;
        if (c12703c != null) {
            C12702b c12702bM34804a = c12703c.m34804a(str);
            this.f33772b.m34807b(str);
            if (c12702bM34804a == null) {
                C12702b c12702b = this.f33771a.get(str);
                if (c12702b == null || System.currentTimeMillis() > c12702b.m34794c() + ((long) f33762i) || c12702b.m34796e() >= f33760g || i == C12702b.f33778l) {
                    return;
                }
                m34774a(str);
                return;
            }
            if (System.currentTimeMillis() > c12702bM34804a.m34794c() + ((long) f33762i)) {
                if (i != C12702b.f33778l) {
                    m34773a(c12702bM34804a);
                    return;
                }
                return;
            }
            c12702bM34804a.m34786a(i);
            this.f33771a.put(str, c12702bM34804a);
            if (C13188c1.m37647c(str) == 0) {
                str2 = str + "?" + f33758e;
            } else {
                str2 = str + C11744X3.j.f26436c + f33758e;
            }
            C12682a.m34606a(C13008c.m36588n().m36542d(), c12702bM34804a.m34785a(), c12702bM34804a.m34797f(), str2, c12702bM34804a.m34800i(), c12702bM34804a.m34801j(), c12702bM34804a.m34799h());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34776a(String str, C12702b c12702b) {
        if (this.f33772b == null) {
            this.f33772b = new C12703c(f33761h);
        }
        this.f33772b.m34806a(str, c12702b);
    }

    /* JADX INFO: renamed from: a */
    private boolean m34777a(int i) {
        return i == f33769p || i == f33768o;
    }

    /* JADX INFO: renamed from: b */
    public static C12701a m34779b() {
        return b.f33776a;
    }

    /* JADX INFO: renamed from: b */
    private boolean m34780b(int i) {
        return i == f33766m || i == f33767n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m34781c() {
        C12703c c12703c = this.f33772b;
        if (c12703c != null) {
            Iterator<String> it = c12703c.m34805a().iterator();
            while (it.hasNext()) {
                m34775a(it.next(), C12702b.f33778l);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m34782c(int i) {
        return m34777a(i) || m34780b(i) || i == f33770q;
    }

    /* JADX INFO: renamed from: a */
    public void m34783a(String str, String str2, CampaignEx campaignEx, String str3, boolean z, boolean z2, int i) {
        if (!m34782c(i) || TextUtils.isEmpty(str)) {
            return;
        }
        String strReplace = str.replace("?" + f33758e, "").replace(C11744X3.j.f26436c + f33758e, "");
        if (this.f33771a == null) {
            this.f33771a = new ConcurrentHashMap<>();
        }
        C12702b c12702bRemove = this.f33771a.remove(strReplace);
        if (c12702bRemove == null) {
            c12702bRemove = new C12702b(str, str2);
            c12702bRemove.m34791b(i);
            c12702bRemove.m34789a(z);
            c12702bRemove.m34793b(z2);
            c12702bRemove.m34787a(campaignEx);
            c12702bRemove.m34792b(str3);
        } else if (c12702bRemove.m34795d() != C12702b.f33778l) {
            c12702bRemove.m34788a(str2);
        }
        if ((!m34777a(i) || f33763j == 0) && ((!m34780b(i) || f33764k == 0) && i != f33770q)) {
            m34773a(c12702bRemove);
            return;
        }
        if (System.currentTimeMillis() >= c12702bRemove.m34794c() + ((long) f33762i)) {
            if (c12702bRemove.m34795d() == C12702b.f33777k) {
                m34773a(c12702bRemove);
                return;
            }
            return;
        }
        m34776a(strReplace, c12702bRemove);
        if (c12702bRemove.m34795d() == C12702b.f33777k) {
            if (c12702bRemove.m34796e() <= f33760g) {
                m34774a(strReplace);
            } else {
                m34773a(c12702bRemove);
            }
        }
    }
}
