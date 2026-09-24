package com.mbridge.msdk.config.dynamic.baseview.cusview;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mbridge.msdk.config.component.common.file.C12752a;
import com.mbridge.msdk.config.component.common.file.C12753b;
import com.mbridge.msdk.config.dynamic.C12861a;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.C12894a;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MoreOfferContainerView extends ComponentHorizontalScrollView {

    /* JADX INFO: renamed from: a */
    private final String f34570a;

    /* JADX INFO: renamed from: b */
    String f34571b;

    /* JADX INFO: renamed from: c */
    C12894a f34572c;

    /* JADX INFO: renamed from: d */
    List<Map<String, Object>> f34573d;

    /* JADX INFO: renamed from: e */
    ViewGroup f34574e;

    /* JADX INFO: renamed from: f */
    private View.OnTouchListener f34575f;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView$a */
    class RunnableC12872a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ List f34576a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C12894a f34577b;

        RunnableC12872a(List list, C12894a c12894a) {
            this.f34576a = list;
            this.f34577b = c12894a;
        }

        @Override // java.lang.Runnable
        public void run() {
            MoreOfferContainerView.this.updateMoreOfferData(this.f34576a, this.f34577b);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView$b */
    class ViewOnTouchListenerC12873b implements View.OnTouchListener {
        ViewOnTouchListenerC12873b() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (motionEvent.getAction() != 1) {
                return false;
            }
            MoreOfferContainerView.this.m35939a();
            return false;
        }
    }

    public MoreOfferContainerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f34570a = "MoreOfferContainerView";
        this.f34571b = "";
        this.f34575f = new ViewOnTouchListenerC12873b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m35941b(View view) {
        String string = view.getTag().toString();
        int id = view.getId();
        m35942a(String.valueOf(id), string, this.f34573d.get(id));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getVisibleViews, reason: merged with bridge method [inline-methods] */
    public void m35939a() {
        XMLView xMLView;
        ViewGroup viewGroup = this.f34574e;
        if (viewGroup == null || viewGroup.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f34574e.getChildCount(); i++) {
            View childAt = this.f34574e.getChildAt(i);
            Rect rect = new Rect();
            boolean globalVisibleRect = childAt.getGlobalVisibleRect(rect);
            boolean z = rect.width() > childAt.getMeasuredWidth() / 5;
            if (globalVisibleRect && z && (xMLView = this.xmlView) != null && xMLView.getXmlViewActionListener() != null) {
                HashMap map = new HashMap();
                map.put("view_tag", childAt.getTag());
                HashMap map2 = new HashMap();
                map2.put("index", String.valueOf(childAt.getId()));
                map.put("property", map2);
                this.xmlView.getXmlViewActionListener().mo35772a(map);
            }
        }
    }

    public void setData(List<Map<String, Object>> list, C12894a c12894a) {
        this.f34572c = c12894a;
        this.f34573d = list;
        postDelayed(new RunnableC12872a(list, c12894a), 1000L);
    }

    public void setItemXMLPath(String str) {
        this.f34571b = str;
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        C12753b c12753bM35056e;
        if (map == null) {
            return;
        }
        try {
            if (String.valueOf(map.get("clickable")).equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("parentPath");
            String strM35068c = "";
            if (obj instanceof String) {
                String strValueOf = String.valueOf(obj);
                if (!TextUtils.isEmpty(strValueOf) && (c12753bM35056e = C12752a.m35056e(strValueOf)) != null && !TextUtils.isEmpty(c12753bM35056e.m35068c())) {
                    strM35068c = c12753bM35056e.m35068c();
                }
            }
            Object obj2 = map.get("itemXml");
            if (obj2 instanceof String) {
                setItemXMLPath(strM35068c.concat(obj2.toString()).concat(".xml"));
            }
            Object obj3 = map.get("globalModel");
            if (obj3 instanceof C12894a) {
                this.f34572c = (C12894a) obj3;
            }
            Object obj4 = map.get("data");
            if (obj4 instanceof List) {
                setData((List) obj4, this.f34572c);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MoreOfferContainerView", th.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView, com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof List) {
                setData((List) obj, this.f34572c);
            }
        } catch (Throwable th) {
            C13219q0.m37816b("MoreOfferContainerView", th.getMessage());
        }
    }

    public void updateMoreOfferData(List<Map<String, Object>> list, C12894a c12894a) {
        if (list == null || list.isEmpty()) {
            return;
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        this.f34574e = linearLayout;
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = list.get(i);
            C12894a c12894a2 = new C12894a();
            c12894a2.m36049a((Map<? extends String, ?>) map);
            c12894a.m36045a("listData", c12894a2);
            View viewM35886a = new C12861a().m35886a(this.f34571b, null, c12894a);
            if (viewM35886a != null) {
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(0, 0, 20, 0);
                viewM35886a.setLayoutParams(layoutParams);
                viewM35886a.setId(i);
                viewM35886a.setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f$0.m35941b(view);
                    }
                });
                linearLayout.addView(viewM35886a);
            }
        }
        if (linearLayout.getChildCount() > 0) {
            if (getChildCount() > 0) {
                removeAllViews();
            }
            addView(linearLayout);
            setOnTouchListener(this.f34575f);
            linearLayout.postDelayed(new Runnable() { // from class: com.mbridge.msdk.config.dynamic.baseview.cusview.MoreOfferContainerView$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m35939a();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: a */
    void m35942a(String str, String str2, Map<String, Object> map) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(this);
        }
        HashMap map2 = new HashMap();
        map2.put("viewTag", str2);
        HashMap map3 = new HashMap();
        map3.put("index", str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(map);
        map3.put("selectedContents", arrayList);
        map2.put("property", map3);
        C12904f.m36164a(this.xmlView, str2, map2);
    }
}
