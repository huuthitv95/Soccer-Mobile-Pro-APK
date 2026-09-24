package com.iab.omid.library.chartboost.processor;

import android.view.View;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.internal.C11031c;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11050e;
import com.iab.omid.library.chartboost.utils.C11053h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11041c implements InterfaceC11039a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11039a f23007a;

    public C11041c(InterfaceC11039a interfaceC11039a) {
        this.f23007a = interfaceC11039a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m23788a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11031c c11031cM23724c = C11031c.m23724c();
        if (c11031cM23724c != null) {
            Collection<C11021a> collectionM23725a = c11031cM23724c.m23725a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM23725a.size() * 2) + 3);
            Iterator<C11021a> it = collectionM23725a.iterator();
            while (it.hasNext()) {
                View viewM23679e = it.next().m23679e();
                if (viewM23679e != null && C11053h.m23874g(viewM23679e) && (rootView = viewM23679e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM23871d = C11053h.m23871d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11053h.m23871d(arrayList.get(size - 1)) > fM23871d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.chartboost.processor.InterfaceC11039a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23783a(View view) {
        JSONObject jSONObjectM23827a = C11048c.m23827a(0, 0, 0, 0);
        C11048c.m23829a(jSONObjectM23827a, C11050e.m23850a());
        return jSONObjectM23827a;
    }

    @Override // com.iab.omid.library.chartboost.processor.InterfaceC11039a
    /* JADX INFO: renamed from: a */
    public void mo23784a(View view, JSONObject jSONObject, InterfaceC11039a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m23788a().iterator();
        while (it.hasNext()) {
            aVar.mo23785a(it.next(), this.f23007a, jSONObject, z2);
        }
    }
}
