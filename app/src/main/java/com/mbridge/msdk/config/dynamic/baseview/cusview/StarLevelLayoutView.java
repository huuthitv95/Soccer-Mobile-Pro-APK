package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.internal.ads.zzes$$ExternalSyntheticBackport0;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class StarLevelLayoutView extends ComponentLinearLayout {
    public StarLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setRating(int i) {
        try {
            removeAllViews();
            if (i == 0) {
                i = 5;
            }
            int iM37707a = C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_demo_star_sel", "drawable");
            int iM37707a2 = C13203i0.m37707a(C13008c.m36588n().m36542d(), "mbridge_demo_star_nor", "drawable");
            for (int i2 = 0; i2 < 5; i2++) {
                ImageView imageView = new ImageView(getContext());
                ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                if (i2 < i) {
                    imageView.setImageResource(iM37707a);
                } else {
                    imageView.setImageResource(iM37707a2);
                }
                addView(imageView, layoutParams);
            }
        } catch (Exception e) {
            C13219q0.m37816b("StarLevelLayoutView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        try {
            String strValueOf = String.valueOf(map.get("data"));
            if (strValueOf.equals(AbstractJsonLexerKt.NULL)) {
                return;
            }
            setRating(zzes$$ExternalSyntheticBackport0.m22291m(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th) {
            C13219q0.m37817b("StarLevelLayoutView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (strValueOf.equals(AbstractJsonLexerKt.NULL)) {
                return;
            }
            setRating(zzes$$ExternalSyntheticBackport0.m22291m(Math.round(Double.parseDouble(strValueOf))));
        } catch (Throwable th) {
            C13219q0.m37817b("StarLevelLayoutView", th.getMessage(), th);
        }
    }
}
