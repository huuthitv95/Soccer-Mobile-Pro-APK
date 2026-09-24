package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.D0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11390D0 extends AbstractC11395D5 {

    /* JADX INFO: renamed from: a */
    private final C12414p0 f24188a;

    /* JADX INFO: renamed from: b */
    private final C12220h0 f24189b;

    /* JADX INFO: renamed from: c */
    private final String f24190c;

    public /* synthetic */ C11390D0(C12414p0 c12414p0, C12220h0 c12220h0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12414p0, c12220h0, (i & 4) != 0 ? null : str);
    }

    @Override // com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        Map<String, Object> mapM25605a = m25605a(this.f24189b);
        mapM25605a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        mapM25605a.put("sessionDepth", Integer.valueOf(this.f24188a.m33048f()));
        String str = this.f24190c;
        if (str != null) {
            mapM25605a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return mapM25605a;
    }

    public C11390D0(C12414p0 adTools, C12220h0 adProperties, String str) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adProperties, "adProperties");
        this.f24188a = adTools;
        this.f24189b = adProperties;
        this.f24190c = str;
    }
}
