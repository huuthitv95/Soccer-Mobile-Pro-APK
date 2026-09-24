package com.ironsource;

import android.text.TextUtils;
import com.ironsource.AbstractC12259j3;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.ironsource.xg */
/* JADX INFO: loaded from: classes6.dex */
public class C12609xg<Smash extends AbstractC12259j3<?>> {

    /* JADX INFO: renamed from: d */
    AbstractC12259j3<?> f33189d;

    /* JADX INFO: renamed from: e */
    private final List<String> f33190e;

    /* JADX INFO: renamed from: f */
    private final int f33191f;

    /* JADX INFO: renamed from: h */
    InterfaceC12627yg f33193h;

    /* JADX INFO: renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f33186a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    private String f33187b = "";

    /* JADX INFO: renamed from: c */
    private String f33188c = "";

    /* JADX INFO: renamed from: g */
    private final Timer f33192g = new Timer();

    /* JADX INFO: renamed from: i */
    private final int f33194i = 5;

    /* JADX INFO: renamed from: com.ironsource.xg$a */
    class a extends TimerTask {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f33195a;

        a(String str) {
            this.f33195a = str;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("removing waterfall with id " + this.f33195a + " from memory");
                C12609xg.this.f33186a.remove(this.f33195a);
                ironLog.verbose("waterfall size is currently " + C12609xg.this.f33186a.size());
            } finally {
                cancel();
            }
        }
    }

    public C12609xg(List<String> list, int i, InterfaceC12627yg interfaceC12627yg) {
        this.f33190e = list;
        this.f33191f = i;
        this.f33193h = interfaceC12627yg;
    }

    /* JADX INFO: renamed from: e */
    private synchronized boolean m34188e() {
        AbstractC12259j3<?> abstractC12259j3;
        abstractC12259j3 = this.f33189d;
        return abstractC12259j3 != null && abstractC12259j3.m31810C() && this.f33189d.m31823h().equals(this.f33188c);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m34190a(AbstractC12259j3<?> abstractC12259j3) {
        IronLog.INTERNAL.verbose();
        AbstractC12259j3<?> abstractC12259j4 = this.f33189d;
        if (abstractC12259j4 != null && !abstractC12259j4.equals(abstractC12259j3)) {
            this.f33189d.m31812M();
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m34194b(AbstractC12259j3<?> abstractC12259j3) {
        IronLog.INTERNAL.verbose();
        this.f33189d = abstractC12259j3;
    }

    /* JADX INFO: renamed from: c */
    public String m34195c() {
        return this.f33187b;
    }

    /* JADX INFO: renamed from: d */
    public AbstractC12259j3<?> m34196d() {
        return this.f33189d;
    }

    /* JADX INFO: renamed from: b */
    public List<Smash> m34193b() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f33186a.get(this.f33187b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList() : copyOnWriteArrayList;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0049 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:29:0x0049, B:6:0x0008, B:8:0x000d, B:11:0x0012, B:13:0x0016, B:16:0x001d, B:18:0x0021, B:21:0x002e, B:23:0x0032, B:25:0x003a), top: B:35:0x0001 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:29:0x0049, please report this as an issue */
    /* JADX INFO: renamed from: a */
    public synchronized boolean m34191a(C11588O0.a aVar, String str, String str2, LoadWhileShowSupportState loadWhileShowSupportState, AdapterBaseInterface adapterBaseInterface, IronSource.EnumC12328a enumC12328a) {
        boolean z;
        AbstractC12259j3<?> abstractC12259j3;
        if (!m34192a(adapterBaseInterface, enumC12328a, str)) {
            z = true;
            if ((aVar == C11588O0.a.AUTOMATIC_LOAD_WHILE_SHOW || aVar == C11588O0.a.MANUAL_WITH_LOAD_ON_SHOW) && (abstractC12259j3 = this.f33189d) != null && abstractC12259j3.m31810C() && ((loadWhileShowSupportState == LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK && this.f33189d.mo26207c().equals(str)) || ((loadWhileShowSupportState == LoadWhileShowSupportState.NONE || this.f33190e.contains(str2)) && this.f33189d.m31829n().equals(str2)))) {
            }
            if (!z) {
                IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
            }
        }
        z = false;
        if (!z) {
            IronLog.INTERNAL.verbose(str + " will not be added to the auction request");
        }
        return z;
    }

    /* JADX INFO: renamed from: a */
    public boolean m34192a(AdapterBaseInterface adapterBaseInterface, IronSource.EnumC12328a enumC12328a, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (ContextProvider.getInstance().getCurrentActiveActivity() != null || !(adapterBaseInterface instanceof AdapterSettingsInterface) || !((AdapterSettingsInterface) adapterBaseInterface).isUsingActivityBeforeImpression(C12518sf.m33676a(enumC12328a))) {
            return false;
        }
        ironLog.verbose(str + " - is using activity before impression and activity is null");
        return true;
    }

    /* JADX INFO: renamed from: a */
    public void m34189a(C11588O0.a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        m34187a();
        if (aVar != C11588O0.a.AUTOMATIC_LOAD_WHILE_SHOW && aVar != C11588O0.a.MANUAL_WITH_LOAD_ON_SHOW) {
            this.f33186a.clear();
            this.f33186a.put(str, copyOnWriteArrayList);
        } else {
            this.f33186a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f33188c)) {
                if (m34188e()) {
                    ironLog.verbose("ad from previous waterfall " + this.f33188c + " is still showing - the current waterfall " + this.f33187b + " will be deleted instead");
                    String str2 = this.f33187b;
                    this.f33187b = this.f33188c;
                    this.f33188c = str2;
                }
                this.f33192g.schedule(new a(this.f33188c), this.f33191f);
            }
        }
        this.f33188c = this.f33187b;
        this.f33187b = str;
        if (this.f33186a.size() > 5) {
            this.f33193h.mo31703a(this.f33186a.size());
        }
    }

    /* JADX INFO: renamed from: a */
    private void m34187a() {
        for (Smash smash : m34193b()) {
            if (!smash.equals(this.f33189d)) {
                smash.m31812M();
            }
        }
    }
}
