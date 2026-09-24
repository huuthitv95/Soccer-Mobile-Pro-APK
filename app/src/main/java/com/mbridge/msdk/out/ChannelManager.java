package com.mbridge.msdk.out;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.same.net.C13107Aa;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public class ChannelManager {
    public static void setChannel(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            C13107Aa c13107Aa = new C13107Aa();
            Method declaredMethod = C13107Aa.class.getDeclaredMethod(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_B, String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(c13107Aa, str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
