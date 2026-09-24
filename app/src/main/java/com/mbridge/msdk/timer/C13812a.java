package com.mbridge.msdk.timer;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.entity.C13075i;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.p289db.C13015e;
import com.mbridge.msdk.foundation.p289db.C13017g;
import com.mbridge.msdk.foundation.p289db.C13022l;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.reward.adapter.C13609c;
import com.mbridge.msdk.reward.adapter.InterfaceC13607a;
import com.mbridge.msdk.videocommon.setting.C14221a;
import com.mbridge.msdk.videocommon.setting.C14222b;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.timer.a */
/* JADX INFO: compiled from: LoopTimer.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13812a {

    /* JADX INFO: renamed from: a */
    private long f39354a;

    /* JADX INFO: renamed from: b */
    private boolean f39355b;

    /* JADX INFO: renamed from: c */
    private LinkedList<C13075i> f39356c;

    /* JADX INFO: renamed from: d */
    private LinkedList<C13075i> f39357d;

    /* JADX INFO: renamed from: e */
    private int f39358e;

    /* JADX INFO: renamed from: f */
    private int f39359f;

    /* JADX INFO: renamed from: g */
    private C13015e f39360g;

    /* JADX INFO: renamed from: h */
    private C14221a f39361h;

    /* JADX INFO: renamed from: i */
    private C13022l f39362i;

    /* JADX INFO: renamed from: j */
    private C13017g f39363j;

    /* JADX INFO: renamed from: k */
    private Handler f39364k;

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$a */
    /* JADX INFO: compiled from: LoopTimer.java */
    class a extends Handler {
        a() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            synchronized (C13812a.this) {
                int i = message.what;
                if (i != 1) {
                    if (i == 2) {
                        C13812a.this.m40982c();
                    }
                } else {
                    if (C13812a.this.f39355b) {
                        return;
                    }
                    C13812a c13812a = C13812a.this;
                    c13812a.m40974a(c13812a.f39354a);
                    sendMessageDelayed(obtainMessage(1), C13812a.this.f39354a);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$b */
    /* JADX INFO: compiled from: LoopTimer.java */
    class b implements InterfaceC13607a {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13609c f39366a;

        b(C13609c c13609c) {
            this.f39366a = c13609c;
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38980a(String str, C13154c c13154c) {
            C13812a.this.f39364k.sendMessage(C13812a.this.f39364k.obtainMessage(2));
            this.f39366a.m39110a((InterfaceC13607a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38981a(List<CampaignEx> list, C13082b c13082b, C13154c c13154c) {
            C13812a.this.f39364k.sendMessage(C13812a.this.f39364k.obtainMessage(2));
            this.f39366a.m39110a((InterfaceC13607a) null);
        }

        @Override // com.mbridge.msdk.reward.adapter.InterfaceC13607a
        /* JADX INFO: renamed from: a */
        public void mo38982a(List<CampaignEx> list, C13154c c13154c) {
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.timer.a$c */
    /* JADX INFO: compiled from: LoopTimer.java */
    static class c {

        /* JADX INFO: renamed from: a */
        static C13812a f39368a = new C13812a(null);
    }

    private C13812a() {
        this.f39355b = false;
        this.f39356c = new LinkedList<>();
        this.f39357d = new LinkedList<>();
        this.f39358e = 0;
        this.f39359f = 0;
        this.f39364k = new a();
    }

    /* synthetic */ C13812a(a aVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public static C13812a m40973a() {
        return c.f39368a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m40974a(long j) {
        LinkedList<C13075i> linkedList = this.f39356c;
        if (linkedList == null || linkedList.size() <= 0 || this.f39358e == 0 || this.f39356c.size() <= this.f39358e) {
            LinkedList<C13075i> linkedList2 = this.f39357d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f39359f == 0 || this.f39357d.size() == this.f39359f) {
                this.f39359f = 0;
                this.f39358e = 0;
                Handler handler = this.f39364k;
                handler.sendMessage(handler.obtainMessage(2));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40976a(String str, String str2, boolean z) {
        try {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (contextM36542d == null) {
                return;
            }
            C13609c c13609c = new C13609c(contextM36542d, str, str2);
            c13609c.m39129d(z);
            c13609c.m39110a(new b(c13609c));
            C13154c c13154c = new C13154c();
            c13154c.m37446i(SameMD5.getMD5(C13229v0.m37920d()));
            c13154c.m37456n(str2);
            if (z) {
                c13154c.m37420a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
            } else {
                c13154c.m37420a(94);
            }
            c13154c.m37444h("0");
            c13154c.m37440f("1");
            c13609c.m39107a(1, 8000, false, c13154c);
        } catch (Exception e) {
            C13219q0.m37817b("LoopTimer", e.getMessage(), e);
        }
    }

    /* JADX INFO: renamed from: a */
    private boolean m40977a(C13075i c13075i) {
        boolean z = false;
        if (c13075i != null && !TextUtils.isEmpty(c13075i.m36885g())) {
            String strM36885g = c13075i.m36885g();
            try {
                if (this.f39360g == null) {
                    return true;
                }
                C14221a c14221a = this.f39361h;
                int iM36646a = this.f39360g.m36646a(strM36885g, c14221a != null ? c14221a.m42647e() : 0L);
                if (iM36646a == -1) {
                    m40986a(strM36885g);
                } else if (iM36646a == 1) {
                    return true;
                }
                try {
                    Handler handler = this.f39364k;
                    handler.sendMessage(handler.obtainMessage(2));
                    return false;
                } catch (Throwable th) {
                    th = th;
                }
            } catch (Throwable th2) {
                th = th2;
                z = true;
            }
            C13219q0.m37817b("LoopTimer", th.getMessage(), th);
        }
        return z;
    }

    /* JADX INFO: renamed from: b */
    private void m40980b() {
        if (this.f39363j == null) {
            this.f39363j = C13017g.m36693a(C13008c.m36588n().m36542d());
        }
        if (this.f39362i == null) {
            this.f39362i = C13022l.m36717a(this.f39363j);
        }
        List<C13075i> listM36718a = this.f39362i.m36718a(MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        if (listM36718a != null) {
            this.f39357d.addAll(listM36718a);
            for (C13075i c13075i : listM36718a) {
                m40987a(c13075i.m36884d(), c13075i.m36885g());
            }
        }
        List<C13075i> listM36718a2 = this.f39362i.m36718a(94);
        if (listM36718a2 != null) {
            this.f39356c.addAll(listM36718a2);
            for (C13075i c13075i2 : listM36718a2) {
                m40989b(c13075i2.m36884d(), c13075i2.m36885g());
            }
        }
        if (this.f39360g == null) {
            this.f39360g = C13015e.m36643a(this.f39363j);
        }
        if (this.f39361h == null) {
            this.f39361h = C14222b.m42658b().m42670c();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m40981b(String str) {
        C13022l c13022l = this.f39362i;
        if (c13022l != null) {
            c13022l.m36719a(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public void m40982c() {
        try {
            LinkedList<C13075i> linkedList = this.f39356c;
            if (linkedList != null && linkedList.size() > 0 && this.f39358e < this.f39356c.size()) {
                C13075i c13075i = this.f39356c.get(this.f39358e);
                this.f39358e++;
                if (m40977a(c13075i)) {
                    m40976a(c13075i.m36884d(), c13075i.m36885g(), false);
                    return;
                }
                return;
            }
            LinkedList<C13075i> linkedList2 = this.f39357d;
            if (linkedList2 == null || linkedList2.size() <= 0 || this.f39359f >= this.f39357d.size()) {
                return;
            }
            C13075i c13075i2 = this.f39357d.get(this.f39359f);
            this.f39359f++;
            if (m40977a(c13075i2)) {
                m40984c(c13075i2.m36884d(), c13075i2.m36885g());
            }
        } catch (Throwable th) {
            C13219q0.m37817b("LoopTimer", th.getMessage(), th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m40984c(String str, String str2) {
        m40976a(str, str2, true);
    }

    /* JADX INFO: renamed from: a */
    public void m40986a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        LinkedList<C13075i> linkedList = this.f39356c;
        if (linkedList == null || !linkedList.contains(str)) {
            LinkedList<C13075i> linkedList2 = this.f39357d;
            if (linkedList2 != null && linkedList2.contains(str)) {
                this.f39357d.remove(str);
            }
        } else {
            this.f39356c.remove(str);
        }
        m40981b(str);
    }

    /* JADX INFO: renamed from: a */
    public void m40987a(String str, String str2) {
        if (this.f39357d.contains(str2)) {
            return;
        }
        this.f39357d.add(new C13075i(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO));
        C13022l c13022l = this.f39362i;
        if (c13022l != null) {
            c13022l.m36720a(str, str2, MBSupportMuteAdType.INTERSTITIAL_VIDEO);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m40988b(long j) {
        m40980b();
        this.f39354a = j;
        this.f39355b = false;
        Handler handler = this.f39364k;
        handler.sendMessageDelayed(handler.obtainMessage(1), this.f39354a);
    }

    /* JADX INFO: renamed from: b */
    public void m40989b(String str, String str2) {
        if (this.f39356c.contains(str2)) {
            return;
        }
        this.f39356c.add(new C13075i(str, str2, 94));
        C13022l c13022l = this.f39362i;
        if (c13022l != null) {
            c13022l.m36720a(str, str2, 94);
        }
    }
}
