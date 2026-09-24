package com.ironsource.adqualitysdk.sdk.p286i;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.kh */
/* JADX INFO: loaded from: classes6.dex */
public final class C12083kh {

    /* JADX INFO: renamed from: ﾒ */
    private static Rect f29815 = new Rect();

    /* JADX INFO: renamed from: ﻐ */
    public static View m30872(Activity activity) {
        return activity.findViewById(R.id.content);
    }

    /* JADX INFO: renamed from: ｋ */
    public static <E extends View> E m30878(Activity activity, Class<E> cls, int i, List<String> list, String str) {
        ArrayList arrayList = new ArrayList();
        m30884(activity, cls, i, str, true, false, null, list, arrayList);
        if (arrayList.size() > 0) {
            return (E) arrayList.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public static <E extends View> void m30875(Activity activity, Class<E> cls, boolean z, List<Integer> list, List<String> list2, List<E> list3) {
        m30884(activity, cls, -1, null, false, z, list, list2, list3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ﾒ */
    public static <E extends View> void m30884(Activity activity, Class<E> cls, int i, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (i != -1) {
            View viewFindViewById = activity.findViewById(i);
            if (cls.isInstance(viewFindViewById)) {
                list3.add(viewFindViewById);
                if (z) {
                    return;
                }
            }
            m30879(viewFindViewById, cls, str, z, z2, list, list2, list3);
            if (list3.size() > 0 && z) {
                return;
            }
        }
        View viewFindViewById2 = activity.findViewById(R.id.content);
        if (viewFindViewById2 != null) {
            m30874(viewFindViewById2, cls, str, z, z2, list, list2, list3);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    private static <E extends View> void m30874(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        while (view.getParent() != null && (view.getParent() instanceof ViewGroup)) {
            view = (View) view.getParent();
        }
        m30879(view, cls, str, z, z2, list, list2, list3);
    }

    /* JADX INFO: renamed from: ﻐ */
    public static <E extends View> E m30873(View view, Class<E> cls, boolean z) {
        ArrayList arrayList = new ArrayList();
        m30876(view, cls, true, z, null, null, arrayList);
        if (arrayList.isEmpty()) {
            return null;
        }
        return (E) arrayList.get(0);
    }

    /* JADX INFO: renamed from: ﻛ */
    public static <E extends View> void m30876(View view, Class<E> cls, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        m30879(view, cls, null, z, z2, list, list2, list3);
    }

    /* JADX INFO: renamed from: ｋ */
    public static <E extends View> void m30879(View view, Class<E> cls, String str, boolean z, boolean z2, List<Integer> list, List<String> list2, List<E> list3) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                E e = (E) viewGroup.getChildAt(i);
                if (m30882(e, cls, str, list, list2)) {
                    list3.add(e);
                    if (z) {
                        return;
                    }
                    if (z2) {
                        m30879(e, cls, str, z, z2, list, list2, list3);
                    }
                } else {
                    m30879(e, cls, str, z, z2, list, list2, list3);
                    if (list3 != null && list3.size() > 0 && z) {
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public static <E extends View> boolean m30882(View view, Class<E> cls, String str, List<Integer> list, List<String> list2) {
        if (!cls.isInstance(view)) {
            return false;
        }
        if ((m30881(list) || list.contains(Integer.valueOf(view.getId()))) && !m30877(list2, view)) {
            return str == null || view.getClass().getName().startsWith(str);
        }
        return false;
    }

    /* JADX INFO: renamed from: ｋ */
    private static boolean m30881(List list) {
        return list == null || list.isEmpty();
    }

    /* JADX INFO: renamed from: ﻛ */
    private static boolean m30877(List<String> list, View view) {
        return list != null && list.contains(view.getClass().getName());
    }

    /* JADX INFO: renamed from: ﾒ */
    public static View m30883(View view) {
        while (view.getParent() instanceof View) {
            view = (View) view.getParent();
        }
        return view;
    }

    /* JADX INFO: renamed from: ｋ */
    public static boolean m30880(View view) {
        view.getHitRect(f29815);
        return view.getGlobalVisibleRect(f29815);
    }

    /* JADX INFO: renamed from: ﻐ */
    public static Activity m30871(View view) {
        View viewFindViewById;
        if (view != null) {
            View view2 = view;
            while (view2.getId() != 16908290 && (view2.getParent() instanceof View)) {
                view2 = (View) view2.getParent();
            }
            for (Context context = view2.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
                if (context instanceof Activity) {
                    return (Activity) context;
                }
            }
            if (view != null && (viewFindViewById = view.findViewById(R.id.content)) != null && (viewFindViewById.getContext() instanceof Activity)) {
                return (Activity) viewFindViewById.getContext();
            }
        }
        return null;
    }
}
