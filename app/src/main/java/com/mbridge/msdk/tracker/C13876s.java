package com.mbridge.msdk.tracker;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.unity3d.services.UnityAdsConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.s */
/* JADX INFO: compiled from: ReportManager.java */
/* JADX INFO: loaded from: classes7.dex */
class C13876s {

    /* JADX INFO: renamed from: a */
    private final C13816c f39610a;

    /* JADX INFO: renamed from: b */
    private final int f39611b;

    /* JADX INFO: renamed from: c */
    private final int f39612c;

    /* JADX INFO: renamed from: d */
    private final int f39613d;

    /* JADX INFO: renamed from: e */
    private final C13824k f39614e;

    /* JADX INFO: renamed from: i */
    private Handler f39618i;

    /* JADX INFO: renamed from: f */
    private final AtomicInteger f39615f = new AtomicInteger(0);

    /* JADX INFO: renamed from: g */
    private final AtomicInteger f39616g = new AtomicInteger(0);

    /* JADX INFO: renamed from: h */
    private final Object f39617h = new Object();

    /* JADX INFO: renamed from: j */
    private boolean f39619j = true;

    /* JADX INFO: renamed from: k */
    private long f39620k = 0;

    /* JADX INFO: renamed from: l */
    private volatile boolean f39621l = false;

    /* JADX INFO: renamed from: m */
    private volatile boolean f39622m = false;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.s$a */
    /* JADX INFO: compiled from: ReportManager.java */
    private static final class a implements InterfaceC13875r {

        /* JADX INFO: renamed from: a */
        private final Handler f39623a;

        /* JADX INFO: renamed from: b */
        private final C13876s f39624b;

        public a(Handler handler, C13876s c13876s) {
            this.f39623a = handler;
            this.f39624b = c13876s;
        }

        @Override // com.mbridge.msdk.tracker.InterfaceC13875r
        /* JADX INFO: renamed from: a */
        public void mo41345a(C13877t c13877t) {
            this.f39624b.m41355b(c13877t.m41379a());
            this.f39624b.m41366i();
            this.f39624b.f39620k = 0L;
            if (this.f39624b.m41372f()) {
                Handler handler = this.f39623a;
                handler.sendMessage(Message.obtain(handler, 2));
            }
            if (C13814a.f39370a) {
                Log.d("TrackManager", this.f39624b.f39614e.m41066v() + " report success " + c13877t.m41379a().size() + " 剩余事件数：" + this.f39624b.f39616g.addAndGet(0) + " 个，数据库记录数：" + this.f39624b.f39610a.m40998b() + " 个");
            }
        }

        @Override // com.mbridge.msdk.tracker.InterfaceC13875r
        /* JADX INFO: renamed from: a */
        public void mo41346a(C13877t c13877t, int i, String str) {
            this.f39624b.m41353a(c13877t.m41379a(), str);
            this.f39624b.f39620k = System.currentTimeMillis();
            int iM41358d = this.f39624b.m41358d();
            if (iM41358d <= 10) {
                this.f39623a.removeMessages(3);
                Handler handler = this.f39623a;
                handler.sendMessageDelayed(Message.obtain(handler, 3), ((long) iM41358d) * 1000);
            }
            if (C13814a.f39370a) {
                Log.d("TrackManager", this.f39624b.f39614e.m41066v() + " report failed " + c13877t.m41379a().size() + " 剩余事件数：" + this.f39624b.f39616g.addAndGet(0) + " 个，数据库记录数：" + this.f39624b.f39610a.m40998b() + " 个 连续失败次数： " + iM41358d);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.s$b */
    /* JADX INFO: compiled from: ReportManager.java */
    private static final class b extends Handler {

        /* JADX INFO: renamed from: a */
        private final C13876s f39625a;

        public b(Looper looper, C13876s c13876s) {
            super(looper);
            this.f39625a = c13876s;
        }

        /* JADX INFO: renamed from: a */
        private synchronized void m41376a() {
            try {
                this.f39625a.m41364h();
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", this.f39625a.f39614e.m41066v() + " report failed ", e);
                }
            }
        }

        /* JADX INFO: renamed from: a */
        private void m41377a(String str) {
            Log.d("TrackManager", this.f39625a.f39614e.m41066v() + " " + str + this.f39625a.f39616g.addAndGet(0) + " 数据库记录数：" + this.f39625a.f39610a.m40998b());
        }

        /* JADX INFO: renamed from: b */
        private void m41378b() {
            try {
                removeMessages(1);
                removeMessages(6);
                removeMessages(2);
                removeMessages(3);
            } catch (Exception e) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", this.f39625a.f39614e.m41066v() + " removeMessages failed ", e);
                }
            }
            if (this.f39625a.m41373g()) {
                return;
            }
            try {
                sendMessageDelayed(Message.obtain(this, 1), C13882y.m41411a(this.f39625a.f39615f.get(), this.f39625a.f39620k, this.f39625a.f39612c));
            } catch (Exception e2) {
                if (C13814a.f39370a) {
                    Log.e("TrackManager", this.f39625a.f39614e.m41066v() + " sendMessageDelayed failed ", e2);
                }
            }
        }

