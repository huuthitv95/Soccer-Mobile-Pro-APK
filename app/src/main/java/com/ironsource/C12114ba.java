package com.ironsource;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: renamed from: com.ironsource.ba */
/* JADX INFO: loaded from: classes6.dex */
public class C12114ba {

    /* JADX INFO: renamed from: a */
    private static final String f30131a = "_preferences";

    private C12114ba() {
    }

    /* JADX INFO: renamed from: a */
    public static String m31189a(Context context, String str) {
        if (context == null) {
            return str;
        }
        return context.getPackageName() + f30131a;
    }

    /* JADX INFO: renamed from: b */
    public static void m31193b(Context context, String str, String str2, String str3) {
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = context.getSharedPreferences(str, 0).edit();
        editorEdit.putString(str2, str3);
        editorEdit.apply();
    }

    /* JADX INFO: renamed from: a */
    public static String m31191a(Context context, String str, String str2, String str3) {
        return context == null ? str3 : context.getSharedPreferences(str, 0).getString(str2, str3);
    }

    /* JADX INFO: renamed from: a */
    public static String m31190a(Context context, String str, String str2) {
        return m31191a(context, m31189a(context, ""), str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m31192a(Context context, String str, String str2, boolean z) {
        return context == null ? z : context.getSharedPreferences(str, 0).getBoolean(str2, z);
    }

    /* JADX INFO: renamed from: a */
    static int m31188a(Context context, String str, String str2, int i) {
        return context == null ? i : context.getSharedPreferences(str, 0).getInt(str2, i);
    }

    /* JADX INFO: renamed from: a */
    public static int m31187a(Context context, String str, int i) {
        return m31188a(context, m31189a(context, ""), str, i);
    }
}
