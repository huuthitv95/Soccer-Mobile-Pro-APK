package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.mediationsdk.ads.nativead.LevelPlayMediaView;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface;
import com.ironsource.mediationsdk.ads.nativead.internal.NativeAdViewHolder;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ib */
/* JADX INFO: loaded from: classes6.dex */
public final class C12249ib extends FrameLayout implements NativeAdViewBinderInterface {

    /* JADX INFO: renamed from: a */
    private final NativeAdViewHolder f30581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12249ib(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30581a = new NativeAdViewHolder();
    }

    /* JADX INFO: renamed from: a */
    public final void m31740a(C12195fb nativeAd) {
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        List<View> listM31738a = m31738a(this);
        removeAllViews();
        FrameLayout frameLayout = new FrameLayout(getContext());
        m31739a(frameLayout, listM31738a);
        AdapterNativeAdViewBinder adapterNativeAdViewBinderM31494f = nativeAd.m31494f();
        if (adapterNativeAdViewBinderM31494f != null) {
            adapterNativeAdViewBinderM31494f.setBodyView(this.f30581a.getBodyView());
            adapterNativeAdViewBinderM31494f.setMediaView(this.f30581a.getMediaView());
            adapterNativeAdViewBinderM31494f.setCallToActionView(this.f30581a.getCallToActionView());
            adapterNativeAdViewBinderM31494f.setTitleView(this.f30581a.getTitleView());
            adapterNativeAdViewBinderM31494f.setIconView(this.f30581a.getIconView());
            adapterNativeAdViewBinderM31494f.setAdvertiserView(this.f30581a.getAdvertiserView());
            adapterNativeAdViewBinderM31494f.setNativeAdView(frameLayout);
            addView(adapterNativeAdViewBinderM31494f.getNetworkNativeAdView());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setAdvertiserView(View view) {
        this.f30581a.setAdvertiserView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setBodyView(View view) {
        this.f30581a.setBodyView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setCallToActionView(View view) {
        this.f30581a.setCallToActionView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setIconView(View view) {
        this.f30581a.setIconView(view);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setMediaView(LevelPlayMediaView levelPlayMediaView) {
        this.f30581a.setMediaView(levelPlayMediaView);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdViewBinderInterface
    public void setTitleView(View view) {
        this.f30581a.setTitleView(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12249ib(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f30581a = new NativeAdViewHolder();
    }

    /* JADX INFO: renamed from: a */
    private final void m31739a(ViewGroup viewGroup, List<? extends View> list) {
        Iterator<? extends View> it = list.iterator();
        while (it.hasNext()) {
            viewGroup.addView(it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    private final List<View> m31738a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View child = viewGroup.getChildAt(i);
            Intrinsics.checkNotNullExpressionValue(child, "child");
            arrayList.add(child);
        }
        return arrayList;
    }
}
