package com.mbridge.msdk.mbsignalcommon.base;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.mbridge.msdk.click.C12684c;
import com.mbridge.msdk.foundation.controller.C13008c;

/* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.base.c */
/* JADX INFO: compiled from: IntentFilter.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13350c implements InterfaceC13348a {
    @Override // com.mbridge.msdk.mbsignalcommon.base.InterfaceC13348a
    /* JADX INFO: renamed from: a */
    public boolean mo38605a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String scheme = Uri.parse(str).getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.equals(SDKConstants.PARAM_INTENT)) {
            return false;
        }
        return C12684c.m34660d(C13008c.m36588n().m36542d(), str);
    }
}
