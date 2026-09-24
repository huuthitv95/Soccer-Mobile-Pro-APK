package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2431fi;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2442ik;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka;
import com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2478lr;
import com.bytedance.sdk.component.adexpress.dynamic.p115di.InterfaceC2404ri;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2471fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.dynamic.p121ri.C2481lr;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2510sf;
import com.bytedance.sdk.component.adexpress.theme.InterfaceC2532ri;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class DynamicRootView extends FrameLayout implements InterfaceC2469ka, InterfaceC2532ri {
    private String bgColor;
    private Map<Integer, String> bgMaterialCenterCalcColor;
    private AbstractC2412fi dynamicBaseWidget;
    private int logoUnionHeight;
    private Context mContext;
    private InterfaceC2404ri mDynamicClickListener;
    boolean mIsMute;
    private ThemeStatusBroadcastReceiver mReceiver;
    private InterfaceC2510sf mRenderListener;
    private C2500aw mRenderRequest;
    private ViewGroup mTimeOut;
    private InterfaceC2478lr muteListener;
    protected final com.bytedance.sdk.component.adexpress.p125lr.bgr renderResult;
    private int scoreCountWithIcon;
    private List<InterfaceC2442ik> timeOutListener;
    private int timedown;
    private InterfaceC2431fi videoListener;
    public View videoView;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2500aw c2500aw, InterfaceC2404ri interfaceC2404ri) {
        super(context);
        this.mTimeOut = null;
        this.timedown = 0;
        this.timeOutListener = new ArrayList();
        this.logoUnionHeight = 0;
        this.scoreCountWithIcon = 0;
        this.mContext = context;
        com.bytedance.sdk.component.adexpress.p125lr.bgr bgrVar = new com.bytedance.sdk.component.adexpress.p125lr.bgr();
        this.renderResult = bgrVar;
        bgrVar.m8965ri(2);
        this.mDynamicClickListener = interfaceC2404ri;
        interfaceC2404ri.mo8307ri(this);
        this.mReceiver = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.m9173ri(this);
        this.mIsMute = z;
        this.mRenderRequest = c2500aw;
    }

    private void checkCanOpenLandingPage(C2475mj c2475mj) {
        C2470di c2470diM8592fi;
        C2471fi c2471fiM8627qt = c2475mj.m8627qt();
        if (c2471fiM8627qt == null || (c2470diM8592fi = c2471fiM8627qt.m8592fi()) == null) {
            return;
        }
        this.renderResult.m8958lr(c2470diM8592fi.smj());
    }

    private boolean checkSizeValid() {
        return this.dynamicBaseWidget.f6477fi > 0.0f && this.dynamicBaseWidget.f6476di > 0.0f;
    }

    private void setClipChildren(ViewGroup viewGroup, C2475mj c2475mj) {
        ViewGroup viewGroup2;
        if (viewGroup == null || (viewGroup2 = (ViewGroup) viewGroup.getParent()) == null || !c2475mj.m8609ay()) {
            return;
        }
        viewGroup2.setClipChildren(false);
        viewGroup2.setClipToPadding(false);
        ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
        if (viewGroup3 != null) {
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
        }
    }

    public void beginHideFromVisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 4);
    }

    public void beginShowFromInvisible() {
        beginShowFromInvisible(this.dynamicBaseWidget, 0);
    }

    public void beginShowFromInvisible(AbstractC2412fi abstractC2412fi, int i) {
        if (abstractC2412fi == null) {
            return;
        }
        if (abstractC2412fi.getBeginInvisibleAndShow()) {
            abstractC2412fi.setVisibility(i);
            if (abstractC2412fi.f6486vr != null) {
                abstractC2412fi.f6486vr.setVisibility(i);
            }
        }
        int childCount = abstractC2412fi.getChildCount();
        if (childCount <= 0) {
            return;
        }
        for (int i2 = 0; i2 < childCount; i2++) {
            if (abstractC2412fi.getChildAt(i2) instanceof AbstractC2412fi) {
                beginShowFromInvisible((AbstractC2412fi) abstractC2412fi.getChildAt(i2), i);
            }
        }
    }

    public void callBackRenderFail(int i, String str) {
        this.renderResult.m8968ri(false);
        this.renderResult.m8957lr(i);
        this.renderResult.m8967ri(str);
        this.mRenderListener.mo8757ri(this.renderResult);
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public Map<Integer, String> getBgMaterialCenterCalcColor() {
        return this.bgMaterialCenterCalcColor;
    }

    public InterfaceC2404ri getDynamicClickListener() {
        return this.mDynamicClickListener;
    }

    public int getLogoUnionHeight() {
        return this.logoUnionHeight;
    }

    public InterfaceC2510sf getRenderListener() {
        return this.mRenderListener;
    }

    public C2500aw getRenderRequest() {
        return this.mRenderRequest;
    }

    public int getScoreCountWithIcon() {
        return this.scoreCountWithIcon;
    }

    public ViewGroup getTimeOut() {
        return this.mTimeOut;
    }

    public List<InterfaceC2442ik> getTimeOutListener() {
        return this.timeOutListener;
    }

    public int getTimedown() {
        return this.timedown;
    }

    @Override // com.bytedance.sdk.component.adexpress.theme.InterfaceC2532ri
    public void onThemeChanged(int i) {
        AbstractC2412fi abstractC2412fi = this.dynamicBaseWidget;
        if (abstractC2412fi == null) {
            return;
        }
        abstractC2412fi.m8334ri(i);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void onvideoComplate() {
        try {
            this.videoListener.mo8351ri();
        } catch (Exception unused) {
        }
    }

    public void render(C2475mj c2475mj, int i) {
        this.dynamicBaseWidget = renderDynamicView(c2475mj, this, i);
        this.renderResult.m8968ri(true);
        this.renderResult.m8963ri(this.dynamicBaseWidget.f6477fi);
        this.renderResult.m8955lr(this.dynamicBaseWidget.f6476di);
        this.renderResult.m8966ri(this.videoView);
        this.mRenderListener.mo8757ri(this.renderResult);
    }

    public AbstractC2412fi renderDynamicView(C2475mj c2475mj, ViewGroup viewGroup, int i) {
        if (c2475mj == null) {
            return null;
        }
        List<C2475mj> listM8638sf = c2475mj.m8638sf();
        AbstractC2412fi abstractC2412fiM8736ri = C2481lr.m8736ri(this.mContext, this, c2475mj);
        if (abstractC2412fiM8736ri instanceof ory) {
            callBackRenderFail(i == 3 ? 128 : Sdk.SDKError.Reason.PROTOBUF_SERIALIZATION_ERROR_VALUE, "unknow widget");
            return null;
        }
        checkCanOpenLandingPage(c2475mj);
        abstractC2412fiM8736ri.m8327ik();
        if (viewGroup != null) {
            viewGroup.addView(abstractC2412fiM8736ri);
            setClipChildren(viewGroup, c2475mj);
        }
        if (listM8638sf == null || listM8638sf.size() <= 0) {
            return null;
        }
        Iterator<C2475mj> it = listM8638sf.iterator();
        while (it.hasNext()) {
            renderDynamicView(it.next(), abstractC2412fiM8736ri, i);
        }
        return abstractC2412fiM8736ri;
    }

    public void setBgColor(String str) {
        this.bgColor = str;
    }

    public void setBgMaterialCenterCalcColor(Map<Integer, String> map) {
        this.bgMaterialCenterCalcColor = map;
    }

    public void setLogoUnionHeight(int i) {
        this.logoUnionHeight = i;
    }

    public void setMuteListener(InterfaceC2478lr interfaceC2478lr) {
        this.muteListener = interfaceC2478lr;
    }

    public void setRenderListener(InterfaceC2510sf interfaceC2510sf) {
        this.mRenderListener = interfaceC2510sf;
        this.mDynamicClickListener.mo8308ri(interfaceC2510sf);
    }

    public void setScoreCountWithIcon(int i) {
        this.scoreCountWithIcon = i;
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setSoundMute(boolean z) {
        InterfaceC2478lr interfaceC2478lr = this.muteListener;
        if (interfaceC2478lr != null) {
            interfaceC2478lr.setSoundMute(z);
        }
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTime(CharSequence charSequence, int i, int i2, boolean z) {
        for (int i3 = 0; i3 < this.timeOutListener.size(); i3++) {
            if (this.timeOutListener.get(i3) != null) {
                this.timeOutListener.get(i3).mo8310ri(charSequence, i == 1, i2, z);
            }
        }
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.mTimeOut = viewGroup;
    }

    public void setTimeOutListener(InterfaceC2442ik interfaceC2442ik) {
        this.timeOutListener.add(interfaceC2442ik);
    }

    @Override // com.bytedance.sdk.component.adexpress.dynamic.InterfaceC2469ka
    public void setTimeUpdate(int i) {
        this.videoListener.setTimeUpdate(i);
    }

    public void setTimedown(int i) {
        this.timedown = i;
    }

    public void setVideoListener(InterfaceC2431fi interfaceC2431fi) {
        this.videoListener = interfaceC2431fi;
    }

    public void updateRenderInfoForVideo(double d, double d2, double d3, double d4, float f) {
        this.renderResult.m8950ik(d);
        this.renderResult.m8953ka(d2);
        this.renderResult.m8948fi(d3);
        this.renderResult.m8946di(d4);
        this.renderResult.m8964ri(f);
        this.renderResult.m8956lr(f);
        this.renderResult.m8951ik(f);
        this.renderResult.m8954ka(f);
    }
}
