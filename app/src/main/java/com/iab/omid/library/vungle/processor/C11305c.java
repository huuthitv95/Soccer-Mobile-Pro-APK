package com.iab.omid.library.vungle.processor;

import android.view.View;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.internal.C11292c;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11314e;
import com.iab.omid.library.vungle.utils.C11317h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.vungle.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11305c implements InterfaceC11303a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11303a f23704a;

    public C11305c(InterfaceC11303a interfaceC11303a) {
        this.f23704a = interfaceC11303a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m25075a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11292c c11292cM25003c = C11292c.m25003c();
        if (c11292cM25003c != null) {
            Collection<C11271a> collectionM25004a = c11292cM25003c.m25004a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM25004a.size() * 2) + 3);
            Iterator<C11271a> it = collectionM25004a.iterator();
            while (it.hasNext()) {
                View viewM24935e = it.next().m24935e();
                if (viewM24935e != null && C11317h.m25175g(viewM24935e) && (rootView = viewM24935e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM25172d = C11317h.m25172d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11317h.m25172d(arrayList.get(size - 1)) > fM25172d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC11303a
    /* JADX INFO: renamed from: a */
    public JSONObject mo25070a(View view) {
        JSONObject jSONObjectM25125a = C11312c.m25125a(0, 0, 0, 0);
        C11312c.m25127a(jSONObjectM25125a, C11314e.m25151a());
        return jSONObjectM25125a;
    }

    @Override // com.iab.omid.library.vungle.processor.InterfaceC11303a
    /* JADX INFO: renamed from: a */
    public void mo25071a(View view, JSONObject jSONObject, InterfaceC11303a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m25075a().iterator();
        while (it.hasNext()) {
            aVar.mo25072a(it.next(), this.f23704a, jSONObject, z2);
        }
    }
}
