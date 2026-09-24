package com.ironsource.adqualitysdk.sdk.p286i;

import android.app.Activity;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11892dc extends C11886cx {
    /* JADX INFO: renamed from: ﻐ */
    public static WebView m29868(List<Object> list) {
        int iIntValue;
        Activity activity = (Activity) m29851(list, 0, Activity.class);
        List arrayList = new ArrayList();
        String str = null;
        if (list.size() > 1) {
            iIntValue = ((Integer) m29851(list, 1, Integer.class)).intValue();
            if (list.size() > 2) {
                str = (String) m29851(list, 2, String.class);
                if (list.size() > 3) {
                    arrayList = (List) m29851(list, 3, List.class);
                }
            }
        } else {
            iIntValue = -1;
        }
        return (WebView) C12083kh.m30878(activity, WebView.class, iIntValue, arrayList, str);
    }

    /* JADX INFO: renamed from: ｋ */
    public static boolean m29870(List<Object> list) {
        return C12083kh.m30880((View) m29851(list, 0, View.class));
    }

    /* JADX INFO: renamed from: ﾇ */
    public static <E extends View> E m29871(List<Object> list) {
        return (E) C12083kh.m30873((View) m29851(list, 0, View.class), (Class) m29851(list, 1, Class.class), ((Boolean) m29851(list, 2, Boolean.class)).booleanValue());
    }

    /* JADX INFO: renamed from: ﻛ */
    public static View m29869(List<Object> list) {
        return C12083kh.m30872((Activity) m29851(list, 0, Activity.class));
    }
}
