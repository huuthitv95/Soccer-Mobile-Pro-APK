package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeImageView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12979b;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.C13150l;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBExtMBridgeImageView extends MBridgeImageView implements InterBase {

    /* JADX INFO: renamed from: s */
    private Map<String, String> f35105s;

    /* JADX INFO: renamed from: t */
    private Map<String, Boolean> f35106t;

    /* JADX INFO: renamed from: u */
    private String f35107u;

    /* JADX INFO: renamed from: v */
    private int f35108v;

    /* JADX INFO: renamed from: w */
    private int f35109w;

    /* JADX INFO: renamed from: x */
    private int f35110x;

    /* JADX INFO: renamed from: y */
    private int f35111y;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeImageView$1 */
    static /* synthetic */ class C129391 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35112a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f35112a = iArr;
            try {
                iArr[EnumC12973c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35112a[EnumC12973c.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35112a[EnumC12973c.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35112a[EnumC12973c.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35112a[EnumC12973c.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35112a[EnumC12973c.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35112a[EnumC12973c.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35112a[EnumC12973c.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35112a[EnumC12973c.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35112a[EnumC12973c.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35112a[EnumC12973c.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35112a[EnumC12973c.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35112a[EnumC12973c.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35112a[EnumC12973c.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35112a[EnumC12973c.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35112a[EnumC12973c.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBExtMBridgeImageView(Context context) {
        super(context);
        this.f35107u = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                int i2 = C129391.f35112a[enumC12973c.ordinal()];
                if (i2 == 6) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 13) {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.width = -1;
                    } else if (attributeValue2.startsWith("wrap")) {
                        layoutParams.width = -2;
                    } else {
                        layoutParams.width = C12972b.m36361a().m36362a(attributeValue2);
                    }
                } else if (i2 == 14) {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue3.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                        layoutParams.height = -1;
                    } else if (attributeValue3.startsWith("wrap")) {
                        layoutParams.height = -2;
                    } else {
                        layoutParams.height = C12972b.m36361a().m36362a(attributeValue3);
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f35105s;
        return (map == null || !map.containsKey("mbridgeAction")) ? "" : this.f35105s.get("mbridgeAction");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f35105s;
        return (map == null || !map.containsKey("mbridgeData")) ? "" : this.f35105s.get("mbridgeData");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f35105s;
        return (map == null || !map.containsKey("mbridgeEffect")) ? "" : this.f35105s.get("mbridgeEffect");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f35105s;
        return (map == null || !map.containsKey("mbridgeReport")) ? "" : this.f35105s.get("mbridgeReport");
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f35105s;
        return (map == null || !map.containsKey("mbridgeStrategy")) ? "" : this.f35105s.get("mbridgeStrategy");
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f35106t;
        if (map != null && map.containsKey("mbridgeAttached") && this.f35106t.get("mbridgeAttached").booleanValue()) {
            new C13150l.b("mbridgeAttached").m37405a().m37402b(this.f35107u);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f35106t;
        if (map != null && map.containsKey("mbridgeDetached") && this.f35106t.get("mbridgeDetached").booleanValue()) {
            new C13150l.b("mbridgeDetached").m37405a().m37402b(this.f35107u);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                switch (C129391.f35112a[enumC12973c.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        C12972b.m36361a().m36366a(attributeSet.getAttributeValue(i), this);
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArrSplit = null;
                            }
                            if (strArrSplit != null && strArrSplit.length <= 2) {
                                setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                            } else if (strArrSplit == null || strArrSplit.length != 3) {
                                setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                            } else {
                                try {
                                    GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArrSplit[2]), new int[]{Color.parseColor(strArrSplit[0]), Color.parseColor(strArrSplit[1])});
                                    gradientDrawable.setGradientType(0);
                                    setBackground(gradientDrawable);
                                } catch (Exception unused2) {
                                    setBackgroundColor(C12972b.m36361a().m36371d(attributeSet.getAttributeValue(i)));
                                }
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) C12979b.f35377a.get(attributeValue3.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            String str = C12979b.f35377a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            if (attributeValue5.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue5.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue6)) {
                            if (attributeValue6.equals("fitXY")) {
                                setScaleType(ImageView.ScaleType.FIT_XY);
                            } else if (attributeValue6.equals("centerInside")) {
                                setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            } else if (attributeValue6.equals("centerCrop")) {
                                setScaleType(ImageView.ScaleType.CENTER_CROP);
                            }
                        }
                        break;
                    case 8:
                        int iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f35111y = iM36362a;
                        this.f35110x = iM36362a;
                        this.f35109w = iM36362a;
                        this.f35108v = iM36362a;
                        setPadding(iM36362a, iM36362a, iM36362a, iM36362a);
                        break;
                    case 9:
                        int iM36362a2 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f35109w = iM36362a2;
                        setPadding(this.f35108v, iM36362a2, this.f35110x, this.f35111y);
                        break;
                    case 10:
                        int iM36362a3 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f35111y = iM36362a3;
                        setPadding(this.f35108v, this.f35109w, this.f35110x, iM36362a3);
                        break;
                    case 11:
                        int iM36362a4 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f35108v = iM36362a4;
                        setPadding(iM36362a4, this.f35109w, this.f35110x, this.f35111y);
                        break;
                    case 12:
                        int iM36362a5 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        this.f35110x = iM36362a5;
                        setPadding(this.f35108v, this.f35109w, iM36362a5, this.f35111y);
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f35106t = C12980c.m36403a(str);
        if (campaignEx != null) {
            this.f35107u = campaignEx.getCampaignUnitId();
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f35107u = "";
        try {
            this.f35105s = C12980c.m36402a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
            C12980c.m36404a(this.f35105s, this);
        } catch (Exception e) {
            C13219q0.m37816b("MBExtMBridgeImageView", e.getMessage());
        }
    }

    public MBExtMBridgeImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35107u = "";
    }
}
