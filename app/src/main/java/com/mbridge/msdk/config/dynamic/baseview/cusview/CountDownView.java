package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.widget.FeedBackButton;

/* JADX INFO: loaded from: classes5.dex */
public class CountDownView extends ComponentTextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public CountDownView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m35917c();
    }

    /* JADX INFO: renamed from: c */
    private void m35917c() {
        int iM37876a = C13229v0.m37876a(C13008c.m36588n().m36542d(), 13.0f);
        setPadding(iM37876a, 0, iM37876a, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(C13229v0.m37876a(C13008c.m36588n().m36542d(), 20.0f));
        gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
    }
}
