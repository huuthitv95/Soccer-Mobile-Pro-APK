package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12978a;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13150l;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {

    /* JADX INFO: renamed from: a */
    private float f34921a;

    /* JADX INFO: renamed from: b */
    private float f34922b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f34923c;

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f34924d;

    /* JADX INFO: renamed from: e */
    private String f34925e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1 */
    static /* synthetic */ class C129161 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34926a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34926a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34926a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34926a[EnumC12973c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34926a[EnumC12973c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34926a[EnumC12973c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34926a[EnumC12973c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34926a[EnumC12973c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34926a[EnumC12973c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34926a[EnumC12973c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34926a[EnumC12973c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34926a[EnumC12973c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34926a[EnumC12973c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.f34925e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34923c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34923c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34923c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34923c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34923c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34923c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34923c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34923c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34923c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34923c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.f34921a;
    }

    public float getyInScreen() {
        return this.f34922b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f34924d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34924d.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34925e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f34924d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34924d.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34925e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34921a = motionEvent.getRawX();
        this.f34922b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34924d = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34925e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap mapM36368b = C12972b.m36361a().m36368b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                switch (C129161.f34926a[enumC12973c.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParamsGenerateDefaultLayoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.width = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParamsGenerateDefaultLayoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParamsGenerateDefaultLayoutParams.height = -2;
                        } else {
                            layoutParamsGenerateDefaultLayoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                        }
                        break;
                    case 3:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParamsGenerateDefaultLayoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParamsGenerateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        break;
                    case 6:
                        setGravity(C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i)));
                        break;
                    case 7:
                        int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = iM36362a;
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = iM36362a;
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = iM36362a;
                        layoutParamsGenerateDefaultLayoutParams.topMargin = iM36362a;
                        break;
                    case 8:
                        layoutParamsGenerateDefaultLayoutParams.leftMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 9:
                        layoutParamsGenerateDefaultLayoutParams.rightMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 10:
                        layoutParamsGenerateDefaultLayoutParams.topMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 11:
                        layoutParamsGenerateDefaultLayoutParams.bottomMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 12:
                        layoutParamsGenerateDefaultLayoutParams.gravity = C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i));
                        break;
                }
            }
        }
        return layoutParamsGenerateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34925e = "";
        this.f34923c = C12980c.m36402a(context, attributeSet);
        C12978a.m36384a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        C12980c.m36404a(this.f34923c, this);
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34925e = "";
    }
}
