package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.core.C3302pv;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class srn {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.srn$lr */
    public interface InterfaceC3591lr {
        /* JADX INFO: renamed from: lr */
        void mo13024lr();

        /* JADX INFO: renamed from: ri */
        void mo13025ri();

        /* JADX INFO: renamed from: ri */
        void mo13026ri(View view, boolean z);

        /* JADX INFO: renamed from: ri */
        void mo13027ri(boolean z);
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.srn$ri */
    class ViewTreeObserverOnGlobalLayoutListenerC3592ri implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: ik */
        final /* synthetic */ boolean f13329ik;

        /* JADX INFO: renamed from: lr */
        final /* synthetic */ ViewGroup f13330lr;

        /* JADX INFO: renamed from: ri */
        View f13331ri = null;

        ViewTreeObserverOnGlobalLayoutListenerC3592ri(ViewGroup viewGroup, boolean z) {
            this.f13330lr = viewGroup;
            this.f13329ik = z;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                InterfaceC3591lr interfaceC3591lr = (InterfaceC3591lr) this.f13330lr.getTag(520093765);
                if (this.f13331ri == null) {
                    ViewGroup viewGroup = this.f13330lr;
                    srn.m16652lr(viewGroup, interfaceC3591lr, (Integer) viewGroup.getTag(520093766), this.f13329ik);
                    return;
                }
                Rect rect = new Rect();
                this.f13331ri.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.f13330lr.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (interfaceC3591lr != null) {
                        interfaceC3591lr.mo13026ri(this.f13330lr, false);
                    }
                    this.f13330lr.setTag(520093763, Boolean.FALSE);
                } else {
                    if (interfaceC3591lr != null) {
                        interfaceC3591lr.mo13026ri(this.f13330lr, true);
                    }
                    this.f13330lr.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.f13330lr.getTag(520093765), "ViewUtils", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static void m16652lr(View view, InterfaceC3591lr interfaceC3591lr, Integer num, boolean z) {
        if (interfaceC3591lr == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        interfaceC3591lr.mo13026ri(view, m16657ri(view, num.intValue(), z));
    }

    /* JADX INFO: renamed from: ri */
    public static View m16653ri(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        return cls.isInstance(parent) ? (View) parent : m16653ri((View) parent, cls);
    }

    /* JADX INFO: renamed from: ri */
    public static ArrayList<View> m16654ri(View view, int i) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i > 1 && parent != null) {
                arrayList.addAll(m16654ri((View) parent, i - 1));
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: ri */
    public static void m16656ri(final ViewGroup viewGroup, boolean z, int i, final boolean z2, InterfaceC3591lr interfaceC3591lr, List<ViewGroup> list) {
        viewGroup.setTag(520093765, interfaceC3591lr);
        viewGroup.setTag(520093766, Integer.valueOf(i));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final ViewTreeObserverOnGlobalLayoutListenerC3592ri viewTreeObserverOnGlobalLayoutListenerC3592ri = new ViewTreeObserverOnGlobalLayoutListenerC3592ri(viewGroup, z2);
        if (list != null && list.size() > 0) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                list.get(i2).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        viewTreeObserverOnGlobalLayoutListenerC3592ri.f13331ri = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        viewTreeObserverOnGlobalLayoutListenerC3592ri.f13331ri = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC3592ri);
        if (z) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        InterfaceC3591lr interfaceC3591lr2 = (InterfaceC3591lr) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        srn.m16652lr(viewGroup2, interfaceC3591lr2, (Integer) viewGroup2.getTag(520093766), z2);
                    } catch (Exception e) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z3) {
                try {
                    InterfaceC3591lr interfaceC3591lr2 = (InterfaceC3591lr) viewGroup.getTag(520093765);
                    if (interfaceC3591lr2 != null) {
                        interfaceC3591lr2.mo13027ri(z3);
                        ViewGroup viewGroup2 = viewGroup;
                        srn.m16652lr(viewGroup2, interfaceC3591lr2, (Integer) viewGroup2.getTag(520093766), z2);
                    }
                } catch (Exception e) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.srn.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                InterfaceC3591lr interfaceC3591lr2 = (InterfaceC3591lr) viewGroup.getTag(520093765);
                if (interfaceC3591lr2 != null) {
                    interfaceC3591lr2.mo13025ri();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                InterfaceC3591lr interfaceC3591lr2 = (InterfaceC3591lr) viewGroup.getTag(520093765);
                if (interfaceC3591lr2 != null) {
                    interfaceC3591lr2.mo13024lr();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m16657ri(View view, int i, boolean z) {
        return C3302pv.m14656ri(view, 20, i, z);
    }
}
