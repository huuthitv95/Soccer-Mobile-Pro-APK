package com.fyber.inneractive.sdk.config;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.n */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8019n {
    /* JADX INFO: renamed from: a */
    public static void m20440a(Context context, C8048w c8048w) {
        String string = null;
        boolean z = false;
        try {
            ContentResolver contentResolver = context.getContentResolver();
            z = Settings.Secure.getInt(contentResolver, "limit_ad_tracking") != 0;
            if (!z) {
                string = Settings.Secure.getString(contentResolver, "advertising_id");
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        if (string != null) {
            synchronized (c8048w) {
                C8046v c8046v = c8048w.f17886b;
                c8046v.f17882a = string;
                c8046v.f17883b = z;
                c8046v.f17884c = true;
            }
        }
    }
}
