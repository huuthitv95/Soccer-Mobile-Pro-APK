package com.iab.omid.library.unity3d.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.unity3d.utils.C11249c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.unity3d.processor.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11243d implements InterfaceC11240a {

    /* JADX INFO: renamed from: a */
    private final int[] f23542a = new int[2];

    /* JADX INFO: renamed from: a */
    private void m24794a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC11240a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo24790a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m24795b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC11240a.a aVar, boolean z) {
        HashMap map = new HashMap();
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                map.put(Float.valueOf(childAt.getZ()), arrayList);
            }
            arrayList.add(childAt);
        }
        ArrayList arrayList2 = new ArrayList(map.keySet());
        Collections.sort(arrayList2);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((ArrayList) map.get((Float) it.next())).iterator();
            while (it2.hasNext()) {
                aVar.mo24790a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC11240a
    /* JADX INFO: renamed from: a */
    public JSONObject mo24788a(View view) {
        if (view == null) {
            return C11249c.m24830a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f23542a);
        int[] iArr = this.f23542a;
        return C11249c.m24830a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.unity3d.processor.InterfaceC11240a
    /* JADX INFO: renamed from: a */
    public void mo24789a(View view, JSONObject jSONObject, InterfaceC11240a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m24795b(viewGroup, jSONObject, aVar, z2);
            } else {
                m24794a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
