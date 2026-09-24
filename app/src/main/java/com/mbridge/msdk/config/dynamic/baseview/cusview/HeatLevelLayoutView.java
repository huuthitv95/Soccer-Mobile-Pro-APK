package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.tools.C13203i0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class HeatLevelLayoutView extends ComponentLinearLayout {
    public HeatLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setHeatCount(int i) {
        try {
            removeAllViews();
            double dM36400a = C12980c.m36400a(i, 10000.0d, 2);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, C12980c.m36401a(getContext(), 30.0f));
            layoutParams.setMargins(15, 0, 0, 0);
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setGravity(17);
            textView.setTextColor(Color.parseColor("#FF000000"));
            textView.setTextSize(10.0f);
            Drawable drawable = getResources().getDrawable(C13203i0.m37707a(getContext(), "mbridge_reward_user", "drawable"));
            if (drawable != null) {
                drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            }
            textView.setCompoundDrawables(null, null, drawable, null);
            textView.setText(dM36400a + getResources().getString(getResources().getIdentifier("mbridge_reward_heat_count_unit", TypedValues.Custom.S_STRING, C13008c.m36588n().m36550i())));
            addView(textView, layoutParams);
        } catch (Exception e) {
            C13219q0.m37816b("HeatLevelLayoutView", e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        super.setXmlData(map);
        String strValueOf = String.valueOf(map.get("data"));
        try {
            if (strValueOf.equals(AbstractJsonLexerKt.NULL) || TextUtils.isEmpty(strValueOf)) {
                return;
            }
            setHeatCount(Integer.parseInt(strValueOf));
        } catch (Throwable th) {
            C13219q0.m37817b("HeatLevelLayoutView", th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        if (obj == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(obj);
            if (obj.equals(AbstractJsonLexerKt.NULL)) {
                return;
            }
            setHeatCount(Integer.parseInt(strValueOf));
        } catch (Throwable th) {
            C13219q0.m37817b("HeatLevelLayoutView", th.getMessage(), th);
        }
    }
}
