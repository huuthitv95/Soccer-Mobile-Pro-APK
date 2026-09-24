package com.iab.omid.library.unity3d.processor;

import android.view.View;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.internal.C11234c;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11251e;
import com.iab.omid.library.unity3d.utils.C11254h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.processor.c */
/* JADX INFO: loaded from: classes6.dex */
public class C11242c implements InterfaceC11240a {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11240a f23541a;

    public C11242c(InterfaceC11240a interfaceC11240a) {
        this.f23541a = interfaceC11240a;
    }

    /* JADX INFO: renamed from: a */
    ArrayList<View> m24793a() {
        View rootView;
        ArrayList<View> arrayList = new ArrayList<>();
        C11234c c11234cM24743c = C11234c.m24743c();
        if (c11234cM24743c != null) {
            Collection<C11224a> collectionM24744a = c11234cM24743c.m24744a();
            IdentityHashMap identityHashMap = new IdentityHashMap((collectionM24744a.size() * 2) + 3);
            Iterator<C11224a> it = collectionM24744a.iterator();
            while (it.hasNext()) {
                View viewM24702c = it.next().m24702c();
                if (viewM24702c != null && C11254h.m24873e(viewM24702c) && (rootView = viewM24702c.getRootView()) != null && !identityHashMap.containsKey(rootView)) {
                    identityHashMap.put(rootView, rootView);
                    float fM24871c = C11254h.m24871c(rootView);
                    int size = arrayList.size();
                    while (size > 0 && C11254h.m24871c(arrayList.get(size - 1)) > fM24871c) {
                        size--;
                    }
                    arrayList.add(size, rootView);
                }
            }
        }
        return arrayList;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC11240a
    /* JADX INFO: renamed from: a */
    public JSONObject mo24788a(View view) {
        JSONObject jSONObjectM24830a = C11249c.m24830a(0, 0, 0, 0);
        C11249c.m24832a(jSONObjectM24830a, C11251e.m24851a());
        return jSONObjectM24830a;
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC11240a
    /* JADX INFO: renamed from: a */
    public void mo24789a(View view, JSONObject jSONObject, InterfaceC11240a.a aVar, boolean z, boolean z2) {
        Iterator<View> it = m24793a().iterator();
        while (it.hasNext()) {
            aVar.mo24790a(it.next(), this.f23541a, jSONObject, z2);
        }
    }
}
