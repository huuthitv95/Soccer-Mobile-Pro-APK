package com.mbridge.msdk.newreward.function.common;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13235y0;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class MBridgeGlobalCommon {
    public static String SESSION_ID = "";
    public static Map<String, InterfaceC13939h> showRewardListenerMap = new HashMap();

    public static void setAlertDialogText(String str, String str2, String str3, String str4, String str5) {
        Context contextM36542d = C13008c.m36588n().m36542d();
        if (!TextUtils.isEmpty(str2)) {
            C13235y0.m37957b(contextM36542d, "MBridge_ConfirmTitle" + str, str2.trim());
        }
        if (!TextUtils.isEmpty(str3)) {
            C13235y0.m37957b(contextM36542d, "MBridge_ConfirmContent" + str, str3.trim());
        }
        if (!TextUtils.isEmpty(str5)) {
            C13235y0.m37957b(contextM36542d, "MBridge_CancelText" + str, str5.trim());
        }
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        C13235y0.m37957b(contextM36542d, "MBridge_ConfirmText" + str, str4.trim());
    }
}
