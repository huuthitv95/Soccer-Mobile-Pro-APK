package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C12333d;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.t2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12523t2 extends AbstractC12555ug {

    /* JADX INFO: renamed from: e */
    private final C11707V0 f32427e;

    /* JADX INFO: renamed from: f */
    private final AbstractC12593x0 f32428f;

    /* JADX INFO: renamed from: g */
    private final C12541u2 f32429g;

    /* JADX INFO: renamed from: h */
    private final InterfaceC11635Qc f32430h;

    /* JADX INFO: renamed from: i */
    private InterfaceC12559v2 f32431i;

    /* JADX INFO: renamed from: com.ironsource.t2$a */
    public static final class a implements InterfaceC12559v2 {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ InterfaceC11407E f32433b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC12573vg f32434c;

        a(InterfaceC11407E interfaceC11407E, InterfaceC12573vg interfaceC12573vg) {
            this.f32433b = interfaceC11407E;
            this.f32434c = interfaceC12573vg;
        }

        @Override // com.ironsource.InterfaceC12559v2
        /* JADX INFO: renamed from: a */
        public void mo33732a(final List<C12434q2> newWaterfall, final Map<String, C11479I> adInstancePayloads, final String auctionId, final C12434q2 c12434q2, final JSONObject jSONObject, final JSONObject jSONObject2, final int i, final long j, final int i2, final String str) {
            Intrinsics.checkNotNullParameter(newWaterfall, "newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            C11707V0 c11707v0 = C12523t2.this.f32427e;
            final C12523t2 c12523t2 = C12523t2.this;
            final InterfaceC11407E interfaceC11407E = this.f32433b;
            final InterfaceC12573vg interfaceC12573vg = this.f32434c;
            c11707v0.m33233a(new Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C12523t2.a.m33729a(c12523t2, interfaceC11407E, interfaceC12573vg, newWaterfall, adInstancePayloads, auctionId, c12434q2, jSONObject, jSONObject2, i, j, i2, str);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33729a(C12523t2 this$0, InterfaceC11407E adInstanceFactory, InterfaceC12573vg waterfallFetcherListener, List newWaterfall, Map adInstancePayloads, String auctionId, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(newWaterfall, "$newWaterfall");
            Intrinsics.checkNotNullParameter(adInstancePayloads, "$adInstancePayloads");
            Intrinsics.checkNotNullParameter(auctionId, "$auctionId");
            this$0.f32431i = null;
            this$0.m33719a(adInstanceFactory, waterfallFetcherListener, newWaterfall, adInstancePayloads, auctionId, c12434q2, jSONObject, jSONObject2, i, j, i2, str);
        }

        @Override // com.ironsource.InterfaceC12559v2
        /* JADX INFO: renamed from: a */
        public void mo33731a(final int i, final String str, final int i2, final String auctionFallback, final long j) {
            Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
            C11707V0 c11707v0 = C12523t2.this.f32427e;
            final C12523t2 c12523t2 = C12523t2.this;
            final InterfaceC11407E interfaceC11407E = this.f32433b;
            final InterfaceC12573vg interfaceC12573vg = this.f32434c;
            c11707v0.m33233a(new Runnable() { // from class: com.ironsource.t2$a$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12523t2.a.m33728a(c12523t2, interfaceC11407E, interfaceC12573vg, i, str, i2, auctionFallback, j);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public static final void m33728a(C12523t2 this$0, InterfaceC11407E adInstanceFactory, InterfaceC12573vg waterfallFetcherListener, int i, String str, int i2, String auctionFallback, long j) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(adInstanceFactory, "$adInstanceFactory");
            Intrinsics.checkNotNullParameter(waterfallFetcherListener, "$waterfallFetcherListener");
            Intrinsics.checkNotNullParameter(auctionFallback, "$auctionFallback");
            this$0.f32431i = null;
            this$0.m33717a(adInstanceFactory, waterfallFetcherListener, i, str, i2, auctionFallback, j);
        }

        @Override // com.ironsource.InterfaceC12559v2
        /* JADX INFO: renamed from: a */
        public void mo33730a(int i, String errorReason) {
            Intrinsics.checkNotNullParameter(errorReason, "errorReason");
            this.f32434c.mo33271a(i, errorReason);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12523t2(C11707V0 adTools, AbstractC12593x0 adUnitData) {
        super(adTools, adUnitData);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f32427e = adTools;
        this.f32428f = adUnitData;
        C12541u2 c12541u2 = new C12541u2(adTools, adUnitData);
        this.f32429g = c12541u2;
        this.f32430h = c12541u2.m33874b();
    }

    @Override // com.ironsource.AbstractC12555ug
    /* JADX INFO: renamed from: a */
    public InterfaceC11635Qc mo33726a() {
        return this.f32430h;
    }

    @Override // com.ironsource.AbstractC12555ug
    /* JADX INFO: renamed from: a */
    public void mo33727a(InterfaceC11407E adInstanceFactory, InterfaceC12573vg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        a aVar = new a(adInstanceFactory, waterfallFetcherListener);
        this.f32429g.m33873a(aVar);
        this.f32431i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33719a(InterfaceC11407E interfaceC11407E, InterfaceC12573vg interfaceC12573vg, List<C12434q2> list, Map<String, C11479I> map, String str, C12434q2 c12434q2, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2, String str2) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, (String) null, (String) null, 3, (Object) null));
        C12380n2 c12380n2 = new C12380n2(str, jSONObject, c12434q2, i, "");
        if (!TextUtils.isEmpty(str2)) {
            this.f32427e.m33047e().m34220h().m27964a(i2, str2);
        }
        m33725a(jSONObject2);
        C12591wg c12591wgM33917a = m33917a(list, map, c12380n2, interfaceC11407E);
        this.f32427e.m33047e().m34212a(new C11725W1(c12380n2));
        this.f32427e.m33047e().m34214b().m27487a(j, this.f32428f.m34091v() + ";wtf=" + c12591wgM33917a.m34068c());
        this.f32427e.m33047e().m34214b().m27491c(c12591wgM33917a.m34069d());
        m33724a(c12591wgM33917a, interfaceC12573vg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public final void m33717a(InterfaceC11407E interfaceC11407E, InterfaceC12573vg interfaceC12573vg, int i, String str, int i2, String str2, long j) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, "Auction failed (error " + i + " - " + str + ")", (String) null, 2, (Object) null));
        boolean zM33288n = this.f32428f.m34076e().m33288n();
        String strM28098a = C11794a2.f26720a.m28098a(zM33288n);
        C12380n2 c12380n2 = new C12380n2(strM28098a, null, null, i2, str2);
        C12616y5 c12616y5M33047e = this.f32427e.m33047e();
        c12616y5M33047e.m34212a(new C11725W1(c12380n2));
        c12616y5M33047e.m34214b().m27486a(j, i, str);
        if (zM33288n) {
            m33718a(interfaceC11407E, interfaceC12573vg, i2, str2, strM28098a);
        } else {
            m33723a(interfaceC12573vg);
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33724a(C12591wg c12591wg, InterfaceC12573vg interfaceC12573vg) {
        this.f32427e.m27638h().m27406a(c12591wg);
        interfaceC12573vg.mo33272a(c12591wg);
    }

    /* JADX INFO: renamed from: a */
    private final void m33725a(JSONObject jSONObject) {
        int i;
        try {
            if (jSONObject == null) {
                this.f32428f.m34074b(false);
                IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, "loading configuration from auction response is null, using the following: " + this.f32428f.m34091v(), (String) null, 2, (Object) null));
                return;
            }
            try {
                if (jSONObject.has(C12333d.f31060x) && (i = jSONObject.getInt(C12333d.f31060x)) > 0) {
                    this.f32428f.m34072a(i);
                }
                if (jSONObject.has(C12333d.f31061y)) {
                    this.f32428f.m34073a(jSONObject.getBoolean(C12333d.f31061y));
                } else if (this.f32428f.mo26467b().m31575h() && C11455Gb.f24351s.m25905d().mo25846h().mo32184k()) {
                    AbstractC12593x0 abstractC12593x0 = this.f32428f;
                    abstractC12593x0.m34072a(Math.max(2, abstractC12593x0.m34081k()));
                }
                this.f32428f.m34074b(jSONObject.optBoolean(C12333d.f31062z, false));
                IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, this.f32428f.m34091v(), (String) null, 2, (Object) null));
            } catch (JSONException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("failed to update loading configuration for" + this.f32428f.mo26467b().m31567a() + " Error: " + e.getMessage());
                ironLog.verbose(C12414p0.m33033a(this.f32427e, this.f32428f.m34091v(), (String) null, 2, (Object) null));
            }
        } catch (Throwable th) {
            IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, this.f32428f.m34091v(), (String) null, 2, (Object) null));
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m33718a(InterfaceC11407E interfaceC11407E, InterfaceC12573vg interfaceC12573vg, int i, String str, String str2) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32427e, "Moving to fallback waterfall", (String) null, 2, (Object) null));
        new C12641zc(this.f32427e, this.f32428f).m34318a(interfaceC12573vg, i, str, str2, interfaceC11407E);
    }

    /* JADX INFO: renamed from: a */
    private final void m33723a(InterfaceC12573vg interfaceC12573vg) {
        interfaceC12573vg.mo33271a(509, "Mediation No fill");
    }
}
