package com.iab.omid.library.fyber.processor;

import android.view.View;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.internal.C11083c;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11102e;
import com.iab.omid.library.fyber.utils.C11105h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.fyber.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11093c implements InterfaceC11091a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11091a f23142a;

    public C11093c(InterfaceC11091a interfaceC11091a) {
        this.f23142a = interfaceC11091a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m24045a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11083c c11083cM23981c = C11083c.m23981c();
        if (c11083cM23981c != null) {
            Collection<C11073a> collectionM23982a = c11083cM23981c.m23982a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM23982a.size() * 2) + 3);
            Iterator<C11073a> it = collectionM23982a.iterator();
            while (it.hasNext()) {
                View viewM23940e = it.next().m23940e();
                if (viewM23940e != null && C11105h.m24130g(viewM23940e) && (rootView = viewM23940e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM24127d = C11105h.m24127d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11105h.m24127d(arrayList.get(size - 1)) > fM24127d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC11091a
    /* JADX INFO: renamed from: a */
    public JSONObject mo24040a(View view) {
        JSONObject jSONObjectM24083a = C11100c.m24083a(0, 0, 0, 0);
        C11100c.m24085a(jSONObjectM24083a, C11102e.m24106a());
        return jSONObjectM24083a;
    }

    @Override // com.iab.omid.library.fyber.processor.InterfaceC11091a
    /* JADX INFO: renamed from: a */
    public void mo24041a(View view, JSONObject jSONObject, InterfaceC11091a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m24045a().iterator();
        while (it.hasNext()) {
            aVar.mo24042a(it.next(), this.f23142a, jSONObject, z2);
        }
    }
}
