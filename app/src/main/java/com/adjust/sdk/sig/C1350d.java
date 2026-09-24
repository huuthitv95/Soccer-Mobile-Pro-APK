package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import com.google.common.base.Ascii;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.security.InvalidKeyException;
import java.security.UnrecoverableKeyException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.adjust.sdk.sig.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C1350d {

    /* JADX INFO: renamed from: a */
    public static boolean f358a;

    /* JADX INFO: renamed from: a */
    public static void m853a(Context context, C1349c c1349c, InterfaceC1347a interfaceC1347a, Map map, String str, String str2) throws Exception {
        byte[] bArrM851a;
        if (f358a) {
            Log.e("SignerInstance", "sign: library received error. It has locked down");
            return;
        }
        if (map == null || map.size() == 0 || str == null || str2 == null) {
            Log.e("SignerInstance", "sign: One or more parameters are null");
            return;
        }
        map.put("activity_kind", str);
        map.put("client_sdk", str2);
        int i = 2;
        while (true) {
            if (i <= 0) {
                bArrM851a = null;
                break;
            }
            try {
                c1349c.m852b(context);
                bArrM851a = c1349c.m851a(context, map.toString().getBytes("UTF-8"));
                break;
            } catch (C1348b e) {
                Log.e("SignerInstance", "sign: Api is less than JellyBean-4-18");
                f358a = true;
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e;
            } catch (InvalidKeyException e2) {
                e = e2;
            } catch (UnrecoverableKeyException e3) {
                e = e3;
            } catch (Exception e4) {
                Log.e("SignerInstance", "sign: Received an Exception: " + e4.getMessage(), e4);
                map.remove("activity_kind");
                map.remove("client_sdk");
                throw e4;
            }
            Log.e("SignerInstance", "sign: Received a retriable exception: " + e.getMessage(), e);
            Log.e("SignerInstance", "sign: Attempting retry #" + i);
            i += -1;
            c1349c.m850a(context);
        }
        if (i == 0) {
            f358a = true;
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        byte[] bArrM848a = ((NativeLibHelper) interfaceC1347a).m848a(context, map, bArrM851a, c1349c.f357a);
        if (bArrM848a == null) {
            Log.e("SignerInstance", "sign: Returned an null signature. Exiting...");
            map.remove("activity_kind");
            map.remove("client_sdk");
            return;
        }
        int length = bArrM848a.length;
        char[] cArr = AbstractC1351e.f359a;
        char[] cArr2 = new char[length * 2];
        for (int i2 = 0; i2 < length; i2++) {
            byte b = bArrM848a[i2];
            int i3 = i2 * 2;
            char[] cArr3 = AbstractC1351e.f359a;
            cArr2[i3] = cArr3[(b & 255) >>> 4];
            cArr2[i3 + 1] = cArr3[b & Ascii.f22499SI];
        }
        map.put(InAppPurchaseMetaData.KEY_SIGNATURE, new String(cArr2));
        map.remove("activity_kind");
        map.remove("client_sdk");
    }

    /* JADX INFO: renamed from: a */
    public static void m854a(Set set, Map map, Map map2) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (map.containsKey(str)) {
                map2.put(str, (String) map.get(str));
            }
        }
    }
}
