package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.component.style.inter.InterfaceC12844a;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.touch.C12885a;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class XMLView extends ComponentRelativeLayout {

    /* JADX INFO: renamed from: a */
    private Map<String, View> f34595a;

    /* JADX INFO: renamed from: b */
    private InterfaceC12844a f34596b;

    /* JADX INFO: renamed from: c */
    private String f34597c;

    /* JADX INFO: renamed from: d */
    protected C12885a f34598d;

    public XMLView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34595a = new HashMap();
        this.f34597c = "";
        this.f34598d = new C12885a();
        m35948a();
    }

    /* JADX INFO: renamed from: a */
    private void m35948a() {
        setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f34598d.m35980c();
                this.f34598d.m35983d(motionEvent);
            } else if (action == 1) {
                this.f34598d.m35985f(motionEvent);
            } else if (action == 2) {
                this.f34598d.m35984e(motionEvent);
            } else if (action == 3) {
                this.f34598d.m35981c(motionEvent);
            }
        } catch (Exception e) {
            C13219q0.m37816b("RenderView", "处理触摸事件异常: " + e.getMessage());
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Map<String, View> getRenderMap() {
        return this.f34595a;
    }

    public String getSelfTag() {
        return this.f34597c;
    }

    public C12885a getTouchEventData() {
        return this.f34598d;
    }

    public InterfaceC12844a getXmlViewActionListener() {
        return this.f34596b;
    }

    public void setRenderMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f34597c = SameMD5.getMD5(str);
    }

    public void setXmlViewActionListener(InterfaceC12844a interfaceC12844a) {
        this.f34596b = interfaceC12844a;
    }

    public void updateTouchView(View view) {
        C12885a c12885a = this.f34598d;
        if (c12885a != null) {
            c12885a.m35982c(view);
        }
    }
}
