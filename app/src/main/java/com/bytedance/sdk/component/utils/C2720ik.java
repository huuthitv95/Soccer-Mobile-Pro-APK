package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2720ik {

    /* JADX INFO: renamed from: ri */
    private static HashMap<String, ArrayList<String>> f7765ri = new HashMap<>();

    /* JADX INFO: renamed from: lr */
    private static Signature[] m10230lr(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m10231ri(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayListM10233ri = m10233ri(context, "SHA1");
        if (arrayListM10233ri != null && arrayListM10233ri.size() != 0) {
            for (int i = 0; i < arrayListM10233ri.size(); i++) {
                sb.append(arrayListM10233ri.get(i));
                if (i < arrayListM10233ri.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: ri */
    private static String m10232ri(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            if (messageDigest == null) {
                return "error!";
            }
            byte[] bArrDigest = messageDigest.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(CertificateUtil.DELIMITER);
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception unused) {
            return "error!";
        }
    }

    /* JADX INFO: renamed from: ri */
    public static ArrayList<String> m10233ri(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (context != null && str != null) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f7765ri.get(str) != null) {
                return f7765ri.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : m10230lr(context, packageName)) {
                    String strM10232ri = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        strM10232ri = m10232ri(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        strM10232ri = m10232ri(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        strM10232ri = m10232ri(signature, "SHA256");
                    }
                    arrayList.add(strM10232ri);
                }
            } catch (Exception unused) {
            }
            f7765ri.put(str, arrayList);
        }
        return arrayList;
    }
}
