package com.mbridge.msdk.dycreator.utils;

import android.text.TextUtils;
import android.view.View;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.viewdata.base.InterfaceC12986a;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.utils.d */
/* JADX INFO: compiled from: DYLogicUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12981d {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a */
    public static boolean m36408a(View view, InterfaceC12986a interfaceC12986a) {
        String[] strArrSplit;
        if (view != 0) {
            try {
                if ((view instanceof InterBase) && interfaceC12986a != null) {
                    String actionDes = ((InterBase) view).getActionDes();
                    if (!TextUtils.isEmpty(actionDes) && (strArrSplit = actionDes.split("\\|")) != null && strArrSplit.length >= 2 && !TextUtils.isEmpty(strArrSplit[0]) && strArrSplit[0].startsWith("click") && !TextUtils.isEmpty(strArrSplit[1]) && strArrSplit[1].equals("alecfc") && interfaceC12986a.getEffectData() != null) {
                        return interfaceC12986a.getEffectData().isClickScreen();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: a */
    public static void m36407a(String str, View view, boolean z) {
        if (view == null || !(view instanceof InterBase) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] strArrSplit = str.split("\\|");
            if (strArrSplit == null || strArrSplit.length < 2 || TextUtils.isEmpty(strArrSplit[0]) || !strArrSplit[0].startsWith("visible") || TextUtils.isEmpty(strArrSplit[1]) || !strArrSplit[1].equals("parent") || !z) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m36405a(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getMethod(str, null);
                if (method != null) {
                    try {
                        return method.invoke(obj, null);
                    } catch (NoSuchMethodException unused) {
                        if (obj instanceof InterfaceC12986a) {
                            method = ((InterfaceC12986a) obj).getBindData().getClass().getMethod(str, null);
                        }
                        if (method != null) {
                            return method.invoke(((InterfaceC12986a) obj).getBindData(), null);
                        }
                        return null;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static String m36406a(boolean z, int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("zh")) {
            return str + " " + i + CmcdData.Factory.STREAMING_FORMAT_SS;
        }
        if (z) {
            return str + i + CmcdData.Factory.STREAMING_FORMAT_SS;
        }
        return i + "s " + str;
    }
}
