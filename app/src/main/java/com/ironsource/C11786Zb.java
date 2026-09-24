package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.ironsource.Zb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11786Zb extends AbstractC12432q0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11786Zb(C12414p0 adTools, C11804ac adUnitData, InterfaceC12116bc listener) {
        String str;
        int iM25368b;
        super(adTools, adUnitData, listener, null, 8, null);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C12135cd c12135cdM33132g = m33132g();
        IronLog.INTERNAL.verbose("placement = " + c12135cdM33132g);
        if (c12135cdM33132g == null || TextUtils.isEmpty(c12135cdM33132g.m32814c())) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            str = String.format("can't load native ad - %s", Arrays.copyOf(new Object[]{c12135cdM33132g == null ? "placement is null" : "placement name is empty"}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iM25368b = C11354B0.m25368b(adUnitData.mo26467b().m31567a());
        } else {
            str = null;
            iM25368b = 510;
        }
        if (str != null) {
            IronLog.API.error(m33122a(str));
            m33123a(iM25368b, str);
        }
    }

    @Override // com.ironsource.AbstractC12432q0
    /* JADX INFO: renamed from: a */
    protected InterfaceC11407E mo26341a() {
        return new InterfaceC11407E() { // from class: com.ironsource.Zb$$ExternalSyntheticLambda0
            @Override // com.ironsource.InterfaceC11407E
            /* JADX INFO: renamed from: a */
            public final AbstractC11353B mo25641a(C11371C c11371c, C11479I c11479i) {
                return C11786Zb.m28075a(this.f$0, c11371c, c11479i);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final AbstractC11353B m28075a(C11786Zb this$0, C11371C adInstanceData, C11479I adInstancePayload) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adInstanceData, "adInstanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        return new C11650Rb(new C11707V0(this$0.m33131f(), C11426F0.b.PROVIDER), adInstanceData, adInstancePayload, new AbstractC12432q0.a());
    }
}
