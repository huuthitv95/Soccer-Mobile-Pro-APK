package com.mbridge.msdk.mbsignalcommon.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes6.dex */
public class ActionBar extends LinearLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    private WebView f37039a;

    /* JADX INFO: renamed from: com.mbridge.msdk.mbsignalcommon.base.ActionBar$a */
    public interface InterfaceC13346a {
        /* JADX INFO: renamed from: a */
        View m38601a();

        /* JADX INFO: renamed from: a */
        void m38602a(View view, WebView webView);
    }

    public ActionBar(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    private View m38600a(InterfaceC13346a interfaceC13346a) {
        View viewM38601a = interfaceC13346a.m38601a();
        if (viewM38601a == null) {
            return null;
        }
        View viewNewActionItem = newActionItem();
        ((ViewGroup) ((ViewGroup) viewNewActionItem).getChildAt(0)).addView(viewM38601a);
        viewM38601a.setTag(interfaceC13346a);
        viewM38601a.setOnClickListener(this);
        return viewNewActionItem;
    }

    public void addAction(InterfaceC13346a interfaceC13346a) {
        addAction(interfaceC13346a, getChildCount());
    }

    public int getActionCount() {
        return getChildCount();
    }

    public WebView getWebView() {
        return this.f37039a;
    }

    public View newActionItem() {
        Context context = getContext();
        LinearLayout linearLayout = new LinearLayout(context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        layoutParams.weight = 1.0f;
        linearLayout.setLayoutParams(layoutParams);
        View frameLayout = new FrameLayout(context);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        frameLayout.setLayoutParams(layoutParams2);
        linearLayout.addView(frameLayout);
        return linearLayout;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof InterfaceC13346a) {
            ((InterfaceC13346a) tag).m38602a(view, this.f37039a);
        }
    }

    public boolean removeAction(InterfaceC13346a interfaceC13346a) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                Object tag = childAt.getTag();
                if ((tag instanceof InterfaceC13346a) && tag.equals(interfaceC13346a)) {
                    removeView(childAt);
                    return true;
                }
            }
        }
        return false;
    }

    public void removeActionAt(int i) {
        if (i < 0 || i >= getChildCount()) {
            return;
        }
        removeViewAt(i);
    }

    public void removeAllActions() {
        removeAllViews();
    }

    public void setWebView(WebView webView) {
        this.f37039a = webView;
    }

    public ActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void addAction(InterfaceC13346a interfaceC13346a, int i) {
        addView(m38600a(interfaceC13346a), i);
    }
}
