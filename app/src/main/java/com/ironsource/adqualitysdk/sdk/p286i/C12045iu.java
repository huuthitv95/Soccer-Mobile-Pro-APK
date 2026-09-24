package com.ironsource.adqualitysdk.sdk.p286i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iu */
/* JADX INFO: loaded from: classes6.dex */
public final class C12045iu {

    /* JADX INFO: renamed from: ﻛ */
    private e f29428;

    /* JADX INFO: renamed from: ﾇ */
    private long f29429;

    /* JADX INFO: renamed from: ﾒ */
    private String f29430;

    public C12045iu(String str, int i, String str2, long j) {
        this.f29430 = str;
        this.f29429 = j;
        this.f29428 = new e(i, str2);
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m30526() {
        return this.f29430;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final JSONObject m30527() throws JSONException {
        if (!TextUtils.isEmpty(this.f29430)) {
            return new JSONObject(this.f29430);
        }
        return new JSONObject();
    }

    /* JADX INFO: renamed from: ﻛ */
    public final e m30525() {
        return this.f29428;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.iu$e */
    public static class e {

        /* JADX INFO: renamed from: ﻛ */
        private String f29431;

        /* JADX INFO: renamed from: ｋ */
        private int f29432;

        public e(int i, String str) {
            this.f29432 = i;
            this.f29431 = str;
        }

        /* JADX INFO: renamed from: ｋ */
        public final int m30528() {
            return this.f29432;
        }

        /* JADX INFO: renamed from: ﾇ */
        public final String m30529() {
            return this.f29431;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final long m30524() {
        return this.f29429;
    }
}
