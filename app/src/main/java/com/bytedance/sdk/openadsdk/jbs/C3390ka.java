package com.bytedance.sdk.openadsdk.jbs;

import android.text.TextUtils;
import com.bytedance.sdk.component.xha.p170lr.AbstractC2740ik;
import com.bytedance.sdk.openadsdk.utils.C3597xd;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.jbs.ka */
/* JADX INFO: loaded from: classes3.dex */
public final class C3390ka extends AbstractC3392ri {

    /* JADX INFO: renamed from: ri */
    public static InterfaceC3389ik f12059ri;

    /* JADX INFO: renamed from: ri */
    public static String m15343ri(AbstractC2740ik abstractC2740ik, String str) {
        InterfaceC3389ik interfaceC3389ikM15344ri;
        Map map;
        if (!C3597xd.m16677ik() || (interfaceC3389ikM15344ri = C3391lr.m15344ri("net")) == null || (map = (Map) interfaceC3389ikM15344ri.mo15342ri(1, str)) == null) {
            return str;
        }
        String str2 = (String) map.get("url");
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        Map map2 = (Map) map.get("header");
        if (map2 != null) {
            for (String str3 : map2.keySet()) {
                abstractC2740ik.m10372lr(str3, (String) map2.get(str3));
            }
        }
        return str;
    }
}