        @Override // android.os.Handler
        public void dispatchMessage(Message message) {
            super.dispatchMessage(message);
            int i = message.what;
            if (i == 2 || i == 3) {
                m41378b();
                if (C13814a.f39370a) {
                    m41377a("触发上报（report result）当前 Event 数量：");
                }
                m41376a();
                return;
            }
            if (i == 5) {
                if (C13814a.f39370a) {
                    m41377a("触发删除 当前 Event 数量：");
                }
                this.f39625a.m41348a();
                sendMessageDelayed(Message.obtain(this, 5), UnityAdsConstants.Timeout.INIT_TIMEOUT_MS);
                return;
            }
            if (i != 6) {
                if (i != 7) {
                    m41378b();
                    if (C13814a.f39370a) {
                        m41377a("触发上报（timer）当前 Event 数量：");
                    }
                    m41376a();
                    return;
                }
                this.f39625a.m41375k();
                m41378b();
                if (C13814a.f39370a) {
                    m41377a("触发上报（flush）当前 Event 数量：");
                }
                m41376a();
                return;
            }
            Object obj = message.obj;
            C13818e c13818e = obj instanceof C13818e ? (C13818e) obj : null;
            if (C13814a.f39370a && !C13882y.m41417b(c13818e)) {
                m41377a(String.format("收到 Event( %s )，当前 Event 数量：", c13818e.m41012g()));
            }
            if (C13882y.m41413a(c13818e) || this.f39625a.m41372f()) {
                m41378b();
                if (C13814a.f39370a) {
                    m41377a("触发上报（notice check）当前 Event 数量：");
                }
                m41376a();
            }
        }
    }

