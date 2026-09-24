package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12978a;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13150l;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBHorizontalScrollView extends HorizontalScrollView implements InterBase {

    /* JADX INFO: renamed from: a */
    private Map<String, String> f34909a;

    /* JADX INFO: renamed from: b */
    private Map<String, Boolean> f34910b;

    /* JADX INFO: renamed from: c */
    private String f34911c;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBHorizontalScrollView$1 */
    static /* synthetic */ class C129131 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34912a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34912a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34912a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34912a[EnumC12973c.layout_gravity.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34912a[EnumC12973c.layout_marginLeft.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34912a[EnumC12973c.layout_margin.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MBHorizontalScrollView(Context context) {
        super(context);
        this.f34911c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34909a;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34909a.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34909a;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34909a.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34909a;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34909a.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34909a;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34909a.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34909a;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34909a.get("mbridgeStrategy");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f34910b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34910b.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34911c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f34910b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34910b.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34911c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34910b = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34911c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap mapM36368b = C12972b.m36361a().m36368b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129131.f34912a[enumC12973c.ordinal()];
                if (i2 == 1) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue.startsWith("w")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                    }
                } else if (i2 == 2) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("w")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                    }
                } else if (i2 == 3) {
                    layoutParams.gravity = C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i));
                } else if (i2 == 4) {
                    layoutParams.leftMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                } else if (i2 == 5) {
                    int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                    layoutParams.setMargins(iM36362a, iM36362a, iM36362a, iM36362a);
                }
            }
        }
        return layoutParams;
    }

    public MBHorizontalScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34911c = "";
        try {
            this.f34909a = C12980c.m36402a(context, attributeSet);
            C12978a.m36384a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C12980c.m36404a(this.f34909a, this);
        } catch (Exception e) {
            C13219q0.m37816b("MBHorizontalScrollView", e.getMessage());
        }
    }

    public MBHorizontalScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34911c = "";
    }
}
