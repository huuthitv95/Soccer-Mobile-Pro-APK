package com.ironsource;

import com.ironsource.mediationsdk.C12333d;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Y1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11759Y1 implements InterfaceC11776Z1 {

    /* JADX INFO: renamed from: a */
    private final C12301l9 f26565a;

    /* JADX INFO: renamed from: b */
    private final C12333d f26566b;

    /* JADX INFO: renamed from: c */
    private final C12204g2 f26567c;

    public C11759Y1(C12301l9 instanceInfo, C12333d auctionDataUtils, C12204g2 c12204g2) {
        Intrinsics.checkNotNullParameter(instanceInfo, "instanceInfo");
        Intrinsics.checkNotNullParameter(auctionDataUtils, "auctionDataUtils");
        this.f26565a = instanceInfo;
        this.f26566b = auctionDataUtils;
        this.f26567c = c12204g2;
    }

    @Override // com.ironsource.InterfaceC11776Z1
    /* JADX INFO: renamed from: a */
    public void mo28004a(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C12204g2 c12204g2 = this.f26567c;
        if (c12204g2 == null || (listEmptyList = c12204g2.m31518b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        m28003a(listEmptyList, methodName);
    }

    @Override // com.ironsource.InterfaceC11776Z1
    /* JADX INFO: renamed from: b */
    public void mo28005b(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C12204g2 c12204g2 = this.f26567c;
        if (c12204g2 == null || (listEmptyList = c12204g2.m31516a()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        m28003a(listEmptyList, methodName);
    }

    @Override // com.ironsource.InterfaceC11776Z1
    /* JADX INFO: renamed from: c */
    public void mo28006c(String methodName) {
        List<String> listEmptyList;
        Intrinsics.checkNotNullParameter(methodName, "methodName");
        C12204g2 c12204g2 = this.f26567c;
        if (c12204g2 == null || (listEmptyList = c12204g2.m31520c()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        m28003a(listEmptyList, methodName);
    }

    /* JADX INFO: renamed from: a */
    private final void m28003a(List<String> list, String str) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            this.f26566b.m32339a(str, this.f26565a.m32070e(), C12333d.m32333b().m32337a(it.next(), this.f26565a.m32070e(), this.f26565a.m32071f(), this.f26565a.m32069d(), "", "", "", ""));
        }
    }
}
