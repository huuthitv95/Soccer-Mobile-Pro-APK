package com.ironsource;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.j1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12257j1 implements InterfaceC12155df<JSONArray> {

    /* JADX INFO: renamed from: a */
    private final List<C12239i1> f30600a = new ArrayList();

    /* JADX INFO: renamed from: com.ironsource.j1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f30601a;

        static {
            int[] iArr = new int[EnumC12137cf.values().length];
            try {
                iArr[EnumC12137cf.FullHistory.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC12137cf.CurrentlyLoadedAds.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f30601a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC12129c7
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public JSONArray mo26046a(EnumC12137cf mode) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        int i = a.f30601a[mode.ordinal()];
        if (i == 1) {
            List<C12239i1> listM31776b = m31776b();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM31776b, 10));
            Iterator<T> it = listM31776b.iterator();
            while (it.hasNext()) {
                arrayList.add(((C12239i1) it.next()).m31659d());
            }
            return new JSONArray((Collection) arrayList);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        List<C12239i1> listM31775a = m31775a();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM31775a, 10));
        Iterator<T> it2 = listM31775a.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((C12239i1) it2.next()).m31658c());
        }
        return new JSONArray((Collection) arrayList2);
    }

    /* JADX INFO: renamed from: a */
    public final void m31777a(C12239i1 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f30600a.add(event);
    }

    /* JADX INFO: renamed from: a */
    private final List<C12239i1> m31775a() {
        List<C12239i1> list = this.f30600a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            C12239i1 c12239i1 = (C12239i1) obj;
            if (c12239i1.m31660e() != EnumC12101af.LoadSuccess && c12239i1.m31660e() != EnumC12101af.LoadRequest) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C12239i1) it.next()).m31656a());
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List<C12239i1> list2 = this.f30600a;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : list2) {
            C12239i1 c12239i2 = (C12239i1) obj2;
            if (c12239i2.m31660e() == EnumC12101af.LoadSuccess && !set.contains(c12239i2.m31656a())) {
                arrayList3.add(obj2);
            }
        }
        return arrayList3;
    }

    /* JADX INFO: renamed from: b */
    private final List<C12239i1> m31776b() {
        List<C12239i1> list = this.f30600a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((C12239i1) obj).m31660e() != EnumC12101af.LoadRequest) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
