package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import java.io.File;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.mk */
/* JADX INFO: loaded from: classes3.dex */
public final class C3924mk extends AbstractC3654b3 {

    /* JADX INFO: renamed from: k */
    public final C3769g3 f15408k;

    /* JADX INFO: renamed from: l */
    public final a f15409l;

    /* JADX INFO: renamed from: m */
    public final String f15410m;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.mk$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo18439a(String str, String str2);

        /* JADX INFO: renamed from: a */
        void mo18440a(String str, String str2, long j, InterfaceC4015r0 interfaceC4015r0);

        /* JADX INFO: renamed from: a */
        void mo18441a(String str, String str2, CBError cBError);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3924mk(C3769g3 c3769g3, File outputFile, String uri, a aVar, EnumC4095ue priority, String appId) {
        super(AbstractC3654b3.c.GET, uri, priority, outputFile);
        Intrinsics.checkNotNullParameter(outputFile, "outputFile");
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(appId, "appId");
        this.f15408k = c3769g3;
        this.f15409l = aVar;
        this.f15410m = appId;
        this.f13521i = AbstractC3654b3.b.ASYNC;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public C3677c3 mo16887a() {
        HashMap map = new HashMap();
        map.put("X-Chartboost-App", this.f15410m);
        map.put("X-Chartboost-Client", C3907m3.m18629b());
        C3769g3 c3769g3 = this.f15408k;
        map.put("X-Chartboost-Reachability", String.valueOf(c3769g3 != null ? c3769g3.m17755c() : null));
        return new C3677c3(map, null, null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16889a(CBError cBError, C3723e3 c3723e3) {
        a aVar = this.f15409l;
        if (aVar != null) {
            String strM16895e = m16895e();
            File file = this.f13516d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.mo18441a(strM16895e, name, cBError);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16890a(Object obj, C3723e3 c3723e3) {
        a aVar = this.f15409l;
        if (aVar != null) {
            String strM16895e = m16895e();
            File file = this.f13516d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.mo18439a(strM16895e, name);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3654b3
    /* JADX INFO: renamed from: a */
    public void mo16891a(String uri, long j) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        a aVar = this.f15409l;
        if (aVar != null) {
            File file = this.f13516d;
            Intrinsics.checkNotNull(file);
            String name = file.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            aVar.mo18440a(uri, name, j, null);
        }
    }
}
