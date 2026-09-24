package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;

/* JADX INFO: loaded from: classes6.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        m37978b();
    }

    /* JADX INFO: renamed from: a */
    private View m37977a() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    /* JADX INFO: renamed from: b */
    private void m37978b() {
        setOrientation(0);
        try {
            int iM37876a = C13229v0.m37876a(getContext(), 10.0f);
            setPadding(0, iM37876a, 0, iM37876a);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) m37977a();
            imageView.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) m37977a();
            imageView2.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) m37977a();
            imageView3.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) m37977a();
            imageView4.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", C13008c.m36588n().m36550i())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(onClickListener);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m37978b();
    }
}
