package com.iab.omid.library.mmadbridge.processor;

import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.internal.C11185c;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11204e;
import com.iab.omid.library.mmadbridge.utils.C11207h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11195c implements InterfaceC11193a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11193a f23412a;

    public C11195c(InterfaceC11193a interfaceC11193a) {
        this.f23412a = interfaceC11193a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m24551a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11185c c11185cM24487c = C11185c.m24487c();
        if (c11185cM24487c != null) {
            Collection<C11175a> collectionM24488a = c11185cM24487c.m24488a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM24488a.size() * 2) + 3);
            Iterator<C11175a> it = collectionM24488a.iterator();
            while (it.hasNext()) {
                View viewM24446c = it.next().m24446c();
                if (viewM24446c != null && C11207h.m24636g(viewM24446c) && (rootView = viewM24446c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM24633d = C11207h.m24633d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11207h.m24633d(arrayList.get(size - 1)) > fM24633d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC11193a
    /* JADX INFO: renamed from: a */
    public JSONObject mo24546a(View view) {
        JSONObject jSONObjectM24589a = C11202c.m24589a(0, 0, 0, 0);
        C11202c.m24591a(jSONObjectM24589a, C11204e.m24612a());
        return jSONObjectM24589a;
    }

    @Override // com.iab.omid.library.mmadbridge.processor.InterfaceC11193a
    /* JADX INFO: renamed from: a */
    public void mo24547a(View view, JSONObject jSONObject, InterfaceC11193a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m24551a().iterator();
        while (it.hasNext()) {
            aVar.mo24548a(it.next(), this.f23412a, jSONObject, z2);
        }
    }
}
