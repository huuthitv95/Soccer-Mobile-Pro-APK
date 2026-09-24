package com.mbridge.msdk.config.dynamic.baseview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.webkit.ProxyConfig;
import com.mbridge.msdk.config.dynamic.baseview.cusview.XMLView;
import com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a;
import com.mbridge.msdk.config.dynamic.utils.C12902d;
import com.mbridge.msdk.config.dynamic.utils.C12904f;
import com.mbridge.msdk.config.dynamic.utils.image.C12906b;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class ComponentImageView extends ImageView implements InterfaceC12875a {

    /* JADX INFO: renamed from: a */
    private String f34512a;

    /* JADX INFO: renamed from: b */
    private int f34513b;
    public XMLView xmlView;

    public ComponentImageView(Context context, AttributeSet attributeSet) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m35899a(View view) {
        XMLView xMLView = this.xmlView;
        if (xMLView != null) {
            xMLView.updateTouchView(view);
        }
        C12904f.m36164a(this.xmlView, view.getTag(), null);
    }

    private void setEffectImage(Bitmap bitmap) {
        for (String str : this.f34512a.split("\\|")) {
            if (str.equals("blur")) {
                C12906b.m36176a(this, bitmap);
            } else if (str.contains("corner")) {
                C12906b.m36178a(this, bitmap, this.f34513b, str);
            } else if (str.equals("circle")) {
                C12906b.m36185b(this, bitmap);
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            this.xmlView = C12902d.m36156a(this);
        } catch (Exception e) {
            C13219q0.m37816b("MBImageView", "onAttachedToWindow异常: " + e.getMessage());
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setBitmap(Bitmap bitmap) {
        if (TextUtils.isEmpty(this.f34512a)) {
            setImageBitmap(bitmap);
        } else {
            setEffectImage(bitmap);
        }
    }

    public void setImages(Bitmap... bitmapArr) {
        C12906b.m36180a(this, bitmapArr);
    }

    public void setViewClickListener() {
        setOnClickListener(new View.OnClickListener() { // from class: com.mbridge.msdk.config.dynamic.baseview.ComponentImageView$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f$0.m35899a(view);
            }
        });
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void setXmlData(Map<String, Object> map) {
        if (map == null) {
            return;
        }
        try {
            String strValueOf = String.valueOf(map.get("data"));
            String strValueOf2 = String.valueOf(map.get("clickable"));
            if (!TextUtils.isEmpty(strValueOf2) && strValueOf2.equals("true")) {
                setViewClickListener();
            }
            Object obj = map.get("effect");
            if (obj instanceof String) {
                this.f34512a = obj.toString();
            }
            Object obj2 = map.get("radius");
            if (obj2 instanceof String) {
                this.f34513b = Integer.parseInt(obj2.toString());
            }
            if (TextUtils.isEmpty(strValueOf)) {
                return;
            }
            if (strValueOf.startsWith(ProxyConfig.MATCH_HTTP)) {
                C12906b.m36181a(strValueOf, this);
                return;
            }
            BitmapDrawable bitmapDrawableM37948n = C13229v0.m37948n(strValueOf);
            if (bitmapDrawableM37948n != null) {
                setBackground(bitmapDrawableM37948n);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBImageView", "setXmlData异常: " + e.getMessage());
        }
    }

    @Override // com.mbridge.msdk.config.dynamic.baseview.inter.InterfaceC12875a
    public void updateBindData(String str, Object obj) {
        try {
            if (obj instanceof String) {
                C12906b.m36181a((String) obj, this);
            }
        } catch (Exception e) {
            C13219q0.m37816b("MBImageView", "updateBindData异常: " + e.getMessage());
        }
    }
}
