package com.fyber.inneractive.sdk.network.events;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C8428w;
import com.fyber.inneractive.sdk.network.C8430x;
import com.fyber.inneractive.sdk.network.EnumC8415t;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import java.util.HashMap;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.events.a */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8371a {
    /* JADX INFO: renamed from: a */
    public static void m20741a(EnumC8415t enumC8415t, EnumC8372b enumC8372b, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, String str, String str2, Boolean bool) {
        C8428w c8428w = new C8428w(enumC8415t, inneractiveAdRequest, abstractC9087e);
        C8430x c8430x = new C8430x();
        c8430x.m20809a(enumC8372b.name(), "errorCode");
        if (!TextUtils.isEmpty(str2)) {
            c8430x.m20809a(str2, "templateURL");
        }
        if (!TextUtils.isEmpty(str)) {
            c8430x.m20809a(str, "error");
        }
        if (bool != null) {
            c8430x.m20809a(bool, "loaded_from_cache");
        }
        c8428w.f18758f.put(c8430x.f18760a);
        c8428w.m20808a((String) null);
    }

    /* JADX INFO: renamed from: a */
    public static void m20742a(EnumC8415t enumC8415t, String str, String str2, InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, HashMap map, Boolean bool) {
        C8428w c8428w = new C8428w(enumC8415t, inneractiveAdRequest, abstractC9087e);
        C8430x c8430x = new C8430x();
        if (bool != null) {
            c8430x.m20809a(bool, "loaded_from_cache");
        }
        c8430x.m20809a(str, "errorCode").m20809a(str2, "templateURL");
        if (map != null && !map.isEmpty()) {
            for (String str3 : map.keySet()) {
                String str4 = (String) map.get(str3);
                if (!TextUtils.isEmpty(str4)) {
                    c8430x.m20809a(str4, str3);
                }
            }
        }
        c8428w.f18758f.put(c8430x.f18760a);
        c8428w.m20808a((String) null);
    }
}
