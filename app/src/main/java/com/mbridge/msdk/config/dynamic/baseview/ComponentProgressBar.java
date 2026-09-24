package com.mbridge.msdk.config.dynamic.baseview;

import android.R;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentProgressBar extends ProgressBar implements InterfaceC12875a {

    /* JADX INFO: renamed from: a */
    private final String f34514a;

    public ComponentProgressBar(Context context) {
        super(context);
        this.f34514a = "ComponentProgressBar";
    }

    /* JADX INFO: renamed from: a */
    private static int m35903a(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return R.style.Widget.ProgressBar;
        }
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = attributeSet.getAttributeName(i);
            if (!TextUtils.isEmpty(attributeName) && attributeName.equals("style")) {
                String attributeValue = attributeSet.getAttributeValue(i);
                if (attributeValue.contains("Horizontal")) {
                    return R.style.Widget.ProgressBar.Horizontal;
                }
                if (attributeValue.contains("Large")) {
                    return R.style.Widget.ProgressBar.Large;
                }
                if (attributeValue.contains("Small")) {
                    return R.style.Widget.ProgressBar.Small;
                }
                if (attributeValue.contains("Large.Inverse")) {
                    return R.style.Widget.ProgressBar.Large.Inverse;
                }
                if (attributeValue.contains("Small.Inverse")) {
                    return R.style.Widget.ProgressBar.Small.Inverse;
                }
                if (attributeValue.contains("Inverse")) {
                    return R.style.Widget.ProgressBar.Inverse;
                }
            }
        }
        return R.style.Widget.ProgressBar;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("data"));
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            setProgress(Integer.parseInt(strValueOf));
        } catch (Exception e) {
            C13219q0.m37816b("ComponentProgressBar", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        try {
            setProgress(Integer.parseInt(String.valueOf(obj)));
        } catch (Throwable th) {
            C13219q0.m37816b("ComponentProgressBar", th.getMessage());
        }
    }

    public ComponentProgressBar(Context context, AttributeSet attributeSet) {
        super(context, null, m35903a(attributeSet));
        this.f34514a = "ComponentProgressBar";
    }
}
