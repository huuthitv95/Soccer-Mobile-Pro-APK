package com.iab.omid.library.applovin.processor;

import android.view.View;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.internal.C10929c;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10948e;
import com.iab.omid.library.applovin.utils.C10951h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C10939c implements InterfaceC10937a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC10937a f22737a;

    public C10939c(InterfaceC10937a interfaceC10937a) {
        this.f22737a = interfaceC10937a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m23288a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C10929c c10929cM23224c = C10929c.m23224c();
        if (c10929cM23224c != null) {
            Collection<C10919a> collectionM23225a = c10929cM23224c.m23225a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM23225a.size() * 2) + 3);
            Iterator<C10919a> it = collectionM23225a.iterator();
            while (it.hasNext()) {
                View viewM23183e = it.next().m23183e();
                if (viewM23183e != null && C10951h.m23373g(viewM23183e) && (rootView = viewM23183e.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM23370d = C10951h.m23370d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C10951h.m23370d(arrayList.get(size - 1)) > fM23370d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC10937a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23283a(View view) {
        JSONObject jSONObjectM23326a = C10946c.m23326a(0, 0, 0, 0);
        C10946c.m23328a(jSONObjectM23326a, C10948e.m23349a());
        return jSONObjectM23326a;
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC10937a
    /* JADX INFO: renamed from: a */
    public void mo23284a(View view, JSONObject jSONObject, InterfaceC10937a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m23288a().iterator();
        while (it.hasNext()) {
            aVar.mo23285a(it.next(), this.f22737a, jSONObject, z2);
        }
    }
}
