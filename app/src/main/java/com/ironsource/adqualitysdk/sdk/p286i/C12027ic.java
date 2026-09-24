package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.text.TextUtils;
import java.util.HashMap;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ic */
/* JADX INFO: loaded from: classes6.dex */
public final class C12027ic {

    /* JADX INFO: renamed from: ﻐ */
    private C12032ih f29288;

    /* JADX INFO: renamed from: ﻛ */
    private Context f29289;

    /* JADX INFO: renamed from: ｋ */
    private String f29290;

    /* JADX INFO: renamed from: ﾇ */
    private C12028id f29291;

    public C12027ic(Context context, String str, String str2) {
        this.f29289 = context.getApplicationContext();
        this.f29290 = str2;
        this.f29288 = new C12032ih(this.f29289, str);
        this.f29291 = new C12028id(C12026ib.f29287, this.f29289.getPackageName(), C12033ii.m30510(this.f29289), this.f29290);
    }

    /* JADX INFO: renamed from: ﾒ */
    public final int m30470(String str) {
        try {
            return this.f29288.m30505(str);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final HashMap<String, String> m30468(String str, int i) {
        try {
            HashMap<String, String> mapM30506 = this.f29288.m30506(str, i);
            HashMap<String, String> map = new HashMap<>();
            for (String str2 : mapM30506.keySet()) {
                String str3 = mapM30506.get(str2);
                if (str3 != null && !TextUtils.isEmpty(str3)) {
                    try {
                        map.put(str2, this.f29291.m30476(str3));
                    } catch (C12028id.a unused) {
                    }
                }
            }
            return map;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m30467(String str) {
        try {
            String strM30502 = this.f29288.m30502(str);
            if (strM30502 == null || TextUtils.isEmpty(strM30502)) {
                return strM30502;
            }
            try {
                return this.f29291.m30476(strM30502);
            } catch (C12028id.a unused) {
                return "";
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final void m30469(String str) {
        try {
            this.f29288.m30503(str);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m30471(String str, String str2) {
        try {
            this.f29288.m30504(str, this.f29291.m30477(str2));
        } catch (Throwable unused) {
        }
    }
}
