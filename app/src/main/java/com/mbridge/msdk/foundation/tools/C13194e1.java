package com.mbridge.msdk.foundation.tools;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.e1 */
/* JADX INFO: compiled from: ViewCoveredUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13194e1 {

    /* JADX INFO: renamed from: a */
    private static boolean f36289a = false;

    /* JADX INFO: renamed from: a */
    private static int m37668a(View view, ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            if (viewGroup.getChildAt(i) == view) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m37671a(View view, View view2, float f) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        Rect rect2 = new Rect();
        view2.getGlobalVisibleRect(rect2);
        Rect rect3 = new Rect();
        if (rect3.setIntersect(rect, rect2)) {
            int iWidth = rect3.width() * rect3.height();
            int iWidth2 = rect.width() * rect.height();
            int measuredWidth = view.getMeasuredWidth() * view.getMeasuredHeight();
            if (f == 0.0f) {
                return iWidth2 < measuredWidth || iWidth >= measuredWidth;
            }
            float f2 = measuredWidth * f;
            float f3 = iWidth;
            if (f3 >= f2) {
                return true;
            }
            int i = iWidth2 - iWidth;
            if (iWidth + i >= measuredWidth) {
                return f3 > f2;
            }
            if (i <= f2) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m37672a(View view, ViewGroup viewGroup, float f) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            C13219q0.m37816b("ViewUtils", "View Judge : Start Loop");
            View childAt = viewGroup.getChildAt(i);
            if (childAt.getVisibility() == 0 && m37671a(view, childAt, f)) {
                if ((childAt instanceof WebView) && childAt.getVisibility() == 0) {
                    C13219q0.m37816b("ViewUtils", "View Judge : View Covered by WebView.");
                    f36289a = true;
                }
                if (m37669a(childAt)) {
                    C13219q0.m37816b("ViewUtils", "View Judge : View Covered and Cover ViewGroup is not transparent.");
                    f36289a = true;
                }
                if (f36289a) {
                    break;
                }
                if (childAt instanceof ViewGroup) {
                    m37672a(view, (ViewGroup) childAt, f);
                }
            }
        }
        return f36289a;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x0129 A[SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public static boolean m37670a(View view, int i) {
        if (view == null) {
            return true;
        }
        if (view.getVisibility() != 0) {
            C13219q0.m37816b("ViewUtils", "View Judge : View's not visible.");
            return true;
        }
        if (view.getAlpha() < 0.5f) {
            C13219q0.m37816b("ViewUtils", "View Judge : View's alpha must set up 50%.");
            return true;
        }
        if (view.getParent() == null) {
            C13219q0.m37816b("ViewUtils", "View Judge : view has no parent");
            return true;
        }
        if (view.getParent() != null && (view.getParent() instanceof ViewGroup) && ((ViewGroup) view.getParent()).getVisibility() != 0) {
            C13219q0.m37816b("ViewUtils", "View Judge : View's container is not visible.");
            return true;
        }
        Rect rect = new Rect();
        boolean globalVisibleRect = view.getGlobalVisibleRect(rect);
        float f = i == 1 ? 0.0f : 0.5f;
        boolean z = ((float) ((rect.bottom - rect.top) * (rect.right - rect.left))) > ((float) (view.getMeasuredHeight() * view.getMeasuredWidth())) * f;
        boolean z2 = globalVisibleRect && z;
        C13219q0.m37816b("ViewUtils", "View Judge : partVisible is " + globalVisibleRect + " halfPercentVisible is " + z);
        StringBuilder sb = new StringBuilder("View Judge : totalViewVisible is ");
        sb.append(z2);
        C13219q0.m37816b("ViewUtils", sb.toString());
        if (!z2) {
            return true;
        }
        View view2 = view;
        while (view2.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view2.getParent();
            int iM37668a = m37668a(view2, viewGroup);
            for (int i2 = iM37668a + 1; i2 < viewGroup.getChildCount(); i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    boolean zM37671a = m37671a(view, childAt, f);
                    C13219q0.m37816b("ViewUtils", "View Judge : " + iM37668a + "  intersects " + zM37671a + " currentParent " + viewGroup + "currentView " + childAt);
                    if (!zM37671a) {
                        continue;
                    } else if (childAt instanceof ViewGroup) {
                        ViewGroup viewGroup2 = (ViewGroup) childAt;
                        if (viewGroup2.getChildCount() > 0) {
                            C13219q0.m37816b("ViewUtils", "View Judge : Covered by ViewGroup.");
                            boolean zM37672a = m37672a(view, viewGroup2, f);
                            f36289a = false;
                            if (zM37672a) {
                                return true;
                            }
                        } else if (m37669a(childAt)) {
                            C13219q0.m37816b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                            return true;
                        }
                    } else if (m37669a(childAt)) {
                        C13219q0.m37816b("ViewUtils", "View Judge : View Covered and Cover View is not transparent.");
                        return true;
                    }
                }
            }
            view2 = viewGroup;
        }
        C13219q0.m37816b("ViewUtils", "View Judge : Well done, View is not covered.");
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m37669a(View view) {
        if (view == null) {
            return true;
        }
        if (!((view.getTag() instanceof String) && "mb_wm".equals(view.getTag())) && view.getAlpha() > 0.5f) {
            return view.getBackground() == null || view.getBackground().getAlpha() > 127;
        }
        return false;
    }
}
