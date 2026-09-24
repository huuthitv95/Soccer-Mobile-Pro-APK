package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import com.chartboost.sdk.internal.Networking.AbstractC4214b;
import com.chartboost.sdk.internal.Networking.EndpointRepository;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.te */
/* JADX INFO: loaded from: classes3.dex */
public class C4073te implements C3792h3.a {

    /* JADX INFO: renamed from: a */
    public C4131w6 f16374a;

    /* JADX INFO: renamed from: b */
    public final C4001q8 f16375b;

    /* JADX INFO: renamed from: c */
    public final C3746f3 f16376c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC3644ag f16377d;

    /* JADX INFO: renamed from: e */
    public final AtomicReference f16378e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC4000q7 f16379f;

    /* JADX INFO: renamed from: g */
    public final EndpointRepository f16380g;

    /* JADX INFO: renamed from: h */
    public final C4031rg f16381h;

    /* JADX INFO: renamed from: i */
    public int f16382i = 1;

    /* JADX INFO: renamed from: j */
    public int f16383j = 0;

    /* JADX INFO: renamed from: k */
    public long f16384k = 0;

    /* JADX INFO: renamed from: l */
    public C3792h3 f16385l = null;

    /* JADX INFO: renamed from: m */
    public AtomicInteger f16386m = null;

