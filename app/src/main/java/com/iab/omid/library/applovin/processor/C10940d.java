package com.iab.omid.library.applovin.processor;

import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.applovin.utils.C10946c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.iab.omid.library.applovin.processor.d */
/* JADX INFO: loaded from: classes6.dex */
public class C10940d implements InterfaceC10937a {

    /* JADX INFO: renamed from: a */
    private final int[] f22738a = new int[2];

    /* JADX INFO: renamed from: a */
    private void m23289a(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC10937a.a aVar, boolean z) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            aVar.mo23285a(viewGroup.getChildAt(i), this, jSONObject, z);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m23290b(ViewGroup viewGroup, JSONObject jSONObject, InterfaceC10937a.a aVar, boolean z) {
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
                aVar.mo23285a((View) it2.next(), this, jSONObject, z);
            }
        }
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC10937a
    /* JADX INFO: renamed from: a */
    public JSONObject mo23283a(View view) {
        if (view == null) {
            return C10946c.m23326a(0, 0, 0, 0);
        }
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(this.f22738a);
        int[] iArr = this.f22738a;
        return C10946c.m23326a(iArr[0], iArr[1], width, height);
    }

    @Override // com.iab.omid.library.applovin.processor.InterfaceC10937a
    /* JADX INFO: renamed from: a */
    public void mo23284a(View view, JSONObject jSONObject, InterfaceC10937a.a aVar, boolean z, boolean z2) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (z) {
                m23290b(viewGroup, jSONObject, aVar, z2);
            } else {
                m23289a(viewGroup, jSONObject, aVar, z2);
            }
        }
    }
}
