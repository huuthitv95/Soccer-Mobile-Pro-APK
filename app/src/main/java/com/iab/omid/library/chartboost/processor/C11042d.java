package com.iab.omid.library.chartboost.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.chartboost.utils.C11048c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.chartboost.processor.d */
/* JADX INFO: loaded from: classes6.dex */
public class C11042d implements InterfaceC11039a {

    /* JADX INFO: renamed from: a */
    private final int[] f23008a = new int[2];

    /* JADX INFO: renamed from: a */
    private void m23789a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC11039a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo23785a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23790b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC11039a.a aVar, boolean z) {
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
                aVar.mo23785a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.chartboost.processor.InterfaceC11039a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23783a(View view) {
        if (view == null) {
            return C11048c.m23827a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f23008a);
        int[] iArr = this.f23008a;
        return C11048c.m23827a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.chartboost.processor.InterfaceC11039a
    /* JADX INFO: renamed from: a */
    public void mo23784a(View view, JSONObject jSONObject, InterfaceC11039a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m23790b(viewGroup, jSONObject, aVar, z2);
            } else {
                m23789a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
