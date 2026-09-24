package com.mbridge.msdk.foundation.same.net;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.net.utils.C13121d;
import com.mbridge.msdk.foundation.tools.C13188c1;
import com.mbridge.msdk.setting.C13635g;
import com.mbridge.msdk.setting.C13636h;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.net.d */
/* JADX INFO: compiled from: LoadUrlTool.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13111d {
    /* JADX INFO: renamed from: a */
    public static String m37193a(String str) {
        String strM37194b = m37194b(str);
        return TextUtils.isEmpty(strM37194b) ? "" : C13188c1.m37644a(strM37194b);
    }

    /* JADX INFO: renamed from: b */
    public static String m37194b(String str) {
        C13635g c13635gM39714b = C13636h.m39706b().m39714b(C13008c.m36588n().m36533b());
        return C13121d.m37226h().m37227a(str, TextUtils.isEmpty(str) ? c13635gM39714b.m39566t0() : c13635gM39714b.m39394C());
    }
}
