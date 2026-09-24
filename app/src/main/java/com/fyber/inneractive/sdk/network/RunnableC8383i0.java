package com.fyber.inneractive.sdk.network;

import android.os.Process;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.features.C7984l;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.i0 */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8383i0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8392l0 f18660a;

    public RunnableC8383i0(C8392l0 c8392l0) {
        this.f18660a = c8392l0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0064  */
    /* JADX WARN: Code duplicated, block: B:31:0x0066  */
    @Override // java.lang.Runnable
    public final void run() {
        AbstractC8416t0 abstractC8416t0;
        boolean z;
        C8356a c8356aMo20793i;
        C8401o0 c8401o0M20767a;
        InterfaceC8404p0 interfaceC8404p0;
        InterfaceC8404p0 interfaceC8404p1;
        InterfaceC8404p0 interfaceC8404p2;
        C8392l0 c8392l0 = this.f18660a;
        c8392l0.getClass();
        Process.setThreadPriority(10);
        while (c8392l0.f18674b) {
            C8401o0 c8401o0 = null;
            try {
                abstractC8416t0 = (AbstractC8416t0) c8392l0.f18673a.take();
            } catch (InterruptedException unused) {
                if (!c8392l0.f18674b) {
                    Thread.currentThread().interrupt();
                }
                abstractC8416t0 = null;
            }
            if (abstractC8416t0 != null && !abstractC8416t0.f18711a) {
                EnumC8384i1 enumC8384i1 = EnumC8384i1.RUNNING;
                abstractC8416t0.f18716f = enumC8384i1;
                if (enumC8384i1 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p2 = abstractC8416t0.f18714d) != null) {
                    interfaceC8404p2.mo20332a("sdkRequestEndedButWillBeRetried");
                }
                if (abstractC8416t0.f18725o) {
                    Boolean boolMo20420c = ((C7984l) IAConfigManager.f17654M.f17667K.m20432a(C7984l.class)).mo20420c("should_manage_request_watchdog");
                    if (boolMo20420c != null ? boolMo20420c.booleanValue() : true) {
                        z = true;
                    } else if (abstractC8416t0.m20795v()) {
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (abstractC8416t0.m20795v()) {
                    z = true;
                } else {
                    z = false;
                }
                IAlog.m21945a("%s : NetworkExecutorImpl : should enabled watchdog : %s", IAlog.m21943a(c8392l0), Boolean.valueOf(z));
                if (z) {
                    C8387j1 c8387j1 = c8392l0.f18678f;
                    Thread threadCurrentThread = Thread.currentThread();
                    c8387j1.getClass();
                    IAlog.m21945a("%s : NetworkRequestWatchdog : register request: %s", IAlog.m21943a(c8387j1), abstractC8416t0.f18717g);
                    int iMo20754s = abstractC8416t0.mo20754s();
                    C8393l1 c8393l1Mo20752p = abstractC8416t0.mo20752p();
                    C8399n1 c8399n1 = new C8399n1(abstractC8416t0, threadCurrentThread, c8393l1Mo20752p.f18679a + c8393l1Mo20752p.f18680b + iMo20754s);
                    c8387j1.f18664a.putIfAbsent(abstractC8416t0.f18717g, c8399n1);
                    AbstractC9183r.f21478b.postDelayed(c8399n1.f18689d, c8399n1.f18688c);
                }
                try {
                    c8356aMo20793i = (abstractC8416t0.f18711a || abstractC8416t0.mo20792h() == null) ? null : abstractC8416t0.mo20793i();
                } catch (Exception e) {
                    IAlog.m21945a("failed fetching cache data for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
                    if (!abstractC8416t0.f18711a) {
                        abstractC8416t0.m20789a((Object) null, e, true);
                    }
                }
                if (c8356aMo20793i != null && c8356aMo20793i.f18620b != null && !abstractC8416t0.f18711a) {
                    abstractC8416t0.m20789a(c8356aMo20793i.f18620b, (Exception) null, true);
                }
                try {
                    C8391l c8391lM20766a = c8392l0.m20766a(abstractC8416t0, c8356aMo20793i);
                    c8401o0M20767a = c8392l0.m20767a(abstractC8416t0, c8391lM20766a);
                    try {
                        C8392l0.m20764a(abstractC8416t0, c8391lM20766a, c8401o0M20767a);
                        C8392l0.m20765a(abstractC8416t0, c8401o0M20767a);
                        try {
                            abstractC8416t0.m20791e();
                        } catch (Exception unused2) {
                        }
                        EnumC8384i1 enumC8384i2 = EnumC8384i1.DONE;
                        abstractC8416t0.f18716f = enumC8384i2;
                        if (enumC8384i2 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p1 = abstractC8416t0.f18714d) != null) {
                            interfaceC8404p1.mo20332a("sdkRequestEndedButWillBeRetried");
                        }
                    } catch (C8417t1 unused3) {
                        c8401o0 = c8401o0M20767a;
                        C8392l0.m20765a(abstractC8416t0, c8401o0);
                        try {
                            abstractC8416t0.m20791e();
                        } catch (Exception unused4) {
                        }
                        EnumC8384i1 enumC8384i3 = EnumC8384i1.DONE;
                        abstractC8416t0.f18716f = enumC8384i3;
                        if (enumC8384i3 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p1 = abstractC8416t0.f18714d) != null) {
                        }
                        c8392l0.m20769b(abstractC8416t0);
                    } catch (Exception e2) {
                        e = e2;
                        if (!abstractC8416t0.f18711a) {
                            abstractC8416t0.m20789a((Object) null, e, false);
                        }
                        C8392l0.m20765a(abstractC8416t0, c8401o0M20767a);
                        try {
                            abstractC8416t0.m20791e();
                        } catch (Exception unused5) {
                        }
                        EnumC8384i1 enumC8384i4 = EnumC8384i1.DONE;
                        abstractC8416t0.f18716f = enumC8384i4;
                        if (enumC8384i4 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p1 = abstractC8416t0.f18714d) != null) {
                        }
                        c8392l0.m20769b(abstractC8416t0);
                    } catch (Throwable th) {
                        th = th;
                        try {
                            if (!abstractC8416t0.f18711a) {
                                abstractC8416t0.m20789a((Object) null, new Exception(th), false);
                            }
                            C8392l0.m20765a(abstractC8416t0, c8401o0M20767a);
                            try {
                                abstractC8416t0.m20791e();
                            } catch (Exception unused6) {
                            }
                            EnumC8384i1 enumC8384i5 = EnumC8384i1.DONE;
                            abstractC8416t0.f18716f = enumC8384i5;
                            if (enumC8384i5 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p1 = abstractC8416t0.f18714d) != null) {
                            }
                            c8392l0.m20769b(abstractC8416t0);
                        } catch (Throwable th2) {
                            C8392l0.m20765a(abstractC8416t0, c8401o0M20767a);
                            try {
                                abstractC8416t0.m20791e();
                            } catch (Exception unused7) {
                            }
                            EnumC8384i1 enumC8384i6 = EnumC8384i1.DONE;
                            abstractC8416t0.f18716f = enumC8384i6;
                            if (enumC8384i6 == EnumC8384i1.QUEUED_FOR_RETRY && (interfaceC8404p0 = abstractC8416t0.f18714d) != null) {
                                interfaceC8404p0.mo20332a("sdkRequestEndedButWillBeRetried");
                            }
                            c8392l0.m20769b(abstractC8416t0);
                            throw th2;
                        }
                    }
                } catch (C8417t1 unused8) {
                } catch (Exception e3) {
                    e = e3;
                    c8401o0M20767a = null;
                } catch (Throwable th3) {
                    th = th3;
                    c8401o0M20767a = null;
                }
                c8392l0.m20769b(abstractC8416t0);
            }
        }
    }
}
