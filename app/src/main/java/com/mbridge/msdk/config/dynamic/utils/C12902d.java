package com.mbridge.msdk.config.dynamic.utils;

import android.content.Context;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.config.component.common.express.C12716c;
import com.mbridge.msdk.config.dynamic.C12898c;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b;
import com.mbridge.msdk.config.dynamic.binddata.C12893a;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.dycreator.utils.C12982e;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.utils.d */
/* JADX INFO: compiled from: DynamicUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12902d {
    /* JADX INFO: renamed from: a */
    public static XMLView m36156a(View view) {
        XMLView xMLView = null;
        try {
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    if (view2 instanceof XMLView) {
                        XMLView xMLView2 = (XMLView) view2;
                        try {
                            if (view.getTag() instanceof String) {
                                xMLView2.getRenderMap().put(view.getTag().toString(), view);
                            }
                            return xMLView2;
                        } catch (Exception e) {
                            e = e;
                            xMLView = xMLView2;
                        }
                    }
                    e.printStackTrace();
                    return xMLView;
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static XMLView m36157a(ViewGroup viewGroup, String str) {
        XMLView xMLView = null;
        if (viewGroup != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if ((childAt instanceof XMLView) && str.equals(((XMLView) childAt).getSelfTag())) {
                            xMLView = (XMLView) childAt;
                        }
                    }
                    return xMLView;
                }
            } catch (Exception e) {
                C13219q0.m37816b("ComponentUtil", e.getMessage());
            }
        }
        return xMLView;
    }

    /* JADX INFO: renamed from: a */
    public static <T extends View> T m36155a(ViewGroup viewGroup, Class<T> cls) {
        T t = null;
        if (viewGroup != null) {
            try {
                if (viewGroup.getChildCount() > 0) {
                    for (int i = 0; i < viewGroup.getChildCount(); i++) {
                        View childAt = viewGroup.getChildAt(i);
                        if (cls.isInstance(childAt)) {
                            return cls.cast(childAt);
                        }
                    }
                    for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                        View childAt2 = viewGroup.getChildAt(i2);
                        if ((childAt2 instanceof ViewGroup) && (t = (T) m36155a((ViewGroup) childAt2, cls)) != null) {
                            return t;
                        }
                    }
                    return t;
                }
            } catch (Exception e) {
                C13219q0.m37817b("ComponentUtil", e.getMessage(), e);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static Map<String, Object> m36159a(ViewGroup viewGroup) {
        HashMap map = new HashMap();
        m36160a(viewGroup, map);
        return map;
    }

    /* JADX INFO: renamed from: a */
    private static void m36160a(ViewGroup viewGroup, Map<String, Object> map) {
        if (viewGroup == null || map == null) {
            return;
        }
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            try {
                KeyEvent.Callback childAt = viewGroup.getChildAt(i);
                if (childAt instanceof InterfaceC12876b) {
                    try {
                        Map<String, Object> outData = ((InterfaceC12876b) childAt).getOutData();
                        if (outData != null && !outData.isEmpty()) {
                            map.putAll(outData);
                        }
                    } catch (Exception e) {
                        C13219q0.m37816b("ComponentUtil", "Error getting out data from child view: " + e.getMessage());
                    }
                }
                if (childAt instanceof ViewGroup) {
                    m36160a((ViewGroup) childAt, map);
                }
            } catch (Exception e2) {
                C13219q0.m37816b("ComponentUtil", "Error collecting out data from view group: " + e2.getMessage());
                return;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static Object m36158a(String str, String str2, View view, C12894a c12894a) {
        if (!TextUtils.isEmpty(str2)) {
            Context contextM36542d = C13008c.m36588n().m36542d();
            if (str2.startsWith("$")) {
                C12893a.m36040a(str, str2, view, c12894a);
                return C12716c.m34889a(str2, c12894a);
            }
            if (str2.startsWith("@+id/")) {
                return Integer.valueOf(str2.substring(5).hashCode());
            }
            if (str2.startsWith("#")) {
                return Integer.valueOf(C12898c.m36066a().m36076e(str2));
            }
            if (str2.startsWith("@color/")) {
                return Integer.valueOf(C12898c.m36066a().m36071b(str2));
            }
            if (str2.startsWith("@drawable/")) {
                try {
                    return Integer.valueOf(contextM36542d.getResources().getIdentifier(str2.substring(10), "drawable", contextM36542d.getPackageName()));
                } catch (Exception e) {
                    C13219q0.m37816b("ComponentUtil", e.getMessage());
                    return 0;
                }
            }
            if (str2.startsWith("@dimen/")) {
                try {
                    int identifier = contextM36542d.getResources().getIdentifier(str2.substring(7), "dimen", contextM36542d.getPackageName());
                    if (identifier != 0) {
                        return Integer.valueOf(contextM36542d.getResources().getDimensionPixelSize(identifier));
                    }
                    C13219q0.m37816b("ComponentUtil", "Invalid dimen resource: " + str2);
                    return 0;
                } catch (Exception e2) {
                    C13219q0.m37816b("ComponentUtil", "Error getting dimen resource: " + str2 + ", " + e2.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("dp")) {
                try {
                    return Integer.valueOf(C12982e.m36410a(contextM36542d, Integer.parseInt(str2.substring(0, str2.length() - 2))));
                } catch (Exception e3) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing dp value: " + str2 + ", " + e3.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("dip")) {
                try {
                    return Integer.valueOf(C12982e.m36409a(contextM36542d, Integer.parseInt(str2.substring(0, str2.length() - 3))));
                } catch (Exception e4) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing dp value: " + str2 + ", " + e4.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("sp")) {
                try {
                    return Integer.valueOf(C12982e.m36413b(contextM36542d, Integer.parseInt(str2.substring(0, str2.length() - 2))));
                } catch (Exception e5) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing sp value: " + str2 + ", " + e5.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("px")) {
                try {
                    return Integer.valueOf(Math.round(Float.parseFloat(str2.substring(0, str2.length() - 2))));
                } catch (Exception e6) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing px value: " + str2 + ", " + e6.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("pt")) {
                try {
                    return Integer.valueOf(C12982e.m36415d(contextM36542d, Float.parseFloat(str2.substring(0, str2.length() - 2))));
                } catch (Exception e7) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing pt value: " + str2 + ", " + e7.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith("mm")) {
                try {
                    return Integer.valueOf(C12982e.m36414c(contextM36542d, Float.parseFloat(str2.substring(0, str2.length() - 2))));
                } catch (Exception e8) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing mm value: " + str2 + ", " + e8.getMessage());
                    return 0;
                }
            }
            if (str2.endsWith(ScarConstants.IN_SIGNAL_KEY)) {
                try {
                    return Integer.valueOf(C12982e.m36412b(contextM36542d, Float.parseFloat(str2.substring(0, str2.length() - 2))));
                } catch (Exception e9) {
                    C13219q0.m37816b("ComponentUtil", "Error parsing in value: " + str2 + ", " + e9.getMessage());
                    return 0;
                }
            }
            if (str2.startsWith("@string/")) {
                try {
                    return contextM36542d.getString(contextM36542d.getResources().getIdentifier(str2.substring(8), TypedValues.Custom.S_STRING, contextM36542d.getPackageName()));
                } catch (Exception unused) {
                    C13219q0.m37816b("ComponentUtil", "Invalid string resource: " + str2);
                }
            }
        }
        return str2;
    }
}
