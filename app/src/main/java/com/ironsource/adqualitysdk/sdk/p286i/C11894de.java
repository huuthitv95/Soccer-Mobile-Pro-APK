package com.ironsource.adqualitysdk.sdk.p286i;

import java.util.Collection;
import java.util.List;
import org.json.JSONArray;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.de */
/* JADX INFO: loaded from: classes6.dex */
public final class C11894de extends C11886cx {
    /* JADX INFO: renamed from: ﾒ */
    public static int m29886(List<Object> list) {
        return C12081kc.m30858((String) m29851(list, 0, String.class), (String) m29851(list, 1, String.class));
    }

    /* JADX INFO: renamed from: ﻐ */
    public static List<String> m29882(List<Object> list) {
        return C12019hv.m30362().m30363().m30453(m29851(list, 0, Object.class), (List<String>) m29851(list, 1, List.class), ((Integer) m29851(list, 2, Integer.class)).intValue());
    }

    /* JADX INFO: renamed from: ﾇ */
    public static List<String> m29885(List<Object> list) {
        String str = (String) m29851(list, 0, String.class);
        if (list.get(1) instanceof String) {
            return C12081kc.m30860(str, (String) m29851(list, 1, String.class));
        }
        return C12081kc.m30854(str, new JSONArray((Collection) m29851(list, 1, List.class)));
    }

    /* JADX INFO: renamed from: ｋ */
    public static String m29884(List<Object> list) {
        String str = (String) m29851(list, 0, String.class);
        boolean zBooleanValue = list.size() > 2 ? ((Boolean) m29851(list, 2, Boolean.class)).booleanValue() : true;
        if (list.get(1) instanceof String) {
            return C12081kc.m30852(str, (String) m29851(list, 1, String.class), zBooleanValue);
        }
        return C12081kc.m30853(str, new JSONArray((Collection) m29851(list, 1, List.class)), zBooleanValue);
    }

    /* JADX INFO: renamed from: ﻛ */
    public static boolean m29883(List<Object> list) {
        return C12081kc.m30859((String) m29851(list, 0, String.class));
    }

    /* JADX INFO: renamed from: ﱟ */
    public static String m29881(List<Object> list) {
        return C12081kc.m30855((String) m29851(list, 0, String.class));
    }
}
