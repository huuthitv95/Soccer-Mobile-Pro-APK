package com.mbridge.msdk.out;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.error.C13082b;
import com.mbridge.msdk.foundation.feedback.C13084b;
import com.mbridge.msdk.foundation.same.report.metrics.C13154c;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbbanner.common.report.C13291a;
import com.mbridge.msdk.mbbanner.controll.C13295a;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MBBannerView extends RelativeLayout implements BaseExtraInterfaceForHandler {
    private String bidToken;
    private C13295a controller;
    private boolean hadAttached;
    private boolean isVisible;
    private BannerAdListener mBannerAdListener;
    private MBridgeIds mBridgeIds;
    private String unitId;

    public MBBannerView(Context context) {
        this(context, null);
    }

    private void callbackAndReportFail(C13154c c13154c, C13082b c13082b) {
        String strM37032l = "";
        if (c13082b != null) {
            try {
                strM37032l = c13082b.m37032l();
            } catch (Throwable th) {
                C13219q0.m37816b("BannerView", th.getMessage());
            }
        }
        c13154c.m37422a(c13082b);
        c13154c.m37430b(true);
        C13291a.m38291a("2000047", c13154c, (C13157e) null);
        BannerAdListener bannerAdListener = this.mBannerAdListener;
        if (bannerAdListener != null) {
            bannerAdListener.onLoadFailed(this.mBridgeIds, strM37032l);
        }
    }

    private void delayedNotify() {
        postDelayed(new Runnable() { // from class: com.mbridge.msdk.out.MBBannerView.1
            @Override // java.lang.Runnable
            public void run() {
                if (MBBannerView.this.controller == null || C13084b.f35793f) {
                    return;
                }
                MBBannerView.this.controller.m38339c(true);
            }
        }, 200L);
    }

    private void updateAttachedState(boolean z) {
        this.hadAttached = z;
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38337b(z);
        }
    }

    public String getCreativeIdWithUnitId() {
        C13295a c13295a = this.controller;
        return c13295a != null ? c13295a.m38340d() : "";
    }

    public String getRequestId() {
        C13295a c13295a = this.controller;
        return c13295a != null ? c13295a.m38341e() : "";
    }

    public void init(BannerSize bannerSize, String str, String str2) {
        this.unitId = str2;
        this.mBridgeIds = new MBridgeIds(TextUtils.isEmpty(str) ? "" : str, str2);
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        C13295a c13295a = new C13295a(this, bannerSize, str, str2);
        this.controller = c13295a;
        c13295a.m38339c(this.isVisible);
        this.controller.m38337b(this.hadAttached);
    }

    public void load() {
        String strM38292b = C13291a.m38292b(this.bidToken);
        C13154c c13154cM38282a = C13291a.m38282a(this.unitId, strM38292b);
        c13154cM38282a.m37444h("0");
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38337b(this.hadAttached);
            this.controller.m38333a("", strM38292b);
        } else {
            C13082b c13082b = new C13082b(880042);
            c13082b.m37023b(strM38292b);
            callbackAndReportFail(c13154cM38282a, c13082b);
        }
    }

    public void loadFromBid(String str) {
        this.bidToken = str;
        String strM38292b = C13291a.m38292b(str);
        C13154c c13154cM38282a = C13291a.m38282a(this.unitId, strM38292b);
        c13154cM38282a.m37444h("1");
        if (this.controller == null) {
            C13082b c13082b = new C13082b(880042);
            c13082b.m37023b(strM38292b);
            callbackAndReportFail(c13154cM38282a, c13082b);
        } else if (TextUtils.isEmpty(str)) {
            C13082b c13082b2 = new C13082b(880035);
            c13082b2.m37023b(strM38292b);
            callbackAndReportFail(c13154cM38282a, c13082b2);
        } else {
            this.controller.m38337b(this.hadAttached);
            this.controller.m38336b(0);
            this.controller.m38333a(str, strM38292b);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateAttachedState(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        updateAttachedState(false);
    }

    public void onPause() {
        if (this.controller == null || !TextUtils.isEmpty(this.bidToken)) {
            return;
        }
        this.controller.m38342g();
    }

    public void onResume() {
        if (this.controller == null || !TextUtils.isEmpty(this.bidToken) || C13084b.f35793f) {
            return;
        }
        this.controller.m38343h();
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38330a(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        this.isVisible = i == 0;
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            if (i == 0) {
                delayedNotify();
            } else {
                c13295a.m38339c(false);
            }
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.isVisible = i == 0;
        if (this.controller != null) {
            if (i == 0) {
                delayedNotify();
            } else {
                if (C13084b.f35793f) {
                    return;
                }
                this.controller.m38339c(false);
            }
        }
    }

    public void release() {
        if (this.mBannerAdListener != null) {
            this.mBannerAdListener = null;
        }
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38331a((BannerAdListener) null);
            this.controller.m38344i();
        }
        removeAllViews();
    }

    public void setAllowShowCloseBtn(boolean z) {
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38334a(z);
        }
    }

    public void setBannerAdListener(BannerAdListener bannerAdListener) {
        this.mBannerAdListener = bannerAdListener;
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38331a(bannerAdListener);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        C13008c.m36588n().m36530a(this.unitId, jSONObject);
    }

    public void setRefreshTime(int i) {
        C13295a c13295a = this.controller;
        if (c13295a == null || i < 0) {
            return;
        }
        c13295a.m38336b(i);
    }

    public void updateBannerSize(BannerSize bannerSize) {
        C13295a c13295a = this.controller;
        if (c13295a != null) {
            c13295a.m38332a(bannerSize);
        }
    }

    public MBBannerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MBBannerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.hadAttached = false;
        this.isVisible = false;
        C13008c.m36588n().m36527a(context);
    }
}
