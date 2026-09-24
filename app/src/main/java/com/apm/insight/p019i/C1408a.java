package com.apm.insight.p019i;

import android.content.Context;
import android.provider.Settings;
import android.text.TextUtils;
import com.apm.insight.runtime.C1473o;
import java.util.UUID;

/* JADX INFO: renamed from: com.apm.insight.i.a */
/* JADX INFO: compiled from: DeviceUuidFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class C1408a {

    /* JADX INFO: renamed from: a */
    private static volatile UUID f608a = null;

    /* JADX INFO: renamed from: b */
    private static String f609b = "";

    private C1408a(Context context) {
        String string;
        if (f608a == null) {
            synchronized (C1408a.class) {
                if (f608a == null) {
                    String strM1718c = C1473o.m1709a().m1718c();
                    if (strM1718c != null) {
                        f608a = UUID.fromString(strM1718c);
                    } else {
                        try {
                            string = Settings.Secure.getString(context.getContentResolver(), "android_id");
                        } catch (Throwable unused) {
                            string = null;
                        }
                        try {
                            if (string != null) {
                                f608a = UUID.nameUUIDFromBytes(string.getBytes("utf8"));
                            } else {
                                f608a = UUID.randomUUID();
                            }
                        } catch (Throwable unused2) {
                        }
                        try {
                            C1473o.m1709a().m1717b(f608a.toString());
                        } catch (Throwable unused3) {
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized String m1185a(Context context) {
        if (TextUtils.isEmpty(f609b)) {
            new C1408a(context);
            UUID uuid = f608a;
            if (uuid != null) {
                f609b = uuid.toString();
            }
        }
        return f609b;
    }
}
