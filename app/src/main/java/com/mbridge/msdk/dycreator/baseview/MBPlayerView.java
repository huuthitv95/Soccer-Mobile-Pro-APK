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
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.playercommon.PlayerView;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBPlayerView extends PlayerView implements InterBase {

    /* JADX INFO: renamed from: a */
    private float f34931a;

    /* JADX INFO: renamed from: b */
    private float f34932b;

    /* JADX INFO: renamed from: c */
    private Map<String, String> f34933c;

    /* JADX INFO: renamed from: d */
    private Map<String, Boolean> f34934d;

    /* JADX INFO: renamed from: e */
    private String f34935e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.MBPlayerView$1 */
    static /* synthetic */ class C129181 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f34936a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f34936a = iArr;
            try {
                iArr[EnumC12973c.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34936a[EnumC12973c.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34936a[EnumC12973c.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34936a[EnumC12973c.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34936a[EnumC12973c.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f34936a[EnumC12973c.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f34936a[EnumC12973c.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f34936a[EnumC12973c.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f34936a[EnumC12973c.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f34936a[EnumC12973c.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f34936a[EnumC12973c.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f34936a[EnumC12973c.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBPlayerView(Context context) {
        super(context);
        this.f34935e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f34933c;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f34933c.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f34933c;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f34933c.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f34933c;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f34933c.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f34933c;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f34933c.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f34933c;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f34933c.get("mbridgeStrategy");
    }

    public float getxInScreen() {
        return this.f34931a;
    }

    public float getyInScreen() {
        return this.f34932b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f34934d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f34934d.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f34935e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f34934d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f34934d.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f34935e);
        }
    }

    @Override // com.mbridge.msdk.playercommon.PlayerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f34931a = motionEvent.getRawX();
        this.f34932b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f34934d = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f34935e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, 0);
        HashMap mapM36368b = C12972b.m36361a().m36368b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                switch (C129181.f34936a[enumC12973c.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                        }
                        break;
                    case 3:
                        layoutParams.gravity = 1;
                        break;
                    case 4:
                        layoutParams.gravity = 16;
                        break;
                    case 5:
                        layoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        break;
                    case 6:
                        setGravity(C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i)));
                        break;
                    case 7:
                        int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        layoutParams.bottomMargin = iM36362a;
                        layoutParams.leftMargin = iM36362a;
                        layoutParams.rightMargin = iM36362a;
                        layoutParams.topMargin = iM36362a;
                        break;
                    case 8:
                        layoutParams.leftMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 9:
                        layoutParams.rightMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 10:
                        layoutParams.topMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 11:
                        layoutParams.bottomMargin = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        break;
                    case 12:
                        layoutParams.gravity = C12972b.m36361a().m36367b(attributeSet.getAttributeValue(i));
                        break;
                }
            }
        }
        return layoutParams;
    }

    public MBPlayerView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f34935e = "";
        try {
            this.f34933c = C12980c.m36402a(context, attributeSet);
            C12978a.m36384a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C12980c.m36404a(this.f34933c, this);
        } catch (Exception e) {
            C13219q0.m37816b("MBLinearLayout", e.getMessage());
        }
    }
}
