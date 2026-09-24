package com.mbridge.msdk.config.dynamic.baseview;

import android.animation.Animator;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentTextView extends TextView implements InterfaceC12875a, InterfaceC12876b {

    /* JADX INFO: renamed from: a */
    private Animator f34515a;

    /* JADX INFO: renamed from: b */
    private String f34516b;
    public XMLView xmlView;

    public ComponentTextView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    private void m35906a() {
        Animator animator = this.f34515a;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e) {
                C13219q0.m37816b("MBTextView", "启动动画失败: " + e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private void m35908b() {
        Animator animator = this.f34515a;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e) {
                C13219q0.m37816b("MBTextView", "停止动画失败: " + e.getMessage());
            }
        }
    }

    private Map<String, Object> getDataMap() {
        HashMap map = new HashMap();
        map.put("text", getText().toString());
        return map;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12876b
    public Map<String, Object> getOutData() {
        Object tag;
        if (TextUtils.isEmpty(this.f34516b) || (tag = getTag()) == null) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(String.valueOf(tag), getDataMap());
        return map;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = C12902d.m36156a(this);
            m35906a();
        } catch (Exception e) {
            C13219q0.m37816b("MBTextView", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        try {
            m35908b();
        } catch (Exception e) {
            C13219q0.m37816b("MBTextView", "onDetachedFromWindow异常: " + e.getMessage());
        }
    }

    public void setOutDataScope(String str) {
        this.f34516b = str;
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        super.setText(charSequence, bufferType);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentTextView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35907a(view);
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
            Object obj = map.get("data");
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
            if (map.get("saveContent") instanceof String) {
                setOutDataScope("saveContent");
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBTextView", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                setText(String.valueOf(obj));
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBTextView", "updateBindData异常: " + e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35907a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        Map<String, Object> dataMap = getDataMap();
        dataMap.put("property", getDataMap());
        C12904f.m36164a(this.xmlView, view.getTag(), dataMap);
    }
}
