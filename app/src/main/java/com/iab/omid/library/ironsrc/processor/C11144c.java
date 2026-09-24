package com.iab.omid.library.ironsrc.processor;

import android.view.View;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.internal.C11134c;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11153e;
import com.iab.omid.library.ironsrc.utils.C11156h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.ironsrc.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11144c implements InterfaceC11142a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11142a f23277a;

    public C11144c(InterfaceC11142a interfaceC11142a) {
        this.f23277a = interfaceC11142a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m24298a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11134c c11134cM24234c = C11134c.m24234c();
        if (c11134cM24234c != null) {
            Collection<C11124a> collectionM24235a = c11134cM24234c.m24235a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM24235a.size() * 2) + 3);
            Iterator<C11124a> it = collectionM24235a.iterator();
            while (it.hasNext()) {
                View viewM24193c = it.next().m24193c();
                if (viewM24193c != null && C11156h.m24383g(viewM24193c) && (rootView = viewM24193c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM24380d = C11156h.m24380d(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11156h.m24380d(arrayList.get(size - 1)) > fM24380d) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC11142a
    /* JADX INFO: renamed from: a */
    public JSONObject mo24293a(View view) {
        JSONObject jSONObjectM24336a = C11151c.m24336a(0, 0, 0, 0);
        C11151c.m24338a(jSONObjectM24336a, C11153e.m24359a());
        return jSONObjectM24336a;
    }

    @Override // com.iab.omid.library.ironsrc.processor.InterfaceC11142a
    /* JADX INFO: renamed from: a */
    public void mo24294a(View view, JSONObject jSONObject, InterfaceC11142a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m24298a().iterator();
        while (it.hasNext()) {
            aVar.mo24295a(it.next(), this.f23277a, jSONObject, z2);
        }
    }
}
