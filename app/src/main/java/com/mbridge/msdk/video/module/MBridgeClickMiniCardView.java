package com.mbridge.msdk.video.module;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.download.download.H5DownLoadManager;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.mbsignalcommon.windvane.C13392f;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.signal.factory.C14177b;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeClickMiniCardView extends MBridgeH5EndCardView {

    /* JADX INFO: renamed from: P */
    private boolean f40228P;

    /* JADX INFO: renamed from: com.mbridge.msdk.video.module.MBridgeClickMiniCardView$a */
    class RunnableC13995a implements Runnable {
        RunnableC13995a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                C13219q0.m37813a(MBridgeBaseView.TAG, "webviewshow");
                String string = "";
                try {
                    int[] iArr = new int[2];
                    MBridgeClickMiniCardView.this.f40288p.getLocationOnScreen(iArr);
                    C13219q0.m37816b(MBridgeBaseView.TAG, "coordinate:" + iArr[0] + "--" + iArr[1]);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("startX", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[0]));
                    jSONObject.put("startY", C13229v0.m37902b(C13008c.m36588n().m36542d(), (float) iArr[1]));
                    string = jSONObject.toString();
                } catch (Throwable th) {
                    C13219q0.m37817b(MBridgeBaseView.TAG, th.getMessage(), th);
                }
                C13392f.m38726a().m38728a((WebView) MBridgeClickMiniCardView.this.f40288p, "webviewshow", Base64.encodeToString(string.toString().getBytes(), 2));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public MBridgeClickMiniCardView(Context context) {
        super(context);
        this.f40228P = false;
    }

    public MBridgeClickMiniCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f40228P = false;
    }

    private void setContentLayoutParams(View view) {
        int iM37930g = C13229v0.m37930g(this.f40201a);
        int iM37927f = (int) ((C13229v0.m37927f(this.f40201a) * 0.7f) + 0.5f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = (int) ((iM37930g * 0.7f) + 0.5f);
        layoutParams.height = iM37927f;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected RelativeLayout.LayoutParams getContentLayoutParams() {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13, -1);
        return layoutParams;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    protected String getURL() {
        CampaignEx campaignEx = this.f40202b;
        String strM36779h = null;
        if (campaignEx != null) {
            CampaignEx.C13066c rewardTemplateMode = campaignEx.getRewardTemplateMode();
            strM36779h = rewardTemplateMode != null ? rewardTemplateMode.m36779h() : null;
            if (!TextUtils.isEmpty(strM36779h) && strM36779h.contains(".zip")) {
                String h5ResAddress = H5DownLoadManager.getInstance().getH5ResAddress(strM36779h);
                if (!TextUtils.isEmpty(h5ResAddress)) {
                    return h5ResAddress;
                }
            }
        }
        return strM36779h;
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView
    /* JADX INFO: renamed from: j */
    protected void mo41952j() {
        super.mo41952j();
        if (this.f40205e) {
            setBackgroundResource(findColor("mbridge_reward_minicard_bg"));
            setContentLayoutParams(this.f40285m);
            setClickable(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeBaseView
    public void onSelfConfigurationChanged(Configuration configuration) {
        if (this.f40205e) {
            setContentLayoutParams(this.f40285m);
        }
        super.onSelfConfigurationChanged(configuration);
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void preLoadData(C14177b c14177b) {
        super.preLoadData(c14177b);
        setCloseVisible(0);
    }

    public void resizeMiniCard(int i, int i2) {
        View viewFindViewById = ((Activity) this.f40201a).getWindow().findViewById(R.id.content);
        int width = viewFindViewById.getWidth();
        int height = viewFindViewById.getHeight();
        if (i <= 0 || i2 <= 0 || i > width || i2 > height) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f40285m.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.f40285m.setLayoutParams(layoutParams);
    }

    public void setMBridgeClickMiniCardViewClickable(boolean z) {
        setClickable(z);
    }

    public void setMBridgeClickMiniCardViewTransparent() {
        setBackgroundColor(0);
    }

    public void setMiniCardLocation(int i, int i2, int i3, int i4) {
        this.f40228P = true;
        resizeMiniCard(i3, i4);
    }

    public void setRadius(int i) {
        if (i > 0) {
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setCornerRadius(C13229v0.m37876a(getContext(), i));
            gradientDrawable.setColor(-1);
            this.f40288p.setBackground(gradientDrawable);
            this.f40288p.setClipToOutline(true);
        }
    }

    @Override // com.mbridge.msdk.video.module.MBridgeH5EndCardView, com.mbridge.msdk.video.module.MBridgeH5EndCardViewDiff
    public void webviewshow() {
        WindVaneWebView windVaneWebView = this.f40288p;
        if (windVaneWebView != null) {
            windVaneWebView.post(new RunnableC13995a());
            C13157e c13157e = new C13157e();
            c13157e.m37501a("type", 3);
            C13156d.m37475b().m37483a("2000133", this.f40202b, c13157e);
        }
    }
}
