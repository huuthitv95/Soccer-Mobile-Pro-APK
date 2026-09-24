package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentListView extends ListView implements InterfaceC12875a {
    public XMLView xmlView;

    public ComponentListView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35902a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        C12904f.m36164a(this.xmlView, view.getTag(), null);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = C12902d.m36156a((View) this);
        } catch (Exception e) {
            C13219q0.m37816b("MBListView", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentListView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35902a(view);
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
            if (TextUtils.isEmpty(strValueOf) || !strValueOf.equals("true")) {
                return;
            }
            setViewClickListener();
        } catch (Exception e) {
            C13219q0.m37816b("MBListView", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
    }
}
