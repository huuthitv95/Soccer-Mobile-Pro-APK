package com.mbridge.msdk.dycreator.baseview.webview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebChromeClient;
import com.mbridge.msdk.dycreator.baseview.webview.client.MBWebViewClient;
import com.mbridge.msdk.dycreator.baseview.webview.communicator.WebCommunicator;
import com.mbridge.msdk.dycreator.baseview.webview.listener.WebViewEventListener;
import com.mbridge.msdk.dycreator.engine.C12972b;
import com.mbridge.msdk.dycreator.engine.EnumC12973c;
import com.mbridge.msdk.dycreator.utils.C12979b;
import com.mbridge.msdk.dycreator.utils.C12980c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C13219q0;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class MBWebView extends WebView implements InterBase {

    /* JADX INFO: renamed from: a */
    private final String f35176a;

    /* JADX INFO: renamed from: b */
    private Map<String, String> f35177b;

    /* JADX INFO: renamed from: c */
    private MBWebViewClient f35178c;

    /* JADX INFO: renamed from: d */
    private MBWebChromeClient f35179d;
    public Map<String, String> dataMethodMap;

    /* JADX INFO: renamed from: e */
    private boolean f35180e;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.webview.MBWebView$1 */
    static /* synthetic */ class C129571 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f35181a;

        static {
            int[] iArr = new int[EnumC12973c.values().length];
            f35181a = iArr;
            try {
                iArr[EnumC12973c.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35181a[EnumC12973c.fadingEdge.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35181a[EnumC12973c.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35181a[EnumC12973c.background.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35181a[EnumC12973c.contentDescription.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35181a[EnumC12973c.tag.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35181a[EnumC12973c.padding.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35181a[EnumC12973c.paddingTop.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35181a[EnumC12973c.paddingBottom.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35181a[EnumC12973c.paddingLeft.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35181a[EnumC12973c.paddingRight.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35181a[EnumC12973c.paddingStart.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35181a[EnumC12973c.paddingEnd.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35181a[EnumC12973c.layout_width.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35181a[EnumC12973c.layout_height.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    public MBWebView(Context context) {
        super(context);
        this.f35176a = "MBWebView";
        m36292a();
    }

    /* JADX INFO: renamed from: a */
    private void m36292a() {
        m36293b();
        MBWebViewClient mBWebViewClient = new MBWebViewClient();
        this.f35178c = mBWebViewClient;
        setWebViewClient(mBWebViewClient);
        MBWebChromeClient mBWebChromeClient = new MBWebChromeClient();
        this.f35179d = mBWebChromeClient;
        setWebChromeClient(mBWebChromeClient);
    }

    /* JADX INFO: renamed from: b */
    private void m36293b() {
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        WebSettings settings = getSettings();
        settings.setUserAgentString(settings.getUserAgentString() + " WindVane/3.0.2");
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setAllowFileAccess(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        settings.setDomStorageEnabled(true);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setSavePassword(false);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        if (Build.VERSION.SDK_INT >= 26) {
            settings.setSafeBrowsingEnabled(false);
        }
        settings.setMediaPlaybackRequiresUserGesture(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setMixedContentMode(0);
        settings.setDatabaseEnabled(true);
        String path = getContext().getDir("database", 0).getPath();
        settings.setDatabasePath(path);
        settings.setGeolocationEnabled(true);
        settings.setGeolocationDatabasePath(path);
    }

    @Override // android.webkit.WebView
    public void destroy() {
        if (this.f35180e) {
            return;
        }
        try {
            this.f35180e = true;
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            destroy();
        } catch (Throwable th) {
            C13219q0.m37816b("MBWebView", th.getMessage());
        }
    }

    @Override // android.widget.AbsoluteLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        if (attributeSet != null) {
            HashMap mapM36368b = C12972b.m36361a().m36368b();
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                EnumC12973c enumC12973c = (EnumC12973c) mapM36368b.get(attributeSet.getAttributeName(i));
                if (enumC12973c != null) {
                    int i2 = C129571.f35181a[enumC12973c.ordinal()];
                    if (i2 == 14) {
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.width = -1;
                        } else if (attributeValue.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = C12972b.m36361a().m36362a(attributeValue);
                        }
                    } else if (i2 == 15) {
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) || attributeValue2.startsWith(InneractiveMediationDefs.GENDER_MALE)) {
                            layoutParams.height = -1;
                        } else if (attributeValue2.startsWith("wrap")) {
                            layoutParams.height = -2;
                        } else {
                            layoutParams.height = C12972b.m36361a().m36362a(attributeValue2);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.dataMethodMap;
        return map != null ? map.get("mbridgeData") : "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        return "";
    }

    public boolean isDestroyed() {
        return this.f35180e;
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArrSplit;
        if (attributeSet == null) {
            return;
        }
        HashMap<String, EnumC12973c> mapM36370c = C12972b.m36361a().m36370c();
        int attributeCount = attributeSet.getAttributeCount();
        int iM36362a = 0;
        int iM36362a2 = 0;
        int iM36362a3 = 0;
        int iM36362a4 = 0;
        for (int i = 0; i < attributeCount; i++) {
            EnumC12973c enumC12973c = mapM36370c.get(attributeSet.getAttributeName(i));
            if (enumC12973c != null) {
                switch (C129571.f35181a[enumC12973c.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("@+id/")) {
                            setId(attributeValue.substring(5).hashCode());
                        }
                        break;
                    case 2:
                        setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                        break;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue2)) {
                            if (attributeValue2.equals("invisible")) {
                                setVisibility(4);
                            } else if (attributeValue2.equalsIgnoreCase("gone")) {
                                setVisibility(8);
                            }
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (attributeValue3.startsWith("#")) {
                            try {
                                strArrSplit = attributeValue3.split("-");
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
                            if (attributeValue3.startsWith("@drawable/")) {
                                attributeValue3 = attributeValue3.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue3, "drawable", getContext().getPackageName()));
                        }
                        break;
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue4)) {
                            CharSequence charSequence = (String) C12979b.f35377a.get(attributeValue4.substring(8));
                            if (!TextUtils.isEmpty(charSequence)) {
                                setContentDescription(charSequence);
                            }
                        }
                        break;
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue5)) {
                            String str = C12979b.f35377a.get(attributeValue5.substring(8));
                            if (!TextUtils.isEmpty(str)) {
                                setTag(str);
                            }
                        }
                        break;
                    case 7:
                        int iM36362a5 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        setPadding(iM36362a5, iM36362a5, iM36362a5, iM36362a5);
                        break;
                    case 8:
                        iM36362a4 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        setPadding(iM36362a, iM36362a4, iM36362a2, iM36362a3);
                        break;
                    case 9:
                        iM36362a3 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        setPadding(iM36362a, iM36362a4, iM36362a2, iM36362a3);
                        break;
                    case 10:
                        iM36362a = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        setPadding(iM36362a, iM36362a4, iM36362a2, iM36362a3);
                        break;
                    case 11:
                        iM36362a2 = C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i));
                        setPadding(iM36362a, iM36362a4, iM36362a2, iM36362a3);
                        break;
                    case 12:
                        setPadding(C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i)), iM36362a4, iM36362a2, iM36362a3);
                        break;
                    case 13:
                        setPadding(iM36362a, iM36362a4, C12972b.m36361a().m36362a(attributeSet.getAttributeValue(i)), iM36362a3);
                        break;
                }
            }
        }
    }

    public void setCommunicator(WebCommunicator webCommunicator) {
        MBWebChromeClient mBWebChromeClient = this.f35179d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setCommunicator(webCommunicator);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }

    public void setWebViewEventListener(WebViewEventListener webViewEventListener) {
        MBWebViewClient mBWebViewClient = this.f35178c;
        if (mBWebViewClient != null) {
            mBWebViewClient.setWebViewEventListener(webViewEventListener);
        }
        MBWebChromeClient mBWebChromeClient = this.f35179d;
        if (mBWebChromeClient != null) {
            mBWebChromeClient.setWebViewEventListener(webViewEventListener);
        }
    }

    public MBWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f35176a = "MBWebView";
        try {
            this.f35177b = C12980c.m36402a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            C12980c.m36404a(this.f35177b, this);
        } catch (Exception e) {
            C13219q0.m37816b("MBWebView", e.getMessage());
        }
        m36292a();
    }

    public MBWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f35176a = "MBWebView";
        m36292a();
    }

    public MBWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f35176a = "MBWebView";
        m36292a();
    }
}
