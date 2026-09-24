package com.iab.omid.library.bytedance2.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.bytedance2.utils.C10996c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.bytedance2.processor.d */
/* JADX INFO: loaded from: classes6.dex */
public class C10990d implements InterfaceC10987a {

    /* JADX INFO: renamed from: a */
    private final int[] f22868a = new int[2];

    /* JADX INFO: renamed from: a */
    private void m23535a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC10987a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo23531a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23536b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC10987a.a aVar, boolean z) {
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
                aVar.mo23531a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC10987a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23529a(View view) {
        if (view == null) {
            return C10996c.m23571a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f22868a);
        int[] iArr = this.f22868a;
        return C10996c.m23571a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.bytedance2.processor.InterfaceC10987a
    /* JADX INFO: renamed from: a */
    public void mo23530a(View view, JSONObject jSONObject, InterfaceC10987a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m23536b(viewGroup, jSONObject, aVar, z2);
            } else {
                m23535a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
