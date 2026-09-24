package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentButton extends Button implements InterfaceC12875a, InterfaceC12876b {

    /* JADX INFO: renamed from: a */
    private String f34510a;

    /* JADX INFO: renamed from: b */
    private boolean f34511b;
    public XMLView xmlView;

    public ComponentButton(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35895a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        this.f34511b = true;
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        C12904f.m36164a(this.xmlView, view.getTag(), dataMap);
    }

    private Map<String, Object> getDataMap() {
        HashMap map = new HashMap();
        map.put("selected", this.f34511b ? "1" : "0");
        map.put("text", getText().toString());
        return map;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f34510a) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), getDataMap());
        this.f34511b = false;
        return map;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = C12902d.m36156a(this);
        } catch (Exception e) {
            C13219q0.m37816b("MBButton", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setOutDataScope(String str) {
        this.f34510a = str;
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentButton$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35895a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf) && strValueOf.equals("true")) {
                setViewClickListener();
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBButton", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBButton", "updateBindData异常: " + e.getMessage());
        }
    }
}
