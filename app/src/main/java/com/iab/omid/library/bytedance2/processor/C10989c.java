package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.internal.C10980c;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C10998e;
import com.iab.omid.library.bytedance2.utils.C11001h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10989c implements InterfaceC10987a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10987a f22867a;

    public C10989c(InterfaceC10987a interfaceC10987a) {
        this.f22867a = interfaceC10987a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m23534a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C10980c c10980cM23477c = C10980c.m23477c();
        if (c10980cM23477c != null) {
            Collection<C10970a> collectionM23478a = c10980cM23477c.m23478a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM23478a.size() * 2) + 3);
            Iterator<C10970a> it = collectionM23478a.iterator();
            while (it.hasNext()) {
                View viewM23436c = it.next().m23436c();
                if (viewM23436c != null && C11001h.m23615e(viewM23436c) && (rootView = viewM23436c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM23613c = C11001h.m23613c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11001h.m23613c(arrayList.get(size - 1)) > fM23613c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC10987a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23529a(View view) {
        JSONObject jSONObjectM23571a = C10996c.m23571a(0, 0, 0, 0);
        C10996c.m23573a(jSONObjectM23571a, C10998e.m23593a());
        return jSONObjectM23571a;
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC10987a
    /* JADX INFO: renamed from: a */
    public void mo23530a(View view, JSONObject jSONObject, InterfaceC10987a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m23534a().iterator();
        while (it.hasNext()) {
            aVar.mo23531a(it.next(), this.f22867a, jSONObject, z2);
        }
    }
}