    public C13876s(C13824k c13824k) {
        this.f39610a = c13824k.m41048d();
        this.f39611b = c13824k.m41053i();
        this.f39612c = c13824k.m41056l();
        this.f39613d = c13824k.m41054j();
        this.f39614e = c13824k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41348a() {
        if (C13814a.f39370a) {
            return;
        }
        int iM40994a = this.f39610a.m40994a();
        if (C13814a.f39370a) {
            Log.d("TrackManager", this.f39614e.m41066v() + " 删除无效数据的数量 = " + iM40994a + " 当前剩余事件数 = " + this.f39616g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f39610a.m40998b());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41352a(List<C13822i> list) {
        this.f39610a.m40999b(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m41353a(List<C13822i> list, String str) {
        if (C13882y.m41418b((List<?>) list)) {
            return;
        }
        int i = 0;
        for (C13822i c13822i : list) {
            if (!C13882y.m41417b(c13822i)) {
                boolean z = !c13822i.m41037l() && c13822i.m41033h() >= this.f39613d;
                boolean z2 = !c13822i.m41038m() && c13822i.m41032g() < System.currentTimeMillis();
                if (z || z2) {
                    c13822i.m41029b(-1);
                } else {
                    c13822i.m41025a(c13822i.m41033h() + 1);
                    c13822i.m41029b(3);
                    c13822i.m41027a(str);
                    i++;
                }
            }
        }
        this.f39610a.m40997a(list);
        this.f39616g.addAndGet(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m41355b(List<C13822i> list) {
        if (C13882y.m41418b((List<?>) list)) {
            return;
        }
        this.f39610a.m41001c(list);
    }

    /* JADX INFO: renamed from: c */
    private List<C13822i> m41357c() {
        return this.f39610a.m40996a(this.f39611b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public int m41358d() {
        return this.f39615f.getAndIncrement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m41364h() {
        List<C13822i> listM41357c = m41357c();
        if (C13882y.m41418b((List<?>) listM41357c)) {
            if (C13814a.f39370a) {
                Log.d("TrackManager", this.f39614e.m41066v() + " report: 没有可以上报的数据");
                return;
            }
            return;
        }
        m41352a(listM41357c);
        int size = listM41357c.size();
        this.f39616g.addAndGet(-size);
        boolean zM41044a = false;
        if (C13814a.f39370a) {
            Log.d("TrackManager", this.f39614e.m41066v() + " report: 上报的数量 = " + size + " 当前剩余事件数 = " + this.f39616g.addAndGet(0) + " 数据库中剩余事件数 = " + this.f39610a.m40998b());
        }
        try {
            zM41044a = this.f39614e.m41044a();
        } catch (IllegalStateException e) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", this.f39614e.m41066v() + " report environment check failed ", e);
            }
        }
        if (!zM41044a) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", this.f39614e.m41066v() + " report 失败，请检查 TrackConfig 配置是否正确");
                return;
            }
            return;
        }
        C13872o c13872oM41057m = this.f39614e.m41057m();
        c13872oM41057m.m41340a(new a(this.f39618i, this));
        Map<String, String> map = new HashMap<>();
        try {
            map = this.f39614e.m41050f().mo37328a(this.f39614e.m41065u(), listM41357c, this.f39614e.m41059o());
        } catch (Exception e2) {
            if (C13814a.f39370a) {
                Log.e("TrackManager", this.f39614e.m41066v() + " report decorate request params failed ", e2);
            }
        }
        c13872oM41057m.m41341b(new C13877t(listM41357c), map, C13882y.m41415a(listM41357c));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public void m41366i() {
        this.f39615f.set(0);
    }

    /* JADX INFO: renamed from: l */
    private void m41368l() {
        this.f39610a.m41000c();
    }

    /* JADX INFO: renamed from: a */
    public void m41369a(C13818e c13818e) {
        if (this.f39618i.hasMessages(6)) {
            return;
        }
        long jM41411a = C13882y.m41411a(this.f39615f.get(), this.f39620k, this.f39612c);
        if (jM41411a > this.f39612c) {
            Handler handler = this.f39618i;
            handler.sendMessageDelayed(Message.obtain(handler, 6, c13818e), (long) (jM41411a * 0.1f));
        } else {
            Handler handler2 = this.f39618i;
            handler2.sendMessage(Message.obtain(handler2, 6, c13818e));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m41370b() {
        this.f39618i.removeMessages(1);
        Handler handler = this.f39618i;
        handler.sendMessage(Message.obtain(handler, 7));
    }

    /* JADX INFO: renamed from: e */
    public void m41371e() {
        this.f39616g.incrementAndGet();
    }

    /* JADX INFO: renamed from: f */
    protected boolean m41372f() {
        return this.f39616g.addAndGet(0) >= this.f39611b;
    }

    /* JADX INFO: renamed from: g */
    boolean m41373g() {
        return this.f39619j;
    }

    /* JADX INFO: renamed from: j */
    public void m41374j() {
        HandlerThread handlerThread = new HandlerThread("report_timer");
        handlerThread.start();
        b bVar = new b(handlerThread.getLooper(), this);
        this.f39618i = bVar;
        bVar.sendMessageDelayed(Message.obtain(bVar, 5), 5000L);
        Handler handler = this.f39618i;
        handler.sendMessageDelayed(Message.obtain(handler, 1), this.f39612c);
        this.f39619j = false;
    }

    /* JADX INFO: renamed from: k */
    public void m41375k() {
        synchronized (this.f39617h) {
            if (!this.f39621l) {
                this.f39621l = true;
                m41368l();
            }
            if (!this.f39622m) {
                this.f39622m = true;
                this.f39616g.addAndGet(this.f39610a.m40998b());
            }
        }
    }
}
