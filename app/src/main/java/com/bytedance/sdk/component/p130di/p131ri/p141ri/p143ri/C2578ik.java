package com.bytedance.sdk.component.p130di.p131ri.p141ri.p143ri;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.InterfaceC2552ri;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.ri.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2578ik {
    /* JADX INFO: renamed from: ri */
    public static int m9466ri(Context context, String str, ContentValues contentValues, String str2, String[] strArr) {
        if (contentValues != null && !TextUtils.isEmpty(str)) {
            try {
                return C2581ri.m9484ri(context).mo9475ri().m9478ri(str, contentValues, str2, strArr);
            } catch (Throwable unused) {
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: ri */
    public static int m9467ri(Context context, String str, String str2, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return C2581ri.m9484ri(context).mo9475ri().m9479ri(str, str2, strArr);
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static Cursor m9468ri(Context context, String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C2581ri.m9484ri(context).mo9475ri().m9481ri(str, strArr, str2, strArr2, null, null, str5);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9469ri(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C2581ri.m9484ri(context).mo9475ri().m9482ri(Uri.decode(str));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9470ri(Context context, String str, ContentValues contentValues) {
        if (contentValues == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C2581ri.m9484ri(context).mo9475ri().m9480ri(str, (String) null, contentValues);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m9471ri(Context context, String str, List<InterfaceC2552ri> list) {
        if (list == null || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            C2581ri.m9484ri(context).mo9475ri().m9483ri(str, (String) null, list);
        } catch (Throwable unused) {
        }
    }
}
