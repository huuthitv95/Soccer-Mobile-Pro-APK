package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zh */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4208zh implements InterfaceC4186yh {

    /* JADX INFO: renamed from: a */
    public final AtomicReference f17148a;

    public AbstractC4208zh(AtomicReference sdkConfiguration) {
        Intrinsics.checkNotNullParameter(sdkConfiguration, "sdkConfiguration");
        this.f17148a = sdkConfiguration;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4186yh
    /* JADX INFO: renamed from: a */
    public List mo20064a(C3865k7.b eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        C3920mg c3920mg = (C3920mg) this.f17148a.get();
        List listM18663b = c3920mg != null ? c3920mg.m18663b() : null;
        List listEmptyList = (listM18663b == null || listM18663b.isEmpty()) ? CollectionsKt.emptyList() : m20152a(listM18663b, eventType);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listEmptyList) {
            if (!StringsKt.isBlank(((C4120vh) obj).m19711d())) {
                arrayList.add(obj);
            }
        }
        return (arrayList.isEmpty() && eventType == C3865k7.b.INITIALIZATION) ? CollectionsKt.listOf(C3934n7.f15480a.m18769a()) : arrayList;
    }

    /* JADX INFO: renamed from: a */
    public final List m20152a(List list, C3865k7.b bVar) {
        ArrayList<C3865k7> arrayList = new ArrayList();
        for (Object obj : list) {
            if (StringsKt.equals(((C3865k7) obj).m18358d(), bVar.m18362b(), true)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (C3865k7 c3865k7 : arrayList) {
            String strM18359e = c3865k7.m18359e();
            String strM18357c = c3865k7.m18357c();
            String strM18355a = c3865k7.m18355a();
            if (strM18355a == null || strM18355a.length() <= 0) {
                strM18355a = null;
            }
            arrayList2.add(new C4120vh(strM18359e, strM18357c, strM18355a, c3865k7.m18356b()));
        }
        return arrayList2;
    }
}