    public C4073te(C4131w6 c4131w6, C4001q8 c4001q8, C3746f3 c3746f3, InterfaceC3644ag interfaceC3644ag, AtomicReference atomicReference, InterfaceC4000q7 interfaceC4000q7, EndpointRepository endpointRepository, C4031rg c4031rg) {
        this.f16374a = c4131w6;
        this.f16375b = c4001q8;
        this.f16376c = c3746f3;
        this.f16377d = interfaceC3644ag;
        this.f16378e = atomicReference;
        this.f16379f = interfaceC4000q7;
        this.f16380g = endpointRepository;
        this.f16381h = c4031rg;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m19487a() {
        int i = this.f16382i;
        if (i == 2) {
            C4048sb.m19407a("Change state to COOLDOWN", null);
            this.f16382i = 4;
            this.f16385l = null;
        } else if (i == 3) {
            C4048sb.m19407a("Change state to COOLDOWN", null);
            this.f16382i = 4;
            AtomicInteger atomicInteger = this.f16386m;
            this.f16386m = null;
            if (atomicInteger != null) {
                this.f16374a.m19753a(atomicInteger);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0026 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x0012, B:9:0x0021, B:14:0x0028, B:19:0x002f), top: B:26:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x002c A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:18:0x002e  */
    /* JADX WARN: Code duplicated, block: B:8:0x0012 A[Catch: all -> 0x003b, TryCatch #0 {, blocks: (B:5:0x0005, B:6:0x0009, B:8:0x0012, B:9:0x0021, B:14:0x0028, B:19:0x002f), top: B:26:0x0005 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x0026, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x002c, please report this as an issue */
    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo17844a(C3792h3 c3792h3, CBError cBError) {
        String str;
        InterfaceC3888l7 interfaceC3888l7Mo19132a;
        String errorDesc = "Prefetch failure";
        if (cBError == null) {
            str = errorDesc;
            interfaceC3888l7Mo19132a = this.f16379f.mo19132a();
            if (interfaceC3888l7Mo19132a != null) {
                interfaceC3888l7Mo19132a.mo43989track(new C3796h7(InterfaceC3807hi.f.PREFETCH_REQUEST_ERROR, str, "", "", null));
            }
            if (this.f16382i != 2) {
                return;
            }
            if (c3792h3 != this.f16385l) {
                return;
            }
            this.f16385l = null;
            C4048sb.m19407a("Change state to COOLDOWN", null);
            this.f16382i = 4;
            return;
        }
        errorDesc = cBError.getErrorDesc();
        str = errorDesc;
        interfaceC3888l7Mo19132a = this.f16379f.mo19132a();
        if (interfaceC3888l7Mo19132a != null) {
            interfaceC3888l7Mo19132a.mo43989track(new C3796h7(InterfaceC3807hi.f.PREFETCH_REQUEST_ERROR, str, "", "", null));
        }
        if (this.f16382i != 2) {
            return;
        }
        if (c3792h3 != this.f16385l) {
            return;
        }
        this.f16385l = null;
        C4048sb.m19407a("Change state to COOLDOWN", null);
        this.f16382i = 4;
        return;
        throw th;
    }

    @Override // com.chartboost.sdk.impl.C3792h3.a
    /* JADX INFO: renamed from: a */
    public synchronized void mo17845a(C3792h3 c3792h3, JSONObject jSONObject) {
        try {
            if (this.f16382i != 2) {
                return;
            }
            if (c3792h3 != this.f16385l) {
                return;
            }
            C4048sb.m19407a("Change state to DOWNLOAD_ASSETS", null);
            this.f16382i = 3;
            this.f16385l = null;
            this.f16386m = new AtomicInteger();
            if (jSONObject != null) {
                C4048sb.m19407a("Got Asset list for Prefetch from server: " + jSONObject, null);
                this.f16374a.m19751a(EnumC4095ue.LOW, C4038s1.m19375b(jSONObject, ((C3920mg) this.f16378e.get()).f15383o), this.f16386m, null, "");
            }
        } catch (Exception e) {
            C4048sb.m19410b("prefetch onSuccess", e);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m19488a(C3920mg c3920mg) {
        boolean z = c3920mg.f15386r;
        if (this.f16383j != 2 || z) {
            return;
        }
        C4048sb.m19407a("Change state to IDLE", null);
        this.f16382i = 1;
        this.f16383j = 0;
        this.f16384k = 0L;
        this.f16385l = null;
        AtomicInteger atomicInteger = this.f16386m;
        this.f16386m = null;
        if (atomicInteger != null) {
            this.f16374a.m19753a(atomicInteger);
        }
    }

    /* JADX INFO: renamed from: b */
    public synchronized void m19489b() {
        try {
            C4048sb.m19412c("Sdk Version = 9.11.1, Commit: 5e8bb392961ca14a32f21186a9030c507592feee", null);
            C3920mg c3920mg = (C3920mg) this.f16378e.get();
            m19488a(c3920mg);
            if (!c3920mg.m18668g() && !c3920mg.m18667f()) {
                if (this.f16382i == 3) {
                    if (this.f16386m.get() > 0) {
                        return;
                    }
                    C4048sb.m19407a("Change state to COOLDOWN", null);
                    this.f16382i = 4;
                    this.f16386m = null;
                }
                if (this.f16382i == 4) {
                    if (this.f16384k - System.nanoTime() > 0) {
                        C4048sb.m19407a("Prefetch session is still active. Won't be making any new prefetch until the prefetch session expires", null);
                        return;
                    }
                    C4048sb.m19407a("Change state to IDLE", null);
                    this.f16382i = 1;
                    this.f16383j = 0;
                    this.f16384k = 0L;
                }
                if (this.f16382i != 1) {
                    return;
                }
                if (!c3920mg.m18672k()) {
                    C4048sb.m19410b("Did not prefetch because neither native nor webview are enabled.", null);
                    return;
                }
                URL endPointUrl = this.f16380g.getEndPointUrl(EndpointRepository.EndPoint.PREFETCH);
                C3974p3 c3974p3 = new C3974p3(AbstractC3654b3.c.POST, AbstractC4214b.m20171a(endPointUrl), endPointUrl.getPath(), this.f16377d.mo16842a(), EnumC4095ue.NORMAL, null, this, this.f16379f.mo19132a(), this.f16381h);
                c3974p3.m19013b("cache_assets", this.f16375b.m19147e());
                c3974p3.f14362s = true;
                C4048sb.m19407a("Change state to AWAIT_PREFETCH_RESPONSE", null);
                this.f16382i = 2;
                this.f16383j = 2;
                this.f16384k = System.nanoTime() + TimeUnit.MINUTES.toNanos(c3920mg.f15391w);
                this.f16385l = c3974p3;
                this.f16376c.m17614a(c3974p3);
                return;
            }
            m19487a();
        } catch (Exception e) {
            if (this.f16382i == 2) {
                C4048sb.m19407a("Change state to COOLDOWN", null);
                this.f16382i = 4;
                this.f16385l = null;
            }
            C4048sb.m19410b("prefetch", e);
        }
    }
}
