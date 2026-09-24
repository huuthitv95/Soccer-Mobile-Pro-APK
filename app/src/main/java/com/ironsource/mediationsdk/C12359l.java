package com.ironsource.mediationsdk;

import com.ironsource.C12112b8;
import com.ironsource.C12595x2;
import com.ironsource.C12642zd;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.mediationsdk.l */
/* JADX INFO: loaded from: classes6.dex */
public class C12359l {

    /* JADX INFO: renamed from: f */
    private static final C12359l f31284f = new C12359l();

    /* JADX INFO: renamed from: a */
    private final Map<String, Long> f31285a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, Boolean> f31286b = new HashMap();

    /* JADX INFO: renamed from: c */
    private int f31287c;

    /* JADX INFO: renamed from: d */
    private int f31288d;

    /* JADX INFO: renamed from: e */
    private int f31289e;

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.l$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ IronSource.EnumC12328a f31290a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ IronSourceError f31291b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ String f31292c;

        a(IronSource.EnumC12328a enumC12328a, IronSourceError ironSourceError, String str) {
            this.f31290a = enumC12328a;
            this.f31291b = ironSourceError;
            this.f31292c = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IronLog.INTERNAL.verbose("onAdLoadFailed - invokeCallback after delaying");
            C12359l.this.m32561a(this.f31290a, this.f31291b);
            C12359l.this.f31286b.put(this.f31292c, Boolean.FALSE);
        }
    }

    private C12359l() {
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C12359l m32560a() {
        return f31284f;
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m32563b(IronSource.EnumC12328a enumC12328a, IronSourceError ironSourceError) {
        if (m32564b(enumC12328a)) {
            return;
        }
        String string = enumC12328a.toString();
        if (!this.f31285a.containsKey(string)) {
            m32561a(enumC12328a, ironSourceError);
            return;
        }
        long jM32559a = ((long) m32559a(enumC12328a)) * 1000;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f31285a.get(string).longValue();
        if (jCurrentTimeMillis > jM32559a) {
            m32561a(enumC12328a, ironSourceError);
            return;
        }
        this.f31286b.put(string, Boolean.TRUE);
        long j = jM32559a - jCurrentTimeMillis;
        IronLog.INTERNAL.verbose("delaying callback by " + j);
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new a(enumC12328a, ironSourceError, string), j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m32561a(IronSource.EnumC12328a enumC12328a, IronSourceError ironSourceError) {
        this.f31285a.put(enumC12328a.toString(), Long.valueOf(System.currentTimeMillis()));
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            C12642zd.m34322a().m34350a(ironSourceError);
            return;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            C12112b8.m31149a().m31176a(ironSourceError);
            return;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            C12595x2.m34097a().m34117a(ironSourceError);
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
    }

    /* JADX INFO: renamed from: a */
    public void m32562a(IronSource.EnumC12328a enumC12328a, int i) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            this.f31288d = i;
            return;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            this.f31287c = i;
            return;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            this.f31289e = i;
            return;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
    }

    /* JADX INFO: renamed from: a */
    private int m32559a(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return this.f31288d;
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return this.f31287c;
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return this.f31289e;
        }
        IronLog.INTERNAL.warning("ad unit not supported - " + enumC12328a);
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public synchronized boolean m32564b(IronSource.EnumC12328a enumC12328a) {
        if (!this.f31286b.containsKey(enumC12328a.toString())) {
            return false;
        }
        return this.f31286b.get(enumC12328a.toString()).booleanValue();
    }
}
